

public class Fish extends Animal {

	public Fish() {
		// TODO Auto-generated constructor stub
		System.out.println("A fish is hatched...");
		
	}

	@Override
	public String sleep() {
	
		return "A fish sleeps soundly...";
	}

	@Override
	public String eat() {
		return "A fish eats...";
		
	}
	
	public String noise()
	{
		return "blub...";
	}
		
		
	
	
}
