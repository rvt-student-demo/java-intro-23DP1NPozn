package lv.rvt;

public class Timer {
    private ClockHand mili;
    private ClockHand seconds;

    public Timer() {
        this.mili = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.mili.advance();

        if (this.mili.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + mili;
    }
}
