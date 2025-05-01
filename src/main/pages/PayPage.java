package main.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;
import static org.junit.Assert.assertEquals;

public class PayPage {
    private WebDriver driver;
    String name,name2,name3,name4,name5,name6;
    String price,price2,price3,price4,price5,price6;





    // Localizadores
    private By addProduct = By.id("add-to-cart-sauce-labs-backpack");
    private By addProduct2 = By.id("add-to-cart-sauce-labs-bike-light");
    private By addProduct3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addProduct4 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By addProduct5 = By.id("add-to-cart-sauce-labs-onesie");
    private By addProduct6 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    private By cartButton = By.id("shopping_cart_container");

    private By nameProduct = By.id("item_4_title_link");
    private By nameProduct2 = By.id("item_0_title_link");
    private By nameProduct3 = By.id("item_1_title_link");
    private By nameProduct4 = By.id("item_5_title_link");
    private By nameProduct5 = By.id("item_2_title_link");
    private By nameProduct6 = By.id("item_3_title_link");

    private By priceProduct = By.xpath("//div[@class='inventory_item_price']");
    private By priceProduct2 = By.xpath("(//div[@class='inventory_item_price'])[2]");
    private By priceProduct3 = By.xpath("(//div[@class='inventory_item_price'])[3]");
    private By priceProduct4 = By.xpath("(//div[@class='inventory_item_price'])[4]");
    private By priceProduct5 = By.xpath("(//div[@class='inventory_item_price'])[5]");
    private By priceProduct6 = By.xpath("(//div[@class='inventory_item_price'])[6]");

    private By checkoutButton = By.id("checkout");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalField = By.id("postal-code");
    private By continueButton = By.id("continue");

    private By finishButton = By.id("finish");
    private By msnFinish = By.xpath("//h2[@data-test='complete-header']");

    // Constructor
    public PayPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de interacción
    public void addProduct() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
    }

    public void addProducts(int numbProducts) {
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            if(numbProducts==2){
                webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
                webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct2)).click();
            }else if(numbProducts==3){
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct2)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct3)).click();
            }else if(numbProducts==4){
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct2)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct3)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct4)).click();
            }else if(numbProducts==5){
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct2)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct3)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct4)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct5)).click();
            }else if(numbProducts==6){
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct2)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct3)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct4)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct5)).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(addProduct6)).click();
        }

    }


    public void clickShopingCart() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
    }

    public void getTextNamePrice() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
        price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }

    public void getTextNamePrices(int numbProducts) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if(numbProducts==2){
            name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
            price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
            name2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText();
            price2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText();
        }else if(numbProducts==3){
            name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
            price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
            name2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText();
            price2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText();
            name3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText();
            price3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText();
        }else if(numbProducts==4){
            name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
            price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
            name2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText();
            price2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText();
            name3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText();
            price3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText();
            name4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText();
            price4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText();
        }else if(numbProducts==5){
            name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
            price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
            name2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText();
            price2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText();
            name3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText();
            price3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText();
            name4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText();
            price4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText();
            name5 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct5)).getText();
            price5 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct5)).getText();
        }else if(numbProducts==6){
            name = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
            price = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
            name2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText();
            price2 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText();
            name3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText();
            price3 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText();
            name4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText();
            price4 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText();
            name5 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct5)).getText();
            price5 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct5)).getText();
            name6 = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct6)).getText();
            price6 = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct6)).getText();
        }

        webDriverWait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }



    public void insertDate(String name, String lastName, String postal) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(firstNameField)).sendKeys(name);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(lastNameField)).sendKeys(lastName);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(postalField)).sendKeys(postal);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public void validateProduct() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String valName = webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText();
        String valPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText();
        assertEquals(name, valName);
        assertEquals(price, valPrice);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
    }

    public void validateProducts(int numbProducts) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        if(numbProducts==2){
            assertEquals(name, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText());
            assertEquals(price, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText());
            assertEquals(name2, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText());
            assertEquals(price2, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText());
        }else if(numbProducts==3){
            assertEquals(name, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText());
            assertEquals(price, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText());
            assertEquals(name2, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText());
            assertEquals(price2, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText());
            assertEquals(name3, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText());
            assertEquals(price3, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText());
        }else if(numbProducts==4){
            assertEquals(name, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText());
            assertEquals(price, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText());
            assertEquals(name2, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText());
            assertEquals(price2, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText());
            assertEquals(name3, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText());
            assertEquals(price3, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText());
            assertEquals(name4, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText());
            assertEquals(price4, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText());
        }else if(numbProducts==5){
            assertEquals(name, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText());
            assertEquals(price, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText());
            assertEquals(name2, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText());
            assertEquals(price2, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText());
            assertEquals(name3, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText());
            assertEquals(price3, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText());
            assertEquals(name4, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText());
            assertEquals(price4, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText());
            assertEquals(name5, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct5)).getText());
            assertEquals(price5, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct5)).getText());
        }else if(numbProducts==6){
            assertEquals(name, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct)).getText());
            assertEquals(price, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct)).getText());
            assertEquals(name2, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct2)).getText());
            assertEquals(price2, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct2)).getText());
            assertEquals(name3, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct3)).getText());
            assertEquals(price3, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct3)).getText());
            assertEquals(name4, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct4)).getText());
            assertEquals(price4, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct4)).getText());
            assertEquals(name5, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct5)).getText());
            assertEquals(price5, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct5)).getText());
            assertEquals(name6, webDriverWait.until(ExpectedConditions.elementToBeClickable(nameProduct6)).getText());
            assertEquals(price6, webDriverWait.until(ExpectedConditions.elementToBeClickable(priceProduct6)).getText());
        }
        webDriverWait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
    }

    public void payFinished(String message) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String msnFinished = webDriverWait.until(ExpectedConditions.elementToBeClickable(msnFinish)).getText();
        assertEquals(message, msnFinished);
        driver.quit();
    }
}
