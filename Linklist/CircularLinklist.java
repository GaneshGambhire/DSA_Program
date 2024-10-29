package Demo;

class Node7 {
    int data;
    Node7 next;
}

class CirLinkList { 
    Node7 head;

    public void insert(int data) {
        Node7 node = new Node7();
        node.data = data;

        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node7 n = head;
            while (n.next != head) {
                n = n.next;
            }
            n.next = node;
            node.next = head;
        }
    }

    public void insertAtStart(int data) {
        Node7 node = new Node7();
        node.data = data;

        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node7 n = head;
            while (n.next != head) {
                n = n.next;
            }
            n.next = node;
            node.next = head;
            head = node;
        }
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        Node7 node = new Node7();
        node.data = data;

        Node7 n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
            if (n == head) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            if (head == null) return;
            if (head.next == head) {
                head = null;
                return;
            }
            Node7 n = head;
            while (n.next != head) {
                n = n.next;
            }
            n.next = head.next;
            head = head.next;
            return;
        }
        Node7 n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
            if (n.next == head) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
        }
        Node7 n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }

    public void show() {
        if (head == null) return;

        Node7 node = head;
        do {
            System.out.println(node.data);
            node = node.next;
        } while (node != head);
    }
}

public class CircularLinklist {
    public static void main(String[] args) {
        CirLinkList lst = new CirLinkList(); 

        lst.insert(10);
        lst.insert(20);
        lst.insert(30);

        lst.insertAt(0, 55);

        lst.deleteAt(0);
        lst.show();
    }
}
