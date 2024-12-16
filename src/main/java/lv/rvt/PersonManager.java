package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);
            int height = Integer.parseInt(parts[3]);

            Person person = new Person(name, age, height, weight);
            persons.add(person);
        }

        reader.close();
        return persons;
    }
}
