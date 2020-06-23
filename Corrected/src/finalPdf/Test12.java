package finalPdf;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.List;

class Paitent{
	String name ;
	public Paitent(String name) {
		this.name=name;
	}
}
public class Test12 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Paitent p2 = new Paitent("Mike");
		list.add(p2);
		int f = list.indexOf(p2);
		f=list.indexOf(new Paitent("Mike"));
		System.out.println(f);
		if(f>=0) {
			System.out.println("Mike found");
		}
	}

}
