package scenario;

import org.apache.commons.lang.RandomStringUtils;
import page.conduit_page;
import page.signUp_page;

public class main {
    signUp_page SI = new signUp_page();
    conduit_page CP = new conduit_page();
    String username = RandomStringUtils.randomAlphabetic(5);
    String data_email = username + "@yopmail.com";
    String password = "Test@123";
    String invalid_pw = "11111";
    String baseURL = "https://react-redux.realworld.io/";
}
