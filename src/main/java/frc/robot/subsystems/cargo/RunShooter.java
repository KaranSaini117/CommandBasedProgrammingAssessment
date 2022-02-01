// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.cargo;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunShooter extends CommandBase {
  private CargoSubsystem CargoSubsystem;

  /** Creates a new RunShooter. */
  public RunShooter(CargoSubsystem CargoSubsystem) {
    this.CargoSubsystem = CargoSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(CargoSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    CargoSubsystem.setPower(-0.1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    CargoSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
