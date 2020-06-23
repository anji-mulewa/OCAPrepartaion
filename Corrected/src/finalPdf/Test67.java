package finalPdf;

class Planets{
	String name;
	int moons;
	public Planets(String name, int moons) {
		this.name=name;
		this.moons=moons;
	}
}

public class Test67 {
public static void main(String[] args) {
	Planets [] planet = {
			new Planets("Mercury", 0),
			new Planets("Venus", 0),
			new Planets("Earth", 1),
			new Planets("Mars", 2)
	};
	System.out.println(planet);
	System.out.println(planet[2]);
	System.out.println(planet[2].moons);
}
}
