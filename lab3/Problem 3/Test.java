public class Test {
    public static void main(String[] args) {
        UseList<Integer> myList = new UseList<>();
        myList.add(15);
        myList.add(20);
        myList.add(25);

        System.out.println(myList.contains(20)); // true
        myList.clear();


        UseSet<String> mySet = new UseSet<>();
        mySet.add("Mouse");
        mySet.add("Monitor");
        mySet.add("Keyboard");
        System.out.println(mySet.contains("Mouse"));
        System.out.println(mySet.size());



    }
}
