package com.fizz;

import org.junit.Test;
import static org.junit.Assert.*;
public class FizzBuzzClassTest {

    private String a;

    @Test
    public void ShouldReturnFizzForNumber3() {
        FizzBuzzClass num=new FizzBuzzClass();
        a=num.isChecking(3);
        assertEquals("Fizz",a);
    }

    @Test
    public void shouldReturnBuzzForNumber5() {
        FizzBuzzClass num=new FizzBuzzClass();
        a=num.isChecking(5);
        assertEquals("Buzz",a);
    }

    @Test
    public void shouldReturnFizzBuzzForNumber15() {
        FizzBuzzClass num=new FizzBuzzClass();
        a=num.isChecking(15);
        assertEquals("FizzBuzz",a);
    }

    @Test
    public void shouldReturn4for4() {
        FizzBuzzClass num=new FizzBuzzClass();
        a=num.isChecking(4);
        assertEquals("ZzzZ",a);
    }
}
