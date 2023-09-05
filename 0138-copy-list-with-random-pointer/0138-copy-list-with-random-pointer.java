// class Solution {
//   public Node copyRandomList(Node head) {
//     if (head == null)
//       return null;
//     if (map.containsKey(head))
//       return map.get(head);

//     Node newNode = new Node(head.val);
//     map.put(head, newNode);
//     newNode.next = copyRandomList(head.next);
//     newNode.random = copyRandomList(head.random);
//     return newNode;
//   }

//   private Map<Node, Node> map = new HashMap<>();
// }
class Solution {

   public Node copyRandomList(Node head) {
        if(head== null)
            return null;
        
        Node curr = head;
        
        while(curr!=null) {
            Node currNext = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = currNext;
            curr = currNext;
        }
        
        //Deep copy of random pointers
        curr = head;
        while(curr!=null && curr.next!=null) {
            if(curr.random == null) {
                curr.next.random = null;
            } else {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        //Deep copy of next pointers and recovering old linked list
        Node newHead = head.next;
        Node newCurr = newHead;
        curr          = head;
        while(curr!=null && newCurr!=null) {
            curr.next    = curr.next==null ? null : curr.next.next;
            
            newCurr.next = newCurr.next==null ? null : newCurr.next.next;
            
            curr = curr.next;
            newCurr = newCurr.next;
        }
       
        return newHead;        
    }
}