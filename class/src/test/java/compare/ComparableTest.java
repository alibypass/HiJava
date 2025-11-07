package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    @Test
    void slould_sort_mashin () {
        MashinTest mashin_1 = new MashinTest("BMW", 550);
        MashinTest mashin_2 = new MashinTest("BMW", 450);

        List<MashinTest> mashins = new ArrayList<>();
        mashins.add(mashin_1);
        mashins.add(mashin_2);

        Collections.sort(mashins);

        List<MashinTest> exepctedmashins = new ArrayList<>();
        exepctedmashins.add(mashin_1);
        exepctedmashins.add(mashin_2);

        Assertions.assertThat(mashins).isEqualTo(exepctedmashins);
    }
}
