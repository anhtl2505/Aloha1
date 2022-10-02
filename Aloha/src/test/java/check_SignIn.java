import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class check_SignIn {
    @Test
    public void check_UserRegisterAccount() {
        String username = RandomStringUtils.randomAlphabetic(5);
        String data_email = username + "@yopmail.com";
        String password = "Test@123";

        open("https://react-redux.realworld.io/");

        $(xpath("//a[text()='conduit']")).shouldBe(visible);
        $(xpath("//a[text()='Sign up']")).click();
        $(xpath("//h1[text()='Sign Up']")).shouldBe(visible);

        $(xpath("//input[@placeholder='Username']")).shouldBe(visible);
        $(xpath("//input[@placeholder='Username']")).sendKeys(username);

        $(xpath("//input[@type='email']")).shouldBe(visible);
        $(xpath("//input[@type='email']")).sendKeys(data_email);

        $(xpath("//input[@type='password']")).shouldBe(visible);
        $(xpath("//input[@type='password']")).sendKeys(password);

        $(xpath("//button[text()='Sign in']")).shouldBe(enabled);
        $(xpath("//button[text()='Sign in']")).click();

        $(xpath("//li/a[@href='#@" + username + "']")).shouldBe(visible);

        sleep(2000);
    }

    @Test
    public void checkError_SignInWithInvalidCredential() {
        String username = RandomStringUtils.randomAlphabetic(5);
        String data_email = username + "@yopmail.com";
        String password = "Test@123";

        open("https://react-redux.realworld.io/");
        $(xpath("//a[text()='conduit']")).shouldBe(visible);
        $(xpath("//a[text()='Sign in']")).click();

        $(xpath("//input[@type='email']")).shouldBe(visible);
        $(xpath("//input[@type='email']")).sendKeys(data_email);

        $(xpath("//input[@type='password']")).shouldBe(visible);
        $(xpath("//input[@type='password']")).sendKeys(password);

        $(xpath("//button[text()='Sign in']")).shouldBe(enabled);
        $(xpath("//button[text()='Sign in']")).click();

        $(xpath("//ul[@class='error-messages']/li")).shouldBe(visible);
        $(xpath("//ul[@class='error-messages']/li")).shouldHave(text("email or password is invalid"));
        sleep(2000);
    }
}

