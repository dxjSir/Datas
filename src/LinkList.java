public class LinkList {
    private Node head;
    private Node curr; // 当前节点位置
    private int size; // 元素个数

    LinkList() {
        head = curr = new Node(null);
        size = 0;
    }

    public void index(int i) {
        if (i < -1 || i > size - 1) {
            System.out.println("参数错误");
        }

        if (i==-1) {return;}

        int j = 0;
        curr = head.getNext();
        while (curr != null && j < i) {
            curr = curr.getNext();
            j++;
        }
    }

    public void insert(int i, Object o) {
        if (i < 0 || i > size ) {
            System.out.println("参数错误");
        }
        index(i -1);

        curr.setNext(new Node(o, curr.getNext()));
        size++;
    }

    public Object delete(int i) {
        if (size == 0) {
            System.out.println("链表空");
        }
        if (i < 0 || i > size - 1) {
            System.out.println("参数错误");

        }

        index(i - 1);
        Object obj = curr.getNext().getData();
        curr.setNext(curr.getNext().getNext());
        size--;

        return obj;
    }

    public Object getData(int i) {
        if (i < 0 || i > size - 1) {
            System.out.println("参数错误");
        }

        index(i);
        return curr.getData();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }
}

