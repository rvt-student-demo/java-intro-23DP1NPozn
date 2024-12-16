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
    public boolean eatAffordably(PaymentCard card) {
        double mealPrice = 2.50;
        if (card.balance() >= mealPrice){
            card.takeMoney(mealPrice);
            this.affordableMeals++;
            return true;
        }
        return false;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        double mealPrice = 4.30;
        if (card.balance() >= mealPrice){
            card.takeMoney(mealPrice);
            this.heartyMeals++;
            return true;
        }
        return false;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {                   // Ensure the amount to be added is positive
            card.addMoney(sum);          // Add the sum to the card's balance
            this.money += sum;           // Increase the terminal's cash balance by the same sum
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}