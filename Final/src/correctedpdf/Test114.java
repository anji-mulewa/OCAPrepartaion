package correctedpdf;

public class Test114 {
	public static final int min = 1;

	public static void main(String[] args) {
		System.out.println("String main "+args[0]);
		int x = args.length;
		if (checkLimit(x)) {
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
	}

	public static boolean checkLimit(int x) {
		return (x >= min) ? true : false;
	}
}
