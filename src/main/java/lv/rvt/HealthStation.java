package lv.rvt;

public class HealthStation {


    public int weigh(Person person) {
        return person.getWeight();
    }
    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }

}
