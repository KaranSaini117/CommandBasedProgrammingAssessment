package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunShooter extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final ShooterSubsystem shooterSubsystem;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public RunShooter(ShooterSubsystem shooterSubsystem) {
      this.shooterSubsystem = new ShooterSubsystem();
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(shooterSubsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {

    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        shooterSubsystem.setTargetRpm(200);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.setTargetRpm(0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }


}