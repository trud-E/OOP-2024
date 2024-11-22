public class TerrariaCharacter implements AdvMoveable{
    private String name;
    private int age;
    private char gender;

    public TerrariaCharacter(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public void moveToTheRight() {
        System.out.println("You're moving to the right");
    }

    @Override
    public void moveToTheLeft() {
        System.out.println("You're moving to the left");
    }

    @Override
    public void moveUp() {
        System.out.println("You're moving up");
    }

    @Override
    public void moveDown() {
        System.out.println("You're moving down");
    }

    @Override
    public void toJump() {
        System.out.println("You're jumping");
    }

    @Override
    public void toDig(String block){
        System.out.println("You're digging " + block);
    }

    @Override
    public void toTake(String thing){
        System.out.println("You took " + thing);
    }

    @Override
    public void toFight(String villian, String thing) {
        if (thing.equals("Bow"))
            System.out.println("You defeated " + villian);
        else if (thing.equals("Sword"))
            System.out.println("You defeated " + villian);
        else {
            System.out.println("You've lost this battle");
        }
    }


}
