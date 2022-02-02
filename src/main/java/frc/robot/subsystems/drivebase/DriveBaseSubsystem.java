// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drivebase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  /** Creates a new DriveBaseSubsystem. */
  private TalonFX frontLeft;
  private TalonFX frontRight;
  private TalonFX backLeft;
  private TalonFX backRight;

  public DriveBaseSubsystem() {
    frontLeft = new TalonFX(0);
    frontRight = new TalonFX(1);
    backLeft = new TalonFX(2);
    backRight = new TalonFX(3);

    frontLeft.configFactoryDefault();
    frontRight.configFactoryDefault();
    backLeft.configFactoryDefault();
    backRight.configFactoryDefault();

    frontLeft.setInverted(true);
    frontRight.setInverted(false);
    backRight.setInverted(false);
    backLeft.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public TalonFX getFrontLeft(){
    return frontLeft;
  }

  public TalonFX getFrontRight(){
    return frontRight;
  }

  public TalonFX getBackLeft(){
    return backLeft;
  }

  public TalonFX getBackRight(){
    return backRight;
  }

  public void setPower(double power){
    frontLeft.set(ControlMode.PercentOutput, power);
    frontRight.set(ControlMode.PercentOutput, power);
    backLeft.set(ControlMode.PercentOutput, power);
    backRight.set(ControlMode.PercentOutput, power);
  }

  public void setLeftSidePower(double power){
    frontLeft.set(ControlMode.PercentOutput, power);
    backLeft.set(ControlMode.PercentOutput, power);
  }

  public void setRightSidePower(double power){
    frontRight.set(ControlMode.PercentOutput, power);
    backRight.set(ControlMode.PercentOutput, power);
  }

  public void brake(){
    frontRight.setNeutralMode(NeutralMode.Brake);
    frontLeft.setNeutralMode(NeutralMode.Brake);
    backRight.setNeutralMode(NeutralMode.Brake);
    backLeft.setNeutralMode(NeutralMode.Brake);
  }

  public void coast(){
    frontRight.setNeutralMode(NeutralMode.Coast);
    frontLeft.setNeutralMode(NeutralMode.Coast);
    backRight.setNeutralMode(NeutralMode.Coast);
    backLeft.setNeutralMode(NeutralMode.Coast);
  }

}
