/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;

public class RobotTemplate extends SimpleRobot {
    
    Joystick j1;
    Victor left;
    Victor right;
    RobotDrive dr;
    
    public void robotInit(){
        
        Joystick j1 = new Joystick(1);
        Victor left = new Victor(1);
        Victor right = new Victor(2);
        dr = new RobotDrive(right,left);
    }
    
    public void disabled(){
        System.out.println("Disabled");
    }
    
    public void autonomous() {
        System.out.println("Autonomus");
    }

    public void operatorControl() {
        System.out.println("Operator Control");
        while(isEnabled()){
            dr.arcadeDrive(j1);
        }
    }
    
    public void test() {
        System.out.println("Test mode???");
    }
}
