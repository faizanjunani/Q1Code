package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import Pages.*;

public class Test {
       
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/FaizanJunani/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LoginPage lp = new LoginPage(driver);
        AddCustomerPage ap = new AddCustomerPage(driver);
        CustomerPage cp = new CustomerPage(driver);
      
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        System.out.println("URL EXECUTED");
        System.out.println("wait 3seconds");
        Thread.sleep(3000);
        lp.LoginBankManager();
        System.out.println("Login Clicked");
        ap.ClickAddCustomer();
        ap.AddCustomers();
        cp.visitCustomerPage();
        Assert.assertEquals("Christopher","Christopher");
        Assert.assertEquals("Frank","Frank");
        Assert.assertEquals("Connely","Connely");
        Assert.assertEquals("Jackson","Jackson");
        Assert.assertEquals("Mink","Mink");
        cp.deleteCustomer1();
        cp.deleteCustomer2();


    }
}

