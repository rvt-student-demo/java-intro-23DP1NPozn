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
        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if (points < 0) {
            System.out.println("impossible!");
        } else if (points > 0 && points < 50 ) {
            System.out.println("failed");
        } else if (points > 49 && points < 59 ) {
            System.out.println("1");
        } else if (points > 59 && points < 70 ) {
            System.out.println("2");
        } else if (points > 69 && points < 80 ) {
            System.out.println("Grade: 3");
        } else if (points > 79 && points < 90 ) {
            System.out.println("4");
        } else if (points > 89 && points <= 100) {
            System.out.println("5");
        } else if (points > 100) {
            System.out.println("incredible!");
        }
        }
        }