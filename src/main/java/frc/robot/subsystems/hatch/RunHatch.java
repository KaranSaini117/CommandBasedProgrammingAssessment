// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class RunHatch extends CommandBase {

    public RunHatch(HatchSubsystem hatchSubsystem) {
      this.hatchSubsystem = hatchSubsystem; 
      this.xboxController = xboxcontroller;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatchSubsystem, xboxcontroller);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      if(xboxController.getAButton{}
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
