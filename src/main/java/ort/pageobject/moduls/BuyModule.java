package ort.pageobject.moduls;

import org.openqa.selenium.WebDriver;

public class BuyModule extends BaseModule{
    private final static String xpath ="//*[@href='#icon-header-basket']";
    public BuyModule(WebDriver driver) {
        super(driver);
    }
}
