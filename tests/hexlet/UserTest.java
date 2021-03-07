package hexlet;

import java.util.Arrays;

public class UserTest {

    //BEGIN (write your solution here)
    public static void testTake(MyFunction take) {
        test1(take);
        test2(take);
        test3(take);
    }

    public static void test1(MyFunction take) { // Нормальная работа метода
        int [] expectedResult = new int[] {1, 2};
        assert Arrays.equals(take.apply(new int[] {1, 2, 3}, 2), expectedResult) : "Метод не работает!";
    }

    public static void test2(MyFunction take) {
        int [] expectedResult = new int[] {};
        assert Arrays.equals(take.apply(new int[] {}, 2), expectedResult) : "Метод не работает!";

    }

    public static void test3(MyFunction take) {
        int [] expectedResult = new int[] {1, 2, 3};
        assert Arrays.equals(take.apply(new int[] {1, 2, 3}, 7), expectedResult) : "Метод не работает!";
    }
    //END
}
