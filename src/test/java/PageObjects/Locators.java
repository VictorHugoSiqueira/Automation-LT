package PageObjects;

import org.openqa.selenium.By;

public class Locators {
    public static By username() { return By.id("user-name"); }
    public static By password() { return By.id("password"); }
    public static By loginButton() { return By.id("login-button"); }

    public static By backpackButton() { return By.id("add-to-cart-sauce-labs-backpack");}

    public static By tshirtName() { return By.xpath("//*[@id=\"item_1_title_link\"]/div");}
    public static By tshirtNameOnChckout() { return By.xpath("//*[@id=\"item_1_title_link\"]/div");}

    public static By tshirtButton() { return By.id("add-to-cart-sauce-labs-bolt-t-shirt");}
    public static By onesieButton() { return By.id("add-to-cart-sauce-labs-onesie");}
    public static By cartButton() { return By.className("shopping_cart_link");}
    public static By removeButton() { return By.id("remove-sauce-labs-onesie");}
    public static By continueShopButton() { return By.id("continue-shopping");}
    public static By checkoutButton() { return By.id("checkout");}
    public static By firstNameField() { return By.id("first-name");}
    public static By lastNameField() { return By.id("last-name");}
    public static By zipCodeField() { return By.id("postal-code");}
    public static By continueButton() { return By.id("continue");}
    public static By finishButton() { return By.id("finish");}
}
