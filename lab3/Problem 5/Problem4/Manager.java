package Problem4;

import java.util.Vector;
import java.util.Date;
public class Manager extends Employee {

    private int count;
    private double bonus;

    Vector<Employee> employees = new Vector<>();

    public Manager(String name, int age, double salary,
                   Date date, String insuranceNumber){
        super(name, age, salary, date, insuranceNumber);
    }

    public void addEmployee(Employee e){
        employees.add(e);
        count++;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public Employee getVectorValues(int n){
        return employees.get(n);
    }

    public int vCount(){
        return count;
    }

    @Override
    public int compareTo(Employee employee) {
        if (!(employee instanceof Manager)){
            return super.compareTo(employee);
        }
        Manager manager = (Manager) employee;
        if (manager.getSalary() == this.getSalary()){
            if (manager.getBonus()==this.getBonus()){
                return 0;
            }
            if (manager.getBonus()<this.getBonus()){
                return 1;
            }
            return -1;
        }
        if (manager.getSalary()<this.getSalary()){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return super.toString() + " Bonus: " + bonus;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Employee))
            return false;
        if (!super.equals(object))
            return false;
        Manager otherManager = (Manager) object;
        if (this.bonus != otherManager.bonus)
            return false;
        return true;
    }

}
