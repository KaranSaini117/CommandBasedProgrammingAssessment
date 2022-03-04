// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

/** An example command that uses an example subsystem. */
public class ArcadeDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveBaseSubsystem driveBaseSubsystem;
  private final XboxController driveController;
  
  private double straightCoefficient, turnCoefficient;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArcadeDrive(DriveBaseSubsystem driveBaseSubsystem, XboxController driveController, double straightCoefficient, double turnCoefficient) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.driveController = driveController;

    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (driveController.getLeftY() != 0) {
        double straightPower = driveController.getLeftY() * straightCoefficient;
        driveBaseSubsystem.setLeftMotor1Power(straightPower);
        driveBaseSubsystem.setLeftMotor2Power(straightPower);
        driveBaseSubsystem.setRightMotor1Power(straightPower);
        driveBaseSubsystem.setRightMotor2Power(straightPower);
      } else if (driveController.getRightX() != 0) {
        double turnPower = Math.abs(driveController.getRightX() * turnCoefficient);
        if (driveController.getRightX() > 0) {
          driveBaseSubsystem.setLeftMotor1Power(turnPower);
          driveBaseSubsystem.setLeftMotor2Power(turnPower);
          driveBaseSubsystem.setRightMotor1Power(-turnPower);
          driveBaseSubsystem.setRightMotor2Power(-turnPower);
        } else {
          driveBaseSubsystem.setLeftMotor1Power(-turnPower);
          driveBaseSubsystem.setLeftMotor2Power(-turnPower);
          driveBaseSubsystem.setRightMotor1Power(turnPower);
          driveBaseSubsystem.setRightMotor2Power(turnPower);
        }
      }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      driveBaseSubsystem.setLeftMotor1Power(0);
      driveBaseSubsystem.setLeftMotor2Power(0);
      driveBaseSubsystem.setRightMotor1Power(0);
      driveBaseSubsystem.setRightMotor1Power(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
