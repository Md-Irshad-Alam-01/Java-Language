package CH_19_Linked_List_Part_i;

import java.lang.foreign.PaddingLayout;

public class _05_Add_Middle_in_Linked_List {

    public static class Node {
        int data;
        Node next ;

        public Node ( int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst (int data) {
        Node newNode = new Node ( data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast ( int data) {
        Node newNode = new Node (data);
        if ( head == null ) {
            head = tail = newNode ;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle (int idx, int data) {
        Node newNode = new Node ( data);

        Node temp = head ;
        int i = 0 ;
        while ( i < idx -1 ) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print () {
        if ( head == null) {
            System.out.println("Linked List is null");
            return;
        }
        Node temp = head ;

        while (temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _05_Add_Middle_in_Linked_List ll = new _05_Add_Middle_in_Linked_List ();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMiddle(2,3);
        ll.print();
    }
}
