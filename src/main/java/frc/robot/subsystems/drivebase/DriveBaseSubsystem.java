package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIds;

public class DriveBaseSubsystem extends SubsystemBase {
    private TalonFX leftFront;
    private TalonFX rightFront;
    private TalonFX leftBack;
    private TalonFX rightBack;

    public DriveBaseSubsystem() {
        setLeftFront(new TalonFX(CanIds.leftMotor1.id));
        setRightFront(new TalonFX(CanIds.rightMotor1.id));
        setLeftBack(new TalonFX(CanIds.leftMotor2.id));
        setRightBack(new TalonFX(CanIds.rightMotor2.id));
    }

    public TalonFX getRightFront() {
        return rightFront;
    }

    public void setRightFront(TalonFX rightFront) {
        this.rightFront = rightFront;
    }

    public TalonFX getLeftFront() {
        return leftFront;
    }

    public void setLeftFront(TalonFX leftFront) {
        this.leftFront = leftFront;
    }

    public TalonFX getRightBack() {
        return rightBack;
    }

    public void setRightBack(TalonFX rightBack) {
        this.rightBack = rightBack;
    }

    public TalonFX getLeftBack() {
	return leftBack;    
    }

    public void setLeftBack(TalonFX leftBack) {
	    this.leftBack = leftBack;
    }
    public void setLeftPower(double power){
        leftFront.set(ControlMode.PercentOutput, power);
        leftBack.set(ControlMode.PercentOutput, power);
      }
    
      public void setRightPower(double power){
        rightFront.set(ControlMode.PercentOutput, power);
        rightBack.set(ControlMode.PercentOutput, power);
      }
    
      public void setAll(double power){
        setLeftPower(power);
        setRightPower(power);
      }
  
    }
    
    
}
