package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
    private TalonFX talon_leftFront;
    private TalonFX talon_leftBack;
    private TalonFX talon_rightFront;
    private TalonFX talon_rightBack;

    /** Creates a new DriveBaseSubsystem. */
    public DriveBaseSubsystem() {
        talon_leftFront = new TalonFX(1);
        talon_leftBack = new TalonFX(2);
        talon_rightFront = new TalonFX(3);
        talon_rightBack = new TalonFX(4);

        factoryResetAll();

        talon_leftFront.setInverted(true);
        talon_leftFront.setSensorPhase(false);
        talon_rightFront.setInverted(true);
        talon_rightFront.setSensorPhase(false);
    }

    public TalonFX getTalon1(double power) {
        return talon_leftFront;
    }

    public TalonFX getTalon2() {
        return talon_leftBack;
    }

    public TalonFX getTalon3() {
        return talon_rightFront;
    }

    public TalonFX getTalon4() {
        return talon_rightBack;
    }

    @Override
    public void periodic() {
    }

    public void setPower(double power) {
        talon_leftFront.set(ControlMode.PercentOutput, power);
        talon_leftBack.set(ControlMode.PercentOutput, power);
        talon_rightFront.set(ControlMode.PercentOutput, power);
        talon_rightBack.set(ControlMode.PercentOutput, power);
    }

    public void setAllMode(NeutralMode mode) {
        talon_leftFront.setNeutralMode(mode);
        talon_leftBack.setNeutralMode(mode);
        talon_rightFront.setNeutralMode(mode);
        talon_rightBack.setNeutralMode(mode);
    }

    public void factoryResetAll() {
        talon_leftFront.configFactoryDefault();
        talon_leftBack.configFactoryDefault();
        talon_rightFront.configFactoryDefault();
        talon_rightBack.configFactoryDefault();
    }
}
