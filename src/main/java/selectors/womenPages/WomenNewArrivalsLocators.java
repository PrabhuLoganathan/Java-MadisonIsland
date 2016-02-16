package selectors.womenPages;

/**
 * Created by sayem on 2/5/16.
 */
public class WomenNewArrivalsLocators {
    // Filter by price xpath
    public static final String LOW_PRICE_FILTER = "//*[@id='narrow-by-list']/dd[1]/ol/li[1]/a";
    public static final String MEDIUM_PRICE_FILTER = "//*[@id='narrow-by-list']/dd[1]/ol/li[2]/a";
    public static final String HIGH_PRICE_FILTER = "//*[@id='narrow-by-list']/dd[1]/ol/li[3]/a";

    //Filter by color xpath
    public static final String BLUE = "//*[@id='narrow-by-list']/dd[2]/ol/li[1]/a";
    public static final String INDIGO = "//*[@id='narrow-by-list']/dd[2]/ol/li[2]/a";
    public static final String WHITE = "//*[@id='narrow-by-list']/dd[2]/ol/li[3]/a";

    //FILTER BY OCCASION
    public static final String CASUAL = "//*[@id='narrow-by-list']/dd[3]/ol/li[1]/a";
    public static final String EVENING = "//*[@id='narrow-by-list']/dd[3]/ol/li[2]/a";

    //Filter by Type
    public static final String DRESSES = "//*[@id='narrow-by-list']/dd[4]/ol/li[1]/a";
    public static final String KNITS = "//*[@id='narrow-by-list']/dd[4]/ol/li[2]/a";
    public static final String TOPS = "//*[@id='narrow-by-list']/dd[4]/ol/li[3]/a";

    //Filter by Size
    public static final String XS = "//*[@id='narrow-by-list']/dd[6]/ol/li[1]/a";
    public static final String SIZE_TWO = "//*[@id='narrow-by-list']/dd[6]/ol/li[2]/a";
    public static final String S = "//*[@id='narrow-by-list']/dd[6]/ol/li[3]/a";
    public static final String M = "//*[@id='narrow-by-list']/dd[6]/ol/li[4]/a";
    public static final String SIZE_FOUR = "//*[@id='narrow-by-list']/dd[6]/ol/li[5]/a";
    public static final String L = "//*[@id='narrow-by-list']/dd[6]/ol/li[6]/a";
    public static final String XL = "//*[@id='narrow-by-list']/dd[6]/ol/li[7]/a";
    public static final String SIZE_SIX = "//*[@id='narrow-by-list']/dd[6]/ol/li[8]/a";
    public static final String SIZE_EIGHT = "//*[@id='narrow-by-list']/dd[6]/ol/li[9]/a";
    public static final String SIZE_TEN = "//*[@id='narrow-by-list']/dd[6]/ol/li[10]/a";

    //Current Filters
    public static final String FILTER_TYPE = "//div[@class='currently']/ol/li/span[1]";
    public static final String FILTER_VALUE = "//div[@class='currently']/ol/li/span[2]";

    //Items to view by Low price filter
    public static final String TORI_TANK = "//*[@class='product-name']/a";

    //Items without Filters
    public static final String TORI_TANK_NO_FILTER = "//*[@class='category-products']/ul/li[1]/div/h2/a";
    public static final String ELIZABETH_KNIT_TOP = "//*[@class='category-products']/ul/li[2]/div/h2/a";
    public static final String LAFAYATTE_DRESS = "//*[@class='category-products']/ul/li[3]/div/h2/a";




}
