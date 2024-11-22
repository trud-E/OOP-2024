public abstract class Car {
    private String model;
    private int year;


    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }


    public abstract void setSizeTires(double sizeTires);

}
