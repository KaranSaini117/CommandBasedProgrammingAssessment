package frc.robot.subsystems.hatch;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIds;

public class HatchSubsystem extends SubsystemBase {
    private TalonFX hatchMotor;

public HatchSubsystem(){
    setHatchMotor(new TalonFX(CanIds.hatchMotor.id));
}

public void setHatchMotor(TalonFX talonFX) {
}

public TalonFX getHatchMotor() {
    return hatchMotor;
}

public void setHatchMotor(double power){
    hatchMotor.set(ControlMode.PercentOutput, power);
}

public void setAll(double power){
    setHatchMotor(power);

}
}