package Map1;

import java.util.Map;
import java.util.TreeMap;

public class Ex4 {
	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(0, "PINK");
		tm.put(5, "RED");
		tm.put(2, "BLACK");
		tm.put(3, "WHITE");
		tm.put(3, "ORANGE");
		tm.put(-1, "YELLOW");
		tm.put(12, null);
		tm.put(13, null);
		for (Map.Entry<Integer, String> x : tm.entrySet()) {
			System.err.println("Keys: " + x.getKey() + "   Values: " + x.getValue());
			System.out.println("Keys: " + x.getKey() + "   Values: " + x.getValue());
		}

		System.out.println();
		System.out.println("Keys : " + tm.values());
		System.out.println("Contain Key : " + tm.containsKey(-1));
		System.out.println("Contain Values : " + tm.containsValue("RED"));
		System.out.println("Size : " + tm.size());
		System.out.println("Remove0"
				+ " : " + tm.remove(-1));
		System.out.println("Remove : " + tm.remove(0));

		for (Map.Entry<Integer, String> x : tm.entrySet()) {
			System.err.println("Keys: " + x.getKey() + "   Values: " + x.getValue());
			System.out.println("Keys: " + x.getKey() + "   Values: " + x.getValue());
		}
	}
}
