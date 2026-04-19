package CH_19_Linked_List_Part_i;

public class _06_Size_of_Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node ( int data) {
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail;
    public static int size;

    public void addFirst ( int data) {
        Node newNode = new Node (data);
        size++;

        if(head == null) {
            head =  tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast ( int data) {
        Node newNode = new Node (data);
        size++;

        if ( head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle ( int idx,int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node (data);
        size++;

        Node temp = head;
        int i = 0 ;
        while (i < idx -1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next =  newNode;
    }

    public void print () {
        if (head == null) {
            System.out.println("Linked List is null");
            return;
        }
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _06_Size_of_Linked_List ll = new _06_Size_of_Linked_List();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2,3);
        ll.print();
        System.out.println("Size of the linked list is = "+ ll.size);
    }
}
