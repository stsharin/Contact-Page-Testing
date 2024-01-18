package pages;

import org.openqa.selenium.By;

public class ContactUsPage extends BasePage {
    public String contactUsUrl = "https://qa.orangetoolz.net/contact-us/";
    public By firstName = By.xpath("//input[@id='wpforms-1319-field_8']");
    public By lastName = By.xpath("//input[@id='wpforms-1319-field_9']");
    public By email = By.xpath("//input[@id='wpforms-1319-field_6']");
    public By message = By.xpath("//textarea[@id='wpforms-1319-field_7']");
    public By privacyPolicy = By.xpath("//label[@for='wpforms-1319-field_11_1']");
    public By submitBtn = By.xpath("//button[@id='wpforms-submit-1319']");

}
