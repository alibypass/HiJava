package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Compare {

    @Test
    void compare_non_primitives () {
        Assertions.assertThat(1 == 1).isTrue();
        Assertions.assertThat(1 != 2).isTrue();
        Assertions.assertThat(1 != 2).isTrue();
    }

    @Test
    void compare_primitives () {
        String s1 = new String("ali");
        String s2 = new String("ali");
        String s3 = new String("ALI");

        // Assertions.assertThat(s1 == s2).isTrue();  // failed
        Assertions.assertThat(s1.equals(s2)).isTrue();
        Assertions.assertThat(s1.equals(s3)).isFalse();
        Assertions.assertThat(s1.equalsIgnoreCase(s3)).isTrue();


        String a1 = "ali";
        String a2 = "ali";

        Assertions.assertThat(a1 == a2).isTrue();
    }

    @Test
    void compare_with_null_value () {
        String a1 = null;
        String a2 = "ali";

        // Assertions.assertThat(a2.equals(a1)).isTrue(); failed
        Assertions.assertThat(Objects.equals(a1, a2)).isFalse();
    }
}
