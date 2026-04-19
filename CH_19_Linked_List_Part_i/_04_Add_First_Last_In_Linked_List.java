package CH_19_Linked_List_Part_i;

public class _04_Add_First_Last_In_Linked_List {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst (int data) {
        //Step 1 -> Create new Node
        Node newNode = new Node (data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //Step 2 -> newNode next = head
        newNode.next = head;  //link

        //Step 3 -> head = newNode
        head = newNode;
    }

    public void addLast ( int data) {
        Node newNode = new Node( data) ;
        if ( head == null ) {
            head = tail = newNode ;
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
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _04_Add_First_Last_In_Linked_List ll = new _04_Add_First_Last_In_Linked_List();

        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
