
public class Monkey extends Animal {

	public Monkey() {
		// TODO Auto-generated constructor stub
		System.out.println("It's ALIVE!");
	}

	@Override
	public String sleep() {
	
		return "A monkey sleeps soundly...";
	}

	@Override
	public String eat() {
		return "A monkey eats...";
		
	}
	
	public String noise()
	{
		return "Ook?...";
	}
	
}
