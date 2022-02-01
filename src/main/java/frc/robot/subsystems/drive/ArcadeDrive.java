// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  /** Creates a new ArcadeDrive. */
  private DrivebaseSubsystem drivebaseSubsystem;
  private XboxController joystick;
  private double straight;
  private double turn;
  public ArcadeDrive(DrivebaseSubsystem drivebaseSubsystem, XboxController joystick, double straight, double turn) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebaseSubsystem = drivebaseSubsystem;
    this.joystick = joystick;
    this.straight = straight;
    this.turn = turn;
    addRequirements(drivebaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double y = joystick.getLeftY() * straight; //left up and down being used to go forward and back
    double x = joystick.getRightX() * turn; //right left and right being used for turning
    drivebaseSubsystem.setPower(y+x);
    drivebaseSubsystem.setPower(y-x);
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
