// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSubsystem driveBase;
  private PaddedXbox joystick;
  private double d1;
  private double d2;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSubsystem driveBase, PaddedXbox joystick, double d1, double d2) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    this.d1 = d1;
    this.d2 = d2;
    addRequirements(driveBase);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBase.setLeftPower((joystick.getLeftY() * d1) + (joystick.getRightX() * d2));
    driveBase.setRightPower((joystick.getLeftY() * d1) - (joystick.getRightX() * d2));
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

