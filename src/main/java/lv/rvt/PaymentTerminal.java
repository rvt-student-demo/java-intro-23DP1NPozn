package lv.rvt;
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money=1000.0;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        double mealPrice = 2.50;
        if (payment >= mealPrice){
            this.money += mealPrice;
            this.affordableMeals++;
            return payment - mealPrice;
        }
        return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        double mealPrice = 4.30;
        if (payment >= mealPrice){
            this.money+=mealPrice;
            this.heartyMeals++;
            return payment - mealPrice;
        }
        return payment;

        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}