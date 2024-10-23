
public class Test{
    public static void main(String[] args) {
        Person alisa = new Employee("Alisa", 32, "Engineer", 10000);
        Animal murka = new Cat("Murka", 5);
        Person adam = new Employee("Adam", 21, new Dog("Elise", 2), "Teacher", 8000);
        Person mark = new PhDStudent("Mark", 23, "KBTU", "IT");
        
        System.out.println(alisa.hasPet());
        System.out.println(adam.hasPet());

        alisa.assignPet(murka);
        alisa.checkTheAnimals();
        alisa.leavePetWith(adam);
        System.out.println(adam);
        adam.checkTheAnimals();

        // System.out.println(alisa.hasPet());
        adam.leavePetWith(mark);

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