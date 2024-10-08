package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
        public static void main(String[] args) {
        printSquare(4);
}
    public static void printSquare(int number) {
        for (int x=0; x < number; x++){
            for (int n=0; n < number; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}