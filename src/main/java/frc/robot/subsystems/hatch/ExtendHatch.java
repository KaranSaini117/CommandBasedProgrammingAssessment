// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ExtendHatch extends CommandBase {
  private HatchSubsystem hatchSubsystem;
  private double initTime;
  /** Creates a new RetractHatch. */
  public ExtendHatch(HatchSubsystem hatchSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatchSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    hatchSubsystem.setPower(0.1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hatchSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - initTime) > 0.2; // run talon in reverse for duration
  }
}
