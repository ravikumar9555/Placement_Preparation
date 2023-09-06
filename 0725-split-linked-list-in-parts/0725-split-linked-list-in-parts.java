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
    public ListNode[] splitListToParts(ListNode head, int k) {
       int l=0;
       ListNode curr=head;
       ListNode[] arr=new ListNode[k];
       while(curr!=null){
           l++;
           curr=curr.next;
       } 

       int eachBucket=l/k;
       int restNode=  l%k;
         curr=head;
         ListNode prev=curr;
       for(int i =0;curr!=null && i<k;i++){
          arr[i]=curr;

          for(int j=0;j<eachBucket+(restNode>0?1:0);j++){
             prev=curr;
             curr=curr.next;
          }
          prev.next=null;
          restNode--;
       }
       return arr;

    }
}