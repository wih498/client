package array.mat;

public class Szjd {
    private int i, j, v;
    private Szjd down, right;

    public int getI() {
        return i;
    }

    public Szjd setI(int i) {
        this.i = i;
        return this;
    }

    public int getJ() {
        return j;
    }

    public Szjd setJ(int j) {
        this.j = j;
        return this;
    }

    public int getV() {
        return v;
    }

    public Szjd setV(int v) {
        this.v = v;
        return this;
    }

    public Szjd getDown() {
        return down;
    }

    public Szjd setDown(Szjd down) {
        this.down = down;
        return this;
    }

    public Szjd getRight() {
        return right;
    }

    public Szjd setRight(Szjd right) {
        this.right = right;
        return this;
    }
}
