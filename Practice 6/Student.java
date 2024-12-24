public class Student extends Person implements CanHavePizza{
    private int course;


    public Student(String name, int age, char gender, int course){
        super(name, age, gender);
        this.course = course;
    }

}
