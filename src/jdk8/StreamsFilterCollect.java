package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
	
		List<String> productlist=Arrays.asList("iphone","ipad","macbook","macbook pro");
		
		productlist.forEach(ele->System.out.println(ele));
		
		System.out.println("-------");
		
		List<String> result=productlist.stream().filter(ele->!ele.equals("ipad")).collect(Collectors.toList());
	
		result.forEach(ele->System.out.println(ele));
		
		System.out.println("-------");
		
		result.forEach(System.out::println);
	
	}

}
