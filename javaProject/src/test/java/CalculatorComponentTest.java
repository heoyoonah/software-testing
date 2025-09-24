import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorComponentTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    // ---- add ----
    @Test
    public void add_twoPositives_returnsSum() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void add_withZero_returnsSame() {
        assertEquals(5, calc.add(5, 0));
        assertEquals(-2, calc.add(-2, 0));
    }

    @Test
    public void add_twoNegatives_returnsNegativeSum() {
        assertEquals(-9, calc.add(-4, -5));
    }

    // ---- subtract ----
    @Test
    public void subtract_twoPositives_returnsDifference() {
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    public void subtract_resultBecomesNegative_ok() {
        assertEquals(-3, calc.subtract(2, 5));
    }

    // ---- multiply ----
    @Test
    public void multiply_withZero_returnsZero() {
        assertEquals(0, calc.multiply(10, 0));
        assertEquals(0, calc.multiply(0, -7));
    }

    @Test
    public void multiply_negativeTimesNegative_returnsPositive() {
        assertEquals(12, calc.multiply(-3, -4));
    }

    @Test
    public void multiply_positiveTimesNegative_returnsNegative() {
        assertEquals(-15, calc.multiply(3, -5));
    }

    // ---- divide ----
    @Test
    public void divide_exactDivision_returnsQuotient() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    public void divide_truncatesTowardZero_forInts() {
        assertEquals(3, calc.divide(7, 2));    // 3.5 -> 3
        assertEquals(-3, calc.divide(-7, 2));  // -3.5 -> -3 (0쪽 버림)
    }

    @Test
    public void divide_zeroByNonZero_returnsZero() {
        assertEquals(0, calc.divide(0, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        calc.divide(10, 0);
    }
}