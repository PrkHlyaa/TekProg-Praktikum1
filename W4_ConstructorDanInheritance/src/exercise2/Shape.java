package exercise2;

public class Shape {
	//private instance variable
	private String color;
	private boolean filled;
	
	//Constructor (overload)
	/** Constructs a Shape instance with default color and filled */
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String isColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFiled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if (filled == true) {
			return "A Shape with color of " +color + " and filled";	
		} else {
			return "A Shape with color of " +color + " and Not filled";
		}
	}

}
