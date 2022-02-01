// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.cargo;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CargoSubsystem extends SubsystemBase {
  private TalonFX lowerTalon;
  private TalonFX upperTalon;

  public CargoSubsystem() {
    this.lowerTalon = new TalonFX(0);
    this.upperTalon = new TalonFX(5);
  }

  public void setPower(double power) {
    this.lowerTalon.set(ControlMode.PercentOutput, power);
    this.upperTalon.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    this.lowerTalon.setNeutralMode(NeutralMode.Brake);
    this.upperTalon.setNeutralMode(NeutralMode.Brake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
