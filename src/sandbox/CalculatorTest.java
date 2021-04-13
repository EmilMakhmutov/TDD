package sandbox;

import org.junit.jupiter.api.Test;
import tddkata.Calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calc calc = new Calc();

    @Test
    void empty() {
        Integer actual = calc.sum("");
        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void oneNumber() {
        Integer actual = calc.sum("1");
        Integer expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void twoNumbers() {
        Integer actual = calc.sum("1,2");
        Integer expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void minusNumber() {
        Integer actual = calc.sum("-2");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void minusNumbers() {
        Integer actual = calc.sum("-1,-2");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void threeNumbers() {
        Integer actual = calc.sum("1,2,3");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void word() {
        Integer actual = calc.sum("один");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void wordNumber() {
        Integer actual = calc.sum("1,два");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void doubleNumber() {
        Integer actual = calc.sum("1.5");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void incorrectDelimiter() {
        Integer actual = calc.sum("1 2");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void space() {
        Integer actual = calc.sum(" ");
        Integer expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void nullNumber() {
        Integer actual = calc.sum(null);
        Integer expected = -1;
        assertEquals(expected, actual);
    }
}
