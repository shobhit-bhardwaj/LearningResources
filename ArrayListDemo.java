package com.shobhit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(2, 5);
		integers.addAll(1, Arrays.asList(4, 5, 6, 7, 8));

		int size = integers.size();

		integers.set(3, 9);
		int i = integers.get(5);

		boolean contains = integers.contains(10);
		int index = integers.indexOf(5);
		int lastIndex = integers.lastIndexOf(5);

		integers.replaceAll(x -> x * 10);

		Object[] array = integers.toArray();
		integers.sort(Comparator.naturalOrder());

		List<Integer> subList = integers.subList(3, 7);

		integers.forEach(x -> System.out.print(x + "\t"));
		Iterator<Integer> iterator = integers.iterator();
		ListIterator<Integer> listIterator = integers.listIterator();

		integers.remove(new Integer(30));
		integers.removeAll(Arrays.asList(40, 50));
		integers.removeIf(x -> x == 10);

		integers.clear();
	}
}