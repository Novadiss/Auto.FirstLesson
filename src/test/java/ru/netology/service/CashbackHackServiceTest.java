package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCashbackLessThen1000() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    void shouldCashbackMoreThen1000() {
        Assert.assertEquals(service.remain(1_100), 900);
    }

    @Test
    void shouldCashbackEquals1000() {
        Assert.assertEquals(service.remain(1_000), 0);
    }
}