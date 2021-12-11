package com.diegopinheiro.ed1_projectchallenge_03;

import java.util.Iterator;

public class ParentesesValidator {
	
	private String[] openCharacters;
	private String[] closeCharacters;
	private StackCircularLinkedList<String> stack;
	
	public ParentesesValidator() {
		stack = new  StackCircularLinkedList<String>();
		
		openCharacters = new String[3];
		openCharacters[0] = "(";
		openCharacters[1] = "{";
		openCharacters[2] = "[";
		
		closeCharacters = new String[3];
		closeCharacters[0] = ")";
		closeCharacters[1] = "}";
		closeCharacters[2] = "]";
	}
	
	public String getOpen(String closeElement) {
		if (closeElement.equals(this.closeCharacters[0])) {
			return this.openCharacters[0];
		} else if (closeElement.equals(this.closeCharacters[1])) {
			return this.openCharacters[1];
		} else {
			return this.openCharacters[2];
		}
	}
	
	public boolean isOpen(String element) {
		boolean result = false;
		for (int i = 0; i < openCharacters.length; i++) {
			if (element.equals(openCharacters[i])) {
				result = true;
				break;
			}
		}
		return  result;
	}
	
	public boolean isValid(String[] characters) {
		for (int i = 0; i < characters.length; i++) {
			if (isOpen(characters[i])) {
				stack.push(characters[i]);
			} else {
				try {
					String lastOpen = stack.pop();
					String openFromClose = getOpen(characters[i]);
					if (!lastOpen.equals(openFromClose)) {
						return false;
					}
				} catch (Exception e) {
					return false;
				}
				
			}
		}
		
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
