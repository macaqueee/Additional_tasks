package week3.sort;

import java.util.Comparator;

/**
 * Created by macaque on 28.07.2016.
 */
public class WeightComparator implements Comparator<Duck> {

    @Override
    public int compare(Duck o1, Duck o2) {
        return o1.weight - o2.weight;
    }
}
