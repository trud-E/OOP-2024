import java.util.Comparator;

public class SortedByDate implements Comparator<Employee> {


    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getDate().compareTo(employee2.getDate());
    }
}
