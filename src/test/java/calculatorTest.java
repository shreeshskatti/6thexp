import org.example.calculator;
import org.junit.jupiter.api.Test;
import static
        org.junit.jupiter.api.Assertions.assertEquals;
public class calculatorTest {
    @Test
    public void testAdd() {
        calculator calc = new calculator();
        assertEquals(5,calc.add(2,3));

    }
}