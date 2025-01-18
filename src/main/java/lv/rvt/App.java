package lv.rvt;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
public class App 
{
    public class MainProgram {
        public static void main(String[] args) {

            Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
            System.out.println(engine.getEngineType());
            System.out.println(engine.getManufacturer());

            Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
            Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
            System.out.println(ada);
            System.out.println(esko);

            Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
            System.out.println(ollie);
            ollie.study();
            System.out.println(ollie);

            Teacher ada2 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
            Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
            System.out.println(ada2);
            System.out.println(esko2);

            Student ollie2 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

            // int i = 0;
            // while (i < 25) {
            // ollie2.study();
            // i = i + 1;
            // }
            //System.out.println(ollie2);

            ArrayList<Person> persons = new ArrayList<Person>();
            persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
            persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        }
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