package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;


public class IntakeSubsystem extends SubsystemBase {
  // create the intake subsystem
  private TalonFX talon;

  public IntakeSubsystem() {
      talon = new TalonFX(5);
  }

  /*
  public void SetDefaultCommand(){
      CommandScheduler.getInstance().setDefaultCommand(IntakeSubsystem, defaultCommand);
  }
  */

  public void setPower(double power){
    talon.set(ControlMode.PercentOutput, power);
  }

  public void setUpPower(double upPower){
      talon.set(ControlMode.PercentOutput, upPower);
  }

  public boolean getInverted(){
      return talon.getInverted();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
