package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
        public static void main(String[] args) {
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
}