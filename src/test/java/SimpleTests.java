import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class SimpleTests {

    @Test
    void firstPositiveTest() {
        int a = 6;
        int b = 6;

        assertThat(a * b, is(equalTo(36)));
    }

    @Test
    void secondPositiveTest() {
        int a = 6;
        int b = 6;

        assertThat(a + b, is(equalTo(12)));
    }
}
