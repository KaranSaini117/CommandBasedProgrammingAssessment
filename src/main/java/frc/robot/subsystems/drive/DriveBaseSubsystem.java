// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  private TalonFX leftFront;
  private TalonFX leftBack;
  private TalonFX rightFront;
  private TalonFX rightBack;
  
  /** Creates a new DriveBaseSubsystem. */
  public DriveBaseSubsystem() {
    this.leftFront = new TalonFX(3);
    this.leftBack = new TalonFX(5);
    this.rightFront = new TalonFX(6);
    this.rightBack = new TalonFX(8);
    rightFront.setInverted(true);
    rightBack.setInverted(true);
  }

  public void setLeftPower(double power) {
    leftFront.set(ControlMode.PercentOutput, power);
    leftBack.set(ControlMode.PercentOutput, power);
  }
  
  public void setRightPower(double power) {
    rightFront.set(ControlMode.PercentOutput, power);
    rightBack.set(ControlMode.PercentOutput, power);
  }

  public void setAll(double power) {
    leftFront.set(ControlMode.PercentOutput, power);
    leftBack.set(ControlMode.PercentOutput, power);
    rightFront.set(ControlMode.PercentOutput, power);
    rightBack.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    leftFront.setNeutralMode(NeutralMode.Brake);
    leftBack.setNeutralMode(NeutralMode.Brake);
    rightFront.setNeutralMode(NeutralMode.Brake);
    rightBack.setNeutralMode(NeutralMode.Brake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
