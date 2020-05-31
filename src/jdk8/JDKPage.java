package jdk8;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface JDKPage {
	
	public void greet(); //only one abstract method
	
	public static void test() { //static method
		
	}
	
	default void display() { //default method
		
	}

}
