package ElliottSoftwareInitiative.linkedLists;

public class SinglyLinkedList <E>{
	
	private static class Node<E> {
		private E element;
		private Node<E> next = null;
		
		public Node(E element,Node<E> next) {
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
	//END OF THE NODE CLASS

}
