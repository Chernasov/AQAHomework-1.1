package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service =  new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainReturn600If400() {
        int amount = 400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainReturn0If1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainReturn1000If0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainReturn1If999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainReturn999If1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}