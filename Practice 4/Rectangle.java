public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(int position, Color color, double sideA, double sideB){
        super(position, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSides(double a, double b){
        this.sideA = a;
        this.sideB = b;
    }

    public double getArea(){
        return sideA*sideB;
    }

    @Override
    public String draw(){
        return "I'm drawing a Rectangle in this position " + position + "and with" + color + "and Area: " + getArea();  
    }

    @Override
    public String toString() {
        return "Rectangle [position=" + position + ", sideA=" + sideA + ", color=" + color + ", sideB=" + sideB + "]";
    }

    


}
