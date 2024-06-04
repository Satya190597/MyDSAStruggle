package LinkedList;

import LinkedList.util.InitializeLinkedList;
import LinkedList.util.ListNode;

public class SortLinkedList {
    public static void main(String args[])
    {
        InitializeLinkedList initializeLinkedList = new InitializeLinkedList();
        int[] numbers = {40,48,11,88,34,97,12,98,38,13,18,101,59,77,41,63,70,22,3,56,25,10,46,17,84,87,33,60,29,27,54,71,100,93,50,65,61,39,21,32,16};
        ListNode head = initializeLinkedList.initialize(numbers);
        ListNode temp = head;
        while(temp!=null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("Mid Of The Linked List "+findTheMid(head).val);
        ListNode sortedHead =  sort(head);
        print(sortedHead);
    }
    public static void print(ListNode head) {
        while(head!=null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode sort(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = findTheMid(head);
        ListNode secondHead = mid.next;
        mid.next = null;
        ListNode firstHalf = sort(head);
        ListNode secondHalf = sort(secondHead);
        ListNode newList =  mergeTwoSortedLinkedList(firstHalf,secondHalf);
        return newList;
    }
    public static ListNode mergeTwoSortedLinkedList(ListNode A,ListNode B) {
        if(A==null)
            return A;
        ListNode head;
        ListNode temp;
        if(A.val<B.val)
        {
            head = A;
            temp = head;
            A = A.next;
        }
        else
        {
            head = B;
            temp = head;
            B = B.next;
        }
        while(A!=null && B!=null)
        {
            if(A.val<B.val)
            {
                temp.next = A;
                temp = temp.next;
                A = A.next;
            }
            else
            {
                temp.next = B;
                temp = temp.next;
                B = B.next;
            }
        }
        while(A!=null)
        {
            temp.next = A;
            temp = temp.next;
            A = A.next;
        }
        while(B!=null)
        {
            temp.next = B;
            temp = temp.next;
            B = B.next;
        }
        return head;
    }
    public static ListNode findTheMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
