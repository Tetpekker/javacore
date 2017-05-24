package com.novakivska.runners.lesson18;

import com.novakivska.app.classwork.lesson18.Browser;

/**
 * Created by Tas_ka on 5/23/2017.
 */
public class BrowserRunner {
    public static void main(String [] args){
        Browser browser = new Browser();
        browser.invoke("Chrome");
        browser.invoke("Chrome", 45);
    }
}
