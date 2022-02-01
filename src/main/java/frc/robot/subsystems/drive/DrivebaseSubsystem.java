// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivebaseSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private TalonFX talon1;
  private TalonFX talon2;
  private TalonFX talon3;
  private TalonFX talon4;

  public DrivebaseSubsystem(TalonFX talon1, TalonFX talon2,TalonFX talon3, TalonFX talon4) {
    talon1 = new TalonFX(1);
    talon2 = new TalonFX(2);
    talon3 = new TalonFX(3);
    talon4 = new TalonFX(4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void setPower(double power) {
    talon1.set(ControlMode.PercentOutput, power);
    talon2.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }
  
  public void brake() {
    talon1.setNeutralMode(NeutralMode.Brake);
    talon2.setNeutralMode(NeutralMode.Brake);
    talon3.setNeutralMode(NeutralMode.Brake);
    talon4.setNeutralMode(NeutralMode.Brake);
  }

  public void coast() {
    talon1.setNeutralMode(NeutralMode.Coast);
    talon2.setNeutralMode(NeutralMode.Coast);
    talon3.setNeutralMode(NeutralMode.Coast);
    talon4.setNeutralMode(NeutralMode.Coast);
  }
}
