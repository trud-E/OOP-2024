

public abstract class Shape{
    protected int position;
    protected Color color;
    
    public Shape(int position, Color color){
        this.position = position;
        this.color = color;
    }

    public abstract String draw();


}