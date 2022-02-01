// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.RunIntakeWithJoystick;
import frc.robot.subsystems.HatchSubsystem;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.RunHatch;
import frc.robot.subsystems.ArcadeDrive;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private DriveBaseSubsystem driveBaseSubsystem = new DriveBaseSubsystem();
  private IntakeSubsystem intakeSubsystem;
  private HatchSubsystem hatchSubsystem;
  private XboxController joystick;
  private RunIntakeWithJoystick runIntakeWithJoystick;
  private RunHatch runHatch;
  private PowerForTime powerForTime;
  private ArcadeDrive arcadeDrive;
  private TalonFX talonFX;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer(TalonFX talonFX) {
    this.talonFX = talonFX;
    intakeSubsystem = new IntakeSubsystem(this.talonFX);
    hatchSubsystem = new HatchSubsystem(this.talonFX);
    runIntakeWithJoystick = new RunIntakeWithJoystick(intakeSubsystem, joystick);
    runHatch = new RunHatch(hatchSubsystem, joystick);
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

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return powerForTime;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    driveBaseSubsystem.setDefaultCommand(arcadeDrive);
    intakeSubsystem.setDefaultCommand(runIntakeWithJoystick);
    hatchSubsystem.setDefaultCommand(runHatch);
  }
}
