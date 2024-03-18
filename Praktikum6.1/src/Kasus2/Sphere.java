package Kasus2;

public class Sphere extends Shape{
    private double radius;

    public Sphere(double r){
        super("Sphere");
        radius = r;
    }
    
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    
    public String toString(){
        return super.toString() + ", radius: " + radius + ", area: " + fmt.format(area());
    }
}
