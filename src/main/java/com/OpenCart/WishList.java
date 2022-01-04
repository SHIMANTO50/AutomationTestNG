package com.OpenCart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishList extends BaseClass {
    public static void main(String[] args) {
        launch_browser("chrome");
        open_URL("https://demo.opencart.com");
        Login.TC_Login_001();
        TC_Wishlist_002();
    }
    public static void TC_Wishlist_002(){

        WebElement AddedWishList= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]/i"));
        AddedWishList.click();

        WebElement WishListCheck= driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span"));
        WishListCheck.click();

        WebElement ContinueButton1= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/a"));
        ContinueButton1.click();


    }

}
