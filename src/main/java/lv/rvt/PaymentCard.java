package lv.rvt;
    public class PaymentCard {
        private double balance;

        public PaymentCard(double openingBalance) {
            this.balance = openingBalance;
        }
        public void eatAffordably() {
            if (this.balance>2.60){
            this.balance-=2.60;
            }
        }
        
        public void eatHeartily() {
            if (this.balance>4.60){
                this.balance-=4.60;
            }
        }
        public void addMoney(double amount) {
            if (amount>0){
            this.balance+=amount;
            }
        }
        public boolean takeMoney(double amount) {
            // implement the method so that it only takes money from the card if
            // the balance is at least the amount parameter.
            // returns true if successful and false otherwise
        }

    }
