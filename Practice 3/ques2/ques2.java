import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ques2{
    public static void main(String[] args) {
        
        Set<Person> people = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add");
            System.out.println("2. Info");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("type: ");
                String type = scanner.nextLine().toLowerCase();

                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Address: ");
                String address = scanner.nextLine();

                if (type.equals("person")) {
                    people.add(new Person(name, address));

                } else if (type.equals("student")) {

                    System.out.println("Program: ");
                    String program = scanner.nextLine();

                    System.out.println("Year: ");
                    int year = scanner.nextInt();

                    System.out.println("Fee: ");
                    double fee = scanner.nextDouble();

                    people.add(new Student(name, address, program, year, fee));

                } else if (type.equals("staff")) {

                    System.out.println("School: ");
                    String school = scanner.nextLine();

                    System.out.println("Pay: ");
                    double pay = scanner.nextDouble();

                    people.add(new staff(name, address, school, pay));

                } else {
                    System.out.println("Error!");
                }

            } else if (choice == 2) {
                for (Person x : people) {
                    System.out.println(x);
                }

            } else {
                System.out.println("Error!");
            }
        }
    }
}
