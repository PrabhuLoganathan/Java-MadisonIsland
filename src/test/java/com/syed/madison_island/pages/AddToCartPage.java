package com.syed.madison_island.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.AddToCartLocators;

/**
 * Created by sayem on 2/5/16.
 */
public class AddToCartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }

    @FindBy(how = How.XPATH,using = AddToCartLocators.COLOR)
    private WebElement colorDropDown;
    @FindBy(how = How.XPATH, using = AddToCartLocators.INDIGO_COLOR)
    private WebElement indigoColor;
    @FindBy(how = How.XPATH,using = AddToCartLocators.SIZE)
    private WebElement sizeDropDown;
    @FindBy(how = How.XPATH,using = AddToCartLocators.SIZE_S)
    private WebElement smallSize;
    @FindBy(how = How.XPATH,using = AddToCartLocators.SIZE_M)
    private WebElement sizeMedium;
    @FindBy(how = How.XPATH,using = AddToCartLocators.QUANTITY)
    private WebElement quantity;
    @FindBy(how = How.XPATH,using = AddToCartLocators.ADD_TO_QUOTE)
    private WebElement addToQuote;
    @FindBy(how = How.XPATH,using = AddToCartLocators.VIEW_QUOTATION)
    private WebElement viewQuotation;
    @FindBy(how = How.XPATH,using = AddToCartLocators.ADD_TO_CART)
    private WebElement addToCart;
    @FindBy(how = How.XPATH,using = AddToCartLocators.BLUE_COLOR)
    private WebElement blueColor;
    @FindBy(how = How.XPATH,using = AddToCartLocators.WHITE_COLOR)
    private WebElement whiteColor;
    @FindBy(how = How.XPATH,using = AddToCartLocators.TAUPE_COLOR)
    private WebElement taupeColor;
    @FindBy(how = How.XPATH,using = AddToCartLocators.BLACK_COLOR)
    private WebElement blackColor;

    public QuoteListPage addAQuoteOnAnItem(String numberOfItem){
        wait.until(ExpectedConditions.elementToBeClickable(colorDropDown));
        colorDropDown.click();
        indigoColor.click();
        sizeDropDown.click();
        smallSize.click();
        quantity.clear();
        quantity.sendKeys(numberOfItem);
        addToQuote.click();
        wait.until(ExpectedConditions.elementToBeClickable(viewQuotation));
        viewQuotation.click();
        return PageFactory.initElements(driver, QuoteListPage.class);
    }

    public ShoppingCartPage addElizabethKnitTopToCart(String numberOfItem){
       selectSizeColorQTYAndAddToCart(numberOfItem,indigoColor,smallSize);
        return PageFactory.initElements(driver,ShoppingCartPage.class);
    }
    public ShoppingCartPage addLafayetteDressToCart(String numberOfItem){
        selectSizeColorQTYAndAddToCart(numberOfItem,blueColor, sizeMedium);
        return PageFactory.initElements(driver, ShoppingCartPage.class);
    }
    public ShoppingCartPage addLudLowOxfordToCart(String numberOfItem){
        selectSizeColorQTYAndAddToCart(numberOfItem,whiteColor,smallSize);
        return PageFactory.initElements(driver,ShoppingCartPage.class);
    }
    public ShoppingCartPage addDelancyCardiganToCart(String numberOfItem){
        selectSizeColorQTYAndAddToCart(numberOfItem,taupeColor,smallSize);
        return PageFactory.initElements(driver, ShoppingCartPage.class);
    }
    public ShoppingCartPage addNolitaCamiTopToCart(String numberOfItem){
        selectSizeColorQTYAndAddToCart(numberOfItem, blackColor, sizeMedium);
        return PageFactory.initElements(driver,ShoppingCartPage.class);
    }

    private void selectSizeColorQTYAndAddToCart(String numberOfItem, WebElement color, WebElement size){
        wait.until(ExpectedConditions.elementToBeClickable(colorDropDown));
        colorDropDown.click();
        color.click();
        sizeDropDown.click();
        size.click();
        quantity.clear();
        quantity.sendKeys(numberOfItem);
        addToCart.click();
        wait.until(ExpectedConditions.titleIs("Shopping Cart"));
    }

}
