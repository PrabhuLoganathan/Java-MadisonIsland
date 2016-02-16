package com.syed.madison_island.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.CheckoutPageLocators;

import static org.testng.Assert.assertEquals;

/**
 * Created by syed on 2/5/16.
 */
public class CheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }

    @FindBy(how = How.XPATH,using = CheckoutPageLocators.GUEST_CHECKOUT)
    WebElement guestCheckout;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CONTINUE)
    WebElement continueCheckout;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.FIRST_NAME)
    WebElement firstName;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.LAST_NAME)
    WebElement lastName;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.EMAIL_BILLING)
    WebElement emailBilling;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.ADDRESS)
    WebElement address;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CITY)
    WebElement city;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.STATE)
    WebElement state;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.PHONE)
    WebElement phone;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.SHIP_TO_BILLING_ADDRESS)
    WebElement shipToBillingAddress;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.ZIP)
    WebElement zip;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CONTINUE_BILLING)
    WebElement continueBilling;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.FREE_SHIPPING)
    WebElement freeShipping;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CONTINUE_SHIPPING)
    WebElement continueShipping;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CASH)
    WebElement cash;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.CONTINUE_PAYMENT)
    WebElement continuePayment;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.PLACE_ORDER)
    WebElement placeOrder;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.REGISTER)
    WebElement register;
    @FindBy(how = How.XPATH,using = CheckoutPageLocators.ORDER_CONFIRMATION_TITLE)
    WebElement orderConfirmationPageTitle;

    public CheckoutPage checkoutAsGuestAndPlaceOrder(){
        checkoutGuestSameBillingAndShippingAddress("Syed", "Selenium", "Syed@Selenium.com", "921 Third Ave",
                "NYC","New York", "10013","3478889999",freeShipping,cash);
        return this;
    }
    public CheckoutPage confirmOrderHasBeenSent(){
        wait.until(ExpectedConditions.visibilityOf(orderConfirmationPageTitle));
        assertEquals(orderConfirmationPageTitle.getText().toLowerCase(), "your order has been received.");
        return this;
    }

    private void checkoutGuestSameBillingAndShippingAddress(String fName, String lName, String guestEmail, String guestAddress,
                               String guestCity, String guestState, String guestZip, String guestPhone, WebElement typeOfShipping,
                               WebElement typeOfPayment){
        wait.until(ExpectedConditions.elementToBeClickable(guestCheckout));
        if (!guestCheckout.isSelected()){
            guestCheckout.click();
        }
        continueCheckout.click();
        wait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        wait.until(ExpectedConditions.visibilityOf(emailBilling));
        emailBilling.clear();
        emailBilling.sendKeys(guestEmail);
        address.clear();
        address.sendKeys(guestAddress);
        city.clear();
        city.sendKeys(guestCity);
        Select select = new Select(state);
        select.selectByVisibleText(guestState);
        zip.clear();
        zip.sendKeys(guestZip);
        phone.clear();
        phone.sendKeys(guestPhone);
        continueBilling.click();
        if (!shipToBillingAddress.isSelected()){
            shipToBillingAddress.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(typeOfShipping));
        if (!typeOfShipping.isSelected()){
            typeOfShipping.click();
        }
        continueShipping.click();
        wait.until(ExpectedConditions.elementToBeClickable(typeOfPayment));
        if (!typeOfPayment.isSelected()){
            typeOfPayment.click();
        }
        continuePayment.click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrder));
        placeOrder.click();
        wait.until(ExpectedConditions.titleIs("Magento Commerce"));
        assertEquals(driver.getTitle(), "Magento Commerce");
    }
    private void registerAndCheckoutSameBillingAndShippingAddress(String fName, String lName, String registerEmail,
                                     String registerAddress, String registerCity,
                                     String registerState, String registerZip, String registerPhone,
                                     WebElement typeOfShipping, WebElement typeOfPayment){

        wait.until(ExpectedConditions.elementToBeClickable(register));
        if (!register.isSelected()){
            register.click();
        }
        continueCheckout.click();
        wait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        wait.until(ExpectedConditions.visibilityOf(emailBilling));
        emailBilling.clear();
        emailBilling.sendKeys(registerEmail);
        address.clear();
        address.sendKeys(registerAddress);
        city.clear();
        city.sendKeys(registerCity);
        Select select = new Select(state);
        select.selectByVisibleText(registerState);
        zip.clear();
        zip.sendKeys(registerZip);
        phone.clear();
        phone.sendKeys(registerPhone);
        continueBilling.click();
        if (!shipToBillingAddress.isSelected()){
            shipToBillingAddress.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(typeOfShipping));
        if (!typeOfShipping.isSelected()){
            typeOfShipping.click();
        }
        continueShipping.click();
        wait.until(ExpectedConditions.elementToBeClickable(typeOfPayment));
        if (!typeOfPayment.isSelected()){
            typeOfPayment.click();
        }
        continuePayment.click();
    }


}
