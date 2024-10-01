package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args ){
            divisibleByThreeInRange(2, 10);
        }

    public static void divisibleByThreeInRange(int x, int y) {
        for (int i = x; i<y+1; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}