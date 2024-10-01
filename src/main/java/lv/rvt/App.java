package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numbers =0;
        int even = 0;
        System.out.println("Give numbers:");
        int odd = 0;
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
        
            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numbers);
                double avg = (double)sum/numbers;
                System.out.println("Average: "+ avg);
                System.out.println("Even: "+even);
                System.out.println("Odd: "+odd);
                break;
            }
            sum += input;
            numbers++;
            if (input % 2 ==0) {
                even++;
            }
            else {
                odd++;
            }

        }
    }
    }