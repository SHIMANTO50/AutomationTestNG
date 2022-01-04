package com.WebDriverBasic;

import org.openqa.selenium.Dimension;

public class BrowserSize extends Browser {
    public static void main(String[] args) {
       // firefox_launch();
        chrome_launch();
        get_Browser_maximize_size();
        iPad();
        //chrome_close();
        //firefox_close();
    }
    public static void get_Browser_maximize_size(){
        int height= driver.manage().window().getSize().height;
        int width= driver.manage().window().getSize().width;
        System.out.println("Width: "+width+" Height "+height);
        //Width: 1382 Height 744//for firefox

    }
    public static void iPad()
    {
        driver.manage().window().setSize(new Dimension(768,730));
        int width= driver.manage().window().getSize().getWidth();
        int height= driver.manage().window().getSize().getHeight();
        System.out.println("iPadWidth: "+width+" iPadHeight "+height);
    }

}
