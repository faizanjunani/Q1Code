package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Util;

import Utils.UtilMethods;

public class LoginPage {

    WebDriver driver;
    String bankManagerLogin = "/html/body/div/div/div[2]/div/div[1]/div[2]/button";
   

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void LoginBankManager(){
        UtilMethods.waitForVisibility(driver, bankManagerLogin);
        UtilMethods.clickByXpath(driver, bankManagerLogin);
    }
    

}
