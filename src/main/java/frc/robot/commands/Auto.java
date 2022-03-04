package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.AutoConstants;
import frc.robot.Constants.PowerConstants;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.GrabberSubsystem;
import frc.robot.subsystems.IntakeConveyorSubsystem;

public class Auto extends SequentialCommandGroup {
    public Auto(DriveBaseSubsystem driveBaseSubsystem, IntakeConveyorSubsystem intakeConveyorSubsystem, GrabberSubsystem grabberSubsystem) {
        addCommands(
            new DriveForTime(driveBaseSubsystem, AutoConstants.drivePower, AutoConstants.driveTime),
            new RunIntake(intakeConveyorSubsystem, PowerConstants.intakePower),
            new Grab(grabberSubsystem)
        );
    }
}