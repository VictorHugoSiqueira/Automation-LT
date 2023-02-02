import PageObjects.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static PageObjects.Texts.*;

public class SwagLabsAutomation extends Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(getWebsiteString());
        driver.manage().window().maximize();

        driver.findElement(username());
        driver.findElement(username()).sendKeys(getUsernameString());
        driver.findElement(password());
        driver.findElement(password()).sendKeys(getPasswordString());
        driver.findElement(loginButton()).click();

        driver.findElement(tshirtButton()).click();
        driver.findElement(onesieButton()).click();
        driver.findElement(cartButton()).click();

        WebElement ConfirmingItemName = driver.findElement(tshirtName());
        String expected = "Sauce Labs Bolt T-Shirt";
        String confirmed = ConfirmingItemName.getText();

        if (confirmed.equals(expected)) {
            System.out.println("Item name is the same that you added in the cart!");
        } else {
            System.out.println("Item's name is NOT the same that you added in the cart!");
        }

            driver.findElement(removeButton()).click();
            driver.findElement(continueShopButton()).click();
            driver.findElement(backpackButton()).click();
            driver.findElement(cartButton()).click();
            driver.findElement(checkoutButton()).click();

            driver.findElement(firstNameField());
            driver.findElement(firstNameField()).sendKeys(getFirstNameString());
            driver.findElement(lastNameField());
            driver.findElement(lastNameField()).sendKeys(getLastNameString());
            driver.findElement(zipCodeField());
            driver.findElement(zipCodeField()).sendKeys(getZipCodeSring());
            driver.findElement(continueButton()).click();
            System.out.println("chegou aqui!!!!!!!");


        WebElement ConfirmingItemNameChckout = driver.findElement(tshirtNameOnChckout());
        String expectedOnChkout = "Sauce Labs Bolt T-Shirt";
        String confirmedOnChckout = ConfirmingItemNameChckout.getText();

        if (confirmedOnChckout.equals(expectedOnChkout)) {
            System.out.println("Item name is the same on the Checkout too!");
        } else {
            System.out.println("Item's name is NOT the same on the Checkout!");
        }
            driver.findElement(finishButton()).click();
        }
    }
