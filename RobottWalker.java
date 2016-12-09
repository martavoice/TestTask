package testTask;

public class RobottWalker extends Robot implements Stop {
	public RobottWalker(String name, String color) {
		super(name, color);

	}

	private int steps;

	@Override
	public void stop() {
		System.out.println("I'm tired. I don't want walk anymore");

	}

	public void work() {
		System.out.println("My name is " + getName()
				+ ", I'm walking - it's my work");
	}

	public void stepsCounter() {
		work();
		steps++;
		System.out.println(" I walk " + steps + " steps so far");
	}
}
