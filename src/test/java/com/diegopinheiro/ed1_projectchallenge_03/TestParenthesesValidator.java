package com.diegopinheiro.ed1_projectchallenge_03;

import org.junit.Assert;
import org.junit.Test;

public class TestParenthesesValidator {

	@Test
	public void testParentheses0() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] characters = {};
		for(int i = 0; i < characters.length; i++) {
			characters[i] = characters[i];
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses1() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] characters = {"(", ")"};
		
		for(int i = 0; i < characters.length; i++) {
			characters[i] = characters[i];
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses2() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] expression = {"(", ")", "[", "]", "{", "}"};
		String[] characters = new String[expression.length];
		for(int i = 0; i < expression.length; i++) {
			characters[i] = expression[i];
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses3() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] expression = {"(", "[","{", "}", "]", ")"};
		
		String[] characters = new String[expression.length];
		for(int i = 0; i < expression.length; i++) {
			characters[i] = expression[i];
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses4() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] expression = {")"};
		String[] characters = new String[expression.length];
		for(int i = 0; i < expression.length; i++) {
			characters[i] = expression[i];
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses5() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] expression = {"(", "[","}", "]"};
		String[] characters = new String[expression.length];
		for(int i = 0; i < expression.length; i++) {
			characters[i] = new String(expression[i]);
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testParentheses6() {
		ParentesesValidator parenthesesValidator = new ParentesesValidator();
		
		String[] expression = {"(", "[","]", ")", "{"};
		String[] characters = new String[expression.length];
		for(int i = 0; i < expression.length; i++) {
			characters[i] = new String(expression[i]);
		}
		
		boolean actual = parenthesesValidator.isValid(characters);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}
