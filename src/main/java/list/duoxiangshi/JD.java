package list.duoxiangshi;

public class JD {
    int coef, exp;
    public JD next;
    public JD() {}
    public JD(int coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public String toString() {
        return coef + ", " + exp;
    }
}
