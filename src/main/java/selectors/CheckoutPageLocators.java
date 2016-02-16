package selectors;

/**
 * Created by sayem on 2/15/16.
 */
public class CheckoutPageLocators {

    public static final String GUEST_CHECKOUT  = "//*[@id='login:guest']";
    public static final String REGISTER = "//*[@id='login:register']";
    public static final String CONTINUE = "//*[@id='onepage-guest-register-button']";

    //sign in
    public static final String EMAIL = "//*[@id='login-email']";
    public static final String PASSWORD = "//*[@id='login-password']";
    public static final String LOGIN = "//*[@class='col-2']/div/button";

    //buyers info
    public static final String FIRST_NAME = "//*[@id='billing:firstname']";
    public static final String LAST_NAME = "//*[@id='billing:lastname']";
    public static final String EMAIL_BILLING = "//*[@id='billing:email']";
    public static final String ADDRESS = "//*[@id='billing:street1']";
    public static final String CITY = "//*[@id='billing:city']";
    public static final String STATE = "//*[@id='billing:region_id']";
    public static final String PHONE = "//*[@id='billing:telephone']";
    public static final String ZIP = "//*[@id='billing:postcode']";
    public static final String CONTINUE_BILLING = "//*[@id='billing-buttons-container']/button";

    //shipping
    public static final String GROUND_SHIPPING = "//*[@id='s_method_ups_GND']";
    public static final String THREE_DAY_SHIPPING = "//*[@id='s_method_ups_3DS']";
    public static final String NEXT_DAY_SHIPPING = "//*[@id='s_method_ups_1DA']";
    public static final String FREE_SHIPPING = "//*[@id='s_method_freeshipping_freeshipping']";
    public static final String FLAT_SHIPPING = "//*[@id='s_method_flatrate_flatrate']";
    public static final String CONTINUE_SHIPPING = "//*[@id='shipping-method-buttons-container']/button";

    //payment
    public static final String CASH = "//*[@id='p_method_cashondelivery']";
    public static final String BANK_TRANSFER = "//*[@id='p_method_banktransfer']";
    public static final String PURCHASE_ORDER = "//*[@id='p_method_purchaseorder']";
    public static final String CHECK_OR_MONEY_ORDER = "//*[@id='p_method_checkmo']";
    public static final String CREDIT_CARD = "//*[@id='p_method_ccsave']";
    public static final String CONTINUE_PAYMENT = "//*[@id='payment-buttons-container']/button";

    public static final String SHIP_TO_BILLING_ADDRESS = "//*[@id='billing:use_for_shipping_yes']";

    public static final String PLACE_ORDER = "//*[@id='review-buttons-container']/button";

    //register
    public static final String PASSWORD_REGISTER = "//*[@id='billing:customer_password']";
    public static final String PASSWORD_CONFIRM = "//*[@id='billing:confirm_password']";
    public static final String ORDER_CONFIRMATION_TITLE = "//*[@class='page-title']/h1";

}
