package Feb25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Collections.sort(l, (i1, i2) -> {
			if (i1 < i2) {
				return +1;
			} else if (i1 > i2) {
				return -1;
			} else {
				return 0;
			}

		});
		System.out.println(l);
	}
}
