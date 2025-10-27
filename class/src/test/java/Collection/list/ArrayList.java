package Collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
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


    @Test
    void should_reverse () {
        List<String> animals = new java.util.ArrayList();
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("cat");
        animals.add("khar");

        Collections.reverse(animals);

        System.out.println(animals.indexOf("dog"));
        System.out.println(animals.lastIndexOf("dog"));
        Assertions.assertThat(animals.contains("dog")).isTrue();

    }

    @Test
    void immutable () {
        List<String> animals = new java.util.ArrayList();
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("cat");
        animals.add("khar");

        List<String> immutable_animals = Collections.unmodifiableList(animals);

        // immutable_animals.add("sss"); dont work
        animals.add("snake");

        Assertions.assertThat(animals.size()).isEqualTo(7);
        Assertions.assertThat(immutable_animals.size()).isEqualTo(7); // true because refrece

    }


}
