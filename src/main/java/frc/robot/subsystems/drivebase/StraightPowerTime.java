package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveTrainSubsystem;

/** An example command that uses an example subsystem. */
public class StraightPowerTime extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrainSubsystem driveTrainSub;
  private double power;
  private double time;
  private double initialTime;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public StraightPowerTime(DriveTrainSubsystem driveTrainSub, double p, double t, double i) {
    this.driveTrainSub = driveTrainSub;
    power = p;
    time = t;
    initialTime = i;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrainSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      initialTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrainSub.setAllPower(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrainSub.setAllPower(0);
    driveTrainSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return initialTime + time < System.currentTimeMillis();
  }
}
