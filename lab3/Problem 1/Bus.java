
public class Bus extends Car implements toStart, toDrive{
    private int numberOfSeats;
    private double sizeTires;


    public Bus(String model, int year, int numberOfSeats){
        super(model, year);
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public void setSizeTires(double sizeTires){
        this.sizeTires = sizeTires;
    }

    @Override
    public void drive(){
        System.out.println("Ехать со скоростью 60км/час");
    }


}
