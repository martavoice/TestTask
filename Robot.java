package testTask;

public class Robot {
	private String name;
	private String color;

	public Robot(String name, String color) {
		setName(name);
		setColor(color);
	}

	public void work() {
		System.out.println("My name is " + getName() + ", I'm working");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
