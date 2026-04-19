package CH_19_Linked_List_Part_i;

public class _13_Find_and_Remove_Nth_Node_from_End {

    public static class Node {
        int data ;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next= null;
        }
    }

    public static Node head ;
    public static Node tail;
    public static int size;

    public void add (int data) {
        Node newNode = new Node (data);
        if ( head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void deleteNthFromEnd ( int n) {
        //calculate size
        int size = 0;
        Node temp = head;
        while ( temp != null) {
            temp = temp.next ;
            size++;
        }
        if ( n == size) {
            head = head.next; //remove first
            return;
        }

        //size -n
        int  i = 1;
        int find = size -n;
        Node prev = head;
        while ( i < find) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
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
        _13_Find_and_Remove_Nth_Node_from_End ll = new _13_Find_and_Remove_Nth_Node_from_End();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
    }
}
