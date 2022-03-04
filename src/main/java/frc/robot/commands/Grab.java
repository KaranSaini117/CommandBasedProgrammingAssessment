package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.GrabberSubsystem;

public class Grab extends CommandBase {
    private final GrabberSubsystem grabberSubsystem;

    public Grab(GrabberSubsystem grabberSubsystem) {
        this.grabberSubsystem = grabberSubsystem;
        addRequirements(grabberSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        grabberSubsystem.grab();
    }
}
