package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeConveyorSubsystem;

public class RunIntake extends CommandBase {
    private final IntakeConveyorSubsystem intakeConveyorSubsystem;

    private double power;
    
    public RunIntake(IntakeConveyorSubsystem intakeConveyorSubsystem, double power) {
        this.intakeConveyorSubsystem = intakeConveyorSubsystem;
        
        this.power = power;

        addRequirements(intakeConveyorSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        intakeConveyorSubsystem.setPower(power);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        intakeConveyorSubsystem.setPower(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
