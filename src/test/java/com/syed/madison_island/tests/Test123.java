package com.syed.madison_island.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selectors.LandPageLocators;
import selectors.womenPages.WomenNewArrivalsLocators;

/**
 * Created by sayem on 2/10/16.
 */
public class Test123 {

    @Test
    public void sampleTest(){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,10,100);
        Actions actions = new Actions(driver);
        driver.get("http://demo.cart2quote.com/");
        WebElement womenPage = driver.findElement(By.xpath(LandPageLocators.WOMEN_PAGE));
        wait.until(ExpectedConditions.visibilityOf(womenPage));
        actions.moveToElement(womenPage).build().perform();
        WebElement newArrivals = driver.findElement(By.xpath(LandPageLocators.NEW_ARRIVAL_PAGE_WOMEN));
        wait.until(ExpectedConditions.elementToBeClickable(newArrivals));
        newArrivals.click();
        wait.until(ExpectedConditions.titleIs("New Arrivals - Women"));
        WebElement dress = driver.findElement(By.xpath(WomenNewArrivalsLocators.TORI_TANK));
        wait.until(ExpectedConditions.elementToBeClickable(dress));
        System.out.println(dress.getText());
        dress.click();


    }
}
