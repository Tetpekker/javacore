package com.novakivska.app.classwork.lesson5;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Tas_ka on 3/21/2017.
 */
public class TimeoutTest {

    @Ignore("Not ready yet")
    @Test(timeout = 1000)
    public void infinityTest() {
        while (true);
    }
}
