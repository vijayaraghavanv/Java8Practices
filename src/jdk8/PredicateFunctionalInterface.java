package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class PredicateFunctionalInterface {

	public static void main(String[] args) {
	/*
	Represents a predicate (boolean-valued function) of one argument.
    */
		
	Predicate<Integer> func=x->x>5;
	
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);	
		
	List<Integer> collist=list.stream().filter(func).collect(Collectors.toList());
	
	System.out.println(collist);
	
	//predicate with &&
	List<Integer> collist1=list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
	System.out.println(collist1);
	
	//predicate with negate():
	List<String> namelist= Arrays.asList("vijay","java","cucum","sel");
	Predicate<String> nameExp=x->x.startsWith("vij");
	
	List<String> newnamelist=namelist.stream().filter(nameExp.negate()).collect(Collectors.toList());
	System.out.println(newnamelist);
	}

}
