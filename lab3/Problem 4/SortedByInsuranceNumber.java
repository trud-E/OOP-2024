import java.util.Comparator;

public class SortedByInsuranceNumber implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2){
        return employee1.getInsuranceNumber().compareTo(employee2.getInsuranceNumber());
    }

}
