package lv.rvt;
import java.util.*;
public class App 
{
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int sum = 0;
            int x=0;
            int max=0;
            
            while (true) {
                String input = reader.nextLine();
                if (input.equals("")) {
                    break;
                }
            
                String[] parts = input.split(",");
                if (Integer.valueOf(parts[x])>max || max==0){
                    max = Integer.valueOf(parts[x]);
                }
                x++;
            }
            
            System.out.println("Age of the oldest: " + max);
        }
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            //list.contains() boolean found = list.contains()
            // if (list.contains("second")) {
                //System.out.println("Second can be found");}
            }