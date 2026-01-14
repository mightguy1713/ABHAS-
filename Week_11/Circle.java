package Week_11;

public class Circle extends Shape implements Drawable{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override 
    public double calculateArea(){
        return 3.14 * (radius * radius);
    }
    
    @Override 
    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
    
    @Override 
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}