import java.util.List;

public class TwoList {
    private final List<Double> list1;
    private final List<Double> list2;

    public TwoList(List<Double> list1, List<Double> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    private Double getAverageList(List<Double> list) {
        double sum = 0;
        for (Double i : list) {
            sum += i;
        }
        return (double) sum / list.size();

    }

    public Double getAverageList1() {
        return getAverageList(list1);
    }

    public Double getAverageList2() {
        return getAverageList(list2);
    }

    public String compareAverageLists() {
        double average1 = getAverageList1();
        double average2 = getAverageList2();
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    public List<Double> getList1() {
        return list1;
    }

    public List<Double> getList2() {
        return list2;
    }

}




