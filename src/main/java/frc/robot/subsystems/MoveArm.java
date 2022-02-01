package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class MoveArm extends CommandBase {
    private ArmSubsystem arm;
    private boolean reversed;
    private double power = 1;
    
    public MoveArm(ArmSubsystem arm, double power, boolean reversed){
        this.arm = arm;
        this.reversed = reversed;
        this.power = power;
    }

    @Override
    public void initialize() {
        if (reversed) {
            power = -Math.abs(power);
        }
        else {
            power = Math.abs(power);
        }
    }

    @Override
    public void execute() {
        arm.setPower(power);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        arm.setPower(0);
    }
}
