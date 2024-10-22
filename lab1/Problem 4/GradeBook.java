import Prac2.Student;
import java.util.*;

public class GradeBook {
    private double sum = 0;
    private int it = 0;

    private Course course;
    private List<Student> students;

    public GradeBook(Course course){
        this.course = course;
        this.students = new ArrayList<>();
    }


    public void displayGradeReport() {
        Avg();
        lowestAndHighest();
        outputBarChart();
    }
    public void addStudent(Student student){
        students.add(student);
        it++;
    }


    public void displayMessage(){
        System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!");
    }

    public void lowestAndHighest(){
        if(students.isEmpty())return;
        Student n1 = students.get(0);
        Student n2 = students.get(0);
        for(Student student : students){
            if(student.getGrade() < n1.getGrade()){
                n1 = student;
            }
            if(student.getGrade() > n2.getGrade()){
                n2 =student;
            }
        }
        System.out.println("the highest is: " + n1.getGrade() + " id: " + n1.getID());
        System.out.println("the lowest is: " + n2.getGrade() + " id: " + n2.getID());
    }

    public void Avg(){
        for(Student x : students){
            sum+=x.getGrade();
        }
        System.out.println("Avg is: " + sum/it);
    }

    private void outputBarChart(){
        int[] grdistribution = new int[11];
        for(Student student : students){
            int ind = (int) student.getGrade() / 10 ;
            grdistribution[ind]++;
        }
        System.out.println("Grades distribution:");
        for(int i = 0 ; i < grdistribution.length ; i++){
            if(i == 10){
                System.out.print("100: ");
            }
            else{
                System.out.printf("%02d-%02d: " , i * 10 , i * 10 + 9 );
            }
            for(int j = 0 ; j < grdistribution[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "GradeBook [course=" + course + ", students=" + students + "]";
    }

    


}
