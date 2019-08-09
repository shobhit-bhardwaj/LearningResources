package com.shobhit.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);

		integers.addIfAbsent(4);
		integers.addAllAbsent(Arrays.asList(4, 5, 6, 7, 8, 9, 10));

		new Thread(() -> {
			integers.add(11);
		}).start();

		new Thread(() -> {
			integers.add(12);
		}).start();

		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

			//	iterator.remove();		//	It is not allowed.
		}
	}
}