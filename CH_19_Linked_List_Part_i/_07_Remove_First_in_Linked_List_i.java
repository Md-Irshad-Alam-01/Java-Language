package CH_19_Linked_List_Part_i;

public class _07_Remove_First_in_Linked_List_i {

    public static class Node  {
        int data;
        Node next;

        public Node ( int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head ;
    public static Node tail;

    public void add( int data) {
        Node newNode = new Node ( data);

        if ( head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail= newNode;
    }

    public int  removeFirst () {
        int val = head.data;
        head = head.next;
        return val;
    }

    public void print () {
        if ( head == null ) {
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


    public static void main(String[] args) {
        _07_Remove_First_in_Linked_List_i ll = new _07_Remove_First_in_Linked_List_i();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.removeFirst();
        ll.print();
    }
}
