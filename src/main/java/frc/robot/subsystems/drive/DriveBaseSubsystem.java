// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  /** Creates a new DriveBaseSubsystem. */

  private TalonFX left1;
  private TalonFX left2;
  private TalonFX right1;
  private TalonFX right2;

  public DriveBaseSubsystem() {
    left1 = new TalonFX(1);
    right1 = new TalonFX(2);
    left2 = new TalonFX(3);
    right2 = new TalonFX(4);
  }

  public void setAllPower(double power) {
    left1.set(ControlMode.PercentOutput, power);
    left1.set(ControlMode.PercentOutput, power);
    left1.set(ControlMode.PercentOutput, power);
    left1.set(ControlMode.PercentOutput, power);
  }

  public void setLeftPower(double power) {
    left1.set(ControlMode.PercentOutput, power);
    left1.set(ControlMode.PercentOutput, power);
  }

  public void setRightPower(double power) {
    right1.set(ControlMode.PercentOutput, power);
    right1.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
