package com.shobhit.ds.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class GraphDemo {
	public static void hashSetTest() {
		HashSet<String> hashSet = new HashSet<>();
		// LinkedHashSet<String> hashSet = new LinkedHashSet<>();

		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");

		hashSet.addAll(Arrays.asList("c", "d", "e"));

		hashSet.size();

		Object[] array = hashSet.toArray();

		boolean contains = hashSet.contains("a");

		boolean empty = hashSet.isEmpty();

		Spliterator<String> spliterator = hashSet.spliterator();

		Stream<String> stream = hashSet.stream();

		Iterator<String> iterator = hashSet.iterator();

		hashSet.forEach(val -> System.out.print(val + "\t"));

		hashSet.remove("a");
		hashSet.removeIf(val -> val.equals("b"));
		hashSet.removeAll(Arrays.asList("c", "d"));

		hashSet.clear();
	}

	public static void treeSetTest() {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);

		treeSet.addAll(Arrays.asList(6, 7, 8, 9, 10));

		treeSet.size();

		Object[] array = treeSet.toArray();

		boolean contains = treeSet.contains(1);

		boolean empty = treeSet.isEmpty();

		Spliterator<Integer> spliterator = treeSet.spliterator();

		Stream<Integer> stream = treeSet.stream();

		Iterator<Integer> iterator = treeSet.iterator();

		treeSet.forEach(val -> System.out.print(val + "\t"));

		treeSet.comparator();

		iterator = treeSet.descendingIterator();

		Set<Integer> set = treeSet.descendingSet();

		int ceiling = treeSet.ceiling(3);
		int floor = treeSet.floor(7);

		int first = treeSet.first();
		int last = treeSet.last();

		int higher = treeSet.higher(6);
		int lower = treeSet.lower(4);

		int pollFirst = treeSet.pollFirst();
		int pollLast = treeSet.pollLast();

		set = treeSet.subSet(3, 7);
		set = treeSet.subSet(3, true, 7, true);

		set = treeSet.headSet(4);
		set = treeSet.headSet(4, true);

		set = treeSet.tailSet(7);
		set = treeSet.tailSet(7, false);

		treeSet.remove(1);
		treeSet.removeIf(val -> val.equals(2));
		treeSet.removeAll(Arrays.asList(3, 4, 5));

		treeSet.clear();
	}

	public static void main(String[] args) {
		hashSetTest();
		treeSetTest();
	}
}