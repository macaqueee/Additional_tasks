package week3.simplebarista;

public class Barista {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();

		/*System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();*/

		RecipeMaker receipeMaker = new RecipeMaker();
		receipeMaker.prepareRecipe(tea);
		receipeMaker.prepareRecipe(coffee);
	}
}
