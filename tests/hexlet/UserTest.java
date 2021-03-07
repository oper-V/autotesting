package hexlet;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    //BEGIN (write your solution here)
    public static void testIndexOf(MyFunction indexOf) {
        String[] incomeString1 = new String[] {"one", "two", "three", "four", "five"};
        String[] incomeString2 = new String[] {"one", "three", "three", "three", "three"};
        String[] incomeEmptyString = new String[] {};

        assertThat(indexOf.apply(incomeString1, "two")).isEqualTo(1);
        assertThat(indexOf.apply(incomeString1, "six")).isEqualTo(-1);
        assertThat(indexOf.apply(incomeString1, "")).isEqualTo(-1);
        assertThat(indexOf.apply(incomeString1, null)).isEqualTo(-1);
        assertThat(indexOf.apply(incomeString2, "three")).isEqualTo(1);
        assertThat(indexOf.apply(incomeEmptyString, "")).isEqualTo(-1);
    }

    //END
}
