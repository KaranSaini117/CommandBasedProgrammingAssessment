package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.PositionConstants;

public class GrabberSubsystem extends SubsystemBase {
    private final TalonFX grabberMotor = new TalonFX(MotorConstants.grabberMotorID);
    
    public GrabberSubsystem() {

    }

    public void grab() {
        grabberMotor.set(ControlMode.Position, PositionConstants.grabberPosition);
    }

    public void release() {
        grabberMotor.set(ControlMode.Position, -PositionConstants.grabberPosition); // not sure if this works
    }

    @Override
    public void periodic() {

    }
}