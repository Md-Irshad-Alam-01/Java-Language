package CH_19_Linked_List_Part_i;

public class _14_Linked_List_is_Palindrome_or_not {
    public static class Node {
        int data ;
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
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Slow fast Approach
    public Node findMin (Node head) { //helper
        Node slow = head ;
        Node fast = head;
        while ( fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome () {
        //base case
        if ( head == null || head.next == null) {
            return true;
        }

        //step -1 :-> find mid
        Node midNode = findMin(head);
        //Step -2 :-> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while ( curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head ;
        // step -3 :-> check left half and right half
        while ( right != null ) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print () {
        if ( head == null) {
            System.out.println("Linked List is null");
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
        _14_Linked_List_is_Palindrome_or_not ll = new _14_Linked_List_is_Palindrome_or_not();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
