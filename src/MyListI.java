public interface MyListI<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(E e);

    void clear();

    E get( int index);

    boolean remove(int index);
}
