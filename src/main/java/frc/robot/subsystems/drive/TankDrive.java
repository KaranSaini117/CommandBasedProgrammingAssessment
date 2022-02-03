// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */
  private DriveBaseSubsystem driveBaseSubsystem;
  private XboxController joystick;

  public TankDrive(DriveBaseSubsystem driveBaseSubsystem, XboxController joystick) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.joystick = joystick;

    addRequirements(driveBaseSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBaseSubsystem.setLeftPower(joystick.getLeftY());
    driveBaseSubsystem.setRightPower(joystick.getRightY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
