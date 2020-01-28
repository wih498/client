package leetCode;

import list.Lnode;

public class Test1 {
    public static void main(String[] args) {
        Lnode a = new Lnode('a');
        Lnode b = new Lnode('b');
        Lnode c = new Lnode('c');
        Lnode d = new Lnode('d');
        a.next = b;
        b.next = c;
        c.next = d;


    }
}
