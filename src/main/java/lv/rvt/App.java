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
    System.out.println("Last number?");
    int n = Integer.valueOf(scanner.nextLine());
    int sum = 0;
    for (int i = 1; i < n+1; i++) {
        sum+=i;
    }
    System.out.println("The sum is: "+ sum);
    }
    }