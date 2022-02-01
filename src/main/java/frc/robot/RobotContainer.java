// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.HatchSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.DriveBaseSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.RunHatchIntake;
import frc.robot.commands.RunCargoIntake;
import frc.robot.commands.StraightAndIntake;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final HatchSubsystem hatchSubsystem = new HatchSubsystem();
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final DriveBaseSubsystem DriveBaseSubsystem = new DriveBaseSubsystem();
  private final XboxController joystick = new XboxController(0);
  // private final RunHatchIntake runHatchIntake = new RunHatchIntake(hatchSubsystem, 0);
  // private final RunCargoIntake runCargoIntake = new RunCargoIntake(intakeSubsystem);
  private final StraightAndIntake straightAndIntake = new StraightAndIntake(intakeSubsystem, hatchSubsystem, DriveBaseSubsystem);
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
    new JoystickButton(joystick, XboxController.Button.kA.value).whenPressed(new RunHatchIntake(hatchSubsystem,1));
    new JoystickButton(joystick, XboxController.Button.kB.value).whenPressed(new RunHatchIntake(hatchSubsystem,2));
    new JoystickButton(joystick, XboxController.Button.kX.value).whileHeld(new RunCargoIntake(intakeSubsystem));

    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return straightAndIntake;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    
  }
}
