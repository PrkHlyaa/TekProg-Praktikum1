package exercise2;

public class Rectangle extends Shape {
	//private instance variable
	private double width;
	private double length;
	
	//Constructor (overload)
	/** Constructs a Circle instance with default value for radius and color */
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	/** 2nd Constructs, a Circle instance with the given radius and default color */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	/** 3rd Constructs, a Circle instance with the given radius and color */
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	/** Getter and Setter for the instance variable radius*/
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	/** Returns the area of this Circle instance */
	public double getArea() {
		return length*width;
	}
	
	/** Returns the perimeter of this Circle instance */
	public double getPerimeter() {
		return 2*width+2*length;
	}
	
	/** Return a self-descriptive string of this instance in the form of
		Circle[Shape[color=?, filled=?], width=?. length=?] */
	public String toString() {
		return "A Rectangle with width = " +width + " and length = " + length +", which is a subclass of " +super.toString();
	}
	
	public String detail() {
		return "The rectangle area is " +getArea() +" and the perimeter is " +getPerimeter();
	}	
}
