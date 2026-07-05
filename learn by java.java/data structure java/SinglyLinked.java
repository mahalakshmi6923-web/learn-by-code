class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at beginning");
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted at end");
    }
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println(data + " inserted at position " + position);
    }
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data + " deleted from beginning");
        head = head.next;
    }
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " deleted");
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.next.data + " deleted from end");
        temp.next = null;
    }
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            System.out.println(head.data + " deleted");
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }
        System.out.println(temp.next.data + " deleted from position " + position);
        temp.next = temp.next.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class SinglyLinked{
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtPosition(15, 3);

        list.display();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(2);

        list.display();
    }
}