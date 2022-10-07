package ru.netology.service;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainUnder1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainOver1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
