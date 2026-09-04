import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class mainTest {

    @Test
    public void testCountDigits() {
        assertEquals(4, main.countDigits("Vanier2026"));
    }

    @Test
    public void testIsValidPassword() {
        assertFalse(main.isValidPassword("VANIER2026"));
    }

    @Test
    public void testCountUpperCase() {
        assertEquals(6, main.countUppercase("VANIER012"));
    }

    @Test
    public void testGenerateCode() {
        String code = main.generateCode();
        assertEquals(4, code.length());
    }
}

