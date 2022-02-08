package com.bridgelabz.DSPrograms;

public class LinkedListPrg {
	ListNode head;
	int size;
	
	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	class ListNode{
		String data;
		ListNode next;
		
		public ListNode() {
			this.data = null;
			this.next = null;
		}
	}
	
	public LinkedListPrg() {
		this.head = null;
		this.size = 0;
	}
	
	public void addStrElement(String str) {
		ListNode tempVar = new ListNode();
		tempVar.data = str;
		tempVar.next = head;
		head = tempVar;
		
	}
	
	public String printStrList() {
		ListNode pointer = head;
		String result = "";
		while(pointer != null) {
			result = result + pointer.data + " ";
			pointer = pointer.next;
		}
		return result ;
	}

	public String removeOrAdd(String searchWord) {
		ListNode pointer = head;
		
		while(pointer != null) {
			if(pointer.data.equals(searchWord)) {
				System.out.print("Found the word");
			}
			pointer = pointer.next;
		}
		addStrElement( searchWord);
		return null;
	}
	
}
