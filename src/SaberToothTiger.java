
public class SaberToothTiger extends Cat {

	public SaberToothTiger() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("This Cat is a Saber-Toothed Tiger");
	}
	@Override
	public String sleep() {
	
		
		return super.sleep()+"It's teeth are quite sharp.";
	}

	@Override
	public String eat() {
		return super.eat()+"the dog never stood a chance";
		
	}
	
	public String noise()
	{
		return "Growl...";
	}
	
		
		
	
	

}
