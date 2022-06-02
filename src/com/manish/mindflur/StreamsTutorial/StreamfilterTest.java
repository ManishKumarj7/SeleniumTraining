package com.manish.mindflur.StreamsTutorial;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamfilterTest {
	@Test
	public void filter() {
		System.out.println("\n**************Test case for Filter Method****************");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anish");
		list.add("Mahi");
		list.add("jenny");
		list.add("samaira");
		list.add("Abhi");
		list.add("Suraj");
		Long c = list.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		long d = Stream.of("Manish", "Saim", "Jenny", "Aniket", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// Print All the names from Array
		list.stream().filter(s -> s.length() > 6).forEach(s -> System.out.println(s));
		list.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}
}
