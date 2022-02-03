package com.greatlearning.service;

import java.util.Stack;


public class BalancingBrackets {
	static Stack<Character> stackChar = new Stack<Character>();

	public static boolean bracket(char[] bracketArr) {
		
		
		int size = bracketArr.length;
		char ch = ' ';
		for(int i=0; i<size; i++) {
			ch = bracketArr[i];
			if (ch =='(' || ch == '{' || ch == '[') {
				push(ch);
				continue;
			}
				char popChar = ' '; 
				if(!stackChar.isEmpty())		
					pop(stackChar);
				else
					return false;
				switch(popChar) {
				case '(': if(ch != ')') {
							push(popChar);
							push(ch);
						}
						break;
				case '{' : if(ch != '}') {
							push(popChar);
							push(ch);
						}
						break;
				
				case '[' : if(ch != ']') {
							push(popChar);
							push(ch);
							}
							break;
				}
				
		}
		if(stackChar.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	
public static void push(char data) {
		
	stackChar.push(data);
		
	}

public static char pop(Stack<Character> stackChar) {
	
	return stackChar.pop();
}

public boolean isEmpty() {
	return stackChar.isEmpty();
}


}
