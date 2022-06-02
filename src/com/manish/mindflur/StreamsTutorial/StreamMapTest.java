package com.manish.mindflur.StreamsTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamMapTest {
	@Test
	public void streamMap() {
		System.out.println("\n***********Test Case For Stream Map*************");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Man");
		list.add("women");

		// Print names which have last letter as "a" with UpperCase
		System.out.println("\n**Names Starts With 'A' in Upper Case");
		Stream.of("Abhijit", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("\n**Names Starts With 'A' in Upper Case and  Sorted");
		// Print names which have first letter "A" as Upper case & Sorted
		List<String> names = Arrays.asList("Abhijit", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s + "\n"));

		System.out.println("****Merging Two Different List***\n");
		Stream<String> newStream = Stream.concat(list.stream(), names.stream());
		 newStream.sorted().forEach(s -> System.out.println(s));
//		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Ad77am"));
//		System.out.println(flag);
//		Assert.assertFalse(flag);
	}
}
