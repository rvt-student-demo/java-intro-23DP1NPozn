package lv.rvt;
import java.util.*;

public class PackableBox implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    private double weight;
    private double totalWeight;

    public PackableBox(double capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.totalWeight = 0.0;
    }

    public double weight() {
        for (Packable item: items){
            this.totalWeight +=item.weight();
        }
        return totalWeight;
    }

    public void add(Packable item) {
        if (this.totalWeight + item.weight() <= this.capacity) {
            items.add(item);
        }
    }

    public double items() {
        return items.size();
    }

    public String toString(){
        return "Box: "+ this.items() + " items, total weight: " + this.weight() + "kg";
    }
}
