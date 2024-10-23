
public class Magazine extends LibraryItem{
    private int numberOfPages;
    private int circulation;
    private String publisher;
    public Magazine(String title, String author, int publicationYear , int numberOfPages, String publisher, int circulation){
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.circulation = circulation;
    }


    public void getPublisher(){
        System.out.println(publisher);
    }

    public void increaseCirculation(int circulation){
        this.circulation += circulation;
    }



}
