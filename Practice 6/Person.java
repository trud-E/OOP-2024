public class Person implements CanHavePizza{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public void eatPizza(){
        System.out.println("A person can eat pizza");
    }

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " Gender: " + gender;
    }


}
