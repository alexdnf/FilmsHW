package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void test() {
        FilmManager manager= new FilmManager();

        String[] expected = {};
        String actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
