
public class Dog extends Animal {

	public Dog(){
		
		System.out.printf("A dog is born...");
		
		
	}
		@Override
	public String sleep() {
	
		return "A dog sleeps soundly...";
	}

	@Override
	public String eat() {
		return "A dog eats...";
		
	}
	
	public String bark()
	{
		return "BARK...";
	}
		
		
	
	
	
}
