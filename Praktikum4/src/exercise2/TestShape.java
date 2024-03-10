package exercise2;

public class TestShape {
	public static void main(String[] args) {
		/** Declare and allocate a new instance of Shape
 		with default color and filled*/
		Shape s1 =  new Shape();
		System.out.println(s1.toString());
		
		/** Declare and allocate a new instance of Shape
 		specifying color and filled*/
		Shape s2 = new Shape("purple", false);
		System.out.println(s2.toString());
		System.out.println("\n");
		
		/** Declare and allocate a new instance of Circle
 		with default color, filled, and radius*/
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println(c1.detail());
		
		/** Declare and allocate a new instance of Circle
		specifying radius, with default color and filled */
		Circle c2 = new Circle(2.0);
		System.out.println(c2.toString());
		System.out.println(c2.detail());
		
		/** Declare and allocate a new instance of Circle
		specifying radius, color, and filled*/
		Circle c3 = new Circle(3.0, "blue", false);
		System.out.println(c3.toString());
		System.out.println("\n");
		
		/** Declare and allocate a new instance of Rectangle
 		with default color, filled, width, and length*/
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		System.out.println(r1.detail());
		
		/** Declare and allocate a new instance of Circle
		specifying width, and length, with default color and filled */
		Rectangle r2 = new Rectangle(2.0, 4.0);
		System.out.println(r2.toString());
		System.out.println(r2.detail());
		
		/** Declare and allocate a new instance of Circle
		specifying width, length, color, and filled*/
		Rectangle r3 = new Rectangle(5.0, 10.0, "pink", false);
		System.out.println(r3.toString());
		System.out.println(r3.detail());
		System.out.println("\n");
		
		/** Declare and allocate a new instance of Rectangle
 		with default side(width), color, and filled*/
		Square sq1 = new Square();
		System.out.println(sq1.toString());
		System.out.println(sq1.detail());
		
		/** Declare and allocate a new instance of Square
		specifying side, color, and filled*/
		Square sq2 = new Square(3.0, "Pink", false);
		System.out.println(sq1.detail());
		System.out.println(sq2.toString());
	}
}
