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
 * Created by syed
 *on 2/4/16.
 */
public class TestWomenSectionWD {

    private WebDriver driver;
    private LandingPage page;

    @BeforeSuite
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://demo.cart2quote.com/");
        page = PageFactory.initElements(driver,LandingPage.class);
    }

    //Women new arrivals test by checkout with each items
    @Test
    public void checkoutWithElizabethKnitTop(){
        page.goToNewArrivalWomenPage()
                .selectElizabethKnitTop()
                .addElizabethKnitTopToCart("4")
                .checkoutElizabethKnitTop()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }
    @Test
    public void checkoutWithLafayetteDress(){
        page.goToNewArrivalWomenPage()
                .selectLafayetteDress()
                .addLafayetteDressToCart("2")
                .checkoutLafayetteDress()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }
    // Women tops and blouses page item test by checking out with each item in this page

    @Test
    public void checkoutWithLudlowOxfordTop(){
        page.goToTopsAndBlousesPage()
                .selectLudlowOxford()
                .addLudLowOxfordToCart("2")
                .checkoutLudlowOxford()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }
    @Test
    public void checkoutWithDelancyCardigan(){
        page.goToTopsAndBlousesPage()
                .selectDelancyCardigan()
                .addDelancyCardiganToCart("3")
                .checkoutDelancyCardigan()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }
    @Test
    public void checkoutWithNolitaCamiTop(){
        page.goToTopsAndBlousesPage()
                .selectNolitaCamiTop()
                .addNolitaCamiTopToCart("1")
                .checkoutNolitaCamiTop()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }

    // Women Dresses and Skirts

    @Test
    public void checkoutWithEssexPencilDress(){
        page.goToDressesAndSkirtsPage()
                .selectEssexPencilSkirt()
                .addEssexPencilSkirtToCart("2")
                .checkoutEssexPencilSkirt()
                .checkoutByRegisteringAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }

    @Test
    public void checkoutWithRacerBackMaxiDress(){
        page.goToDressesAndSkirtsPage()
                .selectRacerBackMaxiDress()
                .addRacerBackMaxiDressToCart("1")
                .checkoutRacerBackMaxiDress()
                .checkoutAsGuestAndPlaceOrder()
                .confirmOrderHasBeenSent();
    }
    @Test
    public void checkoutWithLudlowSheathDress(){
        page.goToDressesAndSkirtsPage()
                .selectLudlowSheathDress()
                .addLudlowSheathDressToCart("2")
                .checkoutLudlowSheathDress()
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
