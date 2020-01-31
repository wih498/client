package leetCode;

import list.LinkedList;
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

        printLinkList(a);
//        LinkedList.inverse(a);
//        printLinkList(a);
        printLinkList(LinkedList.inverse1(a));
        printLinkList(a);
    }

    public static void printLinkList(Lnode h) {
        if (h != null) {
            System.out.println(h.data);
            printLinkList(h.next);
        } else {
            System.out.println("-----");
        }
    }
}
