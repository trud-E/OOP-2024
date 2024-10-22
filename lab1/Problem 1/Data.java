public class Data {
    private double n1 = 0;
    private double n2 = -9999999;
    private int n = 0;

    public Data(){
    }

    public void add(double a){
        if (a>n2) {
            n2 = a;                        
        }
        n++;
        n1 += a;
    }
    public double getData(){
        if(n == 0){
            return 0;
        }
        else{
            return n1/n;
        }
    }
    public double max(){
        return n2;
    }
}
