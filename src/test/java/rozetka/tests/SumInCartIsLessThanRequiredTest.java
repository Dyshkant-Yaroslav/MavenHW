package rozetka.tests;

import business.BuyTheMostExpensiveProduct;
import business.FindProductsByTypeAndBrand;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumInCartIsLessThanRequiredTest extends BaseTest {


    @Test(dataProvider = "getFilterData")
    public void checkIfSumInCartIsLessThanRequired(String type, String brand, int bounds)
            throws InterruptedException {

        FindProductsByTypeAndBrand findProductsByTypeAndBrand = new FindProductsByTypeAndBrand();
        BuyTheMostExpensiveProduct buyTheMostExpensiveProduct = new BuyTheMostExpensiveProduct();

        findProductsByTypeAndBrand.findProductsByTypeAndBrand(type, brand);
        buyTheMostExpensiveProduct.buyTheMostExpensiveProduct();

        Assert.assertFalse(findProductsByTypeAndBrand.getHomePage().getSumOfProductsInCart() >= bounds
                || findProductsByTypeAndBrand.getHomePage().getSumOfProductsInCart() == 0);

    }

}