import java.util.*;


public class Library{
    private Access access;
    private Depravity depravity;

    private static HashMap<String, String> readers = new HashMap<>();
    
    private static ArrayList<String> books = new ArrayList<>();

    public void setBooks(String book){
        books.add(book);
    }

    public void setReaders(String book, String name){
        if(books.contains(book) != true){
            System.out.println("We don't have such a book!");
        }else{
            readers.put(book, name);
            books.remove(book);
        }
        
    }

    public void check(String book){
        if(books.contains(book) != true){
            System.out.println("We don't have such a book!");
        }
        else if(readers.containsKey(book)){
            System.out.println(Access.NotAvailable);
            System.out.println("This book is in the possession of a person called: " + readers.get(book));
        }
        else{
            System.out.println(Access.InStock);
            System.out.println("You can take this book!");
        }
    }
    public void availableBooks(){
        for (String i : books) {
            System.out.println("Book: " + i);
        }
    }

    public void returnBook(String book, Depravity depravity){
        this.depravity = depravity;
        if (books.contains(book) != true && this.depravity == depravity.lost) {
            System.out.println("Compensate for damage 10000 tenge");
            books.add(book);
            readers.remove(book);
        }
        else if (books.contains(book) != true && this.depravity == depravity.tore) {
            System.out.println("Compensate for damage 5000 tenge");
            books.add(book);
            readers.remove(book);
        }
        else if(books.contains(book) != true && this.depravity == depravity.isFine){
            System.out.println("You have successfully returned");
            books.add(book);
            readers.remove(book);
        }
        else{
            System.out.println("The book has already been returned");
        }
    }
    

}