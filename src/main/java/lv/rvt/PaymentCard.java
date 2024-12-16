package lv.rvt;
    public class PaymentCard {
        private double balance;

        public PaymentCard(double balance) {
            this.balance = balance;
        }
        public void eatAffordably() {
            if (this.balance>2.60){
            this.balance-=2.60;
            }
        }
        
    public double balance() {
        return this.balance;
    }
        
        public void eatHeartily() {
            if (this.balance>4.60){
                this.balance-=4.60;
            }
        }

        public void addMoney(double increase) {
            this.balance = this.balance + increase;
        }
    
        public boolean takeMoney(double amount) {
            // Check if there is enough balance to take the money
            if (this.balance >= amount) {
                this.balance -= amount; // Deduct the amount from the balance
                return true;            // Return true indicating the withdrawal was successful
            }
            return false;                // Return false if there was insufficient balance
        }
    }
