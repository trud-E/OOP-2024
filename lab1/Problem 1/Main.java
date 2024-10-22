import java.util.*;

public class Main{
    public static void main(String[] args){
        Data obj = new Data();
        System.out.println("Enter number (Q to Quit): ");
        
        while (true) {
            Scanner n = new Scanner(System.in);
            String s = n.nextLine();
            if (s.equals("Q") || s.equals("q")) {
                System.out.println("Average = " + obj.getData());
                System.out.println("Maximum = " + obj.max());
                break;
            }else{
                obj.add(Double.parseDouble(s));
            }
            
            
        }
        
    }
}