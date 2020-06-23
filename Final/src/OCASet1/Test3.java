package OCASet1;

import java.time.LocalDate;
import java.util.ArrayList;
class Person{}
class Emp extends Person{}

public class Test3 {
public static void main(String[] args) {
	String a1[][]=new String[][] {{null},new String[] {"a","b"},{new String()}};
	String b1[][]=new String[] []{{"A"},{"B"}};
	String c1[][]=new String[2][2];
	int a=10;
	int b= 20;
	boolean c=false;
	if(b>a) if(++a==10) if(c!=true) System.out.println(1);
	else System.out.println(2); else System.out.println(3);
	
	ArrayList<Object> list = new ArrayList<>();
	list.add(new String("1234"));
	list.add(new Person());
	list.add(new Emp());
	list.add(new String[] {"abcd","xyz"});
	list.add(LocalDate.now().plusDays(1));
}
}
