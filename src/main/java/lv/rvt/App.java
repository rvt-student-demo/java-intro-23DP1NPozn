package lv.rvt;
import java.util.*;

import lv.PaymentCard;
public class App 
{
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            // Student matt = new Student();
            // matt.play();
            // Person ada = new Person("Ada");
    
            // ada.printPerson();
            // ada.growOlder();
            // Product Banana = new Product("Banana", 1.1, 13);
            // Banana.printProduct();
            // ada.growOlder();
            // ada.printPerson();
            // System.out.println(ada.returnAge());

            // decreasingCounter counter = new decreasingCounter(1);

            // counter.printValue();
    
            // counter.decrement();
            // counter.printValue();
    
            // counter.decrement();
            // counter.printValue();

            // Person pekka = new Person("Pekka");
            // Person antti = new Person("Antti");
            // pekka.getName();
            
            // if (antti.isOfLegalAge()) {
            //     System.out.print("of legal age: ");
            //     antti.printPerson();
            // } else {
            //     System.out.print("underage: ");
            //     antti.printPerson();
            // }
        
            // if (pekka.isOfLegalAge()) {
            //     System.out.print("of legal age: ");
            //     pekka.printPerson();
            // } else {
            //     System.out.print("underage: ");
            //     pekka.printPerson();
            // }
            // animal animal1 = new animal("cat");
            // System.out.println(animal1);
            // String animalAsString = animal1.toString();
            
            // Agent bond = new Agent("James", "Bond");
            // Agent ionic = new Agent("Ionic", "Bond");

            // bond.toString(); // prints nothing
            // System.out.println(bond);

            // System.out.println(ionic);



            // Person2 matti = new Person2("Matti");
            // Person2 juhana = new Person2("Juhana");
        
            // matti.setHeight(180);
            // matti.setWeight(86);
        
            // juhana.setHeight(175);
            // juhana.setWeight(64);
        
            // System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
            // System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());

            // statistics.addNumber(3);
            // statistics.addNumber(5);
            // statistics.addNumber(1);
            // statistics.addNumber(2);
            // System.out.println("Count: " + statistics.getCount());
            PaymentCard paul = new PaymentCard("Paul", 20);
            PaymentCard matt = new PaymentCard("Matt", 30);

            matt.eatAffordably();

            paul.eatHeartily();
            System.out.println(paul);
            System.out.println(matt);

            paul.addMoney(20);
            matt.eatHeartily();
            System.out.println(matt);
            System.out.println(paul);
            paul.eatAffordably();
            paul.eatAffordably();
            matt.addMoney(50);
            System.out.println(matt);
            System.out.println(paul);
        }
    }
            //nameList.size()
            //nameList.add()
            //nameList.get()
            //nameList.remove()
            //list.contains() boolean found = list.contains()
            // if (list.contains("second")) {
                //System.out.println("Second can be found");}