
public class AnimalApp {

	public static void main(String[] args) {

		

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		SaberToothTiger s= new SaberToothTiger();
		print(s.eat());
		print(s.purr());
		print(s.sleep());
		

	}
	private static void print(String s){
		System.out.println(s);
	}
}
