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
  private final MotorSubsystem motorSubsystem;
  private final RunMotor runMotor;
  private final XboxController joystick1;





  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    joystick1 = new XboxController(0);
    motorSubsystem = new MotorSubsystem();
    runMotor = new RunMotor(motorSubsystem, joystick1);
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
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
   // return scorePointsAuto;
  //}

  // schedule default commands here
  public void setDefaultCommands(){
    //intakeSubsystem.setDefaultCommand(runIntake);
    //shooterSubsystem.setDefaultCommand(runShooter);
    //armSubsystem.setDefaultCommand(runArm);
    motorSubsystem.setDefaultCommand(runMotor);
    
  }
}
