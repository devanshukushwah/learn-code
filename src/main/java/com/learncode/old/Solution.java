package com.learncode.old;

public class Solution
{
    Node head = null;

    public void add(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }

        Node nextRef = head;

        while (nextRef.next != null) {
            nextRef = nextRef.next;
        }

        nextRef.next = new Node(value, null);
    }

    public void print() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void print(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        // null 1 -> 2 -> 3 4 5
        //   p   c
        //
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            prev = head;
            curr = nextNode;
        }

        head = prev;
    }

    void reverseLinkedList2() {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node second = curr.next; // store next address
            curr.next = prev; // reverse pointing
            prev = curr; // move prev to next
            curr = second; // move head to next
        }

        head = prev;
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node nextNode = reverse(head.next);
        head = head.next.next;
        head.next = null;

        return head;

    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        soln.add(1);
        soln.add(3);
        soln.add(4);
        soln.add(2);

        soln.print();

//        System.out.println("test - " + soln.head.value);
        System.out.println("---");
        soln.reverseLinkedList2();
        soln.print();
//        System.out.println("---");
//        Node reverse = soln.reverse(soln.head);
//        soln.print(reverse);
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
