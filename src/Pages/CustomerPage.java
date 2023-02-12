package Pages;

import org.openqa.selenium.WebDriver;


import Utils.UtilMethods;

public class CustomerPage extends UtilMethods {
    WebDriver driver;
    String visitCustomerPage = "/html/body/div/div/div[2]/div/div[1]/button[3]";
    String deleteCustomer1 = "//tbody/tr[6]/td[5]/button[1]";
    String deleteCustomer2 = "//tr[9]//td[5]//button[contains(text(),'Delete')]";


    public CustomerPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    public void visitCustomerPage()
    {
        System.out.println("find element for visit customer");
        UtilMethods.waitForVisibility(driver, visitCustomerPage);
        System.out.println("wait 2 second on visit customer");  
        UtilMethods.clickByXpath(driver, visitCustomerPage);
    }
    public void deleteCustomer1()
    {
        System.out.println("find delete button");
        UtilMethods.waitForVisibility(driver, deleteCustomer1);
        UtilMethods.clickByXpath(driver, deleteCustomer1);
        System.out.println("Jackson Frank deleted");
    }
    public void deleteCustomer2()
    {
        System.out.println("find delete button");
        UtilMethods.waitForVisibility(driver, deleteCustomer2);
        UtilMethods.clickByXpath(driver, deleteCustomer2);
        System.out.println("Christopher Connely Deleted");
    }

}
