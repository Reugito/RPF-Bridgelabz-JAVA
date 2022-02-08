package com.bridgelabz.programs;


public class HashTableGeneric {
	private HashNode [] bucket;
	int size, noOfBuckets;
	int n;
	public HashTableGeneric(){
		this(10);  // or this.noOfBuckets = capacity;
	}
	
	public HashTableGeneric(int capacity) {
		this.noOfBuckets = capacity;
		this.bucket = new HashNode[noOfBuckets];
		this.size = 0;
	}

	public class HashNode<t>{
		t key;
		t value;
		HashNode next;
		public HashNode(t key, t value ) {
			this.key = key;
			this.value = value;
		}
	}
	
	public <t>void put(t key, t value) {
		if(key == null || value == null)
			throw new IllegalArgumentException("key or value are null");
		int index = getIndex(key);
		HashNode head = bucket[index];
		while(head != null) {    // check existing node value in hash table
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = bucket[index];
		HashNode node = new HashNode(key, value);
		node.next = head;
		System.out.println(node.key+": "+node.value);
		//bucket[index] = node;
	}
	
	public <t>int getIndex(t key) {
		//System.out.println("--> key "+(Integer)key);
		//return (Integer)key % noOfBuckets;
		return 0;
	}
	
	public <t> String getValue(t key) {
		int index = getIndex(key);
		HashNode head = bucket[index];
		while(head != null) {    // check existing node value in hash table
			if(head.key.equals(key)) {
				return (String) head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public void printHashTable() {
		for(HashNode i : bucket) {
			if(i != null)
				while( i.next != null) {
					System.out.println(i.value);
					i = i.next;
				}
		}
	}
	
	public static void main(String[] args) {
		HashTableGeneric obj = new HashTableGeneric();
		obj.put(10, "hii");
		obj.put(20, "hii Rao");
		obj.put(2.0, "hii Rao");
		System.out.println("size of HashTable: "+obj.size);
		System.out.println("get value of "+10+"from table: "+ obj.getValue(10));
		obj.printHashTable();
	}

}
