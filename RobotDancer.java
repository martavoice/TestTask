package testTask;

public class RobotDancer extends Robot implements Stop

{
	public RobotDancer(String name, String color) {
		super(name, color);
	}

	private int dances;

	@Override
	public void work() {
		System.out.println("My name is " + getName()
				+ ", I'm dancing - it's my work");
	}

	public void danceCounter() {
		work();
		dances++;
		System.out.println(" I dance " + dances + " times");
	}

	@Override
	public void stop() {
		System.out.println("I'm tired. I don't want dancing anymore");

	}
}
