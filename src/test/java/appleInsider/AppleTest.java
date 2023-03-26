package appleInsider;
import org.junit.jupiter.api.Test;
import  org.junit.Assert;
public class AppleTest extends BaseSelenideTest {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12"; //
    private final static String EXPECTED_WORD = "iphone-12";
    @Test
    public void checkHref(){

        Assert.assertTrue(new appleInsider.MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }
}
