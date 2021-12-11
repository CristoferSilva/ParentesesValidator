package com.diegopinheiro.ed1_projectchallenge_03;

public class StackCircularLinkedList<Type> implements IStack<Type> {

	private CircularLinkedList<Type> list;
	
	public StackCircularLinkedList() {
		this.list = new CircularLinkedList<Type>();
	}

	@Override
	public void push(Type value) {
		this.list.addLast(value);
	}

	@Override
	public Type pop() throws Exception {
		if (this.isEmpty()) {
			throw new IllegalStateException();
		}
		
		CircularListNode<Type> node = list.getTail();
		Type value = node.getValue();
		
		this.list.delete(node);
		return value;
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

}
