package com.syed.madison_island.pages.header.men;

import com.syed.madison_island.pages.AddToCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.menPages.BlazerLocators;

/**
 * Created by syed on 2/5/16.
 */
public class BlazerPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BlazerPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }

    @FindBy(how = How.XPATH,using = BlazerLocators.SULLIVAN_COAT)
    WebElement sullivanCoat;
    @FindBy(how = How.XPATH,using = BlazerLocators.LINEN_BLAZER)
    WebElement linenBlazer;
    @FindBy(how = How.XPATH,using = BlazerLocators.STRETCH_COTTON_BLAZER)
    WebElement stretchCottonBlazer;

    public AddToCartPage selectSullivanSportCoat(){
        wait.until(ExpectedConditions.elementToBeClickable(sullivanCoat));
        sullivanCoat.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
    public AddToCartPage selectLinenBlazer(){
        wait.until(ExpectedConditions.elementToBeClickable(linenBlazer));
        linenBlazer.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
    public AddToCartPage selectStretchCottonBlazer(){
        wait.until(ExpectedConditions.elementToBeClickable(stretchCottonBlazer));
        stretchCottonBlazer.click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }

}
