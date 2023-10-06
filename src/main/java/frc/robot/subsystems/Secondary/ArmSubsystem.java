package frc.robot.subsystems.Secondary;

// import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase {

    public CANSparkMax intakeMotor;
    public ArmSubsystem() {
        intakeMotor =  new CANSparkMax(Constants.ArmConstants.kManipulatorIntakeMotorLeft, MotorType.kBrushless);
        intakeMotor =  new CANSparkMax(Constants.ArmConstants.kManipulatorIntakeMotorRight, MotorType.kBrushless);
    }
}