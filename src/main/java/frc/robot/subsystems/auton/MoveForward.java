// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.auton;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drive.DrivebaseSubsystem;

public class MoveForward extends CommandBase {
  /** Creates a new MoveForward. */
  private DrivebaseSubsystem drivebaseSubsystem;
  private double power;
  private double time;
  private double initialTime;

  public MoveForward(DrivebaseSubsystem drivebaseSubsystem, double power, double time) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebaseSubsystem = drivebaseSubsystem;
    this.power = power;
    this.time = time;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivebaseSubsystem.setPower(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivebaseSubsystem.setPower(0);
    drivebaseSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() - initialTime < time) {
      return true;
    }
    else {
      return false;
    }
  }
}
