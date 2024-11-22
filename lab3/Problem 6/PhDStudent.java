public class PhDStudent extends Person{
    private String university;
    private String speciality;
    public PhDStudent(String name, int age, Animal animal, String university, String speciality){
        super(name, age, animal);
        this.university = university;
        this.speciality = speciality;
    }


    public PhDStudent(String name, int age, String university, String speciality){
        super(name, age);
        this.university = university;
        this.speciality = speciality;
    }

}
