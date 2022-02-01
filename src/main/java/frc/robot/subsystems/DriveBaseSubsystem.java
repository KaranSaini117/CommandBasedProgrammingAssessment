// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveBaseSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TalonFX left1;
	public TalonFX right1;
	public TalonFX left2;
  public TalonFX right2;
  public double power;
  public DriveBaseSubsystem() {
    left1 = new TalonFX(1);
		right1 = new TalonFX(2);
		left2 = new TalonFX(3);
    right2 = new TalonFX(4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runLeft(double power){
    left1.set(ControlMode.PercentOutput, power);
    left2.set(ControlMode.PercentOutput, power);
  }
  public void runRight(double power){
    right1.set(ControlMode.PercentOutput, power);
    right2.set(ControlMode.PercentOutput, power);
  }
  public void runBoth(double power){
    runLeft(power);
    runRight(power);
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
