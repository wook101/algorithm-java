import java.io.*;
import java.util.ArrayList;

class Node{
  Node left;
  Node right;
  int data;

  Node(int data){
    this.data=data;
    left=null;
    right=null;
  }
	
}

class BinaryTree{
  Node root;
  ArrayList<Integer> ret = new ArrayList<>();

  BinaryTree(Node root){
    this.root=root;
  }

  void inorder(Node node){
    if(node==null) return;
    inorder(node.left);
    ret.add(node.data);
    inorder(node.right);
  }
}

//     6
//  3     9
// 1  5  7 11
//inorder : 1 3 5 6 7 9 11

class Main {
	public static void main(String[] args) throws Exception {
	  int arr[] = {6,3,9,1,5,7,11};
	  Node root = init(arr);
	  BinaryTree bt = new BinaryTree(root);
	  bt.inorder(root);
	  for(int num:bt.ret){
	    System.out.print(num+" ");
	  }
	}
	
	static Node init(int[] arr){
	  Node root = new Node(arr[0]);
	  Node node1 = new Node(arr[1]);
	  Node node2 = new Node(arr[2]);
	  Node node3 = new Node(arr[3]);
	  Node node4 = new Node(arr[4]);
	  Node node5 = new Node(arr[5]);
	  Node node6 = new Node(arr[6]);
	  root.left = node1;
	  root.right = node2;
	  node1.left = node3;
	  node1.right = node4;
	  node2.left = node5;
	  node2.right = node6;
	  return root;
	}
}
