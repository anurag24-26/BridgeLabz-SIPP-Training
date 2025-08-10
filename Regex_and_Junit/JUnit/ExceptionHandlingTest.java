import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    ExceptionHandling obj = new ExceptionHandling();

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> obj.divide(5, 0));
    }
}
