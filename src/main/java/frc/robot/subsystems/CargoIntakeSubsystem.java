// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CargoIntakeSubsystem extends SubsystemBase {
  private TalonFX talon;
  /** Creates a new CargoIntakeSubsystem. */
  public CargoIntakeSubsystem(TalonFX talon) {
    this.talon = talon;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setPower(double power) {
    this.talon.set(ControlMode.PercentOutput, power);
  }
}
