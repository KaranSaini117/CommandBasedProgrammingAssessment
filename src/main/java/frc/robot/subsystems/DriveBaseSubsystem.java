package frc.robot.subsystems;

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
    
      public void stop(){setAll(0);}
    
      public void setAllMode(NeutralMode mode){
        rightFront.setNeutralMode(mode);
        rightBack.setNeutralMode(mode);
        leftFront.setNeutralMode(mode);
        leftBack.setNeutralMode(mode);
      }
    
      public void brake(){setAllMode(NeutralMode.Brake);}
    
      public void coast(){setAllMode(NeutralMode.Coast);}
    
      public double getLeftVelocity(){return leftFront.getSelectedSensorVelocity();}
      public double getRightVelocity(){return leftFront.getSelectedSensorVelocity();}
    
      public void setAllDefaultInversions() {
        rightFront.setInverted(true);
        rightBack.setInverted(true);
        leftFront.setInverted(false);
        leftBack.setInverted(false);
      }
    
      public void factoryResetAll(){
        rightFront.configFactoryDefault();
        rightBack.configFactoryDefault();
        leftFront.configFactoryDefault();
        leftBack.configFactoryDefault();
      }
    }
    
    
}
