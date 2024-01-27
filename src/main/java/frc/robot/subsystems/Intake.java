package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private CANSparkMax m_topNeoMotor;
    private CANSparkMax m_bottomNeoMotor;
    private CANSparkMax m_falcon;
    
    public Intake() {
        m_topNeoMotor = new CANSparkMax();
    }
}
