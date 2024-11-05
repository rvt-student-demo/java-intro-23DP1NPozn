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
            System.out.println(ada.returnAge());

            decreasingCounter counter = new decreasingCounter(1);

            counter.printValue();
    
            counter.decrement();
            counter.printValue();
    
            counter.decrement();
            counter.printValue();

            Person pekka = new Person("Pekka");
            Person antti = new Person("Antti");
            pekka.getName();
            
            if (antti.isOfLegalAge()) {
                System.out.print("of legal age: ");
                antti.printPerson();
            } else {
                System.out.print("underage: ");
                antti.printPerson();
            }
        
            if (pekka.isOfLegalAge()) {
                System.out.print("of legal age: ");
                pekka.printPerson();
            } else {
                System.out.print("underage: ");
                pekka.printPerson();
            }

        }
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            //list.contains() boolean found = list.contains()
            // if (list.contains("second")) {
                //System.out.println("Second can be found");}
            }