package Com.techlab.player;

public class Player {

	int id;
	String name;
	int age;
	int elder;
	int player;
	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void elder(Player p2) {
		if (this.age > p2.age) {
			System.out.println("p1 is elder");
		} else {
			System.out.println("p2 is elder");
		}
	}

	public void display() {
		System.out.println(id + " " + name + " " + age );

	}
}
