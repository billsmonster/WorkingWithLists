  
// Derek LEnz
// working with lists

package listWork;

import java.util.Scanner; // libraries to use 

public class LinList { // the class the linked list is part of 
	  
    static Node head;
  
    static class Node { 
  
        String data; 
        Node next; 
  
        // Constructors for the linke dlist class 
        Node(String d) { 
            data = d; 
            next = null; 
        } 
    }
    public static LinList LinListInsert(LinList list, String data) { //method for inserting element
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
 
            last.next = new_node; 
        } 
 
        return list; 
    } 
    public static void printList(LinList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("\nLinkedList: "); 
   
        while (currNode != null) { 
            
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    } 
    public int lengthOfLinkedList() { //method for how many elements in linked list
       Node temp=head;
       int count = 0;
       while(temp!=null)  {
      temp=temp.next;
      count++;  
       }
        return count;
    }
    public void insertLast(String data) { // method for insurting an element on the list
    	  Node current = head;
    	  while (current.next != null) {
    	   current = current.next; 
    	  }
    	  Node newNode = new Node(data);
    	  newNode.data = data;
    	  current.next = newNode;
    	 }
    public void insertFirst(String data) {
    	  Node newNode = new Node(data);
    	  newNode.data = data;
    	  newNode.next = head;
    	  head = newNode;
    	 }
    static void deleteNode(int input) {  //method for deleting the node
        if (head == null) 
            return;
        Node temp = head; 
 
   if (input == 0)  { 
            head = temp.next;   
            return; 
        } 
  
        for (int i=0; temp!=null && i<input-1; i++) 
            temp = temp.next; 
 
        if (temp == null || temp.next == null) 
            return; 
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list 
    } 
    
	public static void main(String[] args) {
		LinList Rainbow = new LinList(); // cretinglinked list called Rainbow.
		Rainbow =LinListInsert(Rainbow ,"Red");
		Rainbow =LinListInsert(Rainbow ,"Orange"); // creating the roy b giv
		Rainbow =LinListInsert(Rainbow ,"Yellow");
		Rainbow =LinListInsert(Rainbow ,"Blue");//oad the colors of the Rainbow into the linked list
		Rainbow =LinListInsert(Rainbow ,"Green");
		Rainbow =LinListInsert(Rainbow ,"Indigo");
		Rainbow =LinListInsert(Rainbow ,"Violet");
		
		System.out.println("\nLength of Linked List: " +Rainbow.lengthOfLinkedList());//Display the number of items in the list and print its values to the screen
		printList(Rainbow);
		System.out.println("\nPlease enter a new string you would like to insert on front of list");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Rainbow.insertFirst(s);//dd a item to the head of the list by asking the user for a item to add at the beginning
		printList(Rainbow);
		 
		 System.out.println("\nPlease enter a new string you would like to insert on back of list");
		 Scanner ba=new Scanner(System.in);
		 String b=sc.next();
	     Rainbow.insertLast(b);
		 printList(Rainbow);
	//dd an item to the end of the list by asking the user for a item to add at the end. Display the updated list
		 
		System.out.println("\nWould you like to remove items from the list "
				+ "if yes enter1  , if no please enter any other int to exit program");
		//, make sure that it exists before attempting to remove it, al
		//so ensure you check to make sure the list is not empty. Display the updated list
		Scanner tt=new Scanner(System.in);
		
		int c = tt.nextInt();
		
		
		if (c==1) {
			System.out.println("Please enter the index would like to remove ,"
					+ " please note it begins at element 0");
			
			Scanner input=new Scanner(System.in);
			int number = input.nextInt();
			deleteNode(number);
			printList(Rainbow);
			
			}
		else {
			System.out.println("Thank you for using my program , now exiting");
			return;
		}
		
	   System.out.println("\nWould you like to continue to remove items from list enter 9 when completed");
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
	
		
		
	
			while (number!=9) { // loop to go back to item 5 
				 
				 System.out.println("\nPlease enter a new string you would like to insert on back of list");
				 Scanner ta=new Scanner(System.in);
				 String t=sc.next();
			     Rainbow.insertLast(t);
				 printList(Rainbow);
					System.out.println("\nPlease enter the index would like to remove ,"
							+ " please note it begins at element 0");
					
					Scanner ni=new Scanner(System.in);
					int num = ni.nextInt();
					deleteNode(num);
					printList(Rainbow);
					  // System.out.println("\nWould you like to continue to remove items from list enter 9 when completed");
					   System.out.println("\nWould you like to continue to remove items from list enter 9 when completed");
						Scanner im =new Scanner(System.in);
						int imn = input.nextInt();
						number=imn;
					if(number ==9)
					break;
			
			};
			
			

		
		
	
		printList(Rainbow);
		return;
	}
    }