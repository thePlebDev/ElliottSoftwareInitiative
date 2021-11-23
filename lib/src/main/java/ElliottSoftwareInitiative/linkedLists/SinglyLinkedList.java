package ElliottSoftwareInitiative.linkedLists;

public class SinglyLinkedList<E>{
	int another = 5;
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
		//GETTERS
		public E getElement() {
			return this.element;
		}
		public Node<E> getNext(){
			return this.next;
		}
		
		//SETTERS
		public void setNext(Node<E> next) {
			this.next = next;
		}
			
	}
	//END OF NODE CLASS
	Node<E> head = null;
	Node<E> tail = null;	
	int size = 0;
	
	//ACCESS METHODS
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public E first() {
		if(isEmpty()) {
			System.out.println("LIST IS EMPTY");
			return null;
		}else {
			return this.head.element;
		}
	}
	public E last() {
		if(isEmpty()) {
			System.out.println("LIST IS EMPTY");
			return null;
		}else {
			return this.tail.getElement();
		}
	}
	
	//UPDATE METHODS
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if(size == 0) {
			tail = head;
		}
		size++;
	}
	public void addLast(E e) {
		Node<E> newTailNode = new Node(e,null);
		if(isEmpty()) {
			head = newTailNode;
			tail = newTailNode;
		}else {
			tail.setNext(newTailNode);
			tail = newTailNode;
		}
		size++;
	}
	public E removeFirst() {
		if(isEmpty()) {
			System.out.println("LIST IS EMPTY");
			return null;
		}else {
			E answer = head.getElement();
			head = head.getNext();
			
			size--;
			if(size ==0) {
				tail = null;
			}
			return answer;
		}
	}

	@Override
	public boolean equals(Object o){
		if(o == null)return false;
		if(getClass() != o.getClass())return false;
		SinglyLinkedList other = (SinglyLinkedList) o;
		if(this.size != other.size) return false;
		Node walkA = head;
		Node walkB = other.head;
		while(walkA != null){
			if(!walkA.getElement().equals(walkB.getElement())) return false;
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		return true;
	}
	
	
	
	
	
}
