package lv.rvt;
import java.util.*;

public class Box {
    private double capacity;
    private ArrayList<Packable> items;
    private double weight;

    public Box(double capacity){
        this.capacity = capacity;
    }

    public double weight() {
        for (Packable item: items){
            this.weight +=item.weight();
        }
        return weight;
    }

    public void add(Packable item){
        if (this.weight() + item.weight() <= this.capacity) {
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
