// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private TalonFX talonFX;
  public IntakeSubsystem(TalonFX talonFX) {
    this.talonFX = talonFX;
    talonFX.setInverted(false);
  }
  public void setPower(double power) {
      talonFX.set(ControlMode.PercentOutput, power);
  }
  public TalonFX getTalonFX() {
      return talonFX;
  }
  public boolean getInverted() {
    return talonFX.getInverted();
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
