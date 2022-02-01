// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {

  private TalonFX leftTalon;
  private TalonFX rightTalon;
  /** Creates a new DriveBaseSubsystem. */
  public DriveBaseSubsystem(TalonFX leftTalon, TalonFX rightTalon) {
    this.leftTalon = leftTalon;
    this.rightTalon = rightTalon;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setPowerAll(double power) {
    leftTalon.set(ControlMode.PercentOutput, power);
    rightTalon.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeft(double power) {
    leftTalon.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRight(double power) {
    rightTalon.set(ControlMode.PercentOutput, power);
  }
}
