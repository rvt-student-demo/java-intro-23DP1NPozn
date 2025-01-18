package lv.rvt;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        this.credits ++;
    }
    public int credits() {
        return credits;
    }
    public String toString(){
        return this.getName() + "\n\t" + this.getAddress() + "\n\t" + "Study credits " + this.credits();
    }
}
