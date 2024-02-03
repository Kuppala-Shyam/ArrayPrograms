package InternPack;

import java.util.*;
import java.util.LinkedList;

public class ReverseOfElementsInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
