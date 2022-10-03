package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class conduit_page {

    public SelenideElement textHeaderConduit() {
        return $x("//a[text()='conduit']");
    }

    public SelenideElement linkSignUp() {
        return $x("//a[text()='Sign up']");
    }

    public SelenideElement linkSignIn() {
        return $x("//a[text()='Sign in']");
    }
}
