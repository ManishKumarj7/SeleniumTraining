package com.manish.mindflur.StreamsTutorial;

import java.util.ArrayList;
import org.testng.annotations.Test;

public class StreamEg {
	@Test
	public void regular() {
		System.out.println("\n****************Test case for Regular Method*********************");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anish");
		list.add("Mahi");
		list.add("jenny");
		list.add("samaira");
		list.add("Abhi");
		list.add("Suraj");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String real = list.get(i);
			if (real.startsWith("A")) {
				System.out.println(real);
				count++;
			}
		}
		System.out.println("total count :" + count);
	}

	
	

	
	
}
