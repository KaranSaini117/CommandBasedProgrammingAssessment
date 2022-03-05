package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

public class DriveForTime extends CommandBase {

    private final DriveBaseSubsystem driveBaseSubsystem;

    private final double power;
    private final double time;

    private double startTime;

    public DriveForTime(DriveBaseSubsystem driveBaseSubsystem, double power, double time) {
        this.driveBaseSubsystem = driveBaseSubsystem;

        this.power = power;
        this.time = time;
        addRequirements(driveBaseSubsystem);
    }

    @Override
    public void initialize() {
        startTime = System.currentTimeMillis();
    }

    @Override
    public void execute() {
        driveBaseSubsystem.setLeftMotor1Power(power);
        driveBaseSubsystem.setLeftMotor2Power(power);
        driveBaseSubsystem.setRightMotor1Power(power);
        driveBaseSubsystem.setRightMotor2Power(power);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        driveBaseSubsystem.setLeftMotor1Power(0);
        driveBaseSubsystem.setLeftMotor2Power(0);
        driveBaseSubsystem.setRightMotor1Power(0);
        driveBaseSubsystem.setRightMotor2Power(0);
        driveBaseSubsystem.brake();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return System.currentTimeMillis() - startTime >= time;
    }

}