package com.map.it;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapIterationUsingStreams {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sunita");
		map.put(3, "ravi");
		map.put(2, "manu");
		map.put(6, "darshan");
		map.put(5, "ammulu");

		// Convert the HashMap into a stream of Map.Entry<Integer, String>
		List<Entry<Integer, String>> entryStream = map.entrySet()
				.stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());

		// Iterate over the stream and print key-value pairs
		entryStream.forEach(entry -> {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		});
		// change value of map and iterate by using java8
		map.computeIfPresent(2,(key,value) ->"manohar");
		map.entrySet().iterator().forEachRemaining(System.out::println);
		
		
	}
}
