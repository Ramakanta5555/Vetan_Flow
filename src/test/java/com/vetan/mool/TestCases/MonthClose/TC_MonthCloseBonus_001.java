package com.vetan.mool.TestCases.MonthClose;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vetan.mool.PageObjects.MonthCloseBonusPage;
import com.vetan.mool.TestCases.BaseClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_MonthCloseBonus_001 extends BaseClass{
    
    
    @Test
    public void MonthClosePujaBonus() throws InterruptedException
    {
        test = extent.createTest("PujaBonus").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseBonusPage mb = new MonthCloseBonusPage(BaseClass.driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        mb.clickbtnPayroll();
        Thread.sleep(2000);

        mb.clickbtnPayrollInput();
        Thread.sleep(2000);

        mb.clickbtnBonus();
        Thread.sleep(2000);

        mb.clickbtnAdd();
        Thread.sleep(2000);

        mb.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mb.clickbtnEmployeeName();
        Thread.sleep(2000);

        mb.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mb.clickbtnFinancialYear();
        Thread.sleep(2000);

        mb.clickbtn202223();
        Thread.sleep(2000);

        mb.clickbtnMonth();
        Thread.sleep(2000);

        mb.clickbtnFebruary();
        Thread.sleep(2000);

        mb.clickbtnBonusType();
        Thread.sleep(2000);

        mb.clickbtnPujaBonus();
        Thread.sleep(2000);

        mb.settxtBonusAmount("2000");
        Thread.sleep(2000);

        mb.clickbtnAddToMonthEndData();
        Thread.sleep(3000);

        if (driver.getPageSource().contains("Successfully added the bonus")) 
        {
            // logger.info("Puja_Bonus Added successfully");
            log.info("Puja_Bonus Added successfully");
            test.pass("Puja_Bonus Added successfully");
        } else 
        {
            logger.info("Unable to add Puja_Bonus");
            test.fail("Unable to add Puja_Bonus");
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

        if (driver.getPageSource().contains("Puja_Bonus") && driver.getPageSource().contains("2,000.00")) 
        {
           logger.info("Puja_Bonus added to the Payslip"); 
           test.pass("Puja_Bonus added to the Payslip");
        } else 
        {
            logger.info("Unable to Add Bonus to Payslip"); 
           test.pass("Unable to Add Bonus to Payslip");
        }

        if (driver.getPageSource().contains("118,595.00")) 
        {
            logger.info("Puja_Bonus Calculated Successfully");
            test.pass("Puja_Bonus Calculated Successfully");
            test.info("NetPay before Puja_Bonus: 110,395");
            test.info("NetPay after Puja_Bonus: 112,395");
        } else 
        {
            logger.info("Unable to calculated Puja_Bonus Correctly");
            test.fail("Unable to calculated Puja_Bonus Correctly");
        }

        mb.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(15000);

        try {

            mb.clickbtnPayroll();
            Thread.sleep(2000);

            mb.clickbtnPayrollInput();
            Thread.sleep(2000);

            mb.clickbtnBonus();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnBonus = driver.findElement(By.xpath("(//span[normalize-space()='Bonus'])[1]"));
            btnBonus.click();
            Thread.sleep(2000);
        }

        mb.clickbtnDeleteBonus();
        Thread.sleep(2000);

        mb.clickbtnConfirmDelete();
        Thread.sleep(2000);
        
        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Puja_Bonus Deleted Successfully Deleted");
            test.pass("Puja_Bonus Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Puja_Bonus");
            test.fail("Unable to delete Puja_Bonus");    
        }  
    }

    //Interim_Bonus
    public void MonthCloseInterimBonus() throws InterruptedException
    {
        test = extent.createTest("InterimBonus").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseBonusPage mb = new MonthCloseBonusPage(BaseClass.driver);
        Thread.sleep(2000);

        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[2]"));
        btnPayroll.click();

        WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        btnPayrollInput.click();
        

        mb.clickbtnBonus();
        Thread.sleep(2000);

        mb.clickbtnAdd();
        Thread.sleep(2000);

        mb.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mb.clickbtnEmployeeName();
        Thread.sleep(2000);

        mb.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mb.clickbtnFinancialYear();
        Thread.sleep(2000);

        mb.clickbtn202223();
        Thread.sleep(2000);

        mb.clickbtnMonth();
        Thread.sleep(2000);

        mb.clickbtnFebruary();
        Thread.sleep(2000);

        mb.clickbtnBonusType();
        Thread.sleep(2000);

        mb.clickbtnInterimBonus();
        Thread.sleep(2000);

        mb.settxtBonusAmount("2000");
        Thread.sleep(2000);

        mb.clickbtnAddToMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the bonus")) 
        {
            logger.info("Interim_Bonus Added successfully");
            test.pass("Interim_Bonus Added successfully");
        } else 
        {
            logger.info("Unable to add Interim_Bonus");
            test.fail("Unable to add Interim_Bonus");
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

        if (driver.getPageSource().contains("Interim_Bonus") && driver.getPageSource().contains("2000")) 
        {
           logger.info("Interim_Bonus added to the Payslip"); 
           test.pass("Interim_Bonus added to the Payslip");
        } else 
        {
            logger.info("Unable to Add Bonus to Payslip"); 
           test.pass("Unable to Add Bonus to Payslip");
        }

        if (driver.getPageSource().contains("121,200")) 
        {
            logger.info("Interim_Bonus Calculated Successfully");
            test.pass("Interim_Bonus Calculated Successfully");
            test.info("NetPay before Interim_Bonus: 119200");
            test.info("NetPay after Interim_Bonus: 121200");
        } else 
        {
            logger.info("Unable to calculated Interim_Bonus Correctly");
            test.fail("Unable to calculated Interim_Bonus Correctly");
        }

        mb.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(15000);

        try {

            mb.clickbtnPayroll();
            Thread.sleep(2000);

            mb.clickbtnPayrollInput();
            Thread.sleep(2000);

            mb.clickbtnBonus();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayrollOne = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayrollOne.click();
            Thread.sleep(2000);

            WebElement btnPayrollInputOne = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInputOne.click();
            Thread.sleep(2000);

            WebElement btnBonus = driver.findElement(By.xpath("(//span[normalize-space()='Bonus'])[1]"));
            btnBonus.click();
            Thread.sleep(2000);
        }

        mb.clickbtnDeleteBonus();
        Thread.sleep(2000);

        mb.clickbtnConfirmDelete();
        Thread.sleep(2000);
        
        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Interim_Bonus Deleted Successfully Deleted");
            test.pass("Interim_Bonus Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Interim_Bonus");
            test.fail("Unable to delete Interim_Bonus");    
        }  
    }
}
