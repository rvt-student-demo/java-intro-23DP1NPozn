package lv.rvt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.history);
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : this.history) {
            sum += value;
        }
        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}