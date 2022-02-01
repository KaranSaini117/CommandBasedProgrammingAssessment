// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public abstract class Initers {

    public static void initVictors(VictorSPX...victors){
        for (VictorSPX victor : victors) {
			victor.neutralOutput();
		    victor.setSensorPhase(false);
		    victor.configNominalOutputForward(0, 0);
		    victor.configNominalOutputReverse(0, 0);
		    victor.configClosedloopRamp(.2, 0);
		}
	}
	
	public static void initTalons(TalonFX...talons){
		for (TalonFX talon : talons){
			talon.neutralOutput();
			talon.setSensorPhase(false);
			talon.configNominalOutputForward(0, 0);
			talon.configNominalOutputReverse(0, 0);
			talon.configClosedloopRamp(.2, 0);
		}
	}
}