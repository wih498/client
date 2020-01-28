package list;

public class SqList implements ListIntf {
    final int maxlen = 1000;
    String[] v = new String[maxlen];
    int len = 0;

    public SqList() {

    }

    public SqList(String[] strings) {
        len = strings.length;
        System.arraycopy(strings, 0, v, 0, len);
    }

    int getMaxlen() {
        return maxlen;
    }

    @Override
    public int size() {
        return len;
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
        for (int i = 0; i < len; i++) {
            if (v[i].equals(obj)) {
                return i + 1;
            }
        }
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
        if (len == maxlen) {
            System.out.println("溢出");
        } else if (i < 1 || i > len + 1) {
            System.out.println("i超出范围");
        } else {
            for (int j = len - 1; j >= i + 1; j--) {
                v[j + 1] = v[j];
            }
            v[i - 1] = String.valueOf(obj);
            len++;
        }
    }

    @Override
    public Object remove(int i) {
        Object obj;
        if (i < 1 || i > len) {
            System.out.println("i超出范围");
            return null;
        } else {
            obj = v[i - 1];
            for (int j = i; j < len; j++) {
                v[j - 1] = v[j];
            }
            len--;
            return obj;
        }
    }

    @Override
    public Object remove(Object obj) {
        return null;
    }

    void inverse(int a[], int n) {
        int t;
        for (int i = 0; i < (n -1) / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
}
