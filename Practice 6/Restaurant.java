public class Restaurant {

    public boolean servePizza(CanHavePizza eater){
        eater.eatPizza();
        if (eater instanceof Person){
            return true;
        }
    }

}
