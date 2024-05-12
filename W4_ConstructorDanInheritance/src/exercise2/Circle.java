package exercise2;

public class Circle extends Shape {
	//private instance variable
	private double radius;
	
	//Constructor (overload)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() {
		radius = 1.0;
	}
	
	/** 2nd Constructs, a Circle instance with the given radius and default color */
	public Circle(double r) {
		radius = r;
	}
	
	/** 3rd Constructs, a Circle instance with the given radius and color */
	public Circle(double r, String color, boolean filled) {
		radius = r;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	/** Getter and Setter for the instance variable radius*/
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	/** Returns the perimeter of this Circle instance */
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	/** Return a self-descriptive string of this instance in the form of
		Circle[Shape[color=?, filled=?], radius=?] */
	public String toString() {
		return "A Circle with radius = " +radius +", which is a subclass of " +super.toString();
	}
	
	public String detail() {
		return "The circle area is " +getArea() +" and the perimeter is " +getPerimeter();
	}
}
