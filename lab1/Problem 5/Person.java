
public class Person {
    protected Gender gender;
    public Person(Gender gender){
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "gender=" + this.gender;
    }    
    
}
