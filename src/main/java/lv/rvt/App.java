package lv.rvt;
import java.util.*;
public class App 
{
        public static void main(String[] args) {
            ArrayList<Integer> nameList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int sum=0;
            while (true){
                int skaitlis = Integer.valueOf(scanner.nextLine());
                if (skaitlis==0) {
                    break;
                }
                nameList.add(skaitlis);
            }
            for (int x=0; x < nameList.size(); x++){
                sum+=nameList.get(x);}
            System.out.println(sum);
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
        }
    }