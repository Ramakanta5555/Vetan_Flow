package com.vetan.mool.TestCases.MonthClose;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.MonthCloseCustomPage;
import com.vetan.mool.TestCases.BaseClass;

public class TC_MonthCloseCustom_001 extends BaseClass{
    
    @Test
    public void MonthCloseCustom() throws InterruptedException
    {
        test = extent.createTest("Custom MonthClose").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseCustomPage mc = new MonthCloseCustomPage(BaseClass.driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        mc.clickbtnPayroll();
        Thread.sleep(2000);

        mc.clickbtnPayrollInput();
        Thread.sleep(2000);

        mc.clickbtnCustom();
        Thread.sleep(2000);

        mc.clickbtnAdd();
        Thread.sleep(2000);

        mc.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mc.clickbtnEmployeeName();
        Thread.sleep(2000);

        mc.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mc.clickbtnFinancialYear();
        Thread.sleep(2000);

        mc.clickbtn202223();
        Thread.sleep(2000);

        mc.clickbtncheckboxCredit();
        Thread.sleep(2000);

        mc.settxtName("Custom_Credit");
        Thread.sleep(2000);

        mc.settxtAmount("3000");
        Thread.sleep(2000);

        mc.clickbtnAddToTheMonthEnddata();
        Thread.sleep(3000);

        if (driver.getPageSource().contains("Successfully added the arrears and bonuses details") && driver.getPageSource().contains("+3000"))
        {
            logger.info("Custom_Credit Added successfully");
            test.pass("Custom_Credit Added successfully");
        } 
        else 
        {
            logger.info("Unable to add Custom_Credit");
            test.fail("Unable to add Custom_Credit");
        }

        RunPayroll();
        Thread.sleep(2000);

        if(driver.getPageSource().contains("Payroll has been processed successfully") && driver.getPageSource().contains("Ramakanta Samal"))
        {
            Assert.assertTrue( true);
            logger.info("Payroll run Successfully");
            test.pass("Payroll run Successfully"); 
        }
      else
        {
            // Assert.assertTrue( false);
            logger.info("Error: Unable to run the Payroll");
            test.fail("Unable to run the Payroll");
        }

        //Employee Payslip

        Employee_Payslip();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Custom_Credit") && driver.getPageSource().contains("3,000.00")) 
        {
           logger.info("Custom_Credit added to the Payslip"); 
           test.pass("Custom_Credit added to the Payslip");
        } else 
        {
            logger.info("Unable to Add Custom_Credit to Payslip"); 
           test.pass("Unable to Add Custom_Credit to Payslip");
        }

        if (driver.getPageSource().contains("126,200.00"))
        {
            logger.info("Custom_Credit Calculated Successfully");
            test.pass("Custom_Credit Calculated Successfully");
            test.info("NetPay before Custom_Credit: 123,200.00");
            test.info("NetPay after Custom_Credit: 126,200.00");
        } else 
        {
            logger.info("Unable to calculated Custom_Credit Correctly");
            test.fail("Unable to calculated Custom_Credit Correctly");
        }

        mc.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        try {
            mc.clickbtnPayroll();
            Thread.sleep(2000);

            mc.clickbtnPayrollInput();
            Thread.sleep(2000);

            mc.clickbtnCustom();
            Thread.sleep(2000);


        } catch (StaleElementReferenceException e) {
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            payrollinput.click();
            Thread.sleep(2000); 

            WebElement btnCustom = driver.findElement(By.xpath("(//span[normalize-space()='Custom'])[1]"));
            btnCustom.click();
            Thread.sleep(2000); 
        }

        mc.clickbtnDeleteCustom();
        Thread.sleep(2000);

        mc.clickbtnConfirmDeleteCustom();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Custom Deleted Successfully Deleted");
            test.pass("Custom Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Custom");
            test.fail("Unable to delete Fine");    
        }  

    }
}
