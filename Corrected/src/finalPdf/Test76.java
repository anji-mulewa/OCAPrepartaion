package finalPdf;

public class Test76 {
int num;
public static void graceMarks(Test76 obj4) {
	obj4.num +=10;
}
public static void main(String[] args) {
	Test76 obj1 = new Test76();
	Test76 obj2 = obj1;
	Test76 obj3 = null;
	obj2.num = 60;
	graceMarks(obj2);
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj3);
}
}
