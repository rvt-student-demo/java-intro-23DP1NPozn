package lv.rvt;

class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    Person(String initialName, int initialAge, int initialWeight, int initialHeight) {
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
    public int returnAge() {
        return this.age;
    }
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    public String toCsvRow(){
        //Jack, 25, 50, 167
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
    
    }
