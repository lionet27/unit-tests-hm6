
import org.assertj.core.api.AbstractThrowableAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

public class someTests {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false
    @Test
    void evenOddNumberTest(){
        EvenOddNumber evenOddNumber=new EvenOddNumber();
        Assertions.assertTrue(evenOddNumber.evenOddNumber(2));
        Assertions.assertFalse(evenOddNumber.evenOddNumber(9));
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    @Test
    void numInInterval(){
        IntervalNum intervalNum=new IntervalNum();
        Assertions.assertTrue(intervalNum.numInIntervalNum(50));
        Assertions.assertFalse(intervalNum.numInIntervalNum(25));
    }

}
