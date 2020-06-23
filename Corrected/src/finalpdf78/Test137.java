package finalpdf78;

public class Test137 {
void readCard(int cardNo) throws ArithmeticException{
	System.out.println("Reading card");
}
void checkCard(int cardNo) throws RuntimeException{
	System.out.println("Checking card");
}
public static void main(String[] args) {
	Test137 ex = new Test137();
	int cardNo = 1234;
	ex.checkCard(cardNo);
		ex.readCard(cardNo);
}
}
