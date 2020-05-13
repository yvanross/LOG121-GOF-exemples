package PatronStrategie.Animal;

// Référence: https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3
public class AnimalExample{
	
	public static void main(String[] args){
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());
		
		// This allows dynamic changes for flyingType
		sparky.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + sparky.tryToFly());
		
	}
	
}