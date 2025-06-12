/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null){
            return new ListNode();
        }

        ListNode result = new ListNode(0);
        ListNode temp = result;

        head = head.next;
        int sum = 0;

        while(head != null){
            if(head.val != 0){
                sum += head.val;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            head = head.next;
        }
        return result.next;
    }
}