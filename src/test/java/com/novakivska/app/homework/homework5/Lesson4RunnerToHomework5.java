package com.novakivska.app.homework.homework5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Tas_ka on 3/23/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Lesson4RunnerToHomework5 {
    @Test
    @FileParameters(value = "src/test/resoucers/userInputs/Welcome.csv",
    mapper = CsvWithHeaderMapper.class)
    public void testWelcome(String actualResult, String expectedResult){
        Assert.assertTrue(actualResult != expectedResult);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/userInputs/userInput1.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testUserInputNormalize_1(int actualResult, int expectedResult){
        Assert.assertTrue(actualResult == expectedResult);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/userInputs/userInput2.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testUserInputNormalize_2(int actualResult, int expectedResult){
        Assert.assertTrue(actualResult == expectedResult);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/userInputs/wrongInput.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testUserInputNormalize_notInt(String actualResult, String expectedResult){
        Assert.assertTrue(actualResult != expectedResult);
    }
}
