package ort.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ort.pageobject.moduls.BurgerModule;
import ort.pageobject.moduls.BuyModule;
import ort.pageobject.moduls.FindFieldModule;
import ort.pageobject.moduls.ProductModule;

public class RozetkaPage {


         final static String xpathBurgerModule = "//button[@class='header__button ng-tns-c94-1']";
         final static String xpathBuyModule = "//*[@href='#icon-header-basket']";
         final static String xpathFindFieldModule = "//input[@name='search']";
         final static String xpathFindButton = "//button[@class='header__button ng-tns-c94-1']";


        private BurgerModule burgerModule;
        private BuyModule buyModule;
        private FindFieldModule findFieldModule;
        private ProductModule productModule;
        private final static String product = "Стиральная машина";
        private final static String basketProduct = "//button[@class='buy-button goods-tile__buy-button ng-star-inserted buy-button_state_in-cart";


    public RozetkaPage(WebDriver driver) {
            this.burgerModule = burgerModule;
            this.buyModule = buyModule;
            this.findFieldModule = findFieldModule;
            this.productModule = productModule;
        }

        public void buyProduct () {
            findFieldModule.putValue(xpathFindFieldModule, product);
            findFieldModule.findElement(xpathFindButton).click();
            productModule.clickElement(By.xpath(basketProduct));


        }

    }
