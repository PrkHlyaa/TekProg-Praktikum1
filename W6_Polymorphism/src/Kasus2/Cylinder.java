package Kasus2;

public class Cylinder extends Shape{
    private double height; 
    private double radius;

    public Cylinder(double h, double r){
        super("Cylinder");
        height = h;
        radius = r;
    }

    public double area(){
        return Math.PI*radius*2*height;
    }
    
    public String toString(){
    	return super.toString() + ", radius: " + radius + ", heigth: " + height + ", surface area: " + fmt.format(area());
    }
}

