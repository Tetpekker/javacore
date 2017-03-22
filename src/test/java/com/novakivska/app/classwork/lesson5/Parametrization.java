package com.novakivska.app.classwork.lesson5;

import com.novakivska.app.classwork.lesson3.MathFunc;
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
public class Parametrization {
    @Test
    @FileParameters(value = "src/test/resoucers/testdata.csv",
    mapper = CsvWithHeaderMapper.class)
    public void ParametrizationAdd(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    }
}
