package correctedpdf;

public class Test23 {
public static void main(String[] args) {
	int x = 100;
	int a = x++;
	int b = ++x;
	int c = x++;
	int d = (a<b)?((a<c)?a:((b<c)?b:c)):x;
	System.out.println(d);
	System.out.println("x:"+x+ " a: "+a+" b:"+b+" c:"+c);
}
}
