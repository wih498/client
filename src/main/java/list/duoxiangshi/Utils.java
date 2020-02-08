package list.duoxiangshi;

public class Utils {
    public static JD dxsxj(JD a, JD b) {
        JD at = a, bt = b, ph, p, q;
        p = ph = new JD();
        while (at != null && bt != null) {
            q = new JD();
            if (at.exp < bt.exp) {
                q.coef = at.coef;
                q.exp = at.exp;
                at = at.next;
            } else if (at.exp == bt.exp) {
                q.coef = at.coef + bt.coef;
                q.exp = at.exp;
                at = at.next;
                bt = bt.next;
            } else {
                q.coef = bt.coef;
                q.exp = bt.exp;
                bt = bt.next;
            }
            if (q.coef != 0) {
                p.next = q;
                p = q;
            }
        }
        while (at != null) {
            q = new JD();
            q.coef = at.coef;
            q.exp = at.exp;
            at = at.next;
            p.next = q;
            p = q;
        }
        while (bt != null) {
            q = new JD();
            q.coef = bt.coef;
            q.exp = bt.exp;
            bt = bt.next;
            p.next = q;
            p = q;
        }

        return ph.next;
    }
}
