package ort.pageobject.moduls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BaseModule {

    protected WebDriver driver;
    protected String url;
    public final static String BLANK_PAGE = "about:blank";

    public BaseModule(WebDriver driver) {
    }

    public void baseModule(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    public void loadPage() {
        driver.get(BLANK_PAGE);
        driver.get(url);
    }

    public WebElement findElement(String xPath) {
       return driver.findElement(By.xpath(xPath));
    }

    public List<WebElement> findElements(String xpath) {
        List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(xpath));
        return elements;
    }

    public void putValue(String xPath, String product){
        WebElement findProduct= findElement(xPath);
        findProduct.sendKeys(product);
        findProduct.sendKeys(Keys.ENTER);
    }

    public WebElement waitForElement(By selector) {
        return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    public List<WebElement> waitForElements(By selector) {
        return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(selector));
    }

    public void clickElement(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(selector)).click();
    }


}
