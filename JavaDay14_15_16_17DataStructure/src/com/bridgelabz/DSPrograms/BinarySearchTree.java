package com.bridgelabz.DSPrograms;

import com.bridgelabz.DSUtility.Utility;

public class BinarySearchTree {
	
	public static void main(String[] args)
	{
		Utility tree = new Utility();
		tree.insert(50);
		tree.insert(90);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.print();
		
		tree.SearchBST(1);
	}
}
