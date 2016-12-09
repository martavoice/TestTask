package testTask;

public class Main {

	public static void main(String[] args) {
		RobotDancer robot = new RobotDancer("Alex", "red");
		robot.work();
		robot.setName("Olga");
		robot.work();
		robot.danceCounter();
		robot.danceCounter();
		robot.stop();

		Robot robot1 = new RobotDancer("Amanda", "blue");
		robot1.work();

		Robot robot2 = new RobottWalker("Mirai", "yellow");
		robot2.work();

	}

}
