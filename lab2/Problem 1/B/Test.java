

public class Test {
    public static void main(String[] args){
        Magazine firstMagazine = new Magazine("National Geographic", "Nathan Lump", 1888, 100, "National Geographic Society", 2_200_000);
        firstMagazine.getPublisher();
        firstMagazine.increaseCirculation(15000);
    }
}
