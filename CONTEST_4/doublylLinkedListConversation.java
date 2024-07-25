class GfgNew{
 // Function to convert singly linked list to doubly
    static void makeDoubly(Node head){
       
        // Your code here
        Node prev_node = null;
        Node curr_node = head;
        while (curr_node != null) {
            curr_node.prev = prev_node;
            prev_node = curr_node;
            curr_node = curr_node.next;
        
        }
    }
}
