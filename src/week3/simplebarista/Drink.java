package week3.simplebarista;

/**
 * Created by macaque on 28.07.2016.
 */
public abstract class Drink implements IDrinkMaker{

    @Override
    public void prepareRecipe() {
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
