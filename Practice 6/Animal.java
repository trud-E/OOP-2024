public abstract class Animal implements CanHavePizza{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void eatPizza(){
        System.out.println("An animal can eat pizza");
    }

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age;
    }





}
