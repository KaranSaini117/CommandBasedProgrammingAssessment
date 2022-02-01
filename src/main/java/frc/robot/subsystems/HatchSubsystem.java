// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class HatchSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TalonFX hatchMotor;
  private double speed = 0.5;
  public HatchSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void hatchIn(){
    hatchMotor.set(ControlMode.PercentOutput, -speed);
  }

  public void hatchOut(){
    hatchMotor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
