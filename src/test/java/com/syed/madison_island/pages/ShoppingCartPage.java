package com.syed.madison_island.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.ShoppingCartPageLocators;

/**
 * Created by syed on 2/10/16.
 */
public class ShoppingCartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10,100);
    }

    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.CHECKOUT)
    WebElement checkoutButton;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.CITY)
    WebElement city;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.ESTIMATE_SHIPPING)
    WebElement estimateShipping;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.FLAT_SHIPPING)
    WebElement flatShipping;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.STATE)
    WebElement state;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.ZIP)
    WebElement zip;
    @FindBy(how = How.XPATH,using = ShoppingCartPageLocators.UPDATE_TOTAL_AFTER_SHIPPING)
    WebElement updateShipping;

    //Checkout with items from women new arrivals
    public CheckoutPage checkoutElizabethKnitTop(){
        setEstimateShipping("New York", "Bronx", "10460", flatShipping);
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    public CheckoutPage checkoutLafayetteDress(){
        setEstimateShipping("Florida", "Miami", "34323", flatShipping);
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    //checkout with items from women Tops and Blouses
    public CheckoutPage checkoutLudlowOxford(){
        proceedToCheckoutWithoutEstimatingShipping("New York","NYC","10013");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    public CheckoutPage checkoutDelancyCardigan(){
        proceedToCheckoutWithoutEstimatingShipping("Arizona", "Phoenix", "23432");
        return PageFactory.initElements(driver,CheckoutPage.class);
    }
    public CheckoutPage checkoutNolitaCamiTop(){
        proceedToCheckoutWithoutEstimatingShipping("Georgia", "Atlanta", "95647");
        return PageFactory.initElements(driver,CheckoutPage.class);
    }
    //checkout with items from women Dresses and SKirts
    public CheckoutPage checkoutEssexPencilSkirt(){
        proceedToCheckoutWithoutEstimatingShipping("North Carolina", "Charleston", "46584");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    public CheckoutPage checkoutRacerBackMaxiDress(){
        proceedToCheckoutWithoutEstimatingShipping("New Jersey", "Newark", "65487");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    public CheckoutPage checkoutLudlowSheathDress(){
        proceedToCheckoutWithoutEstimatingShipping("New Mexico", "Albaquarqe", "87789");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }

    //Checkout with items from MEN Blazers
    public CheckoutPage checkoutSullivanCoat(){
        proceedToCheckoutWithoutEstimatingShipping("California", "LA", "90210");
        return PageFactory.initElements(driver,CheckoutPage.class);
    }
    public CheckoutPage checkoutLinenBlazer(){
        proceedToCheckoutWithoutEstimatingShipping("California", "San Francisco", "95461");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }
    public CheckoutPage checkoutStretchCottonBlazer(){
        proceedToCheckoutWithoutEstimatingShipping("California", "San Diego", "95642");
        return PageFactory.initElements(driver, CheckoutPage.class);
    }

    private void setEstimateShipping(String whichState, String whichCity, String whichZip, WebElement typeOfShipping){
        wait.until(ExpectedConditions.elementToBeClickable(state));
        Select select = new Select(state);
        select.selectByVisibleText(whichState);
        city.clear();
        city.sendKeys(whichCity);
        zip.clear();
        zip.sendKeys(whichZip);
        estimateShipping.click();
        wait.until(ExpectedConditions.elementToBeClickable(typeOfShipping));
        typeOfShipping.click();
        updateShipping.click();
        checkoutButton.click();
        wait.until(ExpectedConditions.titleIs("Checkout"));
    }
    private void proceedToCheckoutWithoutEstimatingShipping(String whichState, String whichCity, String whichZip){
        wait.until(ExpectedConditions.elementToBeClickable(state));
        Select select = new Select(state);
        select.selectByVisibleText(whichState);
        city.clear();
        city.sendKeys(whichCity);
        zip.clear();
        zip.sendKeys(whichZip);
        checkoutButton.click();
        wait.until(ExpectedConditions.titleIs("Checkout"));
    }

}
