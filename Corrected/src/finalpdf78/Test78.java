package finalpdf78;
class CCMask{
}
public class Test78 {
public static void main(String[] args) {
	System.out.println(maskCC("1234-5678-9101-1121"));
}
public static String maskCC(String creditCard) {
	String x = "XXXX-XXXX-XXXX-";
	StringBuilder sb = new StringBuilder(x);
//	StringBuilder s = sb.insert(0, x);
	sb.append(creditCard , 15 , 19);
//	StringBuilder sb1= new StringBuilder(creditCard);
//	sb1= sb1.substring(15,19);
//	return x+sb1;

	return sb.toString();

}


}
