package lv.rvt;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.author + ": " + this.name;
    }
}

