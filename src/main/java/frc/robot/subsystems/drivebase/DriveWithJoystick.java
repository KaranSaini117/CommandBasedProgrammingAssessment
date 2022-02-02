// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveWithJoystick extends CommandBase {
  /** Creates a new DriveWithJoystick. */
  private DriveBaseSubsystem driveBaseSubsystem;
  private XboxController joystick;

  public DriveWithJoystick(DriveBaseSubsystem driveBaseSubsystem, XboxController joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.joystick = joystick;
    addRequirements(driveBaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getRightY() != 0){
      driveBaseSubsystem.setPower(joystick.getRightY());
    }
    if (joystick.getLeftX() != 0){
      driveBaseSubsystem.setLeftSidePower(joystick.getLeftX());
      driveBaseSubsystem.setRightSidePower(-joystick.getLeftX());
    }
    else{
      driveBaseSubsystem.setPower(0);
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSubsystem.setPower(0);
    driveBaseSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
