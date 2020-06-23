package finalPdf;

interface Readable1 {
	public void readBook();
	public void setBookmark();
}
abstract class Book1 implements Readable1{
	public void readBook() {}
}
abstract class Ebook1 extends Book1{
public void readBook() {}

}
public class Test60 {

}
