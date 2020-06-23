package correctedpdf;

public class Test57 {
public static void main(String[] args) {
	int num[][]= new int [2][3];
	System.out.println(num.length);
	for(int i = 0; i<num.length;i++) {
		for(int j = 0; j<num[i].length;j++) {
			num[i][j]=10;
			System.out.print(num[i][j]);
		}
		System.out.println();
	}
	System.out.println(num);
}
}
