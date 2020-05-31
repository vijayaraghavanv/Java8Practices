package jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
	/*	
		Represents an operation upon two operands of the same type,
		producing a result of the same type as the operands.
		This is a specialization of BiFunction for the case 
		where the operands and the result are all of the same type.
		
	*/
		
		BinaryOperator<Integer> func=(x1,x2)->x1+x2;
		
		int len=func.apply(10, 30);
		System.out.println(len);
		
		//BiFunction interface:
		BiFunction<Integer,Integer,Integer> func1=(x1,x2)->x1+x2;
		
		int res=func1.apply(30, 30);
		System.out.println(res);
		
	}

}
