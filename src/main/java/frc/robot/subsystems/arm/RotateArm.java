package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.shooter.RunShooter;

/** An example command that uses an example subsystem. */
public class RotateArm extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private ArmSubsytem armSubsytem;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public RotateArm(ArmSubsytem armSubsytem) {
      this.armSubsytem = armSubsytem;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(this.armSubsytem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        this.armSubsytem.setPower(10);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        this.armSubsytem.setPower(0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }
