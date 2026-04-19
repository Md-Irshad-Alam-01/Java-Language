package CH_19_Linked_List_Part_i;

public class _10_Search_Key_in_Linked_List_Iterative_Way {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        tail=newNode;
        size--;
    }

    public int iterativeSearch ( int key) {
        Node temp = head;
        int i = 0 ;
        while (temp != null) {
            if ( temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //if key not found
        return -1;
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


    static void main(String[] args) {
        _10_Search_Key_in_Linked_List_Iterative_Way ll = new _10_Search_Key_in_Linked_List_Iterative_Way();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        System.out.println("If fount return index number =" + ll.iterativeSearch(3));
        System.out.println("If not found return -1 = " +ll.iterativeSearch(7));
    }
}
