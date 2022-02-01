package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    private TalonFX talon;
  
    public IntakeSubsystem() {
      this.talon = new TalonFX(6);
    }
  
    public void setPower(double power) {
      talon.set(ControlMode.PercentOutput, power);
    }
  
    public TalonFX getTalon() {
      return this.talon;
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
