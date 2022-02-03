// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunHatch extends CommandBase {
  /** Creates a new RunHatch. */

  private HatchSubsystem hatchSubsystem;
  private XboxController joystick;

  public RunHatch(HatchSubsystem hatchSubsystem, XboxController joystick) {
    this.hatchSubsystem = hatchSubsystem;
    this.joystick= joystick;
    addRequirements(hatchSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getAButton()) {
      hatchSubsystem.setPower(0.2);
    }
    else if (joystick.getBButton()) {
      hatchSubsystem.setPower(-0.2);
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
