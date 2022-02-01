// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static enum CanIds{

        leftFalcon1(5),
        rightFalcon1(2),
        leftFalcon2(4),
        rightFalcon2(3),
        loaderFalcon(10),
        intakeVictor(11),
        revolverVictor(12),
        climberFalcon(13),
        shooterFalcon(14), 
        hoodVictor(40), 
        cpLifterVictor(43), // maybe? 
        cpSpinnerVictor(25), // not getting power rn
        ;

        public final int id; 
        CanIds(int id){
        this.id = id;
        }
    }
}
