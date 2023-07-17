import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedListGFG28May2023 {
    private Node head;

    public Node findNthNodeFromEnd(Node head, int N) {
        if (head == null || N <= 0) {
            return null;
        }

        Node fastPtr = head;
        Node slowPtr = head;

        // Move fastPtr N nodes ahead
        for (int i = 0; i < N; i++) {
            if (fastPtr == null) {
                // N is greater than the length of the linked list
                return null;
            }
            fastPtr = fastPtr.next;
        }

        // Move both pointers until fastPtr reaches the last node
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }

        return slowPtr;
    }

    public static void main(String[] args) {
        LinkedListGFG28May2023 list = new LinkedListGFG28May2023();

        // Create a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int N = 4; // Find the 3rd node from the end

        Node nthNodeFromEnd = list.findNthNodeFromEnd(head, N);
        if (nthNodeFromEnd != null) {
            System.out.println("Value of the " + N + "th node from the end: " + nthNodeFromEnd.data);
        } else {
            System.out.println("The " + N + "th node from the end doesn't exist.");
        }
    }
}
