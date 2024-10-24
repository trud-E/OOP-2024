public class Triangle extends Shape{
    double sideA, sideB, sideC;

    public Triangle(int position, Color color, double sideA, double sideB, double sideC){
        super(position, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public void setSide(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public String draw(){
        return "I'm drawing a Triangle in this position " + position + "and with" + color + "color and Perimeter: " + getPerimeter();  
    }


    @Override
    public String toString() {
        return "Triangle [sideA=" + sideA + ", position=" + position + ", sideB=" + sideB + ", sideC=" + sideC
        + ", color=" + color + "]";
    }

    

    
}
