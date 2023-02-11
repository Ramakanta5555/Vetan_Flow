package com.vetan.mool.TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vetan.mool.PageObjects.MonthCloseArrearPage;


public class TC_MonthCloseArrear_001 extends BaseClass{
    
    @Test
    public void MonthCloseArrear() throws InterruptedException
    {
        test = extent.createTest("Arrear").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();
        
        MonthCloseArrearPage ma = new MonthCloseArrearPage(BaseClass.driver);
        Thread.sleep(2000);

        login();
        implicitlyWait();

        ma.clickbtnPayroll();
        Thread.sleep(2000);

        ma.clickbtnPayrollInput();
        Thread.sleep(2000);

        ma.clickbtnArrear();
        Thread.sleep(2000);

        ma.clickbtnAdd();
        Thread.sleep(5000);

        ma.clickbtnEmployeeName();
        implicitlyWait();

        ma.clickbtnRamakantaSamal();
        Thread.sleep(5000);

        // ma.clickbtnAllowancesArrear();
        // implicitlyWait();

        ma.clickbtnStartMonth();
        Thread.sleep(2000);

        ma.clickbtnJanuary();
        Thread.sleep(2000);

        ma.clickbtnStartYear();
        Thread.sleep(2000);

        ma.settxtStartYear("2023");
        Thread.sleep(2000);

        ma.clicknbtnS2023();
        Thread.sleep(2000);

        ma.clickbtnEndMonth();
        Thread.sleep(2000);

        ma.clickbtnFebruary();
        Thread.sleep(2000);

        ma.clickbtnEndYear();
        Thread.sleep(2000);

        ma.settxtEndYear("2023");
        Thread.sleep(2000);

        ma.clickbtnE2023();
        Thread.sleep(2000);

        // ma.clickbtnMultiPhase();
        // implicitlyWait();

        ma.settxtTotalAmount("3000");
        Thread.sleep(2000);

        ma.clickbtnAddtoMonthEndData();
        Thread.sleep(2000);

        if(driver.getPageSource().contains("Arrear Added Successfully!") && driver.getPageSource().contains("3000"))
        {
            Assert.assertTrue(true);
            logger.info("Successfullty added Arrear For the Employee");
            test.pass("Successfullty added Arrear For the Employee");
            test.info("Arrear Value: 3000");
        }
        else
        {
            test.fail("Unable to add Arrear For the Employee");
            logger.info("Unable to add Arrear For the Employee");
        }

        ma.clickbtnPayrollHistory();
        Thread.sleep(2000);

        ma.clickbtnPayrollFebruary();
        Thread.sleep(2000);

        ma.clickbtnRunPayroll();
        Thread.sleep(2000);

        ma.clickbtncheckbox();
        Thread.sleep(2000);

        ma.clickbtnRunPayrollFinal();
        Thread.sleep(5000);

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
        

        ma.clickbtnEmployee();
        Thread.sleep(2000);

        ma.clickbtnRamakantaSamalEmployee();
        Thread.sleep(2000);

        ma.clickbtnPayslipandForms();
        Thread.sleep(2000);

        ma.clickbtnViewFebPayslip();
        Thread.sleep(5000);

        if (driver.getPageSource().contains("4,048.00") && driver.getPageSource().contains("122,152")) 
        {
            Assert.assertTrue(true);
            logger.info("Arrear Added to the Feb Payslip");
            test.pass("Arrear Added to the Feb Payslip");
            test.info("Basic: 1200");
            test.info("HRA:450");
            test.info("SA: 1234.80");
            test.info("Mobile: 24");
            test.info("Food: 48");
            test.info("Gross: 126200");
            test.info("Netpay before Arrear: 119152");
            test.info("Netpay After Arrear : 122152");
        }
        else
        {
            test.fail("Error: Unable to add Arrear");
            logger.info("Error: Unable to add Arrear");
        }

        ma.clickbtnCloseOPayslip();
        implicitlyWait();

        try {
            ma.clickbtnPayroll();
            Thread.sleep(2000);

            ma.clickbtnPayrollInput();
            Thread.sleep(2000);

            ma.clickbtnArrear();
            Thread.sleep(2000);


        } catch (StaleElementReferenceException e) {
            WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
            btnPayroll.click();
            Thread.sleep(2000);

            WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
            payrollinput.click();
            Thread.sleep(2000); 

            WebElement btnArrear = driver.findElement(By.xpath("(//span[normalize-space()='Arrears'])[1]"));
            btnArrear.click();
            Thread.sleep(2000); 
        }


        ma.clickbtnDeleteArrear();
        Thread.sleep(5000); 

        ma.clickbtnConfirmDelete();
        Thread.sleep(2000); 

        if (driver.getPageSource().contains("Successfully deleted month close")) {
            
            test.pass("Arrear Deleted Successfully");
            logger.info("Arrear Deleted Successfully");
        }
        else
        {   
            test.fail("Unable to Deleted Arrear");
            logger.info("Unable to Deleted Arrear");   
        }

        
        
    }
}
