package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.UtilMethods;

public class AddCustomerPage extends UtilMethods{

    WebDriver driver;
    String addCustomer = "/html/body/div/div/div[2]/div/div[1]/button[1]";
    String firstName = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input";
    String lastName = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input";
    String postalCode = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input";
    String registerCustomer = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button";

    public AddCustomerPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void ClickAddCustomer()
    {
        UtilMethods.waitForVisibility(driver, addCustomer);
        UtilMethods.clickByXpath(driver, addCustomer);
    }
    public void AddCustomers()
    {
        String[] arrFirstName = {"Christopher", "Frank", "Christopher", "Connely","Jackson","Minka","Jackson"};
        String[] arrLastName = {"Connely","Christopher","Minka","Jackson","Frank","Jackson","Connely"};
        String[] arrPostalCode = {"L789C349","A897N450","M098Q585","L789C349","L789C349","A897N450","L789C349"};

        UtilMethods.waitForVisibility(driver, firstName);
        UtilMethods.waitForVisibility(driver, lastName);
        UtilMethods.waitForVisibility(driver, postalCode);
        UtilMethods.waitForVisibility(driver, registerCustomer);
        System.out.println("Adding Customer");
        for(int i=0;i<=6;i++) {
            UtilMethods.sendKeysXpath(driver, firstName, arrFirstName[i]);
            UtilMethods.sendKeysXpath(driver, lastName, arrLastName[i]);
            UtilMethods.sendKeysXpath(driver, postalCode, arrPostalCode[i]);
            UtilMethods.clickByXpath(driver, registerCustomer);
            driver.switchTo().alert().dismiss();
            System.out.println("Customer"+i+"Added");
        }
    }
}