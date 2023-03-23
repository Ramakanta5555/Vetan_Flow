package com.vetan.mool.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.MonthCloseAccidentPage;

public class TC_MonthCloseAccident_001 extends BaseClass {
    
    @Test
    public void MonthCloseAccident() throws InterruptedException
    {
        test = extent.createTest("Accident").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseAccidentPage ac = new MonthCloseAccidentPage(BaseClass.driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        ac.clickbtnPayroll();
        Thread.sleep(2000);

        ac.clickbtnPayrollInput();
        Thread.sleep(2000);

        ac.clickbtnAccident();
        Thread.sleep(2000);

        ac.clickbtnAdd();
        Thread.sleep(2000);

        ac.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        ac.clickbtnEmployeeName();
        Thread.sleep(2000);

        ac.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        ac.clickbtnFinancialYear();
        Thread.sleep(2000);

        ac.clickbtn202223();
        Thread.sleep(2000);

        ac.settxtCauseOfInjury("Test Injury");
        Thread.sleep(2000);

        ac.settxtInsuranceNumber("1122334455");
        Thread.sleep(2000);

        ac.clickbtnDateOfAccident();
        Thread.sleep(2000);

        ac.clickbtnDate3();
        Thread.sleep(2000);

        ac.settxtTimeOFAccident("1.10");
        Thread.sleep(2000);

        ac.settxtPlaceOfAccident("Bangalore");
        Thread.sleep(2000);

        ac.settxtDescriptionOfAccident("TestDescriptions");
        Thread.sleep(2000);

        ac.settxtWitnessName("Farzi");
        Thread.sleep(2000);

        ac.settxtAccidentAmount("5000");
        Thread.sleep(2000);

        ac.clickbtnAddToMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("+5000")) 
        {
            test.pass("Successfully added the acciedent details");
            logger.info("Successfully added the acciedent details");
            test.info("Added Accident amount is: 5000");
        } else 
        {
            test.fail("Unable to add accident detais");
            logger.info("Unable to add accident detais");
        }

        //Run Payroll
        
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

        if (driver.getPageSource().contains("Accident") && driver.getPageSource().contains("5,000.00")) 
        {
            logger.info("Accident added to the Payslip"); 
            test.pass("Accident added to the Payslip");
         } else 
         {
             logger.info("Unable to Add Accident to Payslip"); 
            test.pass("Unable to Add Accident to Payslip");
         }

         if (driver.getPageSource().contains("121,595.00")) 
        {
            logger.info("Accident Calculated Successfully");
            test.pass("Accident Calculated Successfully");
            test.info("NetPay before Accident: 110,395");
            test.info("NetPay after Accident: 115,395");
        } else 
        {
            logger.info("Unable to calculated Accident Correctly");
            test.fail("Unable to calculated Accident Correctly");
        }

        ac.clickbtnCloseOPayslip();
        Thread.sleep(4000);
        
        driver.navigate().refresh();
        Thread.sleep(10000);

        try {
            
            ac.clickbtnPayroll();
            Thread.sleep(2000);

            ac.clickbtnPayrollInput();
            Thread.sleep(2000);

            ac.clickbtnAccident();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnAccident = driver.findElement(By.xpath("(//span[normalize-space()='Accident'])[1]"));
            btnAccident.click();
            Thread.sleep(2000);
        }

        ac.clickbtnDeleteAccident();
        Thread.sleep(2000);

        ac.clickbtnConfirmDelete();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Accident Deleted Successfully Deleted");
            test.pass("Accident Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Accident");
            test.fail("Unable to delete Accident");    
        }  
    }
}
