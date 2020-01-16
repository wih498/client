package array.mat;

public class Mat {
    private final int MAX = 10;
    private int mu, nu, tu;
    private Node[] data = new Node[MAX];

    public Mat() {
        for (int i = 0; i < MAX; i++) {
            data[i] = new Node();
        }
    }

    Mat zzjz(Mat a) {
        int am, bn, col;
        Mat b;
        b = new Mat();
        b.nu = a.mu;
        b.mu = a.nu;
        b.tu = a.tu;
        bn = 0;
        for (col = 1; col <= a.nu; col++) {
            for (am = 1; am <= a.tu; am++) {
                if (a.data[am].j == col) {
                    b.data[bn].i = a.data[am].j;
                    b.data[bn].j = a.data[am].i;
                    b.data[bn].v = a.data[am].v;
                    bn ++;
                }
            }
        }
        return b;
    }

    public int getMAX() {
        return MAX;
    }

    public int getMu() {
        return mu;
    }

    public Mat setMu(int mu) {
        this.mu = mu;
        return this;
    }

    public int getNu() {
        return nu;
    }

    public Mat setNu(int nu) {
        this.nu = nu;
        return this;
    }

    public int getTu() {
        return tu;
    }

    public Mat setTu(int tu) {
        this.tu = tu;
        return this;
    }

    public Node[] getData() {
        return data;
    }

    public Mat setData(Node[] data) {
        this.data = data;
        return this;
    }
}
