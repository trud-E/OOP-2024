public class Test {
    public static void main(String[] args) {
        TerrariaCharacter character1 = new TerrariaCharacter("Adam", 20, 'm');
        character1.moveToTheRight();
        character1.moveDown();
        character1.toDig("Cobblestone");
        character1.toFight("King Slime", "Sword");


    }
}
