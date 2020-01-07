package Com.techlab.player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1=new Player(101,"ramesh",200);
		p1.display();
		Player p2=new Player(501,"Govind",240);
		p2.display();
		p1.elder(p2);
		
	}

}
