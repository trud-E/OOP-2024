import java.util.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Steve", 30, 20000, new Date(105, 04,15), "23B031505");
        Employee employee2 = new Employee("John", 18, 8000, new Date(109, 02,17), "23B031909");
        Employee employee3 = new Employee("Tom", 24, 15000, new Date(107, 06,9), "23B031102");
        Employee employee4 = new Employee("Ben", 35, 30000, new Date(100, 01,5), "23B030103");

        Employee cloned = (Employee) employee1.clone();
        System.out.println(cloned);



        Manager mainManager = new Manager("Casper", 22, 25000, new Date(106, 03, 12), "23B031605");
        Manager manager1 = new Manager("Alex", 19, 18000, new Date(110, 12, 25), "23B032592");
        Manager manager2 = new Manager("Kai", 39, 18000, new Date(100, 03, 21), "23B032184");

        manager1.setBonus(4000);
        manager2.setBonus(8000);


        mainManager.addEmployee(manager1);
        mainManager.addEmployee(manager2);

        Vector<Employee>vEmployee = new Vector<>();
        for (int i = 0; i < mainManager.vCount(); i++) {
            vEmployee.add(mainManager.getVectorValues(i));
        }

        Collections.sort(vEmployee);

        for (Employee x : vEmployee){
            System.out.println(x);
        }




//        mainManager.addEmployee(employee1);
//        mainManager.addEmployee(employee2);
//        mainManager.addEmployee(employee3);
//        mainManager.addEmployee(employee4);

//        Vector<Employee>vEmployee = new Vector<>();
//        for (int i = 0; i < mainManager.vCount(); i++) {
//            vEmployee.add(mainManager.getVectorValues(i));
//        }
//
//        Collections.sort(vEmployee);


//        Collections.sort(employees, new SortedByName());
//        Collections.sort(vEmployee, new SortedByDate());

//        for (Employee x : vEmployee){
//            System.out.println(x);
//        }




    }
}
