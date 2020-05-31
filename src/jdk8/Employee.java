package jdk8;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	private String name;
	private Set<String> devices;
	
	/*public Employee(String name,Set<String> devices) {
		this.name=name;
		this.devices=devices;
	}*/
	
	public void addDevices(String devicename) {
		if(this.devices==null) {
			this.devices=new HashSet<>();
		}
		
	   this.devices.add(devicename);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

}
