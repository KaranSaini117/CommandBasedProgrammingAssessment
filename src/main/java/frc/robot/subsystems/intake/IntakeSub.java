package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import frc.robot.Constants.CanIds;
import frc.robot.com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //comment 
 
public class IntakeSub extends SubsystemBase {

  /**
   * Creates a new IntakeSub.
   */
  private TalonSRX talon;

  public IntakeSub() {
    talon = new TalonSRX(CanIds.intakeVictor.id);
    Initers.initTalons(talon);
    talon.setInverted(false);
  }

  public TalonSRX get(){
    return this.talon;
  }

  public boolean getInverted(){
    return talon.getInverted();
  }

  public void setPower(double power) {
    talon.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
