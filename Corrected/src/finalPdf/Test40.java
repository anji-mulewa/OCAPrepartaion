package finalPdf;

public class Test40 {
	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount((int) Math.random() * 1000);
//		acc.amount=0;
//		acc.changeAmount(-acc.getAmount());
		acc.changeAmount(0);
		System.out.println(acc.getAmount());
	}
}
