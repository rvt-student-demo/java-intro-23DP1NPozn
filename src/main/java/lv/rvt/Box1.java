package lv.rvt;

public class Box1 {
    private double height;
    private double length;
    private double width;
    private double side;

    public Box1(double width, double length, double height){
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
    
    public Box1(double side){
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

    Box1(Box1 oldBox ){
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    public Box1 biggerBox( Box1 oldBox ){

  return new Box1( 1.25*oldBox.width(),1.25*oldBox.height(),1.25*oldBox.length());
}
    public Box1 smallerBox( Box1 oldBox ){

    return new Box1( 0.75*oldBox.width(),0.75*oldBox.height(),0.75*oldBox.length());
  }
    public boolean nests( Box1 outsideBox ){
        if (this.width()<outsideBox.width() && this.height() < outsideBox.height() && this.length() < outsideBox.length() ){
        return true;
        }
        else {
            return false;
        }
    }
}
