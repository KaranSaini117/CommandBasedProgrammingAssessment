package frc.robot.subsystems.autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.MoveArm;
import frc.robot.subsystems.RunIntake;
import frc.robot.subsystems.RunShooter;
import frc.robot.subsystems.ShooterSubsystem;

public class ScorePoints extends SequentialCommandGroup {
    public ScorePoints(IntakeSubsystem intakeSubsystem, ShooterSubsystem shooterSubsystem, ArmSubsystem armSubsystem) {
        addCommands(new RunIntake(intakeSubsystem, 0.5));
        addCommands(new RunShooter(shooterSubsystem));
        addCommands(new MoveArm(armSubsystem, 0.5, false));
    }
}
