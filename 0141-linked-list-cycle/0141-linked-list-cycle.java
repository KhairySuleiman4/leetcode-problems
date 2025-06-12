/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        Set<ListNode> vals = new HashSet<>();
        while(head.next != null){
            if(vals.contains(head)){
                return true;
            } else{
                vals.add(head);
            }
            head = head.next;
        }
        return false;
    }
}