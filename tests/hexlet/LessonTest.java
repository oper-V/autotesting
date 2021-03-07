package hexlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class LessonTest {

    @Test
    @DisplayName("Тестируем правильную реализацию")
    public void mainTest() {
        UserTest.testIndexOf(HexletFunction::indexOf);
    }

    @Test
    @DisplayName("Тестируем неправильные реализации")
    public void failTest() {
        String message = "\nВаши тесты не должны были пропустить реализацию '%s'\n";

        Assertions.assertThrows(AssertionFailedError.class,
                () -> UserTest.testIndexOf(HexletFunction::failJustWrongIndex),
                String.format(message, "failJustWrongIndex"));

        Assertions.assertThrows(AssertionFailedError.class,
                () -> UserTest.testIndexOf(HexletFunction::failWithEmptyArray),
                String.format(message, "failWithEmptyArray"));

        Assertions.assertThrows(AssertionFailedError.class,
                () -> UserTest.testIndexOf(HexletFunction::failWithNullArray),
                String.format(message, "failWithNullArray"));

        Assertions.assertThrows(AssertionFailedError.class,
                () -> UserTest.testIndexOf(HexletFunction::failWithEmptyValue),
                String.format(message, "failWithEmptyValue"));

        Assertions.assertThrows(AssertionFailedError.class,
                () -> UserTest.testIndexOf(HexletFunction::failWithNullValue),
                String.format(message, "failWithNullValue"));

    }
}
