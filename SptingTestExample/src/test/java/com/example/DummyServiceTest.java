package com.example;

import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class DummyServiceTest {

    @Autowired
    private DummyService dummyService;

    @Test
    public void sayHello() throws Exception {
        String actual = dummyService.sayHello("Jack");
        assertEquals("Hello Jack", actual);
    }

    @Test
    public void sumInt() throws Exception {
        int actual = dummyService.sumInt(2, 3);
        assertEquals(5, actual);
    }


    @Test(expected = ArithmeticException.class)
    public void divisionZeroo() throws Exception {
        dummyService.divisionZeroo(100);
    }

}