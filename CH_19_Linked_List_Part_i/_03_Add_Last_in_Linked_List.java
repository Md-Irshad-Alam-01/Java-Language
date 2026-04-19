package CH_19_Linked_List_Part_i;

public class _03_Add_Last_in_Linked_List {

    public static class Node {
        int data;
        Node next;

        public Node ( int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head ;
    public static Node tail;

    public void addLast ( int data) {
        Node newNode = new Node(data);
        if ( head == null ) {
            head = tail= newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
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

    public static void main(String [] args) {
        _03_Add_Last_in_Linked_List ll = new _03_Add_Last_in_Linked_List ();
        ll.addLast(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(3);
        ll.print();
    }
}
