package leetCode;

import list.LinkedList;
import list.Lnode;
import list.duoxiangshi.JD;
import list.duoxiangshi.Utils;

public class Test2 {
    public static void main(String[] args) {
        Lnode a = new Lnode('1');
        a.next = new Lnode('5');
        a.next.next = new Lnode('7');

        Lnode b = new Lnode('1');
        b.next = new Lnode('3');
        b.next.next = new Lnode('4');
        b.next.next.next = new Lnode('9');

        Test1.printLinkList(LinkedList.hb(a, b));

        JD aj = new JD(8, 0);
        aj.next = new JD(7, 1);
        aj.next.next = new JD(-9, 8);
        aj.next.next.next = new JD(5, 17);

        JD bj = new JD(4, 1);
        bj.next = new JD(6, 7);
        bj.next.next = new JD(9, 8);
        bj.next.next.next = new JD(-10, 19);

        printJD(Utils.dxsxj(aj, bj));
    }

    private static void printJD(JD jd) {
        while (jd != null) {
            System.out.println(jd);
            jd = jd.next;
        }
        System.out.println("-------");
    }
}
