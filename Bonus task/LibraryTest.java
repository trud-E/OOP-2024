
import java.util.*;

public class LibraryTest {
    public static void main(String[] args){
        Library Ellise = new Library();
        Ellise.setBooks("Atomic Habits");
        Ellise.setBooks("CODE");

        // NationalLibraryOfChina.availableBooks();

        Ellise.setReaders("Atomic Habits" , "Abylaikhan");

        Ellise.returnBook("Atomic Habits", Depravity.lost);

        
        
    }    
}
