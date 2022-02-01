package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    private TalonFX talon;

    public IntakeSubsystem() {
        this.talon = new TalonFX(0);
    
    }
    public TalonFX getTalon(){
        return this.talon;
      }
      @Override
    public void periodic(){
    }
    
    public boolean getInverted(){
        return this.talon.getInverted();
    }
    public void setPower(double power){
        talon.set(ControlMode.PercentOutput, power);
    } 
}
