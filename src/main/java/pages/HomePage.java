package pages;

import elements.Div;
import elements.Input;
import elements.Li;
import elements.Span;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//input[@class='search-form__input ng-untouched ng-pristine ng-valid']")
    private Input searchInput;

    @FindBy(xpath = "//li[@class='header-actions__item header-actions__item--cart']")
    private Li productCart;

    @FindBy(xpath = "//div[@class='modal__holder modal__holder_show_animation modal__holder--large']")
    private Div cartDiv;

    @FindBy(xpath = "//div[@class='cart-receipt ng-star-inserted']//div[@class='cart-receipt__sum-price']//span[1]")
    private Span spanWithSumInCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnCart() {
        productCart.click();
    }

    public Div getCartDiv() {
        return cartDiv;
    }

    public int getSumOfProductsInCart() {
        return Integer.parseInt(spanWithSumInCart.getText());
    }
}