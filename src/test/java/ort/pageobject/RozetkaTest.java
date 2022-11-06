package ort.pageobject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ort.pageobject.moduls.FindFieldModule;

public class RozetkaTest extends BaseTest {
    public final static String BLANK_PAGE = "about:blank";
    final static String xpathFindFieldModule = "//input[@name='search']";
    final static String xpathFindButton = "//button[@class='header__button ng-tns-c94-1']";

    public final static String url = "https://rozetka.com.ua/";
    @BeforeEach
    public void preTest() {
        loadRozetkaPage();
    }

    @AfterEach
    public void postTest() {
        System.out.println("Washmachine is present");
    }

    public void loadRozetkaPage(){
        driver.get(BLANK_PAGE);
        driver.get(url);
    }
    @Test
    public void test(){
        RozetkaPage rozetkaPage=new RozetkaPage(driver);
        rozetkaPage.buyProduct();

    }

    @Test
    public void putValueTest(){
        FindFieldModule findFieldModule=new FindFieldModule(driver);
        findFieldModule.putValue(xpathFindFieldModule,"стиральнгая машина");

    }


}
