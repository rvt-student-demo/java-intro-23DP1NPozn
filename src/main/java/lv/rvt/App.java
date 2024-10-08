package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
        public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
}
    public static void printStars(int number) {
        for (int n=0; n < number; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}