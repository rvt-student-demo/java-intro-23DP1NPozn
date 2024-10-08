package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
        public static void main(String[] args) {
        printRectangle(17, 3);
}
    public static void printRectangle(int length, int width) {
        for (int x=0; x < width; x++){
            for (int n=0; n < length; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}