package CH_19_Linked_List_Part_i;

public class _12_Reverse_Linked_List_Iterative_Way {

    public static class Node  {
        int data;
        Node next;
        public Node ( int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add (int data) {
        Node newNode = new Node (data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next= newNode;
        tail = newNode;
        size++;
    }

    public void reverse () {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while ( curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print () {
        if ( head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head ;
        while ( temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _12_Reverse_Linked_List_Iterative_Way ll = new _12_Reverse_Linked_List_Iterative_Way();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
