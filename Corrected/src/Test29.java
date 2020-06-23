import java.io.IOException;

public class Test29 {


public static void main(String[] args) {
	String [] arr = {"a","b","c"};
	System.out.println(arr.length);
	StringBuilder sb1 = new StringBuilder("Duke");
	String str1 = sb1.toString();
	String str2 = str1;
	System.out.println(str1==str2);
	System.out.println(str1);
	System.out.println(str2);
	
	int[] intArr = {8,16,32,64,128};
	for(int i=0;i<intArr.length;i++) {
		System.out.println(intArr[i]+" ");
	}
	
	Boolean[] bool = new Boolean[2];
	bool[0] = new Boolean(Boolean.parseBoolean("true"));
	bool[1] = new Boolean(null);
	System.out.println(bool[0]+ " "+bool[1]);
	
	try {
		int num=10;
		int div=0;
		int ans = num/div;
	} catch (ArithmeticException e) {
		
	}

}

}
