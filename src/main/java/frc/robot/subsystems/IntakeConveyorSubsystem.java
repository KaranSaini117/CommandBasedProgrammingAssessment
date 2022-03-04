package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class IntakeConveyorSubsystem extends SubsystemBase {
    private final TalonFX intakeMotor = new TalonFX(MotorConstants.intakeMotorID);
    
    public IntakeConveyorSubsystem() {

    }

    public void setPower(double power) {
        intakeMotor.set(ControlMode.PercentOutput, power);
    }

    @Override
    public void periodic() {

    }
}