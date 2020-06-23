package OCASet1;

public class Test11 {
public static void main(String[] args) {
	StringBuilder sb1= new StringBuilder("eLion");
	String e = null;
	e=sb1.append("X").substring(sb1.indexOf("L"),sb1.indexOf("X"));
	System.out.println(e);
}
}
