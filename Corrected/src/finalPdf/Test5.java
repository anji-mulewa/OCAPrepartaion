package finalPdf;

import finalpdf78.Acc1;

public class Test5 extends Acc1 {
	int q;
public static void main(String[] args) {
	Acc1 obj = new Test5();
	
	obj.s=10;
System.out.println(obj.s);
Test5 obj1 = (Test5)obj;
System.out.println(obj1.q);
}
}
