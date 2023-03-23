package com.vetan.mool.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.MonthCloseLOPOverdayPage;

public class TC_MonthCloseLOPOverDay_001 extends BaseClass{
    
    @Test
    public void MonthCloseLOPOverDay() throws InterruptedException
    {
        test = extent.createTest("LOP").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();

        MonthCloseLOPOverdayPage ml = new MonthCloseLOPOverdayPage(BaseClass.driver);

        login();
        implicitlyWait();

        ml.clickbtnPayroll();
        Thread.sleep(2000);

        ml.clickbtnPayrollInput();
        Thread.sleep(2000);

        ml.clickbtnLOPOverday();
        Thread.sleep(2000);

        ml.clickbtnAdd();
        Thread.sleep(2000);

        ml.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        ml.clickbtnEmployeeName();
        Thread.sleep(2000);

        ml.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        ml.clickbtnFinancialYear();
        Thread.sleep(2000);

        ml.clickbtn202223();
        Thread.sleep(2000);

        ml.clickbtnCheckBoxLOP();
        Thread.sleep(2000);

        ml.settxtNoOfDays("5");
        Thread.sleep(2000);

        ml.clickbtnAddToMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("-20161")) 
        {
            test.pass("Successfully added the LOP details");
            logger.info("Successfully added the LOp details");
            test.info("The LOP Amount : 22321");
        } 
        else 
        {
            test.fail("Unable to Add LOP");
            logger.info("Unable to add LOP");
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

        if(driver.getPageSource().contains("LOP Days: 5") && driver.getPageSource().contains("20161 INR"))
        {
            test.pass("LOP Added Successfully to the Payslip");
            logger.info("LOP Added Successfully to the Payslip");
        }
        else
        {
            test.fail("Unable to Add LOP to the Payslip");
            logger.info("Unable to Add LOP to the Payslip");
        }

        if (driver.getPageSource().contains("97,790")) 
        {
            logger.info("LOP Calculated Successfully");
            test.pass("LOP Calculated Successfully");
            test.info("NetPay before LOP: 116,595");
            test.info("NetPay after LOP: 97,790");
        } else 
        {
            logger.info("Unable to calculated LOP Correctly");
            test.fail("Unable to calculated LOP Correctly");
        }

        ml.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        try {

            ml.clickbtnPayroll();
            Thread.sleep(2000);

            ml.clickbtnPayrollInput();
            Thread.sleep(2000);

            ml.clickbtnLOPOverday();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnLOpOverday = driver.findElement(By.xpath("(//span[normalize-space()='Loss Of Pay & Overday'])[1]"));
            btnLOpOverday.click();
            Thread.sleep(2000);
        }

        ml.clickbtnDeleteLOP();
        Thread.sleep(2000);

        ml.clickbtnConfirmDelete();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("LOP Deleted Successfully Deleted");
            test.pass("LOP Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete LOP");
            test.fail("Unable to delete LOP");    
        }  



    }
}
