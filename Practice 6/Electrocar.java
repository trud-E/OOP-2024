public class Electrocar extends Car{

    public Electrocar(String model, int year){
        super(model, year);
    }

    @Override
    public void toStart(){
        System.out.println("The car is ready to go");
    }

    @Override
    public void eatPizza(){
        System.out.println("The electrocar can't eat pizza");
    }


}
