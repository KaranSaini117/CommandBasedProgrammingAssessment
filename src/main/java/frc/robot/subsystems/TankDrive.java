// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  private DriveBaseSubsystem driveBase;
  private PaddedXbox joystick;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSubsystem driveBase, PaddedXbox joystick) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    addRequirements(driveBase);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBase.setLeftPower(joystick.getLeftY());
    driveBase.setRightPower(joystick.getRightY());
    addRequirements(driveBase);
  }

  @Override
  public void end(boolean interrupted) {
    driveBase.setPower(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}

