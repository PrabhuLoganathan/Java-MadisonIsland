package selectors;

/**
 * Created by syed on 2/10/16.
 */
public class ShoppingCartPageLocators {

    public static final String STATE = "//*[@id='region_id']";
    public static final String CITY = "//*[@id='city']";
    public static final String ZIP = "//*[@id='postcode']";
    public static final String PROCEED_TO_CHECKOUT = "//*[@class='cart-totals']/ul/li/button";
    //SHIPPING
    public static final String ESTIMATE_SHIPPING = "//*[@id='shipping-zip-form']/div/button";
    public static final String GROUND_SHIPPING = "//*[@id='s_method_ups_GND']";
    public static final String THREE_DAY_SHIPPING = "//*[@id='s_method_ups_3DS']";
    public static final String NEXT_DAY_AIR = "//*[@id='s_method_ups_1DA']";
    public static final String FREE_SHIPPING = "//*[@id='s_method_freeshipping_freeshipping']";
    public static final String FLAT_SHIPPING = "//*[@id='s_method_flatrate_flatrate']";
    public static final String UPDATE_TOTAL_AFTER_SHIPPING = "//*[@id='co-shipping-method-form']/div/button";
    //checkout
    public static final String CHECKOUT = "//*[@class='cart-totals']/ul/li/button";
}
