package Com.techlab.player;

public class Player1 {
	public String name;
	public int age;

	public Player1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void whoiselder(Player1 p2,Player1 p3) {
		if (this.age > p2.age && this.age>p3.age){
			System.out.println("Govind  is elder than ramesh & mahesh");
		}
			else if(p2.age>p3.age) {
				System.out.println("ramesh is elder than Govind & ramesh");
			}
		else {
			System.out.println("mahesh is elder than Govind & ramesh");
		}
	}

	public void display() {
		System.out.println(name + " " + age + " ");
	}

}
