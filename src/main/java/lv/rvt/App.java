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
    int skait=0;
    int sum=0;
    while (true) {
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number==0) {
            break;
        }
        skait+=1;
        sum+=number;
    }
    System.out.println("Number of numbers: "+ skait);
    System.out.println("Sum of numbers: "+ sum);
    }
    }