import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList s = new ReverseLinkedList();
        List<ListNode> list = new LinkedList<>();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        list.add(head);


    }


    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    //Recursive:
    public ListNode reverse2(ListNode head) {
        ListNode prev = null;
        ListNode result = helper(prev, head);
        return result;

    }
    public ListNode helper(ListNode prev, ListNode cur) {
        if(cur.next == null) {
            cur.next = prev;
            return cur;
        }
        ListNode next = cur.next;
        cur.next = prev;
        helper(cur, next);
        return cur;
    }
}


  class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
      this.value = value;
      next = null;
    }

  }


