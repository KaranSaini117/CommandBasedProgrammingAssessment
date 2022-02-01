// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private TalonFX leftMast;
  private TalonFX rightMast;
  private TalonFX leftFollow;
  private TalonFX rightFollow;
  public DriveBaseSubsystem() {
    leftMast = new TalonFX(0);
    rightMast = new TalonFX(0);
    rightFollow = new TalonFX(0);
    leftFollow = new TalonFX(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public TalonFX getLeftMast() {
    return leftMast;
  }
  public TalonFX getRightMast() {
    return rightMast;
  }
  public TalonFX getLeftFollow() {
    return leftFollow;
  }
  public TalonFX getRightFollow() {
    return rightFollow;
  }
  public void setLeftPower(double power) {
    leftMast.set(ControlMode.PercentOutput, power);
    leftFollow.set(ControlMode.PercentOutput, power);
  }
  public void setRightPower(double power) {
    rightMast.set(ControlMode.PercentOutput, power);
    rightFollow.set(ControlMode.PercentOutput, power);
  }
  public void brake() {
    leftMast.set(ControlMode.PercentOutput, 0);
    leftFollow.set(ControlMode.PercentOutput, 0);
    rightMast.set(ControlMode.PercentOutput, 0);
    rightFollow.set(ControlMode.PercentOutput, 0);
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
