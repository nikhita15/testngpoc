package endtoend;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CerseiRegisterPage;
import pages.CheckoutPage;
import pages.ThreeDSVerificationPage;

/**
 * Created by e052988 on 3/22/18.
 */

public class AddCardSuccessHappyPathTest {

    WebDriver driver;
    CerseiRegisterPage cp;
    CheckoutPage c;
    ThreeDSVerificationPage tp;
    String browser = "chrome";

    @BeforeSuite

    public void setup(){

        driver= utilities.DriverProvider.initialize(browser);
        driver.get("https://cersei.apps.stl.pcfstage00.mastercard.int/register");
        cp = new CerseiRegisterPage(driver);
        c=  new CheckoutPage(driver);
        tp= new ThreeDSVerificationPage(driver);

    }


    @Test
    public void addCardEndToEndFlow1()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow2()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }
    @Test
    public void addCardEndToEndFlow3()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow4()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow5()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow6()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }
    @Test
    public void addCardEndToEndFlow7()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow8()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow9()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @Test
    public void addCardEndToEndFlow10()
    {
        cp.enterCardDetails("5413850000000123","9","20");
        cp.clickContinueButton();
        c.clickCheckout();
        tp.clickVerifyButton();
    }

    @AfterSuite
    public void tearDown()
    {
        driver.close();
    }
}
