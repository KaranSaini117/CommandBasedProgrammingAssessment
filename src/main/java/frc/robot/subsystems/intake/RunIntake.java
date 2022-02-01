package frc.robot.subsystems.intake;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
    private IntakeSubsystem intake;
    private double power;

    public RunIntake(IntakeSubsystem intake, double power) {
      this.intake = intake;
      this.power = power;
    }

    public double getPower(){
      return power;
    }
    
    @Override
    public void initialize() {
    }

  @Override
  public void execute() {
    intake.setPower(power);
  }

  @Override
  public void end(boolean interrupted) {
    intake.setPower(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}

