import java.util.*;

abstract class Dessertitem{
	abstract void getcost();
	
}
class Candy extends Dessertitem{
	 void getcost() {}
	
}
class Cookie extends Dessertitem{
	void getcost() {}
	
}
class Icecream extends Dessertitem{
	void getcost() {}
	
}

public class Dessert_shop{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Role:");
		System.out.println("Enter 1 if u r Customer.");
		System.out.println("Enter 2 if u r Owner.");
		int role=sc.nextInt();
		
		
		if(role == 1 ) {
		System.out.println("What is Your Order");
			
		}
		else if(role == 2 ) {
			System.out.println("Change");
		}
	

	}

}
 
