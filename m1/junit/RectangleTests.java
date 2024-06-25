package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class RectangleTests {

    @Test
    @DisplayName("Test Rectangle getWidth")
    public void testRectangleWidth() {
        final Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(2, rectangle.getWidth(), "Get width should be 2");
        assertNotEquals(3, rectangle.getWidth(), "Get width should not be 3");
    }

    @Test
    @DisplayName("Rectangle width should not be negative")
    public void testIncorrectWidth() {
        final Throwable exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Rectangle(-5, 2)
        );
        assertEquals("Incorrect width", exception.getMessage());
    }

    @Test
    @DisplayName("Test rectangle area - single method")
    public void testRectangleArea() {
        final Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.getArea(), "Area should be 6");
    }

    @ParameterizedTest
    @CsvSource({"2,3,6", "2,2,4", "5,5,25"})
    @DisplayName("Test rectangle area - call multiple cases")
    public void testRectangleAreaMultipleCases(final int width, final int height, final int expected) {
        final Rectangle rectangle = new Rectangle(width, height);
        assertEquals(expected, rectangle.getArea());
    }
}
