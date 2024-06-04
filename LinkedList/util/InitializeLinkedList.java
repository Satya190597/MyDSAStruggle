package LinkedList.util;

public class InitializeLinkedList {
    public ListNode initialize(int[] array) {
        ListNode listNode = null;
        ListNode cursor = null;
        for(int element:array) {
            if(listNode == null) {
                listNode = new ListNode(element);
                cursor = listNode;
            }
            else {
                cursor.next = new ListNode(element);
                cursor = cursor.next;
            }
        }
        return listNode;
    }
}
