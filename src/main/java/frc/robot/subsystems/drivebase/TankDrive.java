package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TankDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrainSubsystem driveTrainSub;
  private XboxController xBox;

  /**
   * Creates TankDrive.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TankDrive(DriveTrainSubsystem driveTrainSub, XboxController xBox) {
    this.driveTrainSub = driveTrainSub;
    this.xBox = xBox;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrainSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (xBox.getRightBumperPressed()){
        driveTrainSub.setAllPower(0.2);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      driveTrainSub.setLeftPower(0);
      driveTrainSub.setRightPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
