// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSubsystem driveBaseSubsystem;
  private double power;
  private double time;
  private long inittime;
  /** Creates a new StraightPowerTime. */
  public StraightPowerTime(DriveBaseSubsystem driveBaseSubsystem, double power, double time) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.power = power;
    this.time = time;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    inittime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBaseSubsystem.setPowerAll(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSubsystem.setPowerAll(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return inittime + time < System.currentTimeMillis();
  }
}
