package com.syed.madison_island.tests;

import com.syed.madison_island.pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by sayem on 2/17/16.
 */
public class TestMenSectionWD {

    private WebDriver driver;
    private LandingPage page;

    @BeforeSuite
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://demo.cart2quote.com/");
        page = PageFactory.initElements(driver,LandingPage.class);
    }
    @Test
    public void checkoutWithSullivanCoat(){
        page.goToBlazerPage()
                .selectSullivanSportCoat()
                .addSullivanCoatToCart("2")
                .checkoutSullivanCoat()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }

    @Test
    public void checkoutWithLinenBlazer(){
        page.goToBlazerPage()
                .selectLinenBlazer()
                .addLinenBlazerToCart("1")
                .checkoutLinenBlazer()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }

    @Test
    public void checkoutWithStretchCottonBlazer(){
        page.goToBlazerPage()
                .selectStretchCottonBlazer()
                .addStretchCottonBlazerToCart("3")
                .checkoutStretchCottonBlazer()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }

    @AfterMethod
    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
