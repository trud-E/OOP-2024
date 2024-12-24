public abstract class Car implements CanHavePizza{
    private String model;
    private int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public abstract void toStart();

    public void eatPizza(){
        System.out.println("A car can't eat pizza");
    }


}
