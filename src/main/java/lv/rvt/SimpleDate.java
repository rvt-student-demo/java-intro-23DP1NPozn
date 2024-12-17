package lv.rvt;
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public SimpleDate() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    @Override
    public boolean equals(Object object) {
        if (object instanceof SimpleDate == false) {
            return false;
        }
        SimpleDate comparedObject = (SimpleDate) object;
        if (
            this.day == comparedObject.getDay() &&
            this.month == comparedObject.getMonth() &&
            this.year == comparedObject.getYear()
        ) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }
}