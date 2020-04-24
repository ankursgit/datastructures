package com.beingzero.week_4;

public class ZTreeSample {
	
	/*
		  	1
		  /   \
	  	 2     3
	    / \   / \
	   4   5 6	 7
	    		  \
	    		  	8
	*/
	static ZTreeNode getSampleTree()
	{
		ZTreeNode root = new ZTreeNode(1);
		
		root.left = new ZTreeNode(2);
		root.right = new ZTreeNode(3);
		
		root.left.left = new ZTreeNode(4);
		root.left.right = new ZTreeNode(5);
		root.right.left = new ZTreeNode(6);
		root.right.right = new ZTreeNode(7);
		
		root.right.right.right = new ZTreeNode(8);
		
		return root;
	}
}
