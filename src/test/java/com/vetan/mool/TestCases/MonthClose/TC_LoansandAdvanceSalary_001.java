package com.vetan.mool.TestCases.MonthClose;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoansandAdvanceSalaryPage;
import com.vetan.mool.TestCases.BaseClass;

public class TC_LoansandAdvanceSalary_001 extends BaseClass{
    
    @Test
    public void LoansandAdvanceSalary() throws InterruptedException
    {
        test = extent.createTest("LoansandAdvanceSalary").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();

        LoansandAdvanceSalaryPage LAP = new LoansandAdvanceSalaryPage(driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        LAP.clickbtnPayroll();
        Thread.sleep(2000);

        LAP.clickbtnPayrollInput();
        Thread.sleep(2000);

        LAP.clickbtnLoansandAvdanceSalary();
        Thread.sleep(2000);

        LAP.clickbtnAdd();
        Thread.sleep(2000);

        LAP.clickbtnEmployeeName();
        Thread.sleep(2000);

        LAP.clickbtnRamakantaSamal();
        Thread.sleep(2000);

        LAP.clickbtnStartMonth();
        Thread.sleep(2000);

        LAP.clickbtnJanuary();
        Thread.sleep(2000);

        // LAP.clickbtnStartYear();
        // Thread.sleep(2000);

        // LAP.goDown();
        // Thread.sleep(10000);

        

        // scrollDown();
        // Thread.sleep(2000);

        // scrollUp();
        // Thread.sleep(2000);

        LAP.clicknbtnS2023();
        Thread.sleep(2000);

        LAP.clickbtnEndMonth();
        Thread.sleep(2000);

        LAP.clickbtnFebruary();
        Thread.sleep(2000);

        LAP.clickbtnEndYear();
        Thread.sleep(2000);

        LAP.settxtEndYear("2023");
        Thread.sleep(2000);

        LAP.clickbtnE2023();
        Thread.sleep(2000);

        LAP.settxtInterentAmount("1000");
        Thread.sleep(2000);

        LAP.settxtTotalAmountInclInterestAmount("5000");
        Thread.sleep(2000);

        LAP.clickbtnAddToMonthEndData();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully added the Loan and Advance Salary") && driver.getPageSource().contains("-2500")) 
        {
            logger.info("Successfully added loan for the employee");
            test.pass("Successfully added loan for the employee");
        }
        else
        {
            logger.info("Failed to add Loan ");
            test.fail("Failed to add Loan ");
        }

    }
}
