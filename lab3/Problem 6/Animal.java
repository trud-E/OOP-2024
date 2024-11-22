import java.util.Comparator;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void getSound();

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Animal [name= " + name + ", age= " + age + "]";
    }

    
}
