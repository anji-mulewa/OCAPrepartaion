
public class Test1 {
public static void main(String[] args) {
	String s1 ="Java";
	String s2 = new String("java");
	String s3 = s2;
	String[][] s = new String[][] {{"a"},{"b"}};
	if(s1.equals(s3)) {
		System.out.println("Eq");
	}	else {
		System.out.println("not eq");
	}
	int a = 10; int b=20; boolean c = false;
	if(b>a) if(++a==10) if(c!= true) System.out.println(1);
	else System.out.println(2); else System.out.println(3);
}
}
