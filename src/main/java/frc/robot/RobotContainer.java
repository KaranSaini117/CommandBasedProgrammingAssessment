// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.auton.Backwards;
import frc.robot.subsystems.auton.ForwardShootBack;
import frc.robot.subsystems.auton.MoveForward;
import frc.robot.subsystems.auton.ShootBall;
import frc.robot.subsystems.auton.ShooterSubsystem;
import frc.robot.subsystems.drive.ArcadeDrive;
import frc.robot.subsystems.drive.DrivebaseSubsystem;
import frc.robot.subsystems.intake.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem(null);
  private final DrivebaseSubsystem drivebaseSubsystem = new DrivebaseSubsystem(null, null, null, null);
  private final XboxController joystick = new XboxController(0);
  private final ArcadeDrive arcadeDrive = new ArcadeDrive(drivebaseSubsystem, joystick, 0.5, 0.5);
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
  private final ShootBall shootBall = new ShootBall(shooterSubsystem, 0.5);
  private final MoveForward moveForward = new MoveForward(drivebaseSubsystem, 0.5, 2);
  private final Backwards backwards = new Backwards(drivebaseSubsystem, -0.5, 2);
  private final ForwardShootBack forwardShootBack = new ForwardShootBack(drivebaseSubsystem, shooterSubsystem);

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
    return forwardShootBack;
  }

  // schedule default commands here
  public void setDefaultCommands(){
    
  }
}
