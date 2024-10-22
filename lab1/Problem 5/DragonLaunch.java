import java.util.*;



public class DragonLaunch {
    public static Vector<Person>persons = new Vector<Person>();
    
    public static void kidnap(Person p){
        persons.addElement(p);
    }

    public static boolean willDragonEatOrNot(){
        if (persons.size()%2==1) {
            return true;
        }        
        int bcnt = 0 ;
		int leaves = 0 ;
		for(Person current : persons) {
			if(current.gender == Gender.B) {
				bcnt++ ; 
			}
			if(bcnt == 0 && current.gender == Gender.B) {
				return true ; 
			}
			else if(bcnt > 0 && current.gender == Gender.B) {
				leaves+=2;
				bcnt--; 
			}
		}
		return persons.size() - leaves != 0 ; 
    }
}
