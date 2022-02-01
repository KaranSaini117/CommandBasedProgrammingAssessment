package frc.robot.subsystems.autonomous;

import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.arm.ArmSubsytem;
import frc.robot.subsystems.arm.RotateArm;
import frc.robot.subsystems.driveBase.DriveBaseSubsystem;
import frc.robot.subsystems.intake.IntakeSubsystem;
import frc.robot.subsystems.intake.RunIntake;
import frc.robot.subsystems.shooter.RunShooter;
import frc.robot.subsystems.shooter.ShooterSubsystem;

public class DriveIntakeThenShoot extends SequentialCommandGroup{
    public DriveIntakeThenShoot(IntakeSubsystem intakeSubsystem, ShooterSubsystem shooterSubsystem, ArmSubsytem armSubsytem) {
        addCommands(new RunShooter(shooterSubsystem));
        addCommands(new WaitCommand(1));
        addCommands(new RunIntake(intakeSubsystem, 20));
        addCommands(new RotateArm(armSubsytem));
    }
}
