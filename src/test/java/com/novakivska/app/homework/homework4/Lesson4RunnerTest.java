package com.novakivska.app.homework.homework4;

import com.novakivska.runners.Lesson4Runner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class Lesson4RunnerTest {

    @Test
    public void testWelcome(){
    String actualResult = Lesson4Runner.welcome();
    String expectedResult = "Hello!";
    Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testUserInputNormalize_0(){
    int expected = 0;
    int actual = Lesson4Runner.userInputNormalize("0");
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUserInputNormalize_1(){
    int expected = 1;
    int actual = Lesson4Runner.userInputNormalize("1");
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUserInputNormalize_2(){
    int expected = 2;
    int actual = Lesson4Runner.userInputNormalize("2");
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUserInputNormalize_3(){
    int expected = 3;
    int actual = Lesson4Runner.userInputNormalize("3");
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUserInputNormalize_5(){
    int expected = 5;
    int actual = Lesson4Runner.userInputNormalize("5");
    Assert.assertEquals(expected, actual);
    }

@Test
    public void testUserInputNormalize_notInt(){
    int expected = 0;
    int actual = Lesson4Runner.userInputNormalize("test");
    Assert.assertEquals(expected, actual);
    }

@Test
    public void testUserInputNormalize_4(){
    int expected = 4;
    int actual = Lesson4Runner.userInputNormalize("4");
    Assert.assertEquals(expected, actual);
    }


}
