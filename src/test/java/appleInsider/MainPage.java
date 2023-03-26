package appleInsider;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");
    public  MainPage(String url){ // Инициализация класса открыающего ссылку или
        Selenide.open(url);
    }
    //    public void openWebSite(String url) {    // Метод открывающий ссылку
//        Selenide.open(url);
//    }

    /**
     * Выполняется поиск на сайте и нажатие Enter
     * @param searchString поисковая строка
     */
    public  SearchPage search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage(); // вызов метода search с доступом к его методам

    }
}