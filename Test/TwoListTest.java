import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoListTest {
    private TwoList twoList;
    //Unit tests
    //Проверка того, что при сравнении средних значений списков, выдается правильный рзультат
    @Test
    void compareAverageListsTestFirstLarger() {
        // Act
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> list1 = Arrays.asList(3.0, 4.0, 5.0, 6.0, 7.0);
        twoList = new TwoList(list1, list2);

        // Assert
        assertEquals("Первый список имеет большее среднее значение", twoList.compareAverageLists());
    }

    @Test
    void compareAverageListsTestFirstEqual() {
        // Act
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        twoList = new TwoList(list1, list2);

        // Assert
        assertEquals("Средние значения равны", twoList.compareAverageLists());
    }

    @BeforeEach
    void setUp() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> list2 = Arrays.asList(3.0, 4.0, 5.0, 6.0, 7.0);
        twoList = new TwoList(list1, list2);
    }
    @Test
    void getList1(){
        // Act
        List<Double> list1=twoList.getList1();
        List<Double> list1expected=Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        // Assert
        assertEquals(list1, list1expected);
    }

    @Test
    void getList2(){
        // Act
        List<Double> list2=twoList.getList2();
        List<Double> list2expected=Arrays.asList(3.0, 4.0, 5.0, 6.0, 7.0);
        // Assert
        assertEquals(list2, list2expected);
    }
    //Проверка правильности подсчета среднего значения первого списка
    @Test
    void getAverageList1Test() {
        // Act
        double average1 = twoList.getAverageList1();
        // Assert
        assertEquals(average1, 3.0);

    }
    //Проверка правильности подсчета среднего значения второго списка
    @Test
    void getAverageList2Test() {
        // Act
        double average2 = twoList.getAverageList2();
        // Assert
        assertEquals(average2, 5.0);
    }

    @Test
    void compareAverageListsTestSecondLarger() {
        // Assert
        assertEquals("Второй список имеет большее среднее значение", twoList.compareAverageLists());
    }
}
