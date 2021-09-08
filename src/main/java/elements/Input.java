package elements;

import org.openqa.selenium.WebElement;

public class Input extends AbstractElement {

    public Input(WebElement element) {
        super(element);
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.clear();
        System.out.println("Input field is clean)");
        element.sendKeys(charSequences);
    }

}