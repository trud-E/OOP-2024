public class Dog extends Animal implements AbleToRun{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void run(){
        System.out.println("Dog is running");
    }

    @Override
    public void getSound(){
        System.out.println("Burk");
    }

}
