package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed: ");
        int atrums = Integer.valueOf(scanner.nextLine());
        int limits = 120;
        if (atrums > limits) {
            System.out.println("Speeding ticket!");
        }
    }
}
