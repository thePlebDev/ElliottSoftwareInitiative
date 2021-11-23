package ElliottSoftwareInitiative.linkedLists;

import java.util.Arrays;

public class Starting {

	public static void main (String [] args) {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

		dl.addFirst(1);
		dl.addFirst(44);
		dl.addLast(55);
		dl.removeLast();
		dl.removeFirst();
		System.out.println(dl.last());


		
	}
}

