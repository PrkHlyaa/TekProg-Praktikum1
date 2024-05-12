package Kasus2;

import java.text.DecimalFormat;

abstract public class Shape {
    String shapeName;

    public Shape(String name){
    	shapeName = name;
    }
    
    public abstract double area();
    
    DecimalFormat fmt = new DecimalFormat("0.##");
    public String toString(){
        String result = "Shape Name: " +shapeName;
        return result;
    }
    
}

