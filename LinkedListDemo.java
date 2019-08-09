package com.shobhit.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(11);
		integers.add(12);
		integers.add(13);
		integers.add(2, 15);
		integers.addAll(1, Arrays.asList(14, 15, 16, 17, 18));

		integers.addFirst(1);
		integers.addLast(20);
		integers.offer(2);
		integers.offerFirst(3);
		integers.offerLast(22);

		int peek = integers.peek();
		int peekFirst = integers.peekFirst();
		int peekLast = integers.peekLast();

		integers.push(5);
		int pop = integers.pop();

		int size = integers.size();

		integers.set(3, 9);
		int get = integers.get(5);
		int first = integers.getFirst();
		int last = integers.getLast();

		boolean contains = integers.contains(10);
		int index = integers.indexOf(15);
		int lastIndex = integers.lastIndexOf(15);

		integers.replaceAll(x -> x * 10);

		Object[] array = integers.toArray();
		integers.sort(Comparator.naturalOrder());

		List<Integer> subList = integers.subList(3, 7);

		integers.forEach(x -> System.out.print(x + "\t"));
		Iterator<Integer> iterator = integers.iterator();
		ListIterator<Integer> listIterator = integers.listIterator();

		integers.remove(new Integer(10));
		integers.removeAll(Arrays.asList(20, 30));
		integers.removeIf(x -> x == 150);

		int removeFirst = integers.removeFirst();
		integers.removeFirstOccurrence(130);
		int removeLast = integers.removeLast();
		integers.removeLastOccurrence(180);

		int poll = integers.poll();
		int pollFirst = integers.pollFirst();
		int pollLast = integers.pollLast();

		integers.clear();
	}
}