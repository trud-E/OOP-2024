public interface MyCollection<E>{
    void add(E elem);

    void remove(E elem);

    boolean contains(E elem);

    int size();

    boolean isEmpty();

    void clear();

}
