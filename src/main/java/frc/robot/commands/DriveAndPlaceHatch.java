// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.HatchSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DriveAndPlaceHatch extends SequentialCommandGroup {
  /** Creates a new DriveAndPlaceHatch. */
  public DriveAndPlaceHatch(DriveBaseSubsystem driveBaseSubsystem, HatchSubsystem hatchSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());

    //drive forward, release the hatch, and drive back
    addCommands(new StraightPowerTime(driveBaseSubsystem, 0.75, 2000),
    new InstantCommand(() -> {hatchSubsystem.releaseHatch();}, hatchSubsystem),
    new WaitCommand(2.5),
    new StraightPowerTime(driveBaseSubsystem, -0.75, 1000));
  }
}
