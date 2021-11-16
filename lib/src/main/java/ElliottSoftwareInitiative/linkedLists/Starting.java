package ElliottSoftwareInitiative.linkedLists;

import java.util.Arrays;

public class Starting {

	public static void main (String [] args) {
//		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

		System.out.println("THIS IS BELOW");
		dl.addFirst(3);
		dl.addFirst(4);
		dl.addLast(69);
		dl.addLast(6555559);
		dl.removeLast();

		System.out.println(dl.size());
		
	}
}

