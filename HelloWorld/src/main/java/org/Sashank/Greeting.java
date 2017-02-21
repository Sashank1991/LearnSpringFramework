package org.Sashank;

public class Greeting implements Greeter {

	String name;
	public void setName(String name) {
		this.name=name;
		
	}
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello world from "+name+" !" ;
	}

}
