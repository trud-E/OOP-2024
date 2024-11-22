import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double salary;
    private final String insuranceNumber;
    private Date hireDate;

    public Employee(String name, int age, double salary,
                    Date hireDate, String insuranceNumber){
        super(name, age);
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
        this.hireDate = hireDate;

    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    public Date getDate(){
        return hireDate;
    }


    @Override
    public int compareTo(Employee employee){
        if (this.getSalary()==employee.getSalary()){
            return 0;
        }
        if (this.getSalary()> employee.getSalary()){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formatted = sdf.format(hireDate);
        return super.toString() + " Salary: " + salary +
                " Insurance Number: " + insuranceNumber + " HireDate: " + formatted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, insuranceNumber, hireDate);
    }

    @Override
    public boolean equals(Object object){
        if (object == null)
            return false;
        if(!(object instanceof Employee))
            return false;
        if (!super.equals(object))
            return false;
        Employee otherEmployee = (Employee) object;
        if(this.salary != ((Employee) object).salary)
            return false;
        if (this.insuranceNumber != otherEmployee.insuranceNumber)
            return false;
        if (this.hireDate != otherEmployee.hireDate)
            return false;
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
