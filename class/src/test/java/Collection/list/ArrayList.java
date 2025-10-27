package Collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArrayList {

    @Test
    void is_empty () {
        List<String> strings = new java.util.ArrayList<>();

        Assertions.assertThat(strings).isEmpty();
    }

    @Test
    void kata () {
        int[] ArrayNums = {1, 2, 3};

        Converter coverter = new Converter();
        List<Integer> ArrayListNumbers = coverter.convert_to_array(ArrayNums);

        List<Integer> latest = new java.util.ArrayList<>();
        latest.add(1);
        latest.add(2);
        latest.add(3);

        Assertions.assertThat(ArrayListNumbers).isEqualTo(latest);
    }

    class Converter {

        public List<Integer> convert_to_array(int[] arrayNums) {
            List<Integer> addedList = new java.util.ArrayList();
            for (int nums : arrayNums) {
                addedList.add(nums);
            }
            return addedList;
        }
    }


}
