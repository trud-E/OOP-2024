
public class Test{
    public static void main(String[] args){
        Person objB = new Person(Gender.B);
        Person objG = new Person(Gender.G); 
        DragonLaunch.kidnap(objG);
        DragonLaunch.kidnap(objG);
        DragonLaunch.kidnap(objB);
        DragonLaunch.kidnap(objB);

        System.out.println(DragonLaunch.willDragonEatOrNot()?"Yes":"No");

    }
}