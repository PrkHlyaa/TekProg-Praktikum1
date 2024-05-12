package exercise1;
//The Circle class models a circle with a radius and color

public abstract class Circle {
	//private instance variable
	private double radius;
	private String color;
	
	//Constructor (overload)
	 /** Constructs a Circle instance with default value for radius and color */
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	/** 2nd Constructs, a Circle instance with the given radius and default color */
	 public Circle(double r) {
		 radius = r;
		 color = "red";
	 }
	 
	 /** 3rd Constructs, a Circle instance with the given radius and color */
	 public Circle(double r, String color) {
		 radius = r;
		 this.color = color;
	 }
	 
	 /** Getter and Setter for color*/
	 public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/** Returns the radius */
	 public double getRadius() {
		 return radius;
	 }

	 /** Returns the area of this Circle instance */
	 public double getArea() {
		 return radius*radius*Math.PI;
	 }
	 /** Return a self-descriptive string of this instance in the form of
	Circle[radius=?,color=?] */
	 public String toString() {
		 return "Circle[radius=" + radius + " color=" + color + "]";
	 }
}
