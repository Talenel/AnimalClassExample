
public class Unicorn extends Animal {

	public Unicorn() {
		// TODO Auto-generated constructor stub
		System.out.println("A Unicorn comes into being from the ambient magic of the world");
	}

	
	
	@Override
	public String sleep() {
	
		return "A unicorn does not sleep...";
	}

	@Override
	public String eat() {
		return "A unicorn feasts on the souls of its enemies";
		
	}
	
	public String noise()
	{
		return "Neigh?...";
	}
	public String gore()
	{
		return "Ouch!";
	}
}
