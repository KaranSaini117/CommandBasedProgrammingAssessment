// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchSubsystem extends SubsystemBase {
  /** Creates a new HatchSubsystem. */

  private TalonFX hatchMotor;

  public HatchSubsystem() {
    hatchMotor = new TalonFX(10);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setPower(double power) {
    hatchMotor.set(ControlMode.PercentOutput, power);
  }
}
