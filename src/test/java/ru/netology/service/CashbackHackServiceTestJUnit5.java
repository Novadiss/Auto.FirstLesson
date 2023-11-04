package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJUnit5 {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCashbackLessThen1000Jupiter() {
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    void shouldCashbackMoreThen1000Jupiter() {
        Assert.assertEquals(900, service.remain(1_100));
    }

   @Test
    void shouldCashbackEquals1000Jupiter() {
        Assert.assertEquals(0, service.remain(1_000));
        ;
    }
}
