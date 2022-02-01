package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;


public class PowerForTime extends CommandBase {

  private DriveBaseSubsystem driveBaseSubsystem;
  private double power;
  private double time;
  private double startTime;
  /**
   * Runs the drive base straight at a power for a time
   */
  public PowerForTime(DriveBaseSubsystem driveBaseSubsystem, double time, double power) {
      this.driveBaseSubsystem = driveBaseSubsystem;
      this.time = time;
      this.power = power;
  } 
  public void initialize() {
    startTime = System.currentTimeMillis();
  }
  public void execute() {
    driveBaseSubsystem.setRightPower(power);
    driveBaseSubsystem.setLeftPower(power);
  }
  @Override
  public boolean isFinished() {
      double timeElapsed = System.currentTimeMillis()-startTime;
      if(timeElapsed>=time) {
        return true;
      }
      return false;
  }

}