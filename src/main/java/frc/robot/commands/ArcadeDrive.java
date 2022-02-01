// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;
import static frc.robot.Constants.*;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSubsystem driveBaseSubsystem;
  private XboxController xboxController;
  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(DriveBaseSubsystem driveBaseSubsystem, XboxController xboxController) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.xboxController = xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBaseSubsystem.setPowerLeft(xboxController.getLeftY() * STRAIGHT_COEFFICIENT + xboxController.getRightX() * TURN_COEFFICIENT);
    driveBaseSubsystem.setPowerRight(xboxController.getLeftY() * STRAIGHT_COEFFICIENT - xboxController.getRightX() * TURN_COEFFICIENT);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSubsystem.setPowerAll(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
