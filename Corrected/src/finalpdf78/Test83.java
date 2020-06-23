package finalpdf78;

import java.util.ArrayList;

public class Test83 {
public static void main(String[] args) {
	ArrayList myList = new ArrayList();
	String[] myArray;
	try {
		while(true) {
			myList.add("My String");
			System.out.println("hi");
		}
	} catch (RuntimeException e) {
		System.out.println("Caught a runtime exception");
	} catch(Exception e) {
		System.out.println("Caught an exception");
	}
	System.out.println("Ready to use");
}
}
