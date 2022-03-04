// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;;

public class DriveBaseSubsystem extends SubsystemBase {
  private final TalonFX leftMotor1 = new TalonFX(MotorConstants.leftMotor1ID);
  private final TalonFX leftMotor2 = new TalonFX(MotorConstants.leftMotor2ID);
  private final TalonFX rightMotor1 = new TalonFX(MotorConstants.rightMotor1ID);
  private final TalonFX rightMotor2 = new TalonFX(MotorConstants.rightMotor2ID);


  /** Creates a new ExampleSubsystem. */
  public DriveBaseSubsystem() {
    // right or left motor depends on setup
    rightMotor1.setInverted(true);
    rightMotor2.setInverted(true);
  }

  public TalonFX getLeftMotor1() {
    return leftMotor1;
  }
  public TalonFX getLeftMotor2() {
    return leftMotor2;
  }
  public TalonFX getRightMotor1() {
    return rightMotor1;
  }
  public TalonFX getRightMotor2() {
    return rightMotor2;
  }

  public void setLeftMotor1Power(double p) {
    leftMotor1.set(ControlMode.PercentOutput, p);
  }
  public void setLeftMotor2Power(double p) {
    leftMotor2.set(ControlMode.PercentOutput, p);
  }
  public void setRightMotor1Power(double p) {
    rightMotor1.set(ControlMode.PercentOutput, p);
  }
  public void setRightMotor2Power(double p) {
    rightMotor2.set(ControlMode.PercentOutput, p);
  }

  public void brake() {
    leftMotor1.setNeutralMode(NeutralMode.Brake);
    leftMotor2.setNeutralMode(NeutralMode.Brake);
    rightMotor1.setNeutralMode(NeutralMode.Brake);
    rightMotor2.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    leftMotor1.setNeutralMode(NeutralMode.Coast);
    leftMotor2.setNeutralMode(NeutralMode.Coast);
    rightMotor1.setNeutralMode(NeutralMode.Coast);
    rightMotor2.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
