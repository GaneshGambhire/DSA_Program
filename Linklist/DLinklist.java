package Demo;

class Node5 {
    int data;
    Node5 next;
    Node5 prev;

    // Constructor to initialize the node
    public Node5(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkList {
    Node5 head;

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node5 node = new Node5(data);
        
        if (head == null) {
            head = node; // List is empty
        } else {
            Node5 n = head;
            while (n.next != null) {
                n = n.next; 
            }
            n.next = node;
            node.prev = n; 
        }
    }

    // Insert a new node at the start of the list
    public void insertAtStart(int data) {
        Node5 node = new Node5(data);
        node.next = head; 
        node.prev = null; 
        
        if (head != null) {
            head.prev = node; 
        }
        head = node; 
    }

    // Insert a new node at a specific index
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data); 
            return;
        }

        Node5 node = new Node5(data);
        Node5 n = head;

        // Traverse to the node just before the specified index
        for (int i = 0; i < index - 1 && n != null; i++) {
            n = n.next;
        }

        if (n != null) {
            node.next = n.next; 
            if (n.next != null) {
                n.next.prev = node; 
            }
            n.next = node; 
            node.prev = n; 
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Delete a node at a specific index
    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (index == 0) {
            head = head.next; 
            if (head != null) {
                head.prev = null; 
            }
            return;
        }

        Node5 n = head;
        // Traverse to the node just before the specified index
        for (int i = 0; i < index - 1 && n != null; i++) {
            n = n.next;
        }

        if (n != null && n.next != null) {
            Node5 n1 = n.next;
            n.next = n1.next; 
            if (n1.next != null) {
                n1.next.prev = n; 
            }
            n1 = null; 
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Display the contents of the list
    public void show() {
        Node5 node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(); 
    }
}

public class DLinklist {
    public static void main(String[] args) {
        DoubleLinkList lst = new DoubleLinkList();
        lst.insert(10);
        lst.insert(20);
        lst.insert(30);
        
        lst.insertAt(0, 55); 
        lst.insertAt(2, 25); 

        lst.deleteAt(1); 
        
        lst.show(); 
    }
}
