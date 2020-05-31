package jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetObjectsWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setName("vijay");

		emp1.addDevices("minote7");
		emp1.addDevices("ipad");
		emp1.addDevices("hp laptop");
		
		Employee emp2=new Employee();
		emp2.setName("suji");

		emp2.addDevices("Lenovo");
		emp2.addDevices("ipad");
		emp2.addDevices("hp laptop");
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> devicesList=empList.stream()
				.map(x->x.getDevices()) // Stream<Set<String>> 
				.flatMap(x->x.stream()) // Stream<String> 
				.distinct()
				.collect(Collectors.toList());
	
		devicesList.forEach(System.out::println);
		
		System.out.println("------------------");
		
		devicesList.forEach(x->System.out.println(x));
	}

}
