package com.syed.madison_island.pages.header.women;

import com.syed.madison_island.pages.AddToCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.womenPages.WomenNewArrivalsLocators;

import static org.testng.Assert.assertEquals;

/**
 * Created by sayem on 2/4/16.
 */
public class NewArrivalsWomenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public NewArrivalsWomenPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }
    //current filter
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.FILTER_TYPE)
    WebElement filterType;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.FILTER_VALUE)
    WebElement filterValue;
    //Types of filters
    @FindBy(how = How.XPATH, using = WomenNewArrivalsLocators.LOW_PRICE_FILTER)
    WebElement lowPriceFilter;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.MEDIUM_PRICE_FILTER)
    WebElement mediumPriceFilter;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.HIGH_PRICE_FILTER)
    WebElement highPriceFilter;
    @FindBy(how = How.XPATH, using = WomenNewArrivalsLocators.BLUE)
    WebElement blue;
    @FindBy(how = How.XPATH, using = WomenNewArrivalsLocators.INDIGO)
    WebElement indigo;
    @FindBy(how = How.XPATH, using = WomenNewArrivalsLocators.WHITE)
    WebElement white;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.CASUAL)
    WebElement casual;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.EVENING)
    WebElement evening;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.KNITS)
    WebElement knits;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.DRESSES)
    WebElement dresses;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.TOPS)
    WebElement tops;
    //Items presented by low filter
    @FindBy(how = How.XPATH, using = WomenNewArrivalsLocators.TORI_TANK)
    WebElement itemByLowFilter;
    //dresses without using filters
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.TORI_TANK_NO_FILTER)
    WebElement toriTank;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.ELIZABETH_KNIT_TOP)
    WebElement elizabethKnitTop;
    @FindBy(how = How.XPATH,using = WomenNewArrivalsLocators.LAFAYATTE_DRESS)
    WebElement lafayatteDress;


    public NewArrivalsWomenPage filterByLowPrice(){
        wait.until(ExpectedConditions.elementToBeClickable(lowPriceFilter));
        lowPriceFilter.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(),"$0.00 - $99.99");
        return this;
    }
    public NewArrivalsWomenPage filterByMediumPrice(){
        wait.until(ExpectedConditions.elementToBeClickable(mediumPriceFilter));
        mediumPriceFilter.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(),"$200.00 - $299.99");
        return this;
    }
    public NewArrivalsWomenPage filterByHighPrice(){
        wait.until(ExpectedConditions.elementToBeClickable(highPriceFilter));
        highPriceFilter.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "$300.00 and above");
        return this;
    }
    public NewArrivalsWomenPage filterByColorBlue(){
        wait.until(ExpectedConditions.elementToBeClickable(blue));
        blue.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "Blue");
        return this;
    }
    public NewArrivalsWomenPage filterByColorIndigo(){
        wait.until(ExpectedConditions.elementToBeClickable(indigo));
        indigo.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "Indigo");
        return this;
    }
    public NewArrivalsWomenPage filterByColorWhite(){
        wait.until(ExpectedConditions.elementToBeClickable(white));
        white.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "White");
        return this;
    }
    public NewArrivalsWomenPage filterByOccasionCasual(){
        wait.until(ExpectedConditions.elementToBeClickable(casual));
        casual.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "Casual");
        return this;
    }
    public NewArrivalsWomenPage filterByOccasionEvening(){
        wait.until(ExpectedConditions.elementToBeClickable(evening));
        evening.click();
        wait.until(ExpectedConditions.visibilityOf(filterType));
        assertEquals(filterValue.getText(), "Evening");
        return this;
    }

    public AddToCartPage viewDetailsOfDressByLowPriceFilter(){
        wait.until(ExpectedConditions.elementToBeClickable(itemByLowFilter));
        itemByLowFilter.click();
        return PageFactory.initElements(driver,AddToCartPage.class);
    }

    public AddToCartPage selectElizabethKnitTop(){
        wait.until(ExpectedConditions.elementToBeClickable(elizabethKnitTop));
        elizabethKnitTop.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
    public AddToCartPage selectLafayetteDress(){
        wait.until(ExpectedConditions.elementToBeClickable(lafayatteDress));
        lafayatteDress.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }

}
