// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HatchSubsystem;

public class RunHatch extends CommandBase {
  private HatchSubsystem hatchSubsystem;
  private XboxController xboxController;
  /** Creates a new RunHatch. */
  public RunHatch(HatchSubsystem hatchSubsystem, XboxController xboxController) {
    this.hatchSubsystem = hatchSubsystem;
    this.xboxController = xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatchSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (xboxController.getXButtonPressed()) {
      this.hatchSubsystem.grabHatch();
    } else if (xboxController.getYButtonPressed()) {
      this.hatchSubsystem.releaseHatch();
    }
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
