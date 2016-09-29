package Problem21;

public class MyStack<K> {
	/*
	 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的Min函数，在该栈中,min,push.pop的时间复杂度都是O（1）
	 */
	public ListNode<K> head;
	public int length;
	public void push(K item)
	{
		ListNode<K> node=new ListNode<K>();
		node.data=item;
		node.nextNode=head;
		head=node;
		length++;
	}
	public K pop()
	{
		if(head==null)
			return null;
		ListNode<K> temp=head;
		head=head.nextNode;
		length--;
		return temp.data;
		
	}
}
class ListNode<K>
{
	K data;
	ListNode<K> nextNode;
}


//另一种方式
import java.util.Stack;  
  
public class Solution {  
  
      
    Stack stack=new Stack();  
        public void push(int node) {  
            stack.push(node);  
        }  
          
        public void pop() {  
            stack.pop();  
        }  
          
        public int top() {  
            int top=(int) stack.pop();  
            return top;  
        }  
          
        public int min() {  
            Stack stac=new Stack();  
            int min=(int)stack.pop();  
            stac.push(min);  
            while(!stack.isEmpty()){  
                int temp=(int)stack.pop();  
                if(min>temp){  
                    min=temp;  
                }  
                stac.push(temp);  
            }  
            while(!stac.isEmpty()){  
                stack.push(stac.pop());  
            }  
            return min;  
        }  
          
}  
