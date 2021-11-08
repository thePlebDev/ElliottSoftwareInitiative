package ElliottSoftwareInitiative.linkedLists;

import java.util.Arrays;

public class Starting {

	public static void main (String [] args) {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
	
		ll.addFirst(1);
		ll.addLast(99);
		ll.removeFirst();
		System.out.println(ll.first());
		
		
	}
}

