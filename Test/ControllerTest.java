import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    private Controller controller;

    @BeforeEach
    public void setUp() {
        controller = new Controller(10, 0.0, 10.0);
    }
   //Проверка получения из конструктора правильных значений
    @Test
    public void testConstructor() {
        assertNotNull(controller);
        assertEquals(10, (int) controller.len);
        assertEquals(0.0, controller.minNumberRange, 0.0);
        assertEquals(10.0, controller.maxNumberRange, 0.0);
    }
    //Интеграционный тест. Проверка, что в контроллере идет вызов функций и мы получаем не нулевое значение.
    @Test
    public void testStart() {
        controller.Start();
        assertNotNull(controller.randCreateList);
        assertNotNull(controller.twoList);
        List<Double> list1 = controller.randCreateList.CreateRandomList();
        List<Double> list2 = controller.randCreateList.CreateRandomList();
        assertNotNull(list1);
        assertNotNull(list2);
        assertEquals(10, list1.size());
        assertEquals(10, list2.size());
        assertNotNull(controller.twoList.getAverageList1());
        assertNotNull(controller.twoList.getAverageList2());
        assertNotNull(controller.twoList.compareAverageLists());
    }

}
