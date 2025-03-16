package com.learncode.datastructure;

public class LinkedList {

    Node head;

    {
        reset();
    }

    void reset() {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        head = new Node(1, node2);
    }

    void print() {
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    void print(Node head) {
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    void printAndReset() {
       print();
       reset();
    }

    void printAndReset(String message) {
        System.out.printf("%-20s : ", message);
        printAndReset();
    }

    void printAndReset(Node head, String message) {
        System.out.printf("%-20s : ", message);
        print(head);
        reset();
    }

    // Remove First         : 2 3 4 5
    void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Remove Last          : 1 2 3 4
    void removeLast() {
        Node n2 = head.next;

        while(n2 != null && n2.next != null && n2.next.next != null) {
            n2 = n2.next;
        }

        n2.next = null;
    }

    // Remove 2nd node      : 1 3 4 5
    void remove2ndNode() {
        // check two elements present of not
        if (head == null || head.next == null) {
            return;
        }

        head.next = head.next.next;
    }

    // Remove 2nd last node : 1 2 3 5
    void remove2ndLastNode() {
        Node n2 = head.next;
        while(n2 != null && n2.next != null && n2.next.next != null && n2.next.next.next != null) {
            n2 = n2.next;
        }
        n2.next = n2.next.next;
    }

    // Remove middle node   : 1 2 4 5
    void removeMiddleNode() {
        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
    }

    // Swap Node            : 2 1
    void swapNode() {
        Node n2 = head.next;
        n2.next = head;
        head.next = null;
        head = n2;
    }

//    void swapFirstTwoNode() {
//        Node nextNext = head.next.next; // address of 3
//        Node n2 = head.next; // address of 2
//        n2.next = head; // change pointing of ref from 3 to 1.
//        head.next = nextNext; // change pointing of ref from 2 to 3
//        head = n2; // change pointing of ref from 1 to 2.
//    }
    void swapFirstTwoNode() {
        Node first = head;
        Node second = head.next;

        first.next = second.next;
        second.next = first;
        head = second;
    }

    void reverseLinkedList() {
        Node prev = null;
        Node curr = head;

        while( curr != null) {
            Node second = curr.next; // store next address
            curr.next = prev; // reverse pointing
            prev = curr; // move prev to next
            curr = second; // move head to next
        }

        head = prev;
    }

    Node reverseLinkedListR(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node nextHead = reverseLinkedListR(head.next);

        head.next.next = head;
        head.next = null;

        return nextHead;
    }



//    My LinkedList        : 1 2 3 4 5
//    Remove First         : 2 3 4 5
//    Remove Last          : 1 2 3 4
//    Remove 2nd node      : 1 3 4 5
//    Remove 2nd last node : 1 2 3 5
//    Remove middle node   : 1 2 4 5
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.printAndReset("My LinkedList");

        linkedList.removeFirst();
        linkedList.printAndReset("Remove First");

        linkedList.removeLast();
        linkedList.printAndReset("Remove Last");

        linkedList.remove2ndNode();
        linkedList.printAndReset("Remove 2nd node");

        linkedList.remove2ndLastNode();
        linkedList.printAndReset("Remove 2nd last node");

        linkedList.removeMiddleNode();
        linkedList.printAndReset("Remove middle node");

        linkedList.swapNode();
        linkedList.printAndReset("Swap Node");

        linkedList.swapFirstTwoNode();
        linkedList.printAndReset("Swap First Two Node");

        linkedList.reverseLinkedList();
        linkedList.printAndReset("Reverse LinkedList");

        Node reversed = linkedList.reverseLinkedListR(linkedList.head);
        linkedList.printAndReset(reversed, "Reverse LinkedList(R)");

    }
}
