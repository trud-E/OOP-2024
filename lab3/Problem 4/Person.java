import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Name:" + name +  " Age: " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object object){
        if (object == null)
            return false;
        if(!(object instanceof Person))
            return false;
        Person otherPerson = (Person)object;
        if (this.name != otherPerson.name)
            return false;
        if (this.age != otherPerson.age)
            return false;
        return true;
    }





}
