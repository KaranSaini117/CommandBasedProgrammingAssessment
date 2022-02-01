package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.driveBaseSub.setPowerAll(this.power);
  }


  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setLeftPower(0);
    this.driveBaseSub.setRightPower(0);
    driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() <= this.time) {
      return true;
    }
    return false;
  }

}
