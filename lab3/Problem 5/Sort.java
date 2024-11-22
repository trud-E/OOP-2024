
public class Sort{
    private static <E> void swap(E [] array, int i , int j){
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array){
        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i].compareTo(array[i+1]) > 0){
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }
        for (E x : array){
            System.out.println(x);
        }

    }

    static  <E extends Comparable<E>> void selectSort(E[] array){
        for (int step = 0; step < array.length; step++) {
            int index = minValue(array, step);
            swap(array, step, index);
        }
        for (E x : array){
            System.out.println(x);
        }
    }


    private static <E extends Comparable<E>> int minValue(E[] array, int start){
        int minIndex = start;
        E minValue = array[minIndex];
        for (int i = start; i < array.length; i++) {
            if (minValue.compareTo(array[i]) > 0){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


}
