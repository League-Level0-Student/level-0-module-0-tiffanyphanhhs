package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	//Create new robot
	Robot Rona = new Robot();
	//Create the letter T, start the top first
	//Pen down
	Rona.penDown();
	//Rona starts turning
	Rona.setSpeed(100);
	Rona.turn(90);
	//Moving forward
	Rona.move(200);
	//Moving back
	Rona.turn(180);
	Rona.move(100);
	//Making the next line
	Rona.turn(180);
	Rona.turn(90);
	Rona.move(200);
	
}
}
