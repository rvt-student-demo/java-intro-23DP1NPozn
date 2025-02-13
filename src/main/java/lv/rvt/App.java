package lv.rvt;
import java.util.*;

import javax.swing.Box;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
public class App
{
    public static void main ( String[] args) throws Exception{
        // Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        // Book book2 = new Book("Robert Martin", "Clean Code", 1);
        // Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
    
        // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
    
        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(cd1);
        // System.out.println(cd2);
        // System.out.println(cd3);

        PackableBox box = new PackableBox(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        PackableBox bigbox = new PackableBox(15);

        // bigbox.add(box);

        System.out.println(box);
        }
    }

            
        //     System.out.println("Hello, choose your command");
        //     System.out.println("show - shows all persons");
        //     System.out.println("add - add a person");
        //     System.out.println("exit");
        //     while (true){
        //     String command = scanner.nextLine();

        //     if (command.equals("show")) {
        //         ArrayList<Person> persons = PersonManager.getPersonList();
        //         for (Person person: persons) {
        //             System.out.println(person);
        //         }
        //     }
        //     else if (command.equals("add")){

        //         System.out.println("Please enter name: ");
        //         String name = scanner.nextLine();
        //         System.out.println("Please enter age: ");
        //         int age = Integer.valueOf(scanner.nextLine());
        //         System.out.println("Please enter weight: ");
        //         int weight = Integer.valueOf(scanner.nextLine());
        //         System.out.println("Please enter height: ");
        //         int height = Integer.valueOf(scanner.nextLine());
        //         Person person = new Person(name, age, weight, height);
        //         PersonManager.addPerson(person);
        //     }
        // }

        //     BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);



        //     Person person = new Person("Maija", 20, 50, 160);
        //     System.out.println("Please enter name: ");
        //     String name = scanner.nextLine();
        //     System.out.println("Please enter age: ");
        //     int age = Integer.valueOf(scanner.nextLine());
        //     System.out.println("Please enter weight: ");
        //     int weight = Integer.valueOf(scanner.nextLine());

        //     writer.write("Maija, 20, 0, 160");
        //     writer.write(person.toCsvRow());
        //     writer.newLine();
        //     writer.close();

        //     else if (command=="exit") {
        //         break;
        //     }






            // System.out.println("Sveiki");
            // String userCommand = scanner.nextLine();

            // BufferedReader reader = Helper.getReader("persons.csv");
            // String row;
            // reader.readLine(); //title row
            // String line;
            
            // BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
            // writer.write(0);

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