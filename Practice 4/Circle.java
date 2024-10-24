public class Circle extends Shape{
    private double radius;

    public Circle(int position, Color color, double radius){
        super(position, color);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public String draw(){
        return "I'm drawing a Circle in this position " + position + "and with" + color + "color and Diameter: " + getDiameter();  
    }

    @Override
    public String toString() {
        return "Circle [position=" + position + ", radius=" + radius + ", color=" + color + "]";
    }

    
}
