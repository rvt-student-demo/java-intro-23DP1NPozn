package lv.rvt;
import java.io.BufferedReader;
import java.util.ArrayList;

import lv.rvt.Person;
public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception{
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) !=null) {
            String[] parts = line.split(", ");
            Person person = new Person(parts[0], parts[1], parts[2]);
        }
        
    }
    public static 
}
