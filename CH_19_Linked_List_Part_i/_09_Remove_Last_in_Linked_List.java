package CH_19_Linked_List_Part_i;

public class _09_Remove_Last_in_Linked_List {

    public static class Node {
         int data;
         Node next;

         public Node (int data ){
             this.data = data;
             this.next = null;
         }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add ( int data) {
        Node newNode = new Node (data) ;

        if ( head == null) {
            head = tail = newNode;
            size = 1;
            return;
        }
        tail.next= newNode;
        tail = newNode;
        size++;
    }

    public int removeLast () {
        //If linked list is zero
        if ( size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        //If linked list has only one element ( means head = tail)
        else if ( size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev => i = size -2
        Node prev = head;
        for ( int i = 0 ; i < size - 2 ; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print () {
        if ( head == null ) {
            System.out.println("Linked List is null");
            return;
        }

        Node temp = head;
        while ( temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _09_Remove_Last_in_Linked_List ll = new _09_Remove_Last_in_Linked_List();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
