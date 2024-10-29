package Demo;

class Node {
    int data;
    Node next;
}

class LinkList {
    Node head;
    
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        
        Node node = new Node();
        node.data = data;
        
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        
        node.next = n.next;
        n.next = node;
    }
    
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        
        Node n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }
    
    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

public class SingleLinklist {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        
        list.insertAt(0, 55);
        
        list.deleteAt(1);
        
        list.show();
    }
}
