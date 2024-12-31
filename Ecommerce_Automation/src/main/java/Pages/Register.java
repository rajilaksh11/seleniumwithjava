package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends PageBase
{

    @FindBy(id = "gender-male")
    WebElement genderRadioBUtton;
    @FindBy(id = "FirstName")
    WebElement FirstNameTxt;

    @FindBy(id = "LastName")
    WebElement LastNameTxt;

    @FindBy(id = "Email")
    WebElement EmailTxt;

    @FindBy(id = "Password")
    WebElement PasswordTxt;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTxt;

    @FindBy(id = "register-button")
    WebElement RegisterButton;
    @FindBy(css ="div.result")
    public WebElement RegisterSuccess;

    @FindBy(linkText = "CONTINUE")
    WebElement ContinueButon;

    public Register(WebDriver driver) {
        super(driver);
    }

    public void userRegister(String fnamevalue,String lnamevalue,String emailvalue,  String passwordvalue)
    {
        clickButton(genderRadioBUtton);
        sendKeys(FirstNameTxt,fnamevalue);
        sendKeys(LastNameTxt,lnamevalue);
        sendKeys(EmailTxt,emailvalue);
        sendKeys(PasswordTxt,passwordvalue);
        sendKeys(ConfirmPasswordTxt,passwordvalue);
        clickButton(RegisterButton);


    }
    public void Continue()
    {
        clickButton(ContinueButon);
    }

}
