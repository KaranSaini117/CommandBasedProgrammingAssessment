// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drive.DrivebaseSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ForwardShootBack extends SequentialCommandGroup {
  /** Creates a new ForwardShootBack. */
  public ForwardShootBack(DrivebaseSubsystem drivebaseSubsystem, ShooterSubsystem shooterSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new MoveForward(drivebaseSubsystem, 0.5, 2), new ShootBall(shooterSubsystem, 0.5), new ShootBall(shooterSubsystem, 0), new Backwards(drivebaseSubsystem, -0.5, 2));
  }
}
