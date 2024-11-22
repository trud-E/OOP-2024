import java.util.HashSet;

public class UseSet<E> implements MyCollection<E> {

    HashSet<E> set;

    public UseSet(){
        set = new HashSet<>();
    }

    @Override
    public void add(E elem) {
        set.add(elem);
    }

    @Override
    public void remove(E elem) {
        set.remove(elem);
    }

    @Override
    public boolean contains(E elem) {
        return set.contains(elem);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public void clear() {
        set.clear();
    }
}
