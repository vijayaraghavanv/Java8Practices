package jdk8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

	public static void main(String[] args) {
		
	  String data[][]=new String[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"}
			};
			
	   Stream<String[]> datastream=Arrays.stream(data);
	   /*Stream<String[]> datastreamfilter=datastream.filter(x->"a".equals(x.toString()));
	   
	   datastreamfilter.forEach(System.out::println);*/
	   
	   //Apply flatmap on datastream: >>> 1st way
	   Stream<String> stremaflatmap=datastream.flatMap((x->Arrays.stream(x)));
	   Stream<String> datastreamfilter=stremaflatmap.filter(x->"a".equals(x.toString()));
	   
	   datastreamfilter.forEach(System.out::println);
	   
	   //Apply flatmap on datastream: >>> 2nd way
	   //composite actions
	   Stream<String> finalStream=Arrays.stream(data)
			   				.flatMap((x->Arrays.stream(x)))
			   				.filter(x->"d".equals(x.toString()));
	   
	   
	   finalStream.forEach(System.out::println);
	   
	   
	}

}
