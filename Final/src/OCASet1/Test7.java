package OCASet1;

class Person1 {
	void Person1() {}
	void Person1(Father f) {}
	private int pages=100;
}

class Father extends Person1 {
	public void dance() throws ClassCastException {

	}
	private int totalPages() {
		return 0;
	}
}

public class Test7 {
	public static void main(String[] args) {
		
		Person1 p = new Person1();
		try {
			((Father)p).dance();
		} catch (NullPointerException e) {
		
		}catch(ClassCastException e) {
			
		}catch(Exception e) {
			
		}catch(Throwable e ) {
			
		}
	}
}