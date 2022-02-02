package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    private TalonFX talon1;

    public IntakeSubsystem() {
        talon1 = new TalonFX(0);
    }

    public void setPower(double power) {
        talon1.set(ControlMode.PercentOutput, power);
    }

    public TalonFX getTalon() {
        return talon1;
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
