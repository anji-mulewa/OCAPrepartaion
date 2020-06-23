package correctedpdf;

public class Test92 {
	public static void main(String[] args) {
		String names[] = { "Thomas", "Peterr", "Josep" };
		String pwd[] = new String[3];
		int idx = 0;
		//try {
			for (String n : names) {
				pwd[idx] = n.substring(2, 6);
				System.out.println(idx);
				idx++;
			}
	//	} catch (Exception e) {
		//	System.out.println("Invalid");
		//}
		for (String p : pwd) {
			System.out.println(p);
		}
	}
}
