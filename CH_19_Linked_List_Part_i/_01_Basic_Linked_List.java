package CH_19_Linked_List_Part_i;

import java.util.LinkedList;

public class _01_Basic_Linked_List {
    public static class Node {
        int data ;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Print Linked List
    public static void print () {
        if ( head == null) {
            System.out.println("Linked List is null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main( String[] args) {
        //Creating Linked List manually
        head = new Node(1);
        head.next = new Node(2);

        //Print List
        print();
    }
}
