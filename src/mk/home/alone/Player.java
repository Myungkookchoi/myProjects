package mk.home.alone;

public class Player {
	public String name = "";
	public String pn = "";
	public int age = 0;

	public Player() {
	}

	public Player(String name, int age,String pn) {
		super();
		this.name = name;
		this.age = age;
		this.pn = pn;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", pn=" + pn + ", age=" + age + "]";
	}
	

}
