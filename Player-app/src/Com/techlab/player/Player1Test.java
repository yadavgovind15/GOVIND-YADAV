package Com.techlab.player;

public class Player1Test {
	public static void main(String args[]) {
		Player1 p1 = new Player1("Govind", 20);
		p1.display();
		Player1 p2 = new Player1("Ramesh", 23);
		p2.display();
		Player1 p3 = new Player1("Mahesh", 22);
		p3.display();
		p1.whoiselder(p2, p3);

	}

}
