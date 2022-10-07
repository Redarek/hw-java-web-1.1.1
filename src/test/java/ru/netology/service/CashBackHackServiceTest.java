package ru.netology.service;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainUnder1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 777;
        int expected = 223;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainOver1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}