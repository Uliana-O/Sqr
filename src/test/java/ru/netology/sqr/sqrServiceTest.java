package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class sqrServiceTest {
    @Test
    public void SquareFound() {
        sqrService service = new sqrService();
        int expected = 5;
        int actual = service.calc(1, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SquareFound2() {
        sqrService service = new sqrService();
        int expected = 3;
        int actual = service.calc(10, 150);

        Assertions.assertEquals(expected, actual);

    }
}
