public class Dog extends Animal{
    public int age;
    public String name;
    public Dog(){
        super();
        age = 2;
        name = "Marly";
    }
    public Dog(int n){
        super(n);
        age = 1;
        name = "Grace";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void move(){
        System.out.println("I'm moving and running");
    }

    public void run(int n1, int n2){
        System.out.println("I'm running, but I ate");
    }
}
