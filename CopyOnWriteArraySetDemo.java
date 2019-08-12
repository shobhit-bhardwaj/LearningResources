package com.shobhit.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args) {
		CopyOnWriteArraySet<Integer> integers = new CopyOnWriteArraySet<>();

		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);

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