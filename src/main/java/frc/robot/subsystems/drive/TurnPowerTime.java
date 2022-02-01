package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
  private double timer;
  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.driveBaseSub);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBaseSub.coast();
    this.timer = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (this.direction == ("RIGHT")) {
      this.driveBaseSub.getLeftMast().set(ControlMode.PercentOutput,power);
      this.driveBaseSub.getRightMast().set(ControlMode.PercentOutput,-power);
      this.driveBaseSub.getLeftFollow().set(ControlMode.PercentOutput,power);
      this.driveBaseSub.getRightFollow().set(ControlMode.PercentOutput,-power);
    }if (this.direction == ("LEFT")) {
      this.driveBaseSub.getLeftMast().set(ControlMode.PercentOutput,-power);
      this.driveBaseSub.getRightMast().set(ControlMode.PercentOutput,power);
      this.driveBaseSub.getLeftFollow().set(ControlMode.PercentOutput,-power);
      this.driveBaseSub.getRightFollow().set(ControlMode.PercentOutput,power);
    }
  }

  // Called once the command ends or is interrupted.

  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightFollow(0);
    this.driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return ((System.currentTimeMillis() - this.timer) >= this.time);
  }
}
