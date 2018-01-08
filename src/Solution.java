class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}


public class Solution {
    /*
     * @param node: a list node in the list
     * @param x: An integer
     * @return: the inserted new list node
     */
    public ListNode insert(ListNode node, int x) {

        if(node == null){
            ListNode newNode = new ListNode(x);
            newNode.next = newNode;
            return newNode;
        }

        ListNode curr = node.next;
        ListNode prev = node;

        while(curr != node){

            if( x >= prev.val && x <= curr.val){
                break;
            }

            if((prev.val > curr.val) && (x > prev.val || x < curr.val)){
                break;
            }

            curr = curr.next;
            prev = prev.next;
        }

        ListNode newNode = new ListNode(x);
        prev.next = newNode;
        newNode.next = curr;
        return prev;

    }
}