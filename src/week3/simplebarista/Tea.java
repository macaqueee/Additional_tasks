package week3.simplebarista;

public class Tea extends Drink {

	@Override
	public void prepareRecipe() {
		System.out.println("Making tea...");
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	public void addLemon() {
		System.out.println("Adding Lemon");
	}
}
