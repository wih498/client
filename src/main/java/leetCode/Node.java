package leetCode;

class Node {
    private int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node setData(int data) {
        this.data = data;
        return this;
    }
}
