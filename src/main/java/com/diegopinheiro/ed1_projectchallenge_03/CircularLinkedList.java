package com.diegopinheiro.ed1_projectchallenge_03;

public class CircularLinkedList<Type> {
	
	private CircularListNode<Type> sentinel;

	public CircularLinkedList() {
		this.sentinel = new CircularListNode<Type>(null, null, null);
		this.sentinel.setNext(this.sentinel);
		this.sentinel.setPrevious(this.sentinel);
	}
	
	public void addFirst(Type value) {
		CircularListNode<Type> oldHead = getHead();
		CircularListNode<Type> newHead = new CircularListNode<Type>(value, oldHead, this.sentinel);
		
		oldHead.setPrevious(newHead);
		setHead(newHead);
	}
	
	public void addLast(Type value) {
		CircularListNode<Type> oldTail = this.getTail();
		CircularListNode<Type> newTail = new CircularListNode<Type>(value, this.sentinel, oldTail);
		
		oldTail.setNext(newTail);
		setTail(newTail);
	}
	
	public int size() {
		CircularListNode<Type> node = this.getHead();
		int size = 0;
		
		while (node != this.sentinel) {
			node = node.getNext();
			size++;
		}
		return size;
	}
	
	public CircularListNode<Type> search(Type value) {
		CircularListNode<Type> node = this.getHead();
		
		while (node != this.sentinel) {
			if (value == node.getValue()) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	public boolean isOrdered(boolean ascending) {
		if (isEmpty() || size() == 1) {
			return true;
		}
		CircularListNode<Type> node = this.getHead();
		Integer previousValue;
		
		while(node.getNext() != this.sentinel) {
			node = node.getNext();
			previousValue = (Integer)node.getPrevious().getValue();
			
			if (ascending) {
				if (previousValue > (Integer)node.getValue()) { 
					//verifica se a ordem crescente esta incorreta
					return false;
				}
			} else {
				if (previousValue < (Integer)node.getValue()) { 
					//verifica se a ordem decrescente esta incorreta
					return false;
				}
			}
		}
		return true;
	}
	
	public void delete(CircularListNode<Type> nodeDelete) {
		CircularListNode<Type> previousNode = nodeDelete.getPrevious();
		CircularListNode<Type> nextNode = nodeDelete.getNext();
		
		previousNode.setNext(nextNode);
		nextNode.setPrevious(previousNode);
	}
	
	public void reverse() {
		CircularListNode<Type> node = this.sentinel;
		CircularListNode<Type> nextNode = this.getHead();
		
		do {
			node.setNext(node.getPrevious());
			node.setPrevious(nextNode);
			node = nextNode;
			nextNode = nextNode.getNext();
		} while (node != this.sentinel);
	}
	
	public CircularLinkedList<Type> copy() {
		CircularLinkedList<Type> copiedList = new CircularLinkedList<Type>();
		CircularListNode<Type> node = this.getHead();
		
		while (node != this.sentinel) {
			copiedList.addLast(node.getValue());
			node = node.getNext();
		}
		return copiedList;
	}
	
	public boolean isEquals(CircularLinkedList<Type> list) {
		if (list.size() != this.size()) {
			return false;
		}
		CircularListNode<Type> nodeListOne = this.getHead();
		CircularListNode<Type> nodeListTwo = list.getHead();
		
		while (nodeListOne != this.sentinel) {
			if (nodeListOne.getValue() != nodeListTwo.getValue()) {
				return false;
			}
			nodeListOne = nodeListOne.getNext();
			nodeListTwo = nodeListTwo.getNext(); 
		}
		
		return true;
	}
	
	public int get(Type index) throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty");
		}
		CircularListNode<Type> node = this.getHead();
		Integer x = (Integer) index;
		
		for(int i=0; i<x; i++) {
			node = node.getNext();
			if (node == this.sentinel) {
				node = node.getNext();
			}
		}
		return (Integer)node.getValue();
	}
	
	public CircularListNode<Type> getSuccessor(CircularListNode<Type> currentNode) throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty");
		}
		
		if (currentNode.getNext() == this.sentinel) {
			return this.getHead(); //o next do sentinel
		}
		return currentNode.getNext();
	}
	
	public void setHead (CircularListNode<Type> node) {
		this.sentinel.setNext(node);
	}
	
	public void setTail (CircularListNode<Type> node) {
		this.sentinel.setPrevious(node);
	}
	
	public CircularListNode<Type> getHead() {
		return this.sentinel.getNext();
	}
	
	public CircularListNode<Type> getTail() {
		return this.sentinel.getPrevious();
	}
	
	public boolean isEmpty() {
		return this.getHead() == this.sentinel && this.getTail() == this.sentinel;
	}
}
