package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.GrabberSubsystem;

public class Release extends CommandBase {
    private final GrabberSubsystem grabberSubsystem;

    public Release(GrabberSubsystem grabberSubsystem) {
        this.grabberSubsystem = grabberSubsystem;
        addRequirements(grabberSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        grabberSubsystem.release();
    }
}
