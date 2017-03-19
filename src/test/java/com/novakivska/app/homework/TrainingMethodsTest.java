package com.novakivska.app.homework;

import com.novakivska.app.homework.homework3.TrainingMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tas_ka on 3/16/2017.
 */
public class TrainingMethodsTest {

    int a = 30;
    int b = 30;

    TrainingMethods method = new TrainingMethods();

    @Test
    public void devision() {
        int actualResult = method.divide(a, b);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void modullo(){
        int actualResult = method.modullo(a, b);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverse(){
        String actualResult = method.reverse("test");
        String expectedResult = "tset";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
