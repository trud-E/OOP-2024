import Time.Time;

public class Chocolate implements Comparable<Chocolate>{
    private int weight;
    private String name;

    public Chocolate(int weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return name + " | " + weight;
    }

    @Override
    public int compareTo(Chocolate chocolate) {
        if (this.getWeight()==chocolate.getWeight())
            return 0;
        if (this.getWeight()>chocolate.getWeight())
            return 1;
        return -1;
    }




}
