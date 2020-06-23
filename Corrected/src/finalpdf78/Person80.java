package finalpdf78;
public class Person80{
	String name;;
	int age = 25;
	public Person80(String name) {
		setName(name);
	}
	public Person80(String name, int age) {
		this(name);
		setAge(age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String show() {
		return name+" "+ age;
	}
	public static void main(String[] args) {
		Person80 p1 = new Person80("Jesse");
		Person80 p2 = new Person80("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}

