// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter;

import frc.robot.subsystems.drive.DriveBaseSub;
import frc.robot.Constants.CanIds;
import frc.robot.com.team7419.PaddedXbox;
import frc.robot.subsystems.intake.IntakeSub;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ConveyerSub extends CommandBase {
  private ConveyerSub conveyer;
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  private TalonFX talon;

  /** Creates a new RunIntakeWithR2. */
  public ConveyerSub() {
    talon = new TalonFX(CanIds.shooterFalcon.id);
    // talon.configFactoryDefault();
    talon.setInverted(true);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    conveyer.drive.setPowerAll(xbox.getRightTrig());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    conveyer.drive.setPowerAll(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
