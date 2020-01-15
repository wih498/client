package list;

public interface ListIntf {
    int size();
    void clear();
    boolean isEmpty();
    Object get(int i);
    int indexOf(Object obj);
    Object getPre(Object obj);
    Object getNext(Object obj);
    void insertElementAt(Object obj, int i);
    Object remove(int i);
    Object remove(Object obj);
}
