package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class DriveTrainSubsystem extends SubsystemBase {
  /** Creates a DriveTrainSubsystem. */

  private TalonFX talonFX_leftFront;
  private TalonFX talonFX_rightFront;
  private TalonFX talonFX_leftBack;
  private TalonFX talonFX_rightBack;

  public DriveTrainSubsystem() {
    talonFX_leftFront = new TalonFX(2);
    talonFX_rightFront = new TalonFX(3);
    talonFX_leftBack = new TalonFX(4);
    talonFX_rightBack = new TalonFX(5);
    talonFX_leftFront.setInverted(true);
    talonFX_leftBack.setInverted(true);
  }

  public TalonFX getLeftFront(){
    return talonFX_leftFront;
  }

  public TalonFX getLeftBack(){
    return talonFX_leftBack;
}

  public TalonFX getRightFront(){
    return talonFX_rightFront;
}

  public TalonFX getRightBack(){
    return talonFX_rightBack;
}

  public void setLeftPower(double power){
    talonFX_leftFront.set(ControlMode.PercentOutput, power);
    talonFX_leftBack.set(ControlMode.PercentOutput, power);
  }

  public void setRightPower(double power){
    talonFX_rightFront.set(ControlMode.PercentOutput, power);
    talonFX_rightBack.set(ControlMode.PercentOutput, power);
  }

  public void setAllPower(double power){
    talonFX_leftFront.set(ControlMode.PercentOutput, power);
    talonFX_rightFront.set(ControlMode.PercentOutput, power);
    talonFX_leftBack.set(ControlMode.PercentOutput, power);
    talonFX_rightBack.set(ControlMode.PercentOutput, power);
  }

  public void brake(){
    talonFX_leftFront.setNeutralMode(NeutralMode.Brake);
    talonFX_leftBack.setNeutralMode(NeutralMode.Brake);
    talonFX_rightFront.setNeutralMode(NeutralMode.Brake);
    talonFX_rightBack.setNeutralMode(NeutralMode.Brake);
  }

  public void coast(){
    talonFX_leftFront.setNeutralMode(NeutralMode.Coast);
    talonFX_leftBack.setNeutralMode(NeutralMode.Coast);
    talonFX_rightFront.setNeutralMode(NeutralMode.Coast);
    talonFX_rightBack.setNeutralMode(NeutralMode.Coast);
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
