// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.auton;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{

  private TalonFX shooter;
  private ControlMethod method;
  private double power;

  public ShooterSubsystem(){
      shooter = new TalonFX(13);
      shooter.configFactoryDefault();
      shooter.setInverted(true);
      shooter.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor, 0, 0);
  }

  public enum ControlMethod {
      PERCENT_OUTPUT,
      SPIN_UP,
  }

  @Override
  public void periodic() {}

  public void run(double power, ControlMethod method) {
    this.method = method;
    if(method == ControlMethod.SPIN_UP){
      shooter.set(ControlMode.PercentOutput, power);
    }
  }

  public void off(double power) {
    this.method = method;
    this.power = power;
    shooter.set(ControlMode.PercentOutput, power);
  }

  public TalonFX getShooterTalon(){
    return shooter;
  }

}