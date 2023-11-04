package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCashbackLessThen1000 () {
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldCashbackMoreThen1000 () {
        Assert.assertEquals(900, service.remain(1_100));
    }

    @Test
    public void shouldCashbackEquals1000 () {
        Assert.assertEquals(0, service.remain(1_000));;
    }
}