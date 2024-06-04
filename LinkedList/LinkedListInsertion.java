package LinkedList;

public class LinkedListInsertion {
    public static void main(String args[]) {
        int[] studentIds = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        ListNode head = null;
        ListNode current = null;
        for (int id : studentIds) {
            ListNode node = new ListNode(id);
            if (head == null) {
                head = node;
                current = head;
            } else {
                current.setNext(node);
                current = node;
            }
        }
        print(head);
        System.out.println("\nAdd 51 At 2nd Position");
        add(2,51,head);
        print(head);
        System.out.println("\nAdd 91 At 10th Position");
        add(10,91,head);
        print(head);
    }
    public static void add(int index,int data,ListNode head) {
        if(index == 1) {
            insertAtTheStart(index, data, head);
            return;
        }
        ListNode position = head;
        for(int i = 0; i < index-1; i++) // 0 < 0
        {
            position = position.getNext();
        }
        ListNode node = new ListNode(data);
        node.setNext(position.getNext());
        position.setNext(node);
    }

    private static void insertAtTheStart(int index,int data,ListNode head) {
        ListNode node = new ListNode(data);
        node.setNext(head);
        head = node;
    }
    public static void print(ListNode head) {
        if(head == null)
            return;
        System.out.print(head.getData()+" ");
        print(head.getNext());
    }
}
