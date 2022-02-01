package frc.robot.subsystems.hatch;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class RunHatch extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private HatchSubsystem hatch;
  private XboxController xBox;
  private double hatchGPower;
  private double hatchRPower;


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public RunHatch(HatchSubsystem hatch, XboxController xBox) {
    this.hatch = hatch;
    this.xBox = xBox;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hatch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      if (xBox.getAButtonPressed()){
        hatch.setGrabPower(hatchGPower);
      } else if (xBox.getBButtonPressed()){
        hatch.setReleasePower(hatchRPower);
      }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
