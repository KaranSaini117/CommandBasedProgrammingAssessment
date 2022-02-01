package frc.robot.subsystems.arm;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsytem extends SubsystemBase{
    private TalonFX motor;
    public ArmSubsytem() {
        this.motor = new TalonFX(5);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }

    public void setPower(double power) {
        motor.set(ControlMode.PercentOutput, power);
    }
}
