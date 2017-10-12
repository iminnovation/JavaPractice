package com.java.practice;

import java.util.Stack;

public class SortingOfStack {
 
    public static Stack<Integer> stackSort(Stack<Integer> input){
        // Create a temp stack 
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty()) {
        	//Pop out the element
            int tmp = input.pop();
            System.out.println("Popped Element is: "+tmp);
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
            System.out.println("Input: "+input);
            System.out.println("Temp Stack: "+tmpStack);
        }
        return tmpStack;
    }
     
    public static void main(String a[]){
        Stack<Integer> input = new Stack<Integer>();
        input.add(389);
        input.add(0);
        input.add(-1);
        input.add(67);
        input.add(192);
        input.add(0);
        System.out.println("Inserted Elements: "+input);
        System.out.println("Sorted Stack: "+stackSort(input));
    }
}