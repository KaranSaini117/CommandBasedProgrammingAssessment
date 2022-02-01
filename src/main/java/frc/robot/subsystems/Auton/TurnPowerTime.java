// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Auton;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSubsystem driveBaseSub;
  private double power;
  private double time;
  private String direction;
  private double difference;
  public TurnPowerTime(DriveBaseSubsystem driveBaseSub, String direction, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    difference = System.currentTimeMillis();
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(direction.equals("RIGHT")) {
      driveBaseSub.setLeftPower(power);
      driveBaseSub.setRightPower(-power);
    }
    else {
      driveBaseSub.setLeftPower(power);
      driveBaseSub.setRightPower(power);
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    double currentTime = System.currentTimeMillis();
    if(currentTime-difference>=time) {
      return true;
    }
    return false;
  }
}
