import Prac2.Student;

public class Course {

    private String name;
    private String description;
    private int numberOfCredits;
    private String prerequisite;

    public Course(String name, String description, int numberOfCredits, String prerequisite){
        this.name = name;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", description=" + description + ", numberOfCredits=" + numberOfCredits
                + ", prerequisite=" + prerequisite + "]";
    }

    

    
}

