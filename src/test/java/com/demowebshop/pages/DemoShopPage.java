package com.demowebshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoShopPage extends BasePage{
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLinkBtn;

    @FindBy(id = "gender-male")
    public WebElement genderCheckBtn;

    @FindBy(id = "FirstName")
    public WebElement firstNameInbox;

    @FindBy(id = "LastName")
    public WebElement lastNameInbox;

    @FindBy(id = "Email")
    public WebElement emailInbox;

    @FindBy(id = "Password")
    public WebElement passwordInbox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordInbox;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    public WebElement registerCompleteText;

    @FindBy(linkText = "/customer/info")
    public WebElement customerInfo;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueBtn;

    @FindBy(linkText = "/login")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "//span[text()='Wishlist']")
    public WebElement wishListBtn;

    @FindBy(id = "small-searchterms")
    public WebElement searchInbox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchBoxBtn;

    @FindBy(xpath = "//input[@value='Add to cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement addProductTextMessage;

}