package com.vetan.mool.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.MonthCloseOvertimePage;

public class TC_MonthCloseOvertime_001 extends BaseClass {
    
    @Test
    public void MonthCloseOvertime() throws InterruptedException
    {
        test = extent.createTest("OverTimeBasic").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();

        MonthCloseOvertimePage mo = new MonthCloseOvertimePage(BaseClass.driver);

        login();
        implicitlyWait();

        mo.clickbtnPayroll();
        Thread.sleep(2000);

        mo.clickbtnPayrollInput();
        Thread.sleep(2000);

        mo.clickbtnOvertime();
        Thread.sleep(2000);

        mo.clickbtnAdd();
        Thread.sleep(2000);

        mo.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mo.clickbtnEmployeeName();
        Thread.sleep(2000);

        mo.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mo.clickbtnFinancialYear();
        Thread.sleep(2000);

        mo.clickbtn202223();
        Thread.sleep(2000);

        mo.clickbtnMonth();
        Thread.sleep(2000);

        mo.clickbtnJanuary();
        Thread.sleep(2000);

        mo.clickbtnMonth();
        Thread.sleep(2000);

        mo.clickbtnFebruary();
        Thread.sleep(2000);

        mo.clickbtnSelectDate();
        Thread.sleep(2000);

        mo.clickbtnDate9();
        Thread.sleep(2000);

        mo.cleartxtOverTimeHoursWorked();
        Thread.sleep(2000);

        mo.settxtOverTimeHoursWorked("5");
        Thread.sleep(2000);

        mo.clickbtnSelectComponent();
        Thread.sleep(2000);

        mo.clickbtnGross();
        Thread.sleep(4000);

        mo.clickbtnSelectComponent();
        Thread.sleep(2000);

        mo.clickbtnBasic();
        Thread.sleep(2000);

        mo.cleartxtFactor();
        Thread.sleep(2000);

        mo.settxtFactor("3");
        Thread.sleep(2000);

        mo.clickbtnAddToTheMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the overtime details") && driver.getPageSource().contains("+3024")) 
        {
            test.pass("Successfully added the Overtime(Basic) details");
            logger.info("Successfully added the Overtime(Basic) details");
            test.info("The Overtime Amount : 3024");
        } else 
        {
            test.fail("Unable to Add Overtime(Basic)");
            logger.info("Unable to add Overtime(Basic)");
        }

        RunPayroll();
        Thread.sleep(3000);

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

        if(driver.getPageSource().contains("Overtime") && driver.getPageSource().contains("3,024.00"))
        {
            test.pass("Overtime(Basic) Added Successfully to the Payslip");
            logger.info("Overtime(Basic) Added Successfully to the Payslip");
        }
        else
        {
            test.fail("Unable to Add Overtime(Basic) to the Payslip");
            logger.info("Unable to Add Overtime(Basic) to the Payslip");
        }

        if (driver.getPageSource().contains("119,619.00")) 
        {
            logger.info("Overtime(Basic) Calculated Successfully");
            test.pass("Overtime(Basic) Calculated Successfully");
            test.info("NetPay before Overtime(Basic): 110,395");
            test.info("NetPay after Overtime(Basic): 113,419");
        } else 
        {
            logger.info("Unable to calculated Overtime(Basic) Correctly");
            test.fail("Unable to calculated Overtime(Basic) Correctly");
        }

        mo.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        try {

            mo.clickbtnPayroll();
            Thread.sleep(2000);

            mo.clickbtnPayrollInput();
            Thread.sleep(2000);

            mo.clickbtnOvertime();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnBonus = driver.findElement(By.xpath("(//span[normalize-space()='Overtime'])[1]"));
            btnBonus.click();
            Thread.sleep(2000);
        }

        mo.clickbtnDeleteOvertime();
        Thread.sleep(2000);

        mo.clickbtnConfirmDelete();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Overtime(Basic) Deleted Successfully Deleted");
            test.pass("Overtime(Basic) Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Overtime(Basic)");
            test.fail("Unable to delete Overtime(Basic)");    
        }
    }


    //OvertimeGross
    @Test
    public void MonthCloseOvertimeGross() throws InterruptedException
    {
        test = extent.createTest("OverTimeGross").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();

        MonthCloseOvertimePage mo = new MonthCloseOvertimePage(BaseClass.driver);

        mo.clickbtnPayroll();
        Thread.sleep(2000);

        mo.clickbtnPayrollInput();
        Thread.sleep(2000);

        mo.clickbtnOvertime();
        Thread.sleep(2000);

        mo.clickbtnAdd();
        Thread.sleep(2000);

        mo.clickbtnAddSingleRecord();
        Thread.sleep(2000);

        mo.clickbtnEmployeeName();
        Thread.sleep(2000);

        mo.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        mo.clickbtnFinancialYear();
        Thread.sleep(2000);

        mo.clickbtn202223();
        Thread.sleep(2000);

        mo.clickbtnMonth();
        Thread.sleep(2000);

        mo.clickbtnJanuary();
        Thread.sleep(2000);

        mo.clickbtnMonth();
        Thread.sleep(2000);

        mo.clickbtnFebruary();
        Thread.sleep(2000);

        mo.clickbtnSelectDate();
        Thread.sleep(2000);

        mo.clickbtnDate9();
        Thread.sleep(2000);

        mo.cleartxtOverTimeHoursWorked();
        Thread.sleep(2000);

        mo.settxtOverTimeHoursWorked("5");
        Thread.sleep(2000);

        mo.clickbtnSelectComponent();
        Thread.sleep(2000);

        mo.clickbtnGross();
        Thread.sleep(2000);

        mo.cleartxtFactor();
        Thread.sleep(2000);

        mo.settxtFactor("3");
        Thread.sleep(2000);

        mo.clickbtnAddToTheMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the overtime details") && driver.getPageSource().contains("+7052")) 
        {
            test.pass("Successfully added the Overtime(Gross) details");
            logger.info("Successfully added the Overtime(Gross) details");
            test.info("The Overtime(Gross) Amount : 7052");
        } else 
        {
            test.fail("Unable to Add Overtime(Gross)");
            logger.info("Unable to add Overtime(Gross)");
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

        if(driver.getPageSource().contains("Overtime") && driver.getPageSource().contains("7,052.00"))
        {
            test.pass("Overtime(Gross) Added Successfully to the Payslip");
            logger.info("Overtime(Gross) Added Successfully to the Payslip");
        }
        else
        {
            test.fail("Unable to Add Overtime(Gross) to the Payslip");
            logger.info("Unable to Add Overtime(Gross) to the Payslip");
        }

        if (driver.getPageSource().contains("123,647.00")) 
        {
            logger.info("Overtime(Gross) Calculated Successfully");
            test.pass("Overtime(Gross) Calculated Successfully");
            test.info("NetPay before Overtime(Gross): 110,395");
            test.info("NetPay after Overtime(Gross): 117,447");
        } else 
        {
            logger.info("Unable to calculated Overtime(Gross) Correctly");
            test.fail("Unable to calculated Overtime(Gross) Correctly");
        }

        mo.clickbtnCloseOPayslip();
        Thread.sleep(2000);

        try {

            mo.clickbtnPayroll();
            Thread.sleep(2000);

            mo.clickbtnPayrollInput();
            Thread.sleep(2000);

            mo.clickbtnOvertime();
            Thread.sleep(2000);

        } catch (StaleElementReferenceException e) {
            
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            btnPayrollInput.click();
            Thread.sleep(2000);

            WebElement btnBonus = driver.findElement(By.xpath("(//span[normalize-space()='Overtime'])[1]"));
            btnBonus.click();
            Thread.sleep(2000);
        }

        mo.clickbtnDeleteOvertime();
        Thread.sleep(2000);

        mo.clickbtnConfirmDelete();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("Overtime(Gross) Deleted Successfully Deleted");
            test.pass("Overtime(Gross) Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete Overtime(Gross)");
            test.fail("Unable to delete Overtime(Gross)");
        }
    }
}
