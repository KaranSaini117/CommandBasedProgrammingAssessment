package frc.robot.subsystems.hatch;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class HatchSubsystem extends SubsystemBase {
  /** Creates a HatchSubsystem. */
  private TalonFX talon;
  private double hatchGrabPower;
  private double hatchReleasePower;

  public HatchSubsystem(double hatchGPower, double hatchRPower) {
    talon = new TalonFX(3);
    hatchGrabPower = hatchGPower;
    hatchReleasePower = hatchRPower;
  }

  public void setGrabPower(double hatchGPower){
    talon.set(ControlMode.PercentOutput, hatchGPower);
  }

  public void setReleasePower(double hatchRPower){
    talon.set(ControlMode.PercentOutput, hatchRPower);
  }

  public void brake(){
    talon.setNeutralMode(NeutralMode.Brake);
  }

  public void coast(){
    talon.setNeutralMode(NeutralMode.Coast);
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