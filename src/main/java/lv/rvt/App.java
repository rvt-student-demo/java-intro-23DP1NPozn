package lv.rvt;
import java.util.*;
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
            System.out.println();
            printTriangle2(4);
            christmasTree(4);


}
public static void printSpaces(int n) {
    for (int x=0; x < n; x++){
        System.out.print(" ");
    }
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
        public static void printTriangle2(int size) {
            for (int x=0; x < size; x++){
                    printSpaces(size-(x+1));
                    printStars(x+1);
                }
        }
        public static void christmasTree(int height) {
            int Stars=1;
            for (int x=1; x <= height; x++){
                printSpaces(height - x);
                printStars(Stars);
                Stars+=2;
            }
            for (int x=0; x < 2; x++) {
                printSpaces(height-2);
                printStars(3);
            }
        }
    }