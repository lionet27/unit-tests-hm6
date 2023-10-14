import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandCreateListTest {

    private RandCreateList randList;
    private List<Double> randomList;

    //Unit tests
    @BeforeEach
    void setUp() {
        randList = new RandCreateList(5, 3.0, 15.0);
        randomList = randList.CreateRandomList();
    }

    @Test
    void testLengthRandomList() {
        // Проверка, что длина полученного списка правильная
        // Act
        int lenRandomList = randomList.size();
        // Assert
        assertEquals(5, lenRandomList);
    }

    @Test
    void testValuesRandomListInRange() {
        // Проверка того, что значения списка находятся в заданном интервале
        // Assert
        for (Double value : randomList) {
            assertTrue(value >= 3.0 && value <= 15.0);
        }
    }
}
