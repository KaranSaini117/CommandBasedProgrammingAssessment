// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hatch;

import javax.swing.TransferHandler.TransferSupport;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class UseHatch extends CommandBase {
  /** Creates a new UseHatch. */
  private HatchSubsystem hatchSubsystem;
  private XboxController joystick;

  public UseHatch(HatchSubsystem hatchSubsystem, XboxController joystick) {
    this.hatchSubsystem = hatchSubsystem;
    this.joystick = joystick;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatchSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getAButton() == true){
      hatchSubsystem.setPower(-0.7);
    }
    else if (joystick.getYButton() == true){
      hatchSubsystem.setPower(0.7);
    }
    else{
      hatchSubsystem.setPower(0);
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
