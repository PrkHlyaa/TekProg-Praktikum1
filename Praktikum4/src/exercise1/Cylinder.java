package exercise1;

public class Cylinder extends Circle{
	//Private variable
	private double height; 
	
	// Constructor with default color, radius and height
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	// 2nd Constructor with default radius, color but given height
	 public Cylinder(double height) {
		 super(); // call superclass no-arg constructor Circle()
		 this.height = height;
	 }
	 
	 // 3rd Constructor with default color, but given radius, height
	 public Cylinder(double radius, double height) {
		 super(radius); // call superclass constructor Circle(r)
		 this.height = height;
	 }

	 // A public method for retrieving the height
	 public double getHeight() {
		 return height;
	 }

	 /** A public method for computing the volume of cylinder
	 use superclass method getArea() to get the base area*/
	 public double getVolume() {
		 return super.getArea()*height;
	 }
	 
	 /** Returns the area of this Cylinder instance */
	 @Override
	 public double getArea() {
		 return (2*Math.PI*super.getRadius()*getHeight() + 2*super.getArea());
	 }
	 
	 @Override
	 public String toString() {
		 return "\nCylinder: subclass of " +super.toString()
		 		+ " height=" + height;
	 }
}
