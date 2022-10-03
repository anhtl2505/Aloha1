package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class signUp_page {

    public SelenideElement textHeaderSignUp() {
        return $x("//h1[text()='Sign Up']");
    }

    public SelenideElement inputUserName() {
        return $x("//input[@placeholder='Username']");
    }

    public SelenideElement inputPassWord() {
        return $x("//input[@type='password']");
    }

    public SelenideElement inputEmail() {
        return $x("//input[@type='email']");
    }

    public SelenideElement btnSignIn() {
        return $x("//button[text()='Sign in']");
    }

    public SelenideElement textErrorSignIn() {
        return $x("//ul[@class='error-messages']/li");
    }
}
