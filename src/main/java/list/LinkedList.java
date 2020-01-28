package list;

public class LinkedList implements ListIntf {
    Lnode h = null;

    public LinkedList(String str) {
        h = new Lnode();
        Lnode p, t = h;

        for (int i = 0; i < str.length(); i++) {
            p = new Lnode();
            p.data = str.charAt(i);
            p.next = null;
            t.next = p;
            t = p;
        }
    }

    public LinkedList(String str, boolean desc) {
        if (desc) {
            new LinkedList(str);
        } else {
            h = new Lnode();
            h.next = null;
            Lnode p;

            for (int i = 0; i < str.length(); i++) {
                p = new Lnode();
                p.data = str.charAt(i);
                p.next = h.next;
                h.next = p;
            }
        }
    }

    public void setH(Lnode h) {
        this.h = h;
    }

    @Override
    public int size() {
        Lnode p = h.next;
        int i = 0;
        while (p != null) {
            i++;
            p = p.next;
        }
        return i;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Lnode get(int i) {
        Lnode p = h.next;
        int j = 1;
        while (p != null && j < i) {
            p = p.next;
            j++;
        }
        return p;
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

    public void insertElementAfter(Lnode p, char x) {
        Lnode s = new Lnode();
        s.data = x;
        s.next = p.next;
        p.next = s;
    }

    public int insertElementAt(int i, char x) {
        Lnode p = h;
        for (int j = 0; p != null && j < i - 1; j++) {
            p = p.next;
        }

        if (p != null) {
            insertElementAfter(p, x);
            return 1;
        } else {
            return 0;
        }
    }

    public void remove(Lnode p) {
        Lnode q = p.next;
        if (q != null) {
            p.next = q.next;
        }
    }

    public Lnode search(char x) {
        Lnode p = h.next;
        while (p != null && p.data != x) {
            p = p.next;
        }
        return p;
    }

    int inverse(Lnode h) {
        Lnode r, q, p;
        p = h.next;
        if (p == null) {
            return 0;
        } else if (p.next == null) {
            return 0;
        }

        q = p;
        p = p.next;
        q.next = null;
        while (p != null) {
            r = p.next;
            p.next = q;
            q = p;
            p = r;
        }

        h.next = q;
        return 1;
    }

    // 递归
    Lnode inverse1(Lnode h) {
        Lnode p, q;
        p = h.next;

        if (p.next != null) {
            q = inverse1(p);
            q.next = p;
        }

        return p;
    }
}
