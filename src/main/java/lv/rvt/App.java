package lv.rvt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Hello world!");
       boolean isOnline = false;
       int age = 17;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ievadi savu vārdu: ");
       String name = scanner.nextLine();
       System.out.println("Ievadiet savu uzvārdu: ");
       String lastname = scanner.nextLine();
       System.out.println("Ievadiet savu grupu: ");
       String group = scanner.nextLine();
       System.out.println("Students: " + name + " " + lastname + ", Grupa: " + group);
    }
}
