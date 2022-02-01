// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.auto.GrabHatchPanel;
import frc.robot.subsystems.cargo.CargoSubsystem;
import frc.robot.subsystems.cargo.RunIntake;
import frc.robot.subsystems.cargo.RunShooter;
import frc.robot.subsystems.drive.ArcadeDrive;
import frc.robot.subsystems.drive.DriveBaseSubsystem;
import frc.robot.subsystems.hatch.ExtendHatch;
import frc.robot.subsystems.hatch.HatchSubsystem;
import frc.robot.subsystems.hatch.RetractHatch;
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
  private final XboxController xboxController = new XboxController(0);

  private final CargoSubsystem cargoSubsystem = new CargoSubsystem();
  private final HatchSubsystem hatchSubsystem = new HatchSubsystem();
  private final DriveBaseSubsystem driveBaseSubsystem = new DriveBaseSubsystem();

  private final ArcadeDrive arcadeDrive = new ArcadeDrive(xboxController, driveBaseSubsystem);

  private final GrabHatchPanel grabHatchPanel = new GrabHatchPanel(driveBaseSubsystem, hatchSubsystem);


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
  private void configureButtonBindings() {
    new JoystickButton(xboxController, XboxController.Button.kA.value)
    .whenPressed(new RunIntake(cargoSubsystem));
    new JoystickButton(xboxController, XboxController.Button.kB.value)
    .whenPressed(new RunShooter(cargoSubsystem));

    new JoystickButton(xboxController, XboxController.Button.kLeftBumper.value)
    .whenPressed(new ExtendHatch(hatchSubsystem));
    new JoystickButton(xboxController, XboxController.Button.kRightBumper.value)
    .whenPressed(new RetractHatch(hatchSubsystem));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return grabHatchPanel;
  }

  // schedule default commands here
  public void setDefaultCommands() {
    driveBaseSubsystem.setDefaultCommand(arcadeDrive);
  }
}
