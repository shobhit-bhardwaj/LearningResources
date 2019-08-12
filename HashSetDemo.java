package com.shobhit.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> integers = new HashSet<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.addAll(Arrays.asList(4, 5, 6, 7, 8));

		int size = integers.size();

		boolean contains = integers.contains(10);

		Object[] array = integers.toArray();

		integers.forEach(x -> System.out.print(x + "\t"));
		Iterator<Integer> iterator = integers.iterator();

		integers.remove(new Integer(3));
		integers.removeAll(Arrays.asList(4, 5));
		integers.removeIf(x -> x == 1);

		integers.clear();
	}
}