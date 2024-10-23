
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        
        Set<Company> companies = new HashSet<>();
        
        Educational company1 = new Educational("Udemy", "San Francisco", 2010, "Eren Bali", 516000000, 13);
        Educational company2 = new Educational("Coursera", "Mountain View", 2012, "Andrew Ng", 110000000, 15);
        Educational company3 = new Educational("Udemy", "San Francisco", 2010, "Eren Bali", 516000000, 13); 
        
        
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        for (Company company : companies) {
            System.out.println(company);
        }
        
    }
}