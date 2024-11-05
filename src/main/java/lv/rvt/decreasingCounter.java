package lv.rvt;

public class decreasingCounter {
        public int value;   // a variable that remembers the value of the counter
    
        public decreasingCounter(int initialValue) {
            this.value = initialValue;
        }
    
        public void printValue() {
            System.out.println("value: " + this.value);
        }
    
        public void decrement() {
            if (this.value > 0) {
            this.value--;
            }
        }
    }

