import java.util.Vector;

public class PersonRegistry {
    

    Vector<Person>personR = new Vector<>();

    public void addPerson(Person person){
        personR.add(person);
    }
    public void removePerson(Person person){
        personR.remove(person);
    }
    

}
