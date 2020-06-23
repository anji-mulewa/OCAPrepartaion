package finalPdf;
class C2 {
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I {
	public void displayI();
		
}
public class Test4 extends C2 implements I{
public void displayI() {
	System.out.println("C1");
}
public static void main(String[] args) {
	C2 obj1 = new Test4();
	I obj2 = new Test4();
	
	C2 s = (C2)obj2;
	I t = (I)obj1;
	
	t.displayI();
	s.displayC2();
}
}
