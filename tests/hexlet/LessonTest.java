package hexlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LessonTest {

    @Test
    @DisplayName("Тестируем правильную реализацию")
    public void mainTest() {
        UserTest.testTake(HexletFunction::take);
    }

    @Test
    @DisplayName("Тестируем неправильные реализации")
    public void failTest() {
        Assertions.assertThrows(AssertionError.class,
                () -> UserTest.testTake(HexletFunction::takeFail),
                "Ваши тесты не должны были пропустить эту реализацию");
        Assertions.assertThrows(AssertionError.class,
                () -> UserTest.testTake(HexletFunction::takeFail2),
                "Ваши тесты не должны были пропустить эту реализацию");
    }

}
