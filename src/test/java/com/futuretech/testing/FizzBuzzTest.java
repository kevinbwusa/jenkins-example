package com.futuretech.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String result = this.fizzBuzz.play(1);
        Assertions.assertEquals(result, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String result = this.fizzBuzz.play(3);
        Assertions.assertEquals(result, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String result = this.fizzBuzz.play(5);
        Assertions.assertEquals(result, "Buzz");
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fizzBuzz.play(0));
    }

    @AfterEach
    public void tearDown() {
        fizzBuzz = null;
    }

}