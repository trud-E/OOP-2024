
package Prac2;

public class Student {
    private int id;
    private String name;
    private double grade;
    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void yOfStudy(int year){
        year++;
    }

    public double getGrade(){
        return grade;
    }

    public int getID(){
        return id;
    }
}