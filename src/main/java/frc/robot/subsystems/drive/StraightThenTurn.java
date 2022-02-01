package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub driveBaseSub, String direction, double straight, double turn , double power, double time) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driveBaseSub, power, time), new TurnPowerTime(driveBaseSub, direction, straight, turn));
  }
}
