package io;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    @Test
    void should_write_in_file () {
        try (FileOutputStream fileOutputStream = new FileOutputStream("text.txt");) {
            fileOutputStream.write("Hello from Java".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("error while works with file.txt");
        }
    }
}
