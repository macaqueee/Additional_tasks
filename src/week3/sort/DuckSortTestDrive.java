package week3.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = { 
						new Duck("Daffy", 8), 
						new Duck("Dewey", 2),
						new Duck("Howard", 7),
						new Duck("Louie", 2),
						new Duck("Donald", 10), 
						new Duck("Huey", 2)
		 };

		System.out.println("Before sorting:");
		display(ducks);

		List<Duck> duckList = Arrays.asList(ducks);
		duckList.sort(new WeightComparator());

		// TODO ducks must be sorted by weight

		ducks = duckList.toArray(ducks);

		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
