package InternPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class RetrievalOfElementsInMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Hello");
		map.put(2, "Hello");
		map.put(3, "Java");
		map.put(4, "Python");
		System.out.println(map);
		Set<Integer> keys=map.keySet();
		System.out.println("Retrieval of map using for-each loop");
		for(int i:keys) {
			System.out.println(i+":"+map.get(i));
		}
		System.out.println("Retrieval of map using Iterator");
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int i=(int) itr.next();
			System.out.println(map.get(i));
		}
		System.out.println("Retrieval of map using entryset()");
		Set entry=map.entrySet();
		Iterator<?> itr1=entry.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Retrieval of map using values()");
		Iterator<String> itr2 = map.values().iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
