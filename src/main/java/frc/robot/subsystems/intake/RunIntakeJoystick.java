// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntakeJoystick extends CommandBase {
  /** Creates a new RunIntakeJoystick. */
  private IntakeSubsystem intakeSubsystem;
  private XboxController joystick;
  public RunIntakeJoystick(IntakeSubsystem intakeSubsystem, XboxController joystick) {
    this.intakeSubsystem = intakeSubsystem;
    this.joystick = joystick;
    addRequirements(intakeSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeSubsystem.setPower(joystick.getLeftY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakeSubsystem.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
