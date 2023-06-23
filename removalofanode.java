package linkedlist;

public class removalofanode {

		    Node head; // head of list
	 
	    /* Linked list Node*/
	    class Node {
	        int data;
	        Node next;
			
			  Node(int d) {
				  data = d;
				  next = null; 
				  }
			   }	 
	   
	 
	    /* Inserts a new Node at front of the list. */
	    public void push(int data)
	    {
	        Node new_node = new Node(data);
	        new_node.next = head;
	        head = new_node;
	    }
	 
	    /* This function prints contents of linked list starting
	       from the given node */
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null) {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	    }
	    
	    /* Given a key, deletes the first occurrence of key in linked list */
	    
	    void deleteNode(int key)
	    {
	        // Store head node
	        Node temp = head, prev = null;
	 
	        // If head node itself holds the key to be deleted
			
			  if (temp != null && temp.data == key) { 
				head = head.next; // now second node becomes first(head) node
				  temp.next = null;// Changed head // link between first node and second node is removed// there is no address in the next field 
			  return;
			  }
			 
	        // Search for the key to be deleted, keep track of the previous node as we need to change temp.next
	        while (temp != null && temp.data != key) {
	            prev = temp; // data in the temp node is given the to prev node and 
	           temp = temp.next;// and temp node should show(point) the next node which is given in line 39.
	        }
	 
	        // If any key other than input data. //If key was not present in linked list
			
			  if (temp == null) // If temp does not contain any data, return from the program (Do not do any deletion process)
			  return;
			 
	 
	        // Unlink the node from linked list // if data = key
	       prev.next = temp.next; // jump to next node after the removing node. //prev.next points to the next node of temp.next
	    }
	 
	    /* Driver program to test above functions. Ideally this
	    function should be in a separate user class. It is kept
	    here to keep code compact */
	    public static void main(String[] args)
	    {
	    	removalofanode llist = new removalofanode();
	 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	 
	        System.out.println(" Created Linked list is:");
	        llist.printList();
	 
	        llist.deleteNode(3); // Delete node with data 3
	 
	        System.out.println( "Linked List after Deletion :");
	        llist.printList();
	    }
	}
