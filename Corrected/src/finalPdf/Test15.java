package finalPdf;
interface Downloadable{
	public void download();
}
interface Readable extends Downloadable{
	public void readBook();
}
abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read book");
	}
}
class EBook extends Book{
	public void readBook() {
		System.out.println("Read E-book");
	}
	
	public void download() {
	}
	
}
public class Test15 {
public static void main(String[] args) {
	Book book1 = new EBook();
	book1.readBook();
}
}
