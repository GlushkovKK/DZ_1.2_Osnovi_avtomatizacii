package ru.netology;

import static org.testng.Assert.assertEquals;

public class BonusCashTest {
    @org.testng.annotations.Test
    public void showWorkCashback() {
        int boundary = 2000;
        int amount = 10;
        int expected = 1000;

        BonusCash service = new BonusCash();
        int actual = service.remain(boundary);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void showWorkCashback2() {
        int boundary = 900;
        int amount = 10;
        int expected = 100;

        BonusCash service = new BonusCash();
        int actual = service.remain(boundary);

        assertEquals(actual, expected);


    }


}