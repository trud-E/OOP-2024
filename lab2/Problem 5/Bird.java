public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    public void getSound(){
        System.out.println("Chip!");
    }
    
}
