import Time.Time;
import Problem4.*;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Time t1 = new Time(12,15,43);
        Time t2 = new Time(14, 17, 34);
        Time t3 = new Time(9, 5, 15);
        Time t4 = new Time(23, 58, 30);
        Time[] allTime = {t1, t2, t3 , t4};

        Chocolate choco1 = new Chocolate(100, "Raxat");
        Chocolate choco2 = new Chocolate(200, "Roshen");
        Chocolate choco3 = new Chocolate(150, "Oreo");
        Chocolate[] allChoco = {choco1, choco2, choco3};

        Employee employee1 = new Employee("Davis", 25, 10000, new Date(122,03,15),"2102BWQT01");
        Employee employee2 = new Employee("Alex", 21, 7000, new Date(124,01,12), "2301ABVN61");
        Employee employee3 = new Employee("Andrey", 29, 15000, new Date(119, 06,27), "1803GKLB87");

        Employee[] employees = {employee1,employee2,employee3};




//        Sort.selectSort(allChoco);
//        Sort.bubbleSort(allTime);

        Sort.bubbleSort(employees);

    }
}
