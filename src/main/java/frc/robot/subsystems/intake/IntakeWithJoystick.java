// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeWithJoystick extends CommandBase {
  /** Creates a new IntakeWithJoystick. */
  private IntakeSubsystem intakeSubsystem;
  private XboxController joystick;

  public IntakeWithJoystick(IntakeSubsystem intakeSubsystem, XboxController joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intakeSubsystem = intakeSubsystem;
    this.joystick = joystick;
    addRequirements(intakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getBButton() == true){
      intakeSubsystem.setPower(-0.7);
    }
    else if (joystick.getXButton() == true){
      intakeSubsystem.setPower(0.7);
    }
    else{
      intakeSubsystem.setPower(0);
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
