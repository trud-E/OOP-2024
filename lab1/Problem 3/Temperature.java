public class Temperature {
    private double temperature;
    private char type;

    public Temperature(double temperature){
        this.temperature = temperature;
        type = 'C';
    }

    public Temperature(char type){
        temperature = 0;
        this.type = type;
    }

    public Temperature(){
        temperature = 0;
    }

    public void returnInCelcius(double temperature, char type){
        if (type == 'C') {
            System.out.println("degreesC= " + temperature);
        }
        else{
            System.out.println("degreesC= " + 5*(temperature-32)/9);
        }
    }

    public void returnInFahrenheit(double temperature, char type){
        if (type == 'F') {
            System.out.println("degreesF= " + temperature);
        }
        else{
            System.out.println("degreesF= " + (9*(temperature/5))+32);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setBoth(double temperature, char type) {
        this.temperature = temperature;
        this.type = type;
    }

    public char getType() {
        return type;
    }

}
