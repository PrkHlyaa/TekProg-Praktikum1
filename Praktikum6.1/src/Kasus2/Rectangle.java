package Kasus2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    public double area(){
        return width*length;
    }
    
    public String toString(){
        return super.toString() + ", width: " + width + ", length: " + length + ", base area: " + area();
    }
}
