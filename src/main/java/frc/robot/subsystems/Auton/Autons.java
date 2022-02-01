// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Auton;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

public class Autons extends CommandBase {
  private DriveBaseSubsystem driveBase;
  private double powerForStraight, timeForStraight, powerForTurn, timeForTurn;
  private String direction;
  /** Creates a new Autons. */
  public Autons(DriveBaseSubsystem driveBaseSubsystem, double powerForStraight, double timeForStraight, double powerForTurn, double timeForTurn, String direction) {
    super(new StraightPowerTime(driveBaseSubsystem, powerForStraight, timeForStraight), new TurnPowerTime(driveBaseSubsystem, direction, powerForTurn, timeForTurn));
    super(new StraightPowerTime)
  }
}
