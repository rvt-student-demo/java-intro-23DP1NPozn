package lv.rvt;

public class Counter {
        private int value;   // a variable that remembers the value of the counter
        static public int increase;

        public Counter(int startValue) {
            this.value = startValue;
        }
    
        public void printValue() {
            System.out.println("value: " + this.value);
        }
    
        public void decrease() {
            //if (this.value > 0) {
            //this.value--;
            //}
            value--;
        }
        public void increase(){
            value++;
        }
        public void increase(int increaseBy){
            this.increase=increaseBy;
            if (value>0){
            value+=increaseBy;
            }
        }
        public void decrease(int decreaseBy){
            this.increase=decreaseBy;
            if (value<0){
            value+=decreaseBy;
            }

        }
    }

