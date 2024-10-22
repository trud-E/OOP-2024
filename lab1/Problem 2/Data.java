public class Data {
    private static int n;
    private final int TEN = 10; //read only

    public Data(int n){
        this();
        this.n = n;
        System.out.println("first block");
    }
    public Data(){
        System.out.println("Second block");
    }

    public void add(double a){
        this.n += a;
    }

    public void moreThanTen(){
        if (TEN<n) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public double multiTheNumber(double a){
        return n*a;
    }

    
    public double multiTheNumber(double a, double b){
        return n*(a+b);
    }

    
}


