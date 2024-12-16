package lv.rvt;

public class HealthStation {


    public int weigh(Person person) {
        return person.getWeight();
    }
    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

}
