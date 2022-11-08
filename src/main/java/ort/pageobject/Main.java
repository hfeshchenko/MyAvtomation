package ort.pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ort.pageobject.moduls.BaseModule;
import ort.pageobject.moduls.ProductModule;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ProductModule productModule=new ProductModule(driver);
        driver.get("about:blank");
        driver.get("https://rozetka.com.ua/");
        WebElement findfield = driver.findElement(By.xpath("//input[@name='search']"));
        findfield.sendKeys("Стиральная машинка");

        WebElement findFieldButton = driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));
        findFieldButton.click();
        Thread.sleep(5000);
        WebElement basketProduct = driver.findElement(By.xpath("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']"));

        Thread.sleep(5000);
        basketProduct.click();

        WebElement basketLeft = driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']"));
        Thread.sleep(5000);
        basketLeft.click();
        WebElement productBuy=driver.findElement(By.xpath("//*[@class='cart-product__main']"));
        String ValueMachine=productBuy.getAttribute(driver.getTitle());

        int n=1;







    }


}

