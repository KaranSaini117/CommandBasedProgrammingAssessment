package frc.robot.subsystems.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.cargo.IntakeSubsystem;
import frc.robot.subsystems.cargo.RunIntake;
import frc.robot.subsystems.drivebase.DriveBaseSubsystem;
import frc.robot.subsystems.hatch.HatchSubsystem;
import frc.robot.subsystems.hatch.RunHatch;
import edu.wpi.first.wpilibj.XboxController;

public class Autonomous extends SequentialCommandGroup {

  public Autonomous(DriveBaseSubsystem driveBaseSubsystem, IntakeSubsystem intakeSubsystem,
      HatchSubsystem hatchSubsystem) {

    // addCommands(new WaitCommand(2));
    addCommands(new RunIntake(intakeSubsystem));
    addCommands(new RunHatch(hatchSubsystem));
    addCommands(new RunIntake(intakeSubsystem));
}
}
