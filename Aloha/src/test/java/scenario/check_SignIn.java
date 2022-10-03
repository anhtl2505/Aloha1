package scenario;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class check_SignIn extends main {

    @Test
    public void check_UserRegisterAccount() {
        //Go to Conduit page
        open(baseURL);
        //Verify header page Conduit
        CP.textHeaderConduit().shouldBe(visible);
        //Verify link Sign Up is present and click into link
        CP.linkSignUp().shouldBe(visible).click();
        //Verify page Sign Up display correctly
        SI.textHeaderSignUp().shouldBe(visible);
        //Input Username
        SI.inputUserName().shouldBe(visible).sendKeys(username);
        //Input Email
        SI.inputEmail().shouldBe(visible).sendKeys(data_email);
        //Input Password
        SI.inputPassWord().shouldBe(visible).sendKeys(password);
        //Click button Sign In
        SI.btnSignIn().shouldBe(enabled).click();
        //Verify new account registerd successful
        $(xpath("//li/a[@href='#@" + username + "']")).shouldBe(visible);
        sleep(2000);
    }

    @Test
    public void checkError_SignInWithInvalidCredential() {
        //Go to Conduit page
        open(baseURL);
        //Verify header page Conduit
        CP.textHeaderConduit().shouldBe(visible);
        //Click link Sign In
        CP.linkSignIn().shouldBe(visible).click();
        //Input email
        SI.inputEmail().shouldBe(visible).sendKeys(data_email);
        //Input wrong password
        SI.inputPassWord().shouldBe(visible).sendKeys(invalid_pw);
        //Click button Sign In
        SI.btnSignIn().shouldBe(enabled).click();
        //Verify error message
        SI.textErrorSignIn().shouldBe(visible).shouldHave(text("email or password is invalid"));
        sleep(2000);
    }
}

