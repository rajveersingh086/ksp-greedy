package pattern;
import java.util.*;
//Rajveer singh
//22SCSE1011341
public class Kspgreedy {
    static class Item {
        int weight;
        int value;
        double ratio;
        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }
    }
    static double getMaxValue(int capacity, Item[] items) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.ratio * capacity;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int capacity = 50;
        Item[] items = {
            new Item(20, 100),
            new Item(40, 50),
            new Item(60, 70)
        };

        double maxValue = getMaxValue(capacity, items);
        System.out.println("Maximum value we can obtain = " + maxValue);
        System.out.println("\n"+"RAJVEER SINGH "  );
        System.out.println("22SCSE10341 ");
    }
}
