package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase{
    public Login(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "Email")
    WebElement EmailTxt;

    @FindBy (id = "Password")
    WebElement PasswordTxt;

    @FindBy(css="button.button-1.login-button")
    WebElement LoginButton;

    public void UserLogin(String Email, String Password)
    {
        sendKeys(EmailTxt, Email);
        sendKeys(PasswordTxt,Password);
        clickButton(LoginButton);

    }
}
