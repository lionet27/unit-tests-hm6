import java.util.List;

public class Controller {
    public Integer len;
    public Double minNumberRange;
    public Double maxNumberRange;
    public RandCreateList randCreateList;
    public TwoList twoList;

    public Controller(Integer len, Double minNumberRange, Double maxNumberRange) {
        this.len = len;
        this.minNumberRange = minNumberRange;
        this.maxNumberRange = maxNumberRange;
    }

    public void Start() {
        randCreateList = new RandCreateList(len, minNumberRange, maxNumberRange);
        List<Double> list1 = randCreateList.CreateRandomList();
        List<Double> list2 = randCreateList.CreateRandomList();
        twoList = new TwoList(list1, list2);
        System.out.println("Первый список:");
        System.out.println(list1);
        System.out.println("Второй список:");
        System.out.println(list2);
        System.out.println("Среднее значение первого списка:");
        System.out.println(twoList.getAverageList1());
        System.out.println("Среднее значение второго списка:");
        System.out.println(twoList.getAverageList2());
        System.out.println(twoList.compareAverageLists());

    }
}
