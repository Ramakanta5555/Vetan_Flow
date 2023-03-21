package com.vetan.mool.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.MonthCloseFinePage;

public class TC_MonthCloseFine_001 extends BaseClass{
    
    @Test
    public void MonthCloseFine() throws InterruptedException
    {
        test = extent.createTest("Fine").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseFinePage mf = new MonthCloseFinePage(BaseClass.driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        mf.clickbtnPayroll();
        Thread.sleep(2000);

        mf.clickbtnPayrollInput();
        Thread.sleep(2000);

        mf.clickbtnFine();
        Thread.sleep(2000);

        mf.clickbtnAdd();
        Thread.sleep(2000);

        mf.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mf.clickbtnEmployeeName();
        Thread.sleep(2000);

        mf.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mf.clickbtnFinancialYear();
        Thread.sleep(2000);

        mf.clickbtn202223();
        Thread.sleep(2000);

        // mf.clickbtnMonth();
        // Thread.sleep(2000);

        // mf.clickbtnFebruary();
        // Thread.sleep(2000);

        mf.settxtReasonForFine("Test Fine");
        Thread.sleep(2000);

        mf.settxtNameOfThePersonPresent("Test Sharma");
        Thread.sleep(2000);

        mf.clcikbtnDateOfOffence();
        Thread.sleep(2000);

        mf.clickbtnDate3();
        Thread.sleep(2000);

        mf.settxtWagesPeriod("15");
        Thread.sleep(2000);

        mf.settxtWagespayable("5000");
        Thread.sleep(2000);

        // mf.clickbtnDateOfFine();
        // Thread.sleep(2000);

        // mf.clickbtnDate12();
        // Thread.sleep(2000);

        mf.settxtFineAmount("5000");
        Thread.sleep(2000);

        mf.clickbtnAddToTheMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the fine details") && driver.getPageSource().contains("-5000")) 
        {
            test.pass("Successfully added the fine details");
            logger.info("Successfully added the fine details");
            test.info("The Fine Amount : 5000");
        } 
        else 
        {
            test.fail("Unable to Add Fine");
            logger.info("Unable to add Fine");
        }

        //Run Payroll
        
        RunPayroll();
        // Thread.sleep(2000);

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

        if(driver.getPageSource().contains("Fine") && driver.getPageSource().contains("5,000"))
        {
            test.pass("Fine Added Successfully to the Payslip");
            logger.info("Fine Added Successfully to the Payslip");
        }
        else
        {
            test.fail("Unable to Add fine to the Payslip");
            logger.info("Unable to Add fine to the Payslip");
        }

        if (driver.getPageSource().contains("105,395")) 
        {
            logger.info("fine Calculated Successfully");
            test.pass("fine Calculated Successfully");
            test.info("NetPay before fine: 110,395");
            test.info("NetPay after fine: 105,395");
        } else 
        {
            logger.info("Unable to calculated fine Correctly");
            test.fail("Unable to calculated fine Correctly");
        }

        mf.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        try {

            mf.clickbtnPayroll();
            Thread.sleep(5000);

            mf.clickbtnPayrollInput();
            Thread.sleep(2000);

            mf.clickbtnFine();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnBonus = driver.findElement(By.xpath("(//span[normalize-space()='Fine'])[1]"));
            btnBonus.click();
            Thread.sleep(2000);
        }

        mf.clickbtnDeleteFine();
        Thread.sleep(2000);

        mf.clickbtnConfirmDelete();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Fine Deleted Successfully Deleted");
            test.pass("Fine Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Fine");
            test.fail("Unable to delete Fine");    
        }  


    }
}
