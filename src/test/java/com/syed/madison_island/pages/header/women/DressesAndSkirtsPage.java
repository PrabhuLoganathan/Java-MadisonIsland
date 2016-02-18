package com.syed.madison_island.pages.header.women;

import com.syed.madison_island.pages.AddToCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.womenPages.DressesAndSkirtLocators;

/**
 * Created by syed on 2/4/16.
 */
public class DressesAndSkirtsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public DressesAndSkirtsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }

    @FindBy(how = How.XPATH,using = DressesAndSkirtLocators.ESSEX_PENCIL_SKIRT)
    WebElement essexPencilSkirt;
    @FindBy(how = How.XPATH,using = DressesAndSkirtLocators.LUDLOW_SHEATH_DRESS)
    WebElement ludlowSheathDress;
    @FindBy(how = How.XPATH,using = DressesAndSkirtLocators.RACER_BACK_MAXI_DRESS)
    WebElement racerBackMaxiDress;

    public AddToCartPage selectEssexPencilSkirt(){
        wait.until(ExpectedConditions.elementToBeClickable(essexPencilSkirt));
        essexPencilSkirt.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
    public AddToCartPage selectLudlowSheathDress(){
        wait.until(ExpectedConditions.elementToBeClickable(ludlowSheathDress));
        ludlowSheathDress.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
    public AddToCartPage selectRacerBackMaxiDress(){
        wait.until(ExpectedConditions.elementToBeClickable(racerBackMaxiDress));
        racerBackMaxiDress.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
}
