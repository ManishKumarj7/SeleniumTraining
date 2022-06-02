package com.manish.mindflur.StreamsTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollectTest {
	@Test
	public void streamCollect() {
		System.out.println("************Test Case For streamCollect Method**************");
		List<String> ls = Stream.of("Abhijit", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
	//Print Unique Number from this Array
	//Sort the array -3rd index -1,2,3,5,7,9
	values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(li.get(2));
	}
}
