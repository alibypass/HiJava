package set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    @Test
    void hash_set () {
        Set<String> animals = new HashSet<>();
        animals.add("khar");
        animals.add("asb");
        animals.add("cat");
        animals.add("cat");

        for (String animal : animals) {
            System.out.println(animal);
        }

    }

    @Test
    void linked_hash_set () {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("khar");
        animals.add("asb");
        animals.add("cat");
        animals.add("cat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    @Test
    void thee_set () {
        Set<String> animals = new TreeSet<>();
        animals.add("khar");
        animals.add("asb");
        animals.add("cat");
        animals.add("cat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
