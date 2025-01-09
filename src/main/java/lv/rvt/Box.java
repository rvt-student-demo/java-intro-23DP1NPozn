package lv.rvt;

public class Box {
    private double height;
    private double length;
    private double width;
    private double side;

    public Box(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double width(){
        return this.width;
    }

    public double height(){
        return this.height;
    }

    public double length(){
        return this.length;
    }
    
    public Box(double side){
        this.side = side;
    }

    public double volume(){
        return width*length*height;
    }

    public double faceArea() {
        return this.width*this.height;
    }

    public double topArea() {
        return this.width * this.length;
    }

    public double sideArea() {
        return this.height*this.length;
    }

    public double area(){
        //return 2*(width * length + height * length + width * height);
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    Box(Box oldBox ){
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    public Box biggerBox( Box oldBox ){

  return new Box( 1.25*oldBox.width(),1.25*oldBox.height(),1.25*oldBox.length());
}
    public boolean nests( Box outsideBox ){
        if (oldBox.width()<outsideBox.width ||  )
        return false;
    }
}
