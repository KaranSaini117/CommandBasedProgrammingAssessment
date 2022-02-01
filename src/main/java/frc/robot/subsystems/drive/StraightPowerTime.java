// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSubsystem driveBaseSubsystem;
  private double initialTime;
  private double time;
  private double power;

  /** Creates a new StraightPowerTime. */
  public StraightPowerTime(DriveBaseSubsystem driveBaseSubsystem, double time, double power) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.time = time;
    this.power = power;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBaseSubsystem.setAll(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return System.currentTimeMillis() - initialTime > time;
  }
}
