package com.syed.madison_island.pages.header.women;

import com.syed.madison_island.pages.AddToCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.womenPages.TopsAndBlousesPageLocator;

/**
 * Created by syed on 2/4/16.
 */
public class TopsAndBlousesPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public TopsAndBlousesPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15, 100);
    }

    @FindBy(how = How.XPATH,using = TopsAndBlousesPageLocator.BLACK_NOLITA_CAMI)
    WebElement blackNolitaCamiTop;
    @FindBy(how = How.XPATH,using = TopsAndBlousesPageLocator.NOLITA_CAMI)
    WebElement nolitaCamiTop;
    @FindBy(how = How.XPATH,using = TopsAndBlousesPageLocator.DELANCY_CARDIGAN)
    WebElement delancyCardigan;
    @FindBy(how = How.XPATH,using = TopsAndBlousesPageLocator.LUDLOW_OXFORD)
    WebElement ludlowOxford;

    public AddToCartPage selectBlackNolitaCamiTop(){
        wait.until(ExpectedConditions.elementToBeClickable(blackNolitaCamiTop));
        blackNolitaCamiTop.click();
        return PageFactory.initElements(driver,AddToCartPage.class);
    }
    public AddToCartPage selectNolitaCamiTop(){
        wait.until(ExpectedConditions.elementToBeClickable(nolitaCamiTop));
        nolitaCamiTop.click();
        return PageFactory.initElements(driver,AddToCartPage.class);
    }
    public AddToCartPage selectDelancyCardigan(){
        wait.until(ExpectedConditions.elementToBeClickable(delancyCardigan));
        delancyCardigan.click();
        return PageFactory.initElements(driver,AddToCartPage.class);
    }
    public AddToCartPage selectLudlowOxford(){
        wait.until(ExpectedConditions.elementToBeClickable(ludlowOxford));
        ludlowOxford.click();
        return PageFactory.initElements(driver,AddToCartPage.class);
    }

}
