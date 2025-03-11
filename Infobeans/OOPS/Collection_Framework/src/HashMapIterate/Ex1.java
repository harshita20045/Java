package HashMapIterate;

import java.util.HashMap;
import java.util.Map;

class Ex1 {
	public static void main(String args[]) {
		HashMap<Integer, String> l = new HashMap<Integer, String>();
		l.put(11, "abc");
		l.put(12, "dsfc");
		l.put(13, "fdsc");
		l.put(14, "gbg");
		l.put(15, "cxz");
		l.put(16, "fjhf");

		System.out.println(l);

		for (Map.Entry<Integer, String> i : l.entrySet()) {
			System.out.println();
			if (i.getKey().equals(13)) {
				i.setValue("rashmika");
			}
			System.out.println(i.getKey());
			System.out.println(i.getValue());

		}

		System.out.println(l);
	}
}