package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainReturn600If400() {
        int amount = 400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainReturn0If1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainReturn1000If0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainReturn1If999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainReturn999If1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainReturn600If400withJupiter() {
        int amount = 400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }
}