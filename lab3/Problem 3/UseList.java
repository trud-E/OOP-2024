import java.util.ArrayList;

public class UseList <E> implements MyCollection<E>{
    private ArrayList<E> list;


    public UseList(){
        list = new ArrayList<>();
    }

    @Override
    public void add(E elem) {
        list.add(elem);
    }

    @Override
    public void remove(E elem) {
        list.remove(elem);
    }

    @Override
    public boolean contains(E elem) {
        for (E x : list){
            if (x.equals(elem))
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if (list.size()==0)
            return true;
        return false;
    }

    @Override
    public void clear() {
        list.clear();
    }



}
