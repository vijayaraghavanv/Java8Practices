package jdk8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		List<Customer> customerlist=Arrays.asList( new Customer("Vijay",32),
													new Customer("Suji",27),
													new Customer("Abimanyu",02));
		
		//1. filter - findAny
		Customer customer = customerlist.stream() //convert list to stream
				.filter(x->"Suji".equals(x.getName())) //filter it for suji
				.findAny()  // if it finds then return
				.orElse(null);

		System.out.println(customer.getName()+" "+customer.getAge());
		
		System.out.println("-------");
		
		//2. filter - did not findAny or Else
		Customer customer1 = customerlist.stream() //convert list to stream
				.filter(x->"Java".equals(x.getName())) //filter it for suji
				.findAny()  // if it finds then return
				.orElse(null);
	
		System.out.println(customer1);
		
		System.out.println("-------");
		
		//3. filter with multiple condition
		Customer customer2 = customerlist.stream() //convert list to stream
				.filter(x->"Vijay".equals(x.getName()) && 32 ==x.getAge()) //filter it for Vijay
				.findAny()  // if it finds then return
				.orElse(null);
	
		System.out.println(customer2.getName()+" "+customer2.getAge());
	}

}
