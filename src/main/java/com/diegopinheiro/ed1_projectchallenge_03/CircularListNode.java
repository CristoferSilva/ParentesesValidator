package com.diegopinheiro.ed1_projectchallenge_03;

public class CircularListNode<Type>{
	
	private CircularListNode<Type> previous;
	private CircularListNode<Type> next;
	private Type value;
	
	public CircularListNode(Type value, CircularListNode<Type> next, CircularListNode<Type> previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

	public CircularListNode<Type> getPrevious() {
		return previous;
	}

	public void setPrevious(CircularListNode<Type> previous) {
		this.previous = previous;
	}

	public CircularListNode<Type> getNext() {
		return next;
	}

	public void setNext(CircularListNode<Type> next) {
		this.next = next;
	}

	public Type getValue() {
		return value;
	}

	public void setValue(Type value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof CircularListNode<?>) {
			CircularListNode<?> other = (CircularListNode<?>) obj;
			return this.value.equals(other.value);
		}
		return false;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
}
