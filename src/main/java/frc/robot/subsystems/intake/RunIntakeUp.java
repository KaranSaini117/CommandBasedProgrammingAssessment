package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class RunIntakeUp extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private IntakeSubsystem intake;
  private double upPower;
  private XboxController xBox;

  /**
   * Creates a RunIntakeUp.
   *
   * @param subsystem The subsystem used by this command.
   */
  public RunIntakeUp(IntakeSubsystem intake, double upPower, XboxController xBox) {
    this.intake = intake;
    this.upPower = upPower;
    this.xBox = xBox;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      if (xBox.getXButtonPressed()){
          intake.setUpPower(upPower);
      }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      intake.setUpPower(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
