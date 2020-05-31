package jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {
	
	/*	
		Represents an operation on a single operand/argument 
		that produces a result of the same type as its operand. 
		This is a specialization of Function for the case 
		where the operand and result are of the same type.
		
	 */
		
		UnaryOperator<Integer> func=x->x*7;
		
		int n1=func.apply(10);
		System.out.println(n1);
		
		//SuperInterface function
		Function<Integer,Integer> func1=x->x*10;
		System.out.println(func1.apply(40));
		
		List<String> langlist =new ArrayList<String>();
		langlist.add("java");
		langlist.add("cucumber");
		langlist.add("selenium");
		System.out.println(langlist);
		
		langlist.replaceAll(ele->ele+" Naveen");
		
		System.out.println(langlist);
	}

}
