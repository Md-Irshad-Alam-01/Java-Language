package CH_19_Linked_List_Part_i;

public class _11_Search_Key_in_Linked_List_Recursive_Way {
    public static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add ( int data) {
        Node newNode = new Node (data);

        if ( head == null) {
            head = tail = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int helperFun ( Node head , int key) {
        //base case
        if ( head == null) {
            return  -1 ;
        }

        if ( head.data == key) {
            return 0;
        }
        int idx = helperFun(head.next , key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearch ( int key) {
        return helperFun(head,key);
    }

    public void print () {
        if ( head == null ) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while ( temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main ( String[] args) {
        _11_Search_Key_in_Linked_List_Recursive_Way ll = new _11_Search_Key_in_Linked_List_Recursive_Way();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();

        System.out.println("If fount return index number ="+ ll.recursiveSearch(3));
        System.out.println("If not found return -1 = " +ll.recursiveSearch(10));
    }
}
