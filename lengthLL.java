class Solution { 
  /* Returns count of nodes in linked list */
  public static int lengthOfList(Node head) {
      if(head == null){
        return 0;
      }
      return 1 + lengthOfList(head.next);
  }  
}
