package com.WebDriverBasic;

import com.Base.BaseClass;

public class Navigate extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        open_URL("https://google.com");
        navigate_to("http://demo.guru99.com/V4/");
        Thread.sleep(2000);
        navigate_back();
        System.out.println(driver.getTitle()); //google
        navigate_forward();
        System.out.println(driver.getTitle()); //guru99
        firefox_close();


    }

    public static void navigate_to(String url ){
          driver.navigate().to(url);
    }
    public static void navigate_back(){
          driver.navigate().back();
    }

    public static void navigate_forward(){
           driver.navigate().forward();
    }

    public static void navigate_refresh(){
           driver.navigate().refresh();
    }

}
