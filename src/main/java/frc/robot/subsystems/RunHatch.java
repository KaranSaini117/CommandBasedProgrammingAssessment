// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class RunHatch extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final HatchSubsystem hatchSubsystem;
  private double power;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public RunHatch(HatchSubsystem hatchSubsystem, double power) {
    this.hatchSubsystem = hatchSubsystem;
    this.power = power;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatchSubsystem);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    hatchSubsystem.setPower(0);
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    hatchSubsystem.setPower(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hatchSubsystem.setPower(0);
  }
  public double getPower() {
    return power;
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
