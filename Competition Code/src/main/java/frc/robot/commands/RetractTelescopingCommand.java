// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climber;

public class RetractTelescopingCommand extends CommandBase {
  //Creates a new Command for retracting Telescoping/Primary Climbing Arms
  private Climber CLIMBER;

  public RetractTelescopingCommand(Climber CLIMBER) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(CLIMBER);
    this.CLIMBER = CLIMBER;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize(){
    CLIMBER.retractTelescoping();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    CLIMBER.offTelescoping();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
