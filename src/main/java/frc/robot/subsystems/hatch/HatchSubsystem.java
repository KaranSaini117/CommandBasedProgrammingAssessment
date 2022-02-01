// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchSubsystem extends SubsystemBase {
  private TalonFX talon;
  /** Creates a new HatchSubsystem. */
  public HatchSubsystem() {
    this.talon = new TalonFX(4);
  }

  public void setPower(double power) {
    talon.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    talon.setNeutralMode(NeutralMode.Brake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
