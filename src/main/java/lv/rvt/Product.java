package lv.rvt;

public class Product {
    private String name;
    private String location;
    private int weight;
    public Product(String initialName){
        this.name = initialName;
    }
    public Product(String initialName, int initialWeight){
        this.name = initialName;
        this.weight = initialWeight;

    }
    public Product(String initialName, String initialLocation){
    this.name = initialName;
    this.location = initialLocation;
    }
    public void printProduct(String initialName){
        System.out.println(this.name +" (1 kg) "+"can be found from the shelf ");
    }
    public void printProduct(String initialName, int initialWeight){
        System.out.println(this.name +" (" + this.weight +" kg) can be found from the shelf");
    }
    public void printProduct(String initialName, String initialLocation){
        System.out.println(this.name +" (" + this.weight +" kg) "+"can be found from the "+this.location);
    }
}
