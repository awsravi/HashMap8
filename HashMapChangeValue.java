package com.map.it;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapChangeValue {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Capital of India", "Delhi");
		map.put("Capital of Telangana", "Hyderabad");
		map.put("Capital of Andra", "Null");

		// change value of map and iterate by using java8
		map.computeIfPresent("Capital of Andra", (key, value) -> "Vizag");
		 map.entrySet().iterator().forEachRemaining(System.out::println);

		//sorting based on value ASC order

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList())
				.forEach((entry) -> System.out.println(

						"Key: " + entry.getKey() + ", Value: " + entry.getValue()));
		System.out.println("====================");
		
		// sorting based on value DESC reverse order
		map.entrySet().stream().sorted(Map.Entry.<String,String>comparingByValue().reversed()).collect(Collectors.toList())
		.forEach((entry) -> System.out.println(

				"Key: " + entry.getKey() + ", Value: " + entry.getValue()));


		

	}

}
