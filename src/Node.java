
public class Node 
{
	public int value;
	public Node next;
	public Node head=null;
	
	public Node()	//constructor
	{
		int val=0;
		Node next=null;
	}
	public void insertAtHead(int x)
	{
		Node test= new Node(); //calls constructor, creates a node called test. test.value=0, test.next=null
		test.value=x;	//now test.value=x
		
		if(head==null)
			head=test;	//head now contains address of test
		else
		{
			test.next=head;	
			head=test;	
		}
		
	}

	
	public void insertAtLast(int x)
	{
		Node test= new Node();
		test.value=x;
		if(head==null)
			head=test;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
			temp=temp.next;
				
			}
			temp.next=test;
		}
	}
	
	
	public void printAll()
	{
		Node temp= head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;

		}
	}
	public static void main(String[] args)
	{
		Node L=new Node();
		L.insertAtHead(5);
		L.insertAtHead(9);
		L.insertAtLast(7);
		L.printAll();
	}

}



	
