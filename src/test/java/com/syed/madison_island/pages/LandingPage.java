package com.syed.madison_island.pages;

import com.syed.madison_island.pages.header.men.*;
import com.syed.madison_island.pages.header.women.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.LandPageLocators;

/**
 * Created by syed on 2/4/16.
 */
public class LandingPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    //Women Section
    @FindBy(how = How.XPATH,using = LandPageLocators.WOMEN_PAGE)
    WebElement womenPageLink;
    @FindBy(how = How.XPATH,using = LandPageLocators.NEW_ARRIVAL_PAGE_WOMEN)
    WebElement newArrivalWomenPageLink;
    @FindBy(how = How.XPATH,using = LandPageLocators.TOPS_AND_BLOUSES)
    WebElement topsAndBlousesLink;
    @FindBy(how = How.XPATH,using = LandPageLocators.PANTS_AND_DENIM_WOMEN)
    WebElement pantsAndDenimWomenLink;
    @FindBy(how = How.XPATH,using = LandPageLocators.DRESSES_AND_SKIRTS)
    WebElement dressesAndSkirtsLink;

    //Men Section
    @FindBy(how = How.XPATH,using = LandPageLocators.MEN_PAGE)
    WebElement menPageLink;
    @FindBy(how = How.XPATH,using = LandPageLocators.NEW_ARRIVAL_MEN)
    WebElement menNewArrivals;
    @FindBy(how = How.XPATH, using = LandPageLocators.SHIRTS)
    WebElement shirts;
    @FindBy(how = How.XPATH,using = LandPageLocators.TEES_KNITS_POLOS)
    WebElement teesKnitsAndPolo;
    @FindBy(how = How.XPATH, using = LandPageLocators.PANTS_DENIM_MEN)
    WebElement menPantsAndDenim;
    @FindBy(how = How.XPATH, using = LandPageLocators.BLAZERS)
    WebElement blazers;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
        actions = new Actions(driver);
    }

    // Returns pages in the Women Sections
    public WomenPage goToWomenPage(){
        wait.until(ExpectedConditions.elementToBeClickable(womenPageLink));
        womenPageLink.click();
        wait.until(ExpectedConditions.titleIs("Women"));
        return PageFactory.initElements(driver,WomenPage.class);
    }

    public NewArrivalsWomenPage goToNewArrivalWomenPage(){
        wait.until(ExpectedConditions.visibilityOf(womenPageLink));
        actions.moveToElement(womenPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(newArrivalWomenPageLink));
        newArrivalWomenPageLink.click();
        wait.until(ExpectedConditions.titleIs("New Arrivals - Women"));
        return PageFactory.initElements(driver, NewArrivalsWomenPage.class);
    }

    public TopsAndBlousesPage goToTopsAndBlousesPage(){
        wait.until(ExpectedConditions.visibilityOf(womenPageLink));
        actions.moveToElement(womenPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(topsAndBlousesLink));
        topsAndBlousesLink.click();
        wait.until(ExpectedConditions.titleIs("Tops & Blouses - Women"));
        return PageFactory.initElements(driver, TopsAndBlousesPage.class);
    }

    public PantsAndDenimWomenPage goToPantsAndDenimWomenPage(){
        wait.until(ExpectedConditions.visibilityOf(womenPageLink));
        actions.moveToElement(womenPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(pantsAndDenimWomenLink));
        pantsAndDenimWomenLink.click();
        wait.until(ExpectedConditions.titleIs("Pants & Denim - Women"));
        return PageFactory.initElements(driver, PantsAndDenimWomenPage.class);
    }

    public DressesAndSkirtsPage goToDressesAndSkirtsPage(){
        wait.until(ExpectedConditions.visibilityOf(womenPageLink));
        actions.moveToElement(womenPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dressesAndSkirtsLink));
        dressesAndSkirtsLink.click();
        wait.until(ExpectedConditions.titleIs("Dresses & Skirts - Women"));
        return PageFactory.initElements(driver, DressesAndSkirtsPage.class);
    }

    // Returns Pages in the Men Sections
    public MenPage goToMenPage(){
        wait.until(ExpectedConditions.elementToBeClickable(menPageLink));
        menPageLink.click();
        wait.until(ExpectedConditions.titleIs("Men"));
        return PageFactory.initElements(driver, MenPage.class);
    }

    public NewArrivalsMenPage goToNewArrivalsMenPage(){
        wait.until(ExpectedConditions.visibilityOf(menPageLink));
        actions.moveToElement(menPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(menNewArrivals));
        menNewArrivals.click();
        wait.until(ExpectedConditions.titleIs("New Arrivals - Men"));
        return PageFactory.initElements(driver, NewArrivalsMenPage.class);
    }

    public ShirtsPage goToShirtsPage(){
        wait.until(ExpectedConditions.visibilityOf(menPageLink));
        actions.moveToElement(menPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(shirts));
        shirts.click();
        wait.until(ExpectedConditions.titleIs("Shirts - Men"));
        return PageFactory.initElements(driver, ShirtsPage.class);
    }

    public PantsAndDenimMenPage goToPantsAndDenimMenPage(){
        wait.until(ExpectedConditions.visibilityOf(menPageLink));
        actions.moveToElement(menPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(menPantsAndDenim));
        menPantsAndDenim.click();
        wait.until(ExpectedConditions.titleIs("Pants & Denim - Men"));
        return PageFactory.initElements(driver, PantsAndDenimMenPage.class);
    }

    public TeesKnitsAndPoloPage goToTeesKnitsAndPoloPage(){
        wait.until(ExpectedConditions.visibilityOf(menPageLink));
        actions.moveToElement(menPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(teesKnitsAndPolo));
        teesKnitsAndPolo.click();
        wait.until(ExpectedConditions.titleIs("Tees, Knits and Polos - Men"));
        return PageFactory.initElements(driver, TeesKnitsAndPoloPage.class);
    }

    public BlazerPage goToBlazerPage(){
        wait.until(ExpectedConditions.visibilityOf(menPageLink));
        actions.moveToElement(menPageLink).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(blazers));
        blazers.click();
        wait.until(ExpectedConditions.titleIs("Blazers - Men"));
        return PageFactory.initElements(driver, BlazerPage.class);
    }
}
