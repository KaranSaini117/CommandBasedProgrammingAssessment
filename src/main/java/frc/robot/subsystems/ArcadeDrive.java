
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSubsystem driveBaseSubsystem;
  private XboxController joystick;
  private double straightCoefficient;
  private double turnCoefficient;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSubsystem driveBaseSubsystem, XboxController joystick, double straightCoefficient, double turnCoefficient) {
    this.driveBaseSubsystem = driveBaseSubsystem;
    this.joystick = joystick;
    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
    addRequirements(driveBaseSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double first = joystick.getLeftY()*straightCoefficient;
    double second = joystick.getRightY()*turnCoefficient;
    driveBaseSubsystem.setLeftPower(first+second);
    driveBaseSubsystem.setRightPower(first-second);
  }

  @Override
  public void end(boolean interrupted) {
    driveBaseSubsystem.setLeftPower(0);
    driveBaseSubsystem.setRightPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}