public class Employee extends Person{
    private String typeOfWork;
    private double earnings;
    public Employee(String name, int age, Animal animal, String typeOfWork, double earnings){
        super(name, age, animal);
        this.typeOfWork = typeOfWork;
        this.earnings = earnings;
    }
    public Employee(String name, int age, String typeOfWork, double earnings){
        super(name, age);
        this.typeOfWork = typeOfWork;
        this.earnings = earnings;
    }

    public void getEarnings(){
        System.out.println(earnings);
    }

    
}
