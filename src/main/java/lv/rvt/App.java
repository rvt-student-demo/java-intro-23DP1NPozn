package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //int number = Integer.valueOf(scanner.nextLine());
        //if (number > 5) {
            //System.out.println("Your number is greater than five.");
        //}  else {
            //System.out.println("Your number is five or less.");
        //}
    int start = Integer.valueOf(scanner.nextLine());
    int end = Integer.valueOf(scanner.nextLine());
    for (int i = start; i < end; i++) {
        System.out.println(i);
    }
    }
    }