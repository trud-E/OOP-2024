public class Test {
    public static void main(String[] args){
        Sphere s = new Sphere(5);
        s.volume();

        Cylinder c = new Cylinder(2, 4);
        c.surfaceArea();

        Cube b = new Cube(5);

        System.out.println(b.volume());
        System.out.println(c.surfaceArea());
    }
}
