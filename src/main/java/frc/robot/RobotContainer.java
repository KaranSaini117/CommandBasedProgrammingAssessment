// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.autonomous.RunRobot;
import frc.robot.subsystems.drivebase.DriveBaseSubsystem;
import frc.robot.subsystems.drivebase.DriveStraight;
import frc.robot.subsystems.drivebase.DriveWithJoystick;
import frc.robot.subsystems.hatch.HatchSubsystem;
import frc.robot.subsystems.hatch.UseHatch;
import frc.robot.subsystems.intake.IntakeSubsystem;
import frc.robot.subsystems.intake.IntakeWithJoystick;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final XboxController joystick = new XboxController(0);
  private final DriveBaseSubsystem driveBaseSubsystem = new DriveBaseSubsystem();
  private final DriveWithJoystick driveWithJoystick = new DriveWithJoystick(driveBaseSubsystem, joystick);
  private final HatchSubsystem hatchSubsystem = new HatchSubsystem();
  private final UseHatch useHatch = new UseHatch(hatchSubsystem, joystick);
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final IntakeWithJoystick intakeWithJoystick = new IntakeWithJoystick(intakeSubsystem, joystick);
  private final RunRobot runRobot = new RunRobot();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
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
    return runRobot;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    driveBaseSubsystem.setDefaultCommand(driveWithJoystick);
    hatchSubsystem.setDefaultCommand(useHatch);
    intakeSubsystem.setDefaultCommand(intakeWithJoystick);
  }
}
