package array.mat;

import java.util.Scanner;

public class Szjd {
    private int i, j, v;
    private Szjd down, right;

    class Temp {
        int hs;
        int ls;
    }

    int szlbcreate(Szjd m[], Szjd n[], Temp l) {
        int i, j, v, k, ms, ns;
        Szjd p = null, q = null;
        ms = ns = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数和列数：");
        ms = scanner.nextInt();
        ns = scanner.nextInt();
        for (k = 0; k < ms; k++) {
            m[k] = null;
        }
        for (k = 0; k < ns; k++) {
            n[k] = null;
        }
        l.hs = ms;
        l.ls = ns;
        System.out.println("输入三元组，若行下表或列下标为0时，则表示输入完毕，算法结束");
        while (true) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            v = scanner.nextInt();
            if (i > ms || j > ns) {
                continue;
            }
            if (i <= 0 || j <= 0) {
                break;
            }
            q = new Szjd();
            q.i = i;
            q.j = j;
            q.v = v;
            q.down = q.right = null;
            p = m[i - 1];
            if (p == null || p.j > j) {
                q.right = p;
                m[i - 1] = q;
            } else {
                if (p.j == j) {
                    m[i - 1] = q;
                } else {
                    while (p.right != null) {
                        p = p.right;
                    }
                    p.right = q;
                }
            }
            p = n[j - 1];
            if (p == null || p.i > i) {
                q.down = p;
                n[j - 1] = q;
            } else {
                if (p.i == i) {
                    n[j - 1] = q;
                } else {
                    while (p.down != null) {
                        p = p.down;
                    }
                    p.down = q;
                }
            }
        }
        return 1;
    }

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
