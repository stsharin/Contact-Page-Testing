package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import utilities.DriverSetup;

public class TestContactUsPage extends DriverSetup {
    ContactUsPage contactUsPage = new ContactUsPage();
    @Test(description = "Test contact page form")
    @Description("Allure Description Test product page form which includes firstname, lastname, email, message, privacy policy and submit button")

    public void testContactForm() {
        getDriver().get(contactUsPage.contactUsUrl);

        contactUsPage.scrollToElement(contactUsPage.firstName);
        contactUsPage.addScreenShot("form screen short");

        contactUsPage.writeOnElement(contactUsPage.firstName,"st");
        contactUsPage.writeOnElement(contactUsPage.lastName,"sharin");
        contactUsPage.writeOnElement(contactUsPage.email,"stsharin@gmail.com");
        contactUsPage.writeOnElement(contactUsPage.message,"Your service was great. I want to have another appointment.");
        contactUsPage.clickOnElement(contactUsPage.privacyPolicy);
        contactUsPage.clickOnElement(contactUsPage.submitBtn);
        contactUsPage.addScreenShot("form screen short");
    }
}
