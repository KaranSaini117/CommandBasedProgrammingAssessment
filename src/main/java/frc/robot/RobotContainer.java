// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.Constants.OIConstants;
import frc.robot.Constants.PowerConstants;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.Auto;
import frc.robot.commands.Grab;
import frc.robot.commands.Release;
import frc.robot.commands.RunIntake;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.GrabberSubsystem;
import frc.robot.subsystems.IntakeConveyorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveBaseSubsystem driveBaseSubsystem = new DriveBaseSubsystem();
  private final IntakeConveyorSubsystem intakeConveyorSubsystem = new IntakeConveyorSubsystem();
  private final GrabberSubsystem grabberSubsystem = new GrabberSubsystem();

  private final XboxController driverController = new XboxController(OIConstants.xboxPort);

  private final Auto autoCommandGroup = new Auto(driveBaseSubsystem, intakeConveyorSubsystem, grabberSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    setDefaultCommands();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(driverController, Button.kA.value)
      .whenHeld(new RunIntake(intakeConveyorSubsystem, PowerConstants.intakePower));
      new JoystickButton(driverController, Button.kX.value)
      .whenHeld(new Grab(grabberSubsystem));
      new JoystickButton(driverController, Button.kY.value)
      .whenHeld(new Release(grabberSubsystem));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return autoCommandGroup;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    driveBaseSubsystem.setDefaultCommand(new ArcadeDrive(driveBaseSubsystem, driverController, PowerConstants.driveBaseStraight, PowerConstants.driveBaseTurn));
  }
}
