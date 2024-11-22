import java.util.Comparator;

public class SortAnimal implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getAge()==animal2.getAge())
            return 0;
        if (animal1.getAge()>animal2.getAge())
            return 1;
        return -1;
    }
}
