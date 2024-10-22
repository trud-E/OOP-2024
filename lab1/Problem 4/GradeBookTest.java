import java.util.*;

import Prac2.Student;



public class GradeBookTest{
    public static void main(String[] args) {
        Course c = new Course("OOP", "Object-Oriented Programming" , 5, "Know basic knowledge of Java");
        Scanner s = new Scanner(System.in);
        GradeBook stud = new GradeBook(c);

        System.out.println("Number of students: ");
        int n = s.nextInt();

        for(int i = 1 ; i <= n ; i ++){
            System.out.print("enter student name : ");
            String name = s.nextLine();
            System.out.print("enter id : ");
            int id= s.nextInt();
            System.out.print("enter grade : ");
            double grade = s.nextDouble();

            stud.addStudent(new Student(id , name , grade));

        }
        stud.displayGradeReport();
    }
}