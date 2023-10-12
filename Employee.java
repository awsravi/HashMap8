package com.map.it;

import java.util.Objects;

public class Employee {

	private String name;
	private long salary;
	private int age;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, location, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	public Employee(String name, long salary, int age, String location) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.location = location;
	}
	
	
	
}
