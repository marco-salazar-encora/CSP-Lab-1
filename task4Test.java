import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathFunctionsTest {

    @Test
    public void testAdd() {
        int result = MathFunctions.add(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = MathFunctions.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = MathFunctions.multiply(5, 3);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = MathFunctions.divide(6, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MathFunctions.divide(6, 0);
        });
    }
}