package Problem19;

import java.util.Stack;

public class MirrorRecursively {
	/*
	 * 输入一个二叉树，输出它的镜像
	 */
	public BinaryTreeNode mirrorRecursively(BinaryTreeNode root)
	{
		if(root==null)
			return null;
		BinaryTreeNode node=root;
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		while(node!=null || !stack.isEmpty())
		{
			while(node!=null)
			{
				BinaryTreeNode temp=node.leftNode;//交换左右子节点
				node.leftNode=node.rightNode;
				node.rightNode=temp;
				stack.push(node);
				node=node.leftNode;
			}
			node=stack.pop();
			node=node.rightNode;
		}
		return root;
	}

}
class BinaryTreeNode
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}


/** 
 * 题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。 
 */  
package swordForOffer;  
  
import utils.BinaryTreeNode;  
  
/** 
 * @author JInShuangQi 
 * 
 * 2015年8月1日 
 */  
public class E19MirrorOfBinaryTree {  
    public void MirrorRecursively(BinaryTreeNode node){  
        if(node == null)  
            return;  
        if(node.leftNode == null && node.rightNode == null)  
            return;  
        BinaryTreeNode temp = node.leftNode;  
        node.leftNode = node.rightNode;  
        node.rightNode = temp;  
        if(node.leftNode != null)  
            MirrorRecursively(node.leftNode);  
        if(node.rightNode != null)  
            MirrorRecursively(node.rightNode);  
    }  
}  
