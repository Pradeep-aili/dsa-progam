package com.tcs.stack_program;

class Stack
{
	int[] stack;
	int top;
	
	Stack(int size){
		stack=new int[size];
		top=-1;
	}
	
	public boolean isFull()
	{
		return top==stack.length-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}else {
			stack[++top]=value;
			System.out.println("value is inserted");
		}
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}else {
			int value = stack[top];
			top--;
			System.out.println("value is popped");
		}
	}
	
	public void traverse()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		else {
			System.out.print(stack[top]+" ");
		}
	}
	
	public void topStackElement()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		else 
		{
			System.out.println("Top of the stack element is : "+stack[top]);
		}
	}
}

public class Mainclass {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.topStackElement();
	}
}
