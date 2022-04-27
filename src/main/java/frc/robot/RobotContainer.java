// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.MotorSubsystem;
import frc.robot.subsystems.MoveArm;
import frc.robot.subsystems.RunIntake;
import frc.robot.subsystems.RunMotor;
import frc.robot.subsystems.RunShooter;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.autos.ScorePoints;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem intakeSubsystem;
  private final DriveBaseSubsystem driveBaseSubsystem;
  private final ShooterSubsystem shooterSubsystem;
  private final ArmSubsystem armSubsystem;
  private final ScorePoints scorePointsAuto;
  private final MotorSubsystem motorSubsystem;
  private final RunIntake runIntake;
  private final RunShooter runShooter;
  private final MoveArm runArm;
  private final RunMotor runMotor;





  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    intakeSubsystem = new IntakeSubsystem();
    driveBaseSubsystem = new DriveBaseSubsystem();
    shooterSubsystem = new ShooterSubsystem();
    armSubsystem = new ArmSubsystem();
    motorSubsystem = new MotorSubsystem();
    scorePointsAuto = new ScorePoints(intakeSubsystem, shooterSubsystem, armSubsystem);

    runIntake = new RunIntake(intakeSubsystem, 0);
    runShooter = new RunShooter(shooterSubsystem);
    runArm = new MoveArm(armSubsystem, 0, true);
    runMotor = new RunMotor(motorSubsystem);

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return scorePointsAuto;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    intakeSubsystem.setDefaultCommand(runIntake);
    //shooterSubsystem.setDefaultCommand(runShooter);
    //armSubsystem.setDefaultCommand(runArm);
    motorSubsystem.setDefaultCommand(runMotor);
    
  }
}
