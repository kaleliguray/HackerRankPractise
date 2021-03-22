package challenges;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedListNode {

	public static Node insert(Node head,int data) {
		if (head == null) {
			return new Node(data);
		}else if (head.next == null) {
			return head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		
		return head;
	}
	
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Node head = null;
		int N = scanner.nextInt();
		
		while (N-- > 0 ) {
			int ele  = scanner.nextInt();
			head = insert(head, ele);
		}
		
		display(head);
		scanner.close();
	}
	
	
}












































