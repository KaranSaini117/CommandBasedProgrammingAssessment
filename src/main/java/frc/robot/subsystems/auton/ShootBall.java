// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.auton;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.auton.ShooterSubsystem.ControlMethod;

public class ShootBall extends CommandBase {
  /** Creates a new ShootBall. */
  private ShooterSubsystem shooterSubsystem;
  private double power;
  public ShootBall(ShooterSubsystem shooterSubsystem, double power) {
    this.shooterSubsystem = shooterSubsystem;
    this.power = power;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shooterSubsystem.run(power, ControlMethod.SPIN_UP);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shooterSubsystem.off(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
