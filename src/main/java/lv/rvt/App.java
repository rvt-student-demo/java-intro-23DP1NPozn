package lv.rvt;
import java.util.*;

import java.io.BufferedReader;
public class App 
{
        public static void main(String[] args) throws Exception {
            BufferedReader reader = Helper.getReader("persons.csv");
            String line;
            reader.readLine(); //title row
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }

            // ArrayList<Person> persons = new ArrayList<>();
            // for (Person : persons){
            //     System.out.println(person);
            // }
            // String line;
            // String[] parts = {"name", "age", "weight", "height"};
            // Person pers1 = new Person(parts[0], parts[1], parts[2], parts[3]);
            // Person.add(pers1);
            
            // reader.readLine();
            // while ((line = reader.readLine()) != null) {

            // }
            // reader.close();


//     Timer timer = new Timer();

//     while (true) {
//     System.out.println(timer);
//     timer.advance();

//     try {
//         Thread.sleep(10);
//     } catch (Exception e) {

//     }
// }
//         ClockHand hours = new ClockHand(24);
//         ClockHand minutes = new ClockHand(60);
//         ClockHand seconds = new ClockHand(60);

//         while (true) {
//         // 1. Printing the time
//         System.out.println(hours + ":" + minutes + ":" + seconds);

//         // 2. Advancing the second hand
//         seconds.advance();

//         // 3. Advancing the other hands when required
//         if (seconds.value() == 0) {
//         minutes.advance();

//         if (minutes.value() == 0) {
//         hours.advance();
        
// }
// }
//Clock clock = new Clock();

//while (true) {
    //System.out.println(clock);
    //clock.advance();
//}

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

        }
    }