package lv.rvt;
import java.util.*;
public class App 
{
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            numbers.add(3);
            numbers.add(2);
            numbers.add(6);
            numbers.add(-1);
            numbers.add(5);
            numbers.add(1);
            System.out.println("The numbers in the range [0, 5]");
            printNumbersInRange(numbers, 0, 5);
            
            System.out.println("The numbers in the range [3, 10]");
            printNumbersInRange(numbers, 3, 10);
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            //list.contains() boolean found = list.contains()
            // if (list.contains("second")) {
                //System.out.println("Second can be found");}
            }
            public static void printNumbersInRange
            (ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
                for (int number: numbers) {
                    if (number >= lowerLimit && number<=upperLimit){
                        System.out.println(number);
                    }
                }
            }
            }