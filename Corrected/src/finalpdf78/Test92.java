package finalpdf78;

public class Test92 {
	public static void main(String[] args) {
		double discount = 0;
		int qty = 91;
		
		// valid
//		if (qty >= 90) {
//			discount = 0.5;
//			System.out.println("a");
//		}
//		if(qty>80&&qty<90) {
//			discount=0.2;
//			System.out.println("b");
//		}
		
//		discount = (qty >= 90) ? 0.5 : 0;
//		discount=(qty>80)?0.2:0;
		
	//	discount = (qty>=90) ? 0.5:(qty>80)?0.2:0; //valid

//		discount = (qty > 80) ? 0.2 : (qty>= 90) ? 0.5 : 0;  
		
		System.out.println(discount);
	}
}
