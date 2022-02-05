package frc.robot.subsystems.cargo;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIds;

public class IntakeSubsystem extends SubsystemBase {
    private TalonFX intakeMotor;

public IntakeSubsystem(){
    setIntakeMotor(new TalonFX(CanIds.intakeMotor.id));
}

public void setIntakeMotor(TalonFX talonFX) {
}

public TalonFX getIntakeMotor() {
    return intakeMotor;
}

public void setIntakePower(double power){
    intakeMotor.set(ControlMode.PercentOutput, power);
}

public void setAll(double power){
    setIntakePower(power);

}
}