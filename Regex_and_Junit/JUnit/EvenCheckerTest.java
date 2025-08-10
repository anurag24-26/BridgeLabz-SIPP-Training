import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void testEvenNumbers(int num) {
        assertTrue(checker.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    public void testOddNumbers(int num) {
        assertFalse(checker.isEven(num));
    }
}
