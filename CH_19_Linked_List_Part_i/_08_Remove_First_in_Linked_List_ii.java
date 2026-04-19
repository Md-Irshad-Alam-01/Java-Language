package CH_19_Linked_List_Part_i;

public class _08_Remove_First_in_Linked_List_ii {

    public static class Node {
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
        Node newNode = new Node(data);
        if (head== null) {
            head = tail=newNode;
            size= 1;
            return;
        }

        tail.next= newNode;
        tail = newNode;
        size++;
    }

    public int removeFirst ( ) {
        //If size is zero
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        //if size == 1 means head = tail
        else if ( size == 1) {
            int val = head.data;
            head = tail = null;
            size =  0 ;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public void print () {
        if ( head == null) {
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
        _08_Remove_First_in_Linked_List_ii ll = new _08_Remove_First_in_Linked_List_ii();
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
