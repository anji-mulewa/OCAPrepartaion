package correctedpdf;

class MyString {
	String msg;

	MyString(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
}

public class Test54 {
	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new MyString("Java SE 8"));
	}
}
