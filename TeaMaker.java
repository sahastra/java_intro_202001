
public class TeaMaker {

	public static void main(String[] args) {
		System.out.println("Making Hot Tea ...");
		
		//Calling addTeaPowder()
		
		//Without Instance 
		TeaMaker.addTeaPowder();
		
		//WithInstance
		TeaMaker maker1 = new TeaMaker();
		maker1.addSugar();
		
		TeaMaker maker2 = new TeaMaker();
		maker2.addSugar();
		
	}
	
	public static void addTeaPowder() {
		System.out.println("Adding Tea Powder ...");
	}
	
	public void addSugar() {
		System.out.println("Adding Sugar ...");
	}
}
