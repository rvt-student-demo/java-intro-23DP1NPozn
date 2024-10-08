package lv.rvt;
public class App 
{
        public static void main(String[] args) {
            printStars(5);
            printStars(3);
            printStars(9);
            System.out.println();
            printSquare(4);
            System.out.println();
            printRectangle(17, 3);
            System.out.println();
            printTriangle(4);


}
    public static void printTriangle(int size) {
        for (int x=0; x < size; x++){
            for (int n=0; n <= x; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printSquare(int number) {
        for (int x=0; x < number; x++){
            for (int n=0; n < number; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int length, int width) {
        for (int x=0; x < width; x++){
            for (int n=0; n < length; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStars(int number) {
        for (int n=0; n < number; n++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }