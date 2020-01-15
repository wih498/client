import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] data = new int[]{8, 2, 3, 3, 1, 7, 3};
        Node head;

        head = arrayToNode(data);
        System.out.println(head);

        head = swap(head);
        System.out.println(head);

//        a1(data);
        System.out.println(Arrays.toString(data));

        a2(3);
        a3(data);
        System.out.println(Arrays.toString(data));
    }

    // 数组转链表
    private static Node arrayToNode(int[] data) {
        Node head = new Node(data[0]);
        Node p = head;

        for (int i = 1; i < data.length; i++) {
            p.next = new Node(data[i]);
            p = p.next;
        }
        return head;
    }

    // 数组逆置
    private static void swap(int[] data) {
        int length = data.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = data[i];
            data[i] = data[length - 1 - i];
            data[length - 1 - i] = temp;
        }
    }

    // 链表逆置
    private static Node swap(Node head) {
        Node node, next, temp;
        node = head;
        next = node.next;

        while (next != null) {
            temp = next.next;

            next.next = node;

            node = next;
            next = temp;
        }

        head.next = null;
        return node;
    }

    // 冒泡排序
    private static void a1(int[] a) {
        boolean change = true;
        for (int j = 0; j < a.length; j++) {
            if (!change) break;
            change = false;
            for (int i = a.length - 1; i >= j + 1; i--) {
                if (a[i] > a[i - 1]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    change = true;
                }
            }
        }
    }

    // n! * 2n
    private static void a2(int n) {
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }

            a[i - 1] = f * 2 * i;
        }
        System.out.println(Arrays.toString(a));
    }

    // 最小与第一个交换，最大数与最后一个交换
    private static void a3(int[] a) {
        int temp, indexMin = 0, indexMax = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[indexMin] > a[i + 1]) {
                indexMin = i + 1;
            }
        }
        temp = a[0];
        a[0] = a[indexMin];
        a[indexMin] = temp;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[indexMax] < a[i + 1]) {
                indexMax = i + 1;
            }
        }
        temp = a[a.length - 1];
        a[a.length - 1] = a[indexMax];
        a[indexMax] = temp;
    }
}
