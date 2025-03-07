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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        while(slow != null){
            ListNode newNode = slow.next;
            slow.next=prev;
            prev=slow;
            slow=newNode;
        }
        while(prev!=null){
            if(prev.val != head.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;

        
    }
}