package frc.robot.subsystems.drive;

import frc.robot.com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox xbox;
  private double straight;
  private double turn;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox xbox, double straight, double turn) {
    this.driveBaseSub = driveBaseSub;
    this.xbox = xbox;
    this.straight = straight;
    this.turn = turn;
    addRequirements(driveBaseSub);
  }

  @Override
  public void execute() {
    double lefty = straight * xbox.getLeftY();
    double rightx = turn * xbox.getRightX();
    this.driveBaseSub.setLeftPower(lefty+rightx);
    this.driveBaseSub.setRightPower(lefty-rightx);
  }

  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setLeftPower(0.0);
    this.driveBaseSub.setRightPower(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
