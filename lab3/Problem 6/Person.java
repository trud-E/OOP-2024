
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public abstract class Person implements Check, Cloneable{
    private Animal animal;
    private String name;
    private int age;
    ArrayList<Animal> animals = new ArrayList<>();
    HashMap<Person, ArrayList>i = new HashMap<>(); 
    public Person(String name, int age, Animal animal){
        this.name = name;
        this.age = age;
        animals.add(animal);
        i.put(this, animals);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasPet(){
        return !i.isEmpty();
    }
    public void assignPet(Animal animal){
        animals.add(animal);
        i.put(this, animals);
    }

    public void removePet(Animal animal){
        animals.remove(animal);
    }

    public void retrivePetFrom(Person person){
        if (!person.i.containsKey(this)) {
            System.out.println("This person does not keep such an animal!");
        }
        else{
            i.put(this, person.i.get(this));
            person.i.remove(this);
        }
    }
    public void leavePetWith(Person person){
        if (i.isEmpty()) {
            System.out.println("You have no available animals!");    
        }
        else if (person instanceof PhDStudent) {
            for (Animal animal : this.animals) {
                if (animal instanceof Dog) { 
                    System.out.println("You are not allowed to hand over the dog!");
                }
            }
        }
        else{
            person.i.put(this, this.animals);
            i.remove(this);
        }
    }

    @Override
    public void checkTheAnimals(){
        for(Person s: i.keySet()){
            System.out.println(s + ":" + i.get(s));
        }
    }

    @Override
    public String toString(){
        return "Person [name= " + name + ", age= " + age + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (animal == null) {
            if (other.animal != null)
                return false;
        } else if (!animal.equals(other.animal))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (animals == null) {
            if (other.animals != null)
                return false;
        } else if (!animals.equals(other.animals))
            return false;
        if (i == null) {
            if (other.i != null)
                return false;
        } else if (!i.equals(other.i))
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }




}
