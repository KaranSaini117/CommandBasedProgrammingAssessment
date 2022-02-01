// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Auton;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSubsystem driveBaseSub;
  private double power;
  private double time;
  private double difference;
  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSubsystem driveBaseSub, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
    difference = System.currentTimeMillis();
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(power);
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
      double currentTime = System.currentTimeMillis();
      if(currentTime-difference>=time) {
        return true;
      }
      return false;
  }

}
