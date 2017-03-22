package com.novakivska.app.classwork.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Tas_ka on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Phonebook {
    @Test
    @FileParameters(value = "src/test/resoucers/Phonebook.csv",
    mapper = CsvWithHeaderMapper.class)
    public void PhoneBookTest(String Person1, String Person2, String Person3){
        Assert.assertEquals("Person1","Person2","Person3");
    }
}
