package data.structure;

import java.util.Scanner;

import javax.xml.soap.Node;

public class LinkedList {
		
	private Node next;
	private int data;
	
	public LinkedList(int data){
		this.data = data;
	}
	
	public void display(){
		System.out.println(data + "");
	}
	
	public static class Node{
		int value;
		Node next;
		public Node(int n){
			this.value = n;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Node head = null;
		if (scanner.hasNext()) {
			head = new Node(scanner.nextInt());
		}
		Node temp = head;
		while(scanner.hasNext()){
			temp.next = new Node(scanner.nextInt());
			temp = temp.next;
		}
		scanner.close();
	}
	//求单链表中结点的个数: getListLength
	public static int getListLength(Node head) {
		int len = 0;
		while (null != head) {
			len ++;
			head = head.next;
		}
		return len;
	}
	public static Node reverseList(Node head) {
		if (null == head || null == head.next) {
			return head;
		}
		Node pre = null;
		Node nex = null;
		while (null != head) {
			nex = head.next;
			head.next = pre;
			pre = head;
			head = nex;
		}
		return pre;
	}
	
	
	
}
