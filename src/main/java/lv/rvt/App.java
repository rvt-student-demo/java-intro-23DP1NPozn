package lv.rvt;
import java.util.*;
public class App 
{
        public static void main(String[] args) {
            ArrayList<Integer> numberList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true){
                Integer skaitlis = Integer.valueOf(scanner.nextLine());
                if (skaitlis==-1) {
                    break;
                }
                numberList.add(skaitlis);
            }
            while (true) {
                System.out.println("From where? ");
                int start = Integer.valueOf(scanner.nextLine());
                System.out.println();
                if (start>numberList.size()){
                    break;
                }
                System.out.println("To where?");
                int end = Integer.valueOf(scanner.nextLine());
                System.out.println();
                if (end>numberList.size()){
                    break;
                }
                for (int x=start; x <= end; x++){
                    System.out.println(numberList.get(x));
                }
                break;
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            }
        }
    }