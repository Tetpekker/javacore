package com.novakivska.app.homework.homework5;

import com.novakivska.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Tas_ka on 3/22/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Homework5 {

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
    mapper = CsvWithHeaderMapper.class)
    public void multiplyAll(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertNotEquals((MathFunc.multiply(Numb2, Numb3)), Numb1, Numb4);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sum_1(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertEquals((Numb1+Numb2),Numb3,Numb4);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sum_2(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertEquals(Numb1, Numb2 ,(Numb3 + Numb4));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void minus(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertEquals(Numb1, Numb2 ,(Numb4 - Numb3));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void moreFalse(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertFalse((Numb1 + Numb2)>(Numb4 + Numb3));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void lessFalse(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertFalse((Numb1 + Numb2)<(Numb3 - Numb4));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void lessTrue(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertTrue((Numb1 + Numb2)>(Numb3 - Numb4));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/homework5.csv",
            mapper = CsvWithHeaderMapper.class)
    public void moreTrue(int Numb1, int Numb2, int Numb3, int Numb4){
        Assert.assertTrue((Numb1 + Numb2)<(Numb3 + Numb4));
    }

    @Test
    @FileParameters(value = "src/test/resoucers/phonebook.csv",
            mapper = CsvWithHeaderMapper.class)
    public void stringFalse(String Pers1, String Pers2, String Pers3){
        Assert.assertFalse((Pers1 + Pers2)== Pers3);
    }

    @Test
    @FileParameters(value = "src/test/resoucers/phonebook.csv",
            mapper = CsvWithHeaderMapper.class)
    public void stringTrue(String Pers1, String Pers2, String Pers3){
        Assert.assertTrue((Pers1 + Pers2)!= Pers3);
    }
}



