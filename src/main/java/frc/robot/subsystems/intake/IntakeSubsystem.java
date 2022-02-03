// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */
  private TalonFX intakeMotor;
  
  public IntakeSubsystem() {
    intakeMotor = new TalonFX(5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public TalonFX getIntakeMotor(){
    return intakeMotor;
  }

  public void setPower(double power){
    intakeMotor.set(ControlMode.PercentOutput, power);
  }
}
