package map;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MapTest {

    @Test
    void linked_map () {
        Map<String, String> geometriks = new LinkedHashMap<>();
        geometriks.put("mosalas", "ghermez");
        geometriks.put("mostatil", "zard");
        geometriks.put("sheshzel", "sabz");
        geometriks.put("moraba", "ghermez");

        Set<Map.Entry<String, String>> entries = geometriks.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " and value is " + value);
        }
    }
    @Test
    void hash_map () {
        Map<String, String> geometriks = new HashMap<>();
        geometriks.put("mosalas", "ghermez");
        geometriks.put("mostatil", "zard");
        geometriks.put("sheshzel", "sabz");
        geometriks.put("moraba", "ghermez");

        Set<Map.Entry<String, String>> entries = geometriks.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " and value is " + value);
        }
    }

    @Test
    void three_map () {
        Map<String, String> geometrics = new TreeMap<>();

        geometrics.put("mosalas", "ghermez");
        geometrics.put("mostatil", "zard");
        geometrics.put("moraba", "ghermez");
        geometrics.put("sheshzel", "sabz");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " and value is " + value);
        }


    }
}
