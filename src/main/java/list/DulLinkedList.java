package list;

public class DulLinkedList implements ListIntf {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public Object getPre(Object obj) {
        return null;
    }

    @Override
    public Object getNext(Object obj) {
        return null;
    }

    @Override
    public void insertElementAt(Object obj, int i) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public Object remove(Object obj) {
        return null;
    }

    public int insert(DulNode h, int i, char x) {
        DulNode p, s;
        p = h.next;
        int j = 1;
        while (p != h && j < i) {
            p = p.next;
            j++;
        }

        if (j == i) {
            s = new DulNode();
            s.data = x;
            s.prior = p.prior;
            s.next = p;
            s.prior.next = s;
            p.prior = s;
            return 1;
        } else {
            return 0;
        }
    }

    public char dele(DulNode h, int i) {
        DulNode p = h.next;
        int j = 1;
        while (p != h && j < i) {
            p = p.next;
            j++;
        }

        if (j == i) {
            p.prior.next = p.next;
            p.next.prior = p.prior;
            return p.data;
        } else {
            return 0;
        }
    }
}
