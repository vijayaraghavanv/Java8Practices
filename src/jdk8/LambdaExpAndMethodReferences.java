package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

	public static void main(String[] args) {
	
	/*	
		Implementing this interface allows an object to be the target of the "for-each loop" statement.
	*/
		
	List<String> namesList=Arrays.asList("Vijay","Suji","Abimanyu");
	
	//for loop
	for(int i=0;i<namesList.size();i++) {
		System.out.println(namesList.get(i));
	}
	
	System.out.println("-----");
	
	//foreach
	for (String t : namesList) {
		System.out.println(t);
	}
	System.out.println("-----");
	
	//1. With Anonymous class
	namesList.forEach(new Consumer<String>(){ //Anonymous class

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
		
		
	});
	System.out.println("-----");
	//2. Lambda Exp: ->
	namesList.forEach(str->System.out.println(str));
	System.out.println("-----");
	//3. Method References:
	namesList.forEach(System.out::println);
	
	System.out.println("-----");
	
	
	
	
	
	
	}

}
