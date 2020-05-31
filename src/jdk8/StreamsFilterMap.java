package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<Customer> customerlist=Arrays.asList( new Customer("Vijay",32),
				new Customer("Suji",27),
				new Customer("Abimanyu",02));

		String name = customerlist.stream()
					.filter(x-> "Abimanyu".equals(x.getName()))
					.map(Customer::getName)
					.findAny()
					.orElse(null);
		
		System.out.println(name);
		
		System.out.println("-----");
		//print all names from the list
		
		List<String> custlist=customerlist.stream()
							.map(Customer::getName)
							.collect(Collectors.toList());
		
		custlist.forEach(System.out::println);
		System.out.println("-----");
		custlist.forEach(x->System.out.println(x));
	}

}
