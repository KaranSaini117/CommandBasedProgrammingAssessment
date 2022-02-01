// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.ArcadeDrive;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.PaddedXbox;
import frc.robot.subsystems.RunIntake;
import frc.robot.subsystems.RunIntakeWithJoystick;
import frc.robot.subsystems.TankDrive;

public interface Factory {
    
    public IntakeSubsystem getIntakeSub();
    public PaddedXbox getPaddedXbox();
    public RunIntake getRunIntakeWithPower(double power);
    public RunIntakeWithJoystick getRunIntakeWithJoystick(PaddedXbox joystick);
    public DriveBaseSubsystem getDriveBaseSub();
    public TankDrive getTankDrive(PaddedXbox joystick);
    public ArcadeDrive getArcadeDrive(PaddedXbox joystick);
    public StraightPowerTime getStraightPowerTime(double power, double time);
    public TurnPowerTime getTurnPowerTime(String direction, double power, double time);
}
