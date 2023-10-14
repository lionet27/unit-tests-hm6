import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandCreateList {
    int len;
    double min;
    double max;
    final Random random = new Random();

    public RandCreateList(int len, double min, double max) {
        this.len = len;
        this.min = min;
        this.max = max;
    }

    public List<Double> CreateRandomList() {
        List<Double> newlist = new ArrayList<Double>();
        for (int i = 0; i < len; i++) {
            double value = min + (max - min) * random.nextDouble();
            newlist.add(value);
        }
        return newlist;

    }

}

