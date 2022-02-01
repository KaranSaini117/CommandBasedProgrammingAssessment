package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.RunCargoIntake;
import frc.robot.subsystems.HatchSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.DriveBaseSubsystem;

public class StraightAndIntake extends SequentialCommandGroup {

  public StraightAndIntake(IntakeSubsystem intakeSubsystem, HatchSubsystem hatchSubsystem, DriveBaseSubsystem driveBaseSubsystem) {
    addCommands(new RunCargoIntake(intakeSubsystem));
    addCommands(new RunHatchIntake(hatchSubsystem,1));
    addCommands(new RunHatchIntake(hatchSubsystem,2));
  }

}
