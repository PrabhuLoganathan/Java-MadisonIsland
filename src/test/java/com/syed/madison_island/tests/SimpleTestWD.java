package com.syed.madison_island.tests;

import com.syed.madison_island.pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by syed
 *on 2/4/16.
 */
public class SimpleTestWD {

    private WebDriver driver;
    private WebDriverWait wait;
    private LandingPage page;

    @BeforeSuite
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://demo.cart2quote.com/");
        page = PageFactory.initElements(driver,LandingPage.class);
    }

    //Tests for the pages in the women section
    @Test
    public void goToWomenPage(){
        page.goToWomenPage();
        assertEquals(driver.getTitle(), "Women");
    }
    @Test
    public void goToNewArrivalPage(){
        page.goToNewArrivalWomenPage();
        assertEquals(driver.getTitle(), "New Arrivals - Women");
    }
    @Test
    public void goToTopsAndBlousesPage(){
        page.goToTopsAndBlousesPage();
        assertEquals(driver.getTitle(),"Tops & Blouses - Women" );
    }
    @Test
    public void goToPantsAndDenimWomenPage(){
        page.goToPantsAndDenimWomenPage();
        assertEquals(driver.getTitle(), "Pants & Denim - Women");
    }
    @Test
    public void goToDressesAndSkirtsPage(){
        page.goToDressesAndSkirtsPage();
        assertEquals(driver.getTitle(), "Dresses & Skirts - Women");
    }
    //Tests for the pages in the men sections
    @Test
    public void goToMenPage(){
        page.goToMenPage();
        assertEquals(driver.getTitle(), "Men");
    }
    @Test
    public void goToNewArrivalsMenPage(){
        page.goToNewArrivalsMenPage();
        assertEquals(driver.getTitle(), "New Arrivals - Men");
    }
    @Test
    public void goToShirtsPage(){
        page.goToShirtsPage();
        assertEquals(driver.getTitle(), "Shirts - Men");
    }
    @Test
    public void gotoPantsAndDenimMenPage(){
        page.goToPantsAndDenimMenPage();
        assertEquals(driver.getTitle(), "Pants & Denim - Men");
    }
    @Test
    public void goToTeesKnitsAndPoloPage(){
        page.goToTeesKnitsAndPoloPage();
        assertEquals(driver.getTitle(), "Tees, Knits and Polos - Men");
    }

    @Test
    public void goToBlazerPage(){
        page.goToBlazerPage();
        assertEquals(driver.getTitle(), "Blazers - Men");
    }
    //Filter in Women's page
    @Test
    public void filterByLowPrice() throws InterruptedException{
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

    @AfterMethod
    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
