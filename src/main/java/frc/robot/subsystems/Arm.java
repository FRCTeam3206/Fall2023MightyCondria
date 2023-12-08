package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class Arm extends SubsystemBase {
  private WPI_VictorSPX m_armMotor = new WPI_VictorSPX(ArmConstants.KArmCanId);

  public Arm() {}

  public void setSpeed(double speed) {
    m_armMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
