package com.map.it;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("ravi", 2900, 28, "atp"));
		employees.add(new Employee("kl", 3000, 29, "kurnool"));
		employees.add(new Employee("madhu", 4000, 26, "kadapa"));
		employees.add(new Employee("naresh", 3400, 30, "kadapa"));
		//employees.add(new Employee("naresh", 3400, 30, "kadapa"));

		// sort baased on age ,get names
		List<Employee> sortagethengetnames = employees.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(sortagethengetnames);

		// sort baased on age ,get names DESC

		List<Employee> sortagethengetnameDesc = employees.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(sortagethengetnameDesc);

		//// sort baased on age ,get names UniqueEmployee

		List<Employee> uniqueEmployee = employees.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueEmployee);

		// find the duplicate objects in list
		Map<Employee, Long> countEmp = employees.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		countEmp.entrySet()
		.stream().filter((e) -> e.getValue() == 1).map(e -> e.getKey())
		.forEach(System.out::println);
	}

}
