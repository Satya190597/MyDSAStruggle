package LinkedList;

public class CalculateLength {
    public static void main(String args[]) {
        int[] studentIds = {100,200,300,400,500,600,700,800,900,1000};
        ListNode head = null;
        ListNode current = null;
        for(int id : studentIds) {
            ListNode node = new ListNode(id);
            if(head == null)
            {
                head = node;
                current = node;
            }
            else
            {
                current.setNext(node);
                current = node;
            }
        }
        System.out.println("Length Of The LinkedList "+getLength(head));
    }
    public static int getLength(ListNode node) {
        if(node == null)
            return 0;
        return getLength(node.getNext()) + 1;
    }
}
