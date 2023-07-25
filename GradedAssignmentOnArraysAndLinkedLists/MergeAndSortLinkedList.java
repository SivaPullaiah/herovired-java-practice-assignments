class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void mergeSortedList(LinkedList list1, LinkedList list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                insert(temp1.data);
                temp1 = temp1.next;
            } else {
                insert(temp2.data);
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            insert(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            insert(temp2.data);
            temp2 = temp2.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class MergeAndSortLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(25);
        list1.insert(35);
        list1.insert(12);
        list1.insert(4);
        list1.insert(36);
        list1.insert(48);

        LinkedList list2 = new LinkedList();
        list2.insert(8);
        list2.insert(32);
        list2.insert(22);
        list2.insert(45);
        list2.insert(63);
        list2.insert(49);

        LinkedList mergedList = new LinkedList();
        mergedList.mergeSortedList(list1, list2);

        System.out.println("Output: ");
        mergedList.printList();
    }
}
