import java.util.Vector;

public class Test {
    public static void main(String[] args){
        Vector<Shape>xyz = new Vector<>();

        Circle c = new Circle(5, Color.Black, 4);
        xyz.add(c);

        Rectangle r = new Rectangle(1, Color.Blue, 3, 4);
        xyz.add(r);

        Triangle t = new Triangle(3, Color.Orange, 3, 4, 5);
        xyz.add(t);

        for(Shape x: xyz){
            System.out.println(x);
        }
    }
}
