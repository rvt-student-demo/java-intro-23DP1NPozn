package lv.rvt;
import java.util.*;
public class App 
{
        public static void main(String[] args) {
            Student matt = new Student();
            matt.play();
            Person ada = new Person("Ada");
    
            ada.printPerson();
            ada.growOlder();
            Product Banana = new Product("Banana", 1.1, 13);
            Banana.printProduct();
            ada.growOlder();
            ada.printPerson();

        }
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            //list.contains() boolean found = list.contains()
            // if (list.contains("second")) {
                //System.out.println("Second can be found");}
            }