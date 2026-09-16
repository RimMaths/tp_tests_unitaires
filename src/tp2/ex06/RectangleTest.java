package ex06;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {
    @Test
    void testAireEtPerimetre() {

        Rectangle rectangle = new Rectangle(4, 3);

        assertAll(
                () -> assertEquals(12, rectangle.aire()),
                () -> assertEquals(14, rectangle.perimetre())
        );
    }
}
