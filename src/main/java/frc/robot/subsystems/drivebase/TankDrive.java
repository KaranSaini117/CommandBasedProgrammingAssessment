package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  private DriveBaseSubsystem driveBaseSubsystem;
  private XboxController xboxController;
  
  public TankDrive(DriveBaseSubsystem driveBaseSubsystem, XboxController xboxController) {
    addRequirements(driveBaseSubsystem);
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.xboxController = xboxController;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
      driveBaseSubsystem.setLeftPower(xboxController.getLeftY());
      driveBaseSubsystem.setRightPower(xboxController.getRightY());
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
