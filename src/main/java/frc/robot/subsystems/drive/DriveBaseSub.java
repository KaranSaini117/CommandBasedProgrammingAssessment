package frc.robot.subsystems.drive;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIds;

public class DriveBaseSub extends SubsystemBase{
  public TalonFX talon1;
  public TalonFX talon2;
  public TalonFX talon3;
  public TalonFX talon4;
  public DriveBaseSub(TalonFX talon1, TalonFX talon2, TalonFX talon3, TalonFX talon4) {
    this.talon1 = new TalonFX(CanIds.leftFalcon1.id);
	  this.talon2 = new TalonFX(CanIds.rightFalcon1.id);
	  this.talon3 = new TalonFX(CanIds.leftFalcon2.id);
    this.talon4 = new TalonFX(CanIds.rightFalcon2.id);
  }
  public TalonFX getLeftMast() {
    return this.talon1;
  }
  public TalonFX getRightMast() {
    return this.talon2;
  }
  public TalonFX getLeftFollow() {
    return this.talon3;
  }
  public TalonFX getRightFollow() {
    return this.talon4;
  }

  public void setPowerAll(double power) {
    talon1.set(ControlMode.PercentOutput, power);
    talon2.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }

  public void setLeftPower(double power) {
    talon1.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
  }
  
  public void setRightPower(double power){
    talon2.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftMast(double power) {
    talon1.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftFollow(double power) {
    talon3.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightMast(double power) {
    talon2.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightFollow(double power) {
    talon4.set(ControlMode.PercentOutput, power);
  }
  public void brake(){
    this.talon1.setNeutralMode(NeutralMode.Brake);
    this.talon2.setNeutralMode(NeutralMode.Brake);
    this.talon3.setNeutralMode(NeutralMode.Brake);
    this.talon4.setNeutralMode(NeutralMode.Brake);
  }

  public void coast(){
    this.talon1.setNeutralMode(NeutralMode.Coast);
    this.talon2.setNeutralMode(NeutralMode.Coast);
    this.talon3.setNeutralMode(NeutralMode.Coast);
    this.talon4.setNeutralMode(NeutralMode.Coast);
  }

  public void periodic() {
  }
}
