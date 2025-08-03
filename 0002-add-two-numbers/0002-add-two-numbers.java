/**
 * Definition for singly-linked list.
  * public class ListNode {
   * int val;
    * ListNode next;
     * ListNode() {}
      * ListNode(int val) { this.val = val; }
       * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        * }
         */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                     // A dummy node to simplify handling the start of the result list.
                             ListNode dummyHead = new ListNode(0);
                                     ListNode current = dummyHead;
                                             int carry = 0;
                                             
                                                     // Pointers for iterating through the input lists.
                                                             ListNode p1 = l1;
                                                                     ListNode p2 = l2;
                                                                     
                                                                             // Loop until we have processed both lists and any remaining carry.
                                                                                     while (p1 != null || p2 != null || carry != 0) {
                                                                                                 // Get the value of the current node, or 0 if the list has ended.
                                                                                                             int x = (p1 != null) ? p1.val : 0;
                                                                                                                         int y = (p2 != null) ? p2.val : 0;
                                                                                                                         
                                                                                                                                     // Calculate the sum and the new carry.
                                                                                                                                                 int sum = carry + x + y;
                                                                                                                                                             carry = sum / 10;
                                                                                                                                                             
                                                                                                                                                                         // Create a new node with the unit digit of the sum.
                                                                                                                                                                                     current.next = new ListNode(sum % 10);
                                                                                                                                                                                                 
                                                                                                                                                                                                             // Move all pointers forward.
                                                                                                                                                                                                                         current = current.next;
                                                                                                                                                                                                                                     if (p1 != null) p1 = p1.next;
                                                                                                                                                                                                                                                 if (p2 != null) p2 = p2.next;
                                                                                                                                                                                                                                                         }
                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                 // The result list starts after the dummy head.
                                                                                                                                                                                                                                                                         return dummyHead.next;
                                                                                                                                                                                                                                                                             }
}