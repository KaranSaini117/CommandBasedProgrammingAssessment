package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    private TalonFX talon;

    public ArmSubsystem() {
        talon = new TalonFX(0); // CanIds.armFalcon.id --> random CanID since Constants is not coded
        talon.setNeutralMode(NeutralMode.Brake);
    }

    public TalonFX getTalonn() {
        return this.talon;
    }
    
    public void setPower(double power){
        talon.set(ControlMode.PercentOutput, power);
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
