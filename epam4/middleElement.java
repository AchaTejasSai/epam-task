import java.util.*;
class middleElement
{
	public static class Node
	{
		int data;
		Node next;
	}
	public static Node head=null;
	public static Node tref=null;
	static void push(int new_data)
	{
		Node new_node=new Node();
		new_node.data=new_data;
		if(head==null)
			head=tref=new_node;
		else
			tref.next=new_node;
		tref=new_node;
		tref.next=null;
	}
	static void middle()
	{
		Node sp=head;
		Node fp=head;
		if(head!=null){
			while(fp!=null&&fp.next!=null){
				fp=fp.next.next;
				sp=sp.next;
			}
		}
		System.out.println(sp.data);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			push(sc.nextInt());
		middle();
		
	}
}