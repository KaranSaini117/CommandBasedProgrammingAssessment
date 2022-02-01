// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CargoIntakeSubsystem;

public class RunCargoIntake extends CommandBase {
  private CargoIntakeSubsystem cargoIntakeSubsystem;
  private XboxController xboxController;
  /** Creates a new RunCargoIntake. */
  public RunCargoIntake(CargoIntakeSubsystem cargoIntakeSubsystem, XboxController xboxController) {
    this.cargoIntakeSubsystem = cargoIntakeSubsystem;
    this.xboxController = xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(cargoIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (xboxController.getLeftBumperPressed()) {
      cargoIntakeSubsystem.setPower(0.5);
    } else if (xboxController.getRightBumperPressed()) {
      cargoIntakeSubsystem.setPower(-0.5);
    } else {
      cargoIntakeSubsystem.setPower(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    cargoIntakeSubsystem.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
