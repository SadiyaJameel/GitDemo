import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty("   "));
        assertTrue(StringUtils.isEmpty(null));
        assertFalse(StringUtils.isEmpty("hello"));
    }

    @Test
    void testReverse() {
        assertEquals("dcba", StringUtils.reverse("abcd"));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, StringUtils.countVowels("hello"));
        assertEquals(3, StringUtils.countVowels("education"));
    }
}