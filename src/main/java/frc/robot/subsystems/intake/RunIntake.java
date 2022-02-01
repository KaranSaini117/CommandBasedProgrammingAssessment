package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private IntakeSubsystem intake;
    private double power;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public RunIntake(IntakeSubsystem intake, double power) {
      this.intake = intake;
      this.power = power;
      addRequirements(intake);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
  
    }
  
    public double getPower(double power) {
      return this.power;
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      intake.setPower(power);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      intake.setPower(0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
