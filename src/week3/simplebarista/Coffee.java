package week3.simplebarista;

public class Coffee extends Drink {

	@Override
	public void prepareRecipe() {
		System.out.println("Making coffee...");
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();

	}

	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
