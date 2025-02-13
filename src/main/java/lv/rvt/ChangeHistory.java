package lv.rvt;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory() {
        this.records = new ArrayList<>();
    }

    public void add(double status) {
        this.records.add(status);
    }

    public void clear() {
        this.records.clear();
    }

    public double maxValue() {
        double max = this.records.get(0);
        for (double value : records) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.records.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.records);
    }

    public double average() {
        if (this.records.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : this.records) {
            sum += value;
        }
        return sum / this.records.size();
    }

    @Override
    public String toString() {
        return this.records.toString();
    }
}