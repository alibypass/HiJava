package io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    @Test
    void should_write_in_file () {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");) {
            fileOutputStream.write("Hello from Java".getBytes(StandardCharsets.UTF_8));

            FileInputStream fileInputStream = new FileInputStream("test.txt");
            int hello = 0;
            StringBuilder hello_world = new StringBuilder();
            while ((hello = fileInputStream.read()) != -1) {

                hello_world.append((char) hello);
                //System.out.println(hello_world);
            }
            System.out.println(hello_world);

        } catch (IOException e) {
            System.out.println("error while works with file.txt");
            e.printStackTrace();
        }
    }
}
