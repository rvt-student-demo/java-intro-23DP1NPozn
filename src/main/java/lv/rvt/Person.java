package lv.rvt;

class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    Person(String initialName, int initialAge, int initialHeight, int initialWeight) {
        this.age = initialAge;
        this.name = initialName;
        this.weight = initialWeight;
        this.height = initialHeight;
        
    }
    Person(String initialName){
        this.name = initialName;
    }
    void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    void growOlder() {
        while (this.age < 30) {
            this.age++;
        }

    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public int returnAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    public int getAge(){
        return this.age;
    }
    public int getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public double getBodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    public String toCsvRow(){
        //Jack, 25, 50, 167
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
    }
