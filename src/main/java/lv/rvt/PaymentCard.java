package lv.rvt;
    public class PaymentCard {
        private double balance;
        private String name;

        public PaymentCard(String name, double openingBalance) {
            this.balance = openingBalance;
            this.name = name;
        }
    
        public String toString() {
            return name+": The card has a balance of "+this.balance+" euros";
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
    }
