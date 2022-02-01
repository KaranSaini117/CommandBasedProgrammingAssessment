// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  private TalonFX ta1;
  private TalonFX ta2;
  private TalonFX ta3;
  private TalonFX ta4;
  
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSubsystem(TalonFX ta1, TalonFX ta2, TalonFX ta3, TalonFX ta4) {
    this.ta1 = ta1;
    this.ta2 = ta2;
    this.ta3 = ta3;
    this.ta4 = ta4;
  }

  public TalonFX getLeftMast() {
    return ta1;
  }
  public TalonFX getRightMast() {
    return ta2;
  }
  public TalonFX getLeftFollow() {
    return ta3;
  }
  public TalonFX getRightFollow() {
    return ta4;
  }

  public void setPower(double power) {
    ta1.set(ControlMode.PercentOutput, power);
    ta2.set(ControlMode.PercentOutput, power);
    ta3.set(ControlMode.PercentOutput, power);
    ta4.set(ControlMode.PercentOutput, power);
  }

  public void setRightPower(double power) {
    ta1.set(ControlMode.PercentOutput, power);
    ta3.set(ControlMode.PercentOutput, power);
  }
  public void setLeftPower(double power) {
    ta2.set(ControlMode.PercentOutput, power);
    ta4.set(ControlMode.PercentOutput, power);
  }
  @Override
  public void periodic() {
  }
  public void brake () {
    ta1.setNeutralMode(NeutralMode.Brake);
    ta2.setNeutralMode(NeutralMode.Brake);
    ta3.setNeutralMode(NeutralMode.Brake);
    ta4.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    ta1.setNeutralMode(NeutralMode.Coast);
    ta2.setNeutralMode(NeutralMode.Coast);
    ta3.setNeutralMode(NeutralMode.Coast);
    ta4.setNeutralMode(NeutralMode.Coast);
  }

}

