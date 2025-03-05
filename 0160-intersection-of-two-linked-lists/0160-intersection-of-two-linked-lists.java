/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int l1=0;
        ListNode tempA = headA;
        while(tempA != null){
            l1++;
            tempA=tempA.next;
            
        }

        int l2=0;
        ListNode
         tempB=headB;
        while(tempB != null){
            l2++;
            tempB = tempB.next;

        }
        
        



            
        

       while(l1>l2){
        headA=headA.next;
        l1--;
       }
       while(l2>l1){
        headB=headB.next;
        l2--;
       }
        while(headA != headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

        
                
        
    }
}