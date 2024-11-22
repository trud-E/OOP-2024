import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
//        Person alisa = new Employee("Alisa", 32, "Engineer", 10000);

//        Person adam = new Employee("Adam", 21, new Dog("Elise", 2), "Teacher", 8000);



        Animal murka = new Cat("Murka", 5);
        Animal belka = new Dog("Белка", 2);
        Animal strelka = new Dog("Стрелка", 4);

        List<Animal> animals = new ArrayList<>();
        animals.add(murka);
        animals.add(belka);
        animals.add(strelka);

        Collections.sort(animals, new SortAnimal());

        System.out.println(animals);


        Person mark = new PhDStudent("Mark", 23, "KBTU", "IT");
        Person markClone = (Person) mark.clone();


        System.out.println(mark);
        System.out.println(markClone);



//        System.out.println(alisa.hasPet());
//        System.out.println(adam.hasPet());
//
//        alisa.assignPet(murka);
//        alisa.checkTheAnimals();
//        alisa.leavePetWith(adam);
//        System.out.println(adam);
//        adam.checkTheAnimals();
//
//        // System.out.println(alisa.hasPet());
//        adam.leavePetWith(mark);

        // alisa.retrivePetFrom(adam);
        // adam.checkTheAnimals();
        // alisa.retrivePetFrom(adam);


        // System.out.println(adam.equals(mark));

        // adam.assignPet(murka);
        // adam.checkTheAnimals();
        // adam.removePet(murka);
        // adam.checkTheAnimals();
        // adam.checkTheAnimals();

        


    }
}