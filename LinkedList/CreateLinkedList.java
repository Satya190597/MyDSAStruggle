package LinkedList;
/*
 Create a linked list and iterate through it.
*/
public class CreateLinkedList {
    public static void main(String args[]) {
        int[] studentIds = {100,200,300,400,500,600,700,800,900,1000};
        ListNode head = null;
        ListNode current = null;
        for(int id : studentIds) {
            ListNode node = new ListNode(id);
            if(head == null) {
                head = node;
                current = head;
            }
            else {
                current.setNext(node);
                current = node;
            }
        }
        print(head);
    }
    public static void print(ListNode head) {
        if(head==null)
            return;
        System.out.print(head.getData()+" ");
        print(head.getNext());
    }
}
