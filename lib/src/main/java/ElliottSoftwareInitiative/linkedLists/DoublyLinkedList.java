package ElliottSoftwareInitiative.linkedLists;

public class DoublyLinkedList <E>{
	private static class Node<E>{
		private E element;
		private Node<E> previous;
		private Node<E> next;
		
		public Node(E element, Node<E> previous, Node<E> next) {
			this.element = element;
			this.previous = previous;
			this.next = next;
		}
		//GETTERS
		public E getElement() {
			return this.element;
		}
		public Node<E> getPrevious(){
			return this.previous;
		}
		public Node<E> getNext(){
			return this.next;
		}
		//SETTERS
		public void setNext(Node<E> next) {
			this.next = next;
		}
		public void setPrevious(Node<E> previous) {
			this.previous = previous;
		}
		
	}
	//END OF THE NODE CLASS
	
	private Node<E> header;
	private Node<E> trailer;
	private int size =0;

	public DoublyLinkedList(){
		header = new Node<>(null,null,null);
		trailer = new Node<>(null,header,null);
		header.setNext(trailer);
	}
	
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E first() {
		if (isEmpty()) {
			return null;
		}else {
			return header.getNext().getElement();
		}
	}
	public E last() {
		if(isEmpty()) {
			return null;
		}else {
			return this.trailer.getPrevious().getElement();
		}
	}
	
	public void addFirst(E e) {
		addBetween(e,header,header.getNext());
	}
	public void addLast(E e) {
		addBetween(e,trailer.getPrevious(),trailer);
	}
	
	private void addBetween(E e,Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e,predecessor,successor);
		predecessor.setNext(newest);
		successor.setPrevious(newest);
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}else {
			return remove(header.getNext());
		}
	}
	public E removeLast() {
		if(isEmpty()) {
			return null;
		}else {
			return remove(trailer.getPrevious());
		}
	}
	
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrevious();
		Node<E> successor = node.getNext();
		
		predecessor.setNext(successor);
		successor.setPrevious(predecessor);
		
		size--;
		return node.getElement();
	}

}
