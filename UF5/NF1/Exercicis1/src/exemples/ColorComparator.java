package exemples;

import java.util.Comparator;

public class ColorComparator implements Comparator<Fruit> {
    // int compare(T o1, T o2) = Compares its two arguments for order.
    // Info en: https://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html

    public int compare(Fruit f1, Fruit f2) {
        return f1.getColor().compareTo(f2.getColor());
    }
}
