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

        if (driver.getPageSource().contains("4,048.00") && driver.getPageSource().contains("122,152")) 
        {
            Assert.assertTrue(true);
            logger.info("Arrear Added to the Feb Payslip");
            test.pass("Arrear Added to the Feb Payslip");
            test.info("Basic: 1200.00");
            test.info("HRA:450.00");
            test.info("SA: 1234.80");
            test.info("Mobile: 24.00");
            test.info("Food: 48.00");
            test.info("Gross: 126,200.00");
            test.info("Netpay before Arrear: 119,152.00");
            test.info("Netpay After Arrear : 122,152.00");
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

    //Multipurpose
    @Test
    public void MonthCloseArrearMultiPhase() throws InterruptedException
	{
        test = extent.createTest("Arrear_MultiPhase").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        driver.manage().window().maximize();

        MonthCloseArrearPage ma = new MonthCloseArrearPage(BaseClass.driver);
        Thread.sleep(2000);

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

        ma.clickbtnAllowancesArrear();
        Thread.sleep(5000);

        ma.clickbtnSelectAllowances();
        Thread.sleep(2000);

        ma.clickbtnFoodAllowances();
        Thread.sleep(2000);

        ma.clickbtnAllowancesStartMonth();
        Thread.sleep(2000);

        ma.clickbtnJanuary();
        Thread.sleep(2000);

        ma.clickbtnAllowancesStartYear();
        Thread.sleep(2000);

        ma.settxtAllowancesStartYear("2023");
        Thread.sleep(2000);

        ma.clicknbtnS2023();
        Thread.sleep(2000);

        ma.clickbtnAllowancesEndMonth();
        Thread.sleep(2000);

        ma.clickbtnFebruary();
        Thread.sleep(2000);

        ma.clickbtnAllowancesEndYear();
        Thread.sleep(2000);

        ma.settxtAllowancesEndYear("2023");
        Thread.sleep(2000);

        ma.clickbtnE2023();
        Thread.sleep(2000);

        ma.clickbtnMultiPhase();
        implicitlyWait();

        ma.clickbtnFromMonth();
        Thread.sleep(2000);

        ma.clickbtnFromMonthFebruary();
        Thread.sleep(2000);

        ma.clickbtnFromYear();
        Thread.sleep(2000);

        ma.clickbtnFromYear2023();
        Thread.sleep(2000);

        ma.clickbtnToMonth();
        Thread.sleep(2000);

        ma.clickbtnToMonthMarch();
        Thread.sleep(2000);

        ma.clickbtnToYear();
        Thread.sleep(2000);

        ma.clickbtnToYear2023();
        Thread.sleep(2000);

        ma.settxtTotalAmount("3000");
        Thread.sleep(2000);

        ma.clickbtnAddtoMonthEndData();
        Thread.sleep(2000);

        if(driver.getPageSource().contains("Arrear Added Successfully!") && driver.getPageSource().contains("3000"))
        {
            Assert.assertTrue(true);
            logger.info("Successfullty added MultiPhase_Arrear For the Employee");
            test.pass("Successfullty added MultiPhase_Arrear For the Employee");
            test.info("MultiPhase_Arrear Value: 1500");
        }
        else
        {
            test.fail("Unable to add MultiPhase_Arrear For the Employee");
            logger.info("Unable to add MultiPhase_Arrear For the Employee");
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

        if (driver.getPageSource().contains("4,048.00") && driver.getPageSource().contains("122,152")) 
        {
            Assert.assertTrue(true);
            logger.info("MultiPhase_Arrear Added to the Feb Payslip");
            test.pass("MultiPhase_Arrear Added to the Feb Payslip");
            test.info("Basic: 600.00");
            test.info("HRA:225.00	");
            test.info("SA: 617.40");
            test.info("Mobile: 12.00");
            test.info("Food: 24.00");
            test.info("Gross: 124,700.00");
            test.info("Netpay before Arrear: 119,152.00");
            test.info("Netpay After Arrear : 120,676");
        }
        else
        {
            test.fail("Error: Unable to add MultiPhase_Arrear");
            logger.info("Error: Unable to add MultiPhase_Arrear");
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
        Thread.sleep(2000); 

        ma.clickbtnConfirmDelete();
        Thread.sleep(4000);

        try {
            ma.clickbtnDeleteArrear();
            Thread.sleep(2000); 

            ma.clickbtnConfirmDelete();
            Thread.sleep(4000);
        } catch (StaleElementReferenceException e) {
            
            WebElement btnDeleteArrear = driver.findElement(By.xpath("(//img[@alt='pri-icon'])[3]"));
            btnDeleteArrear.click();
            Thread.sleep(2000); 

            WebElement btnConfirmDelete = driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]"));
            btnConfirmDelete.click();
            Thread.sleep(2000); 
        }


        if (driver.getPageSource().contains("Successfully deleted month close"))
        {
            logger.info("MultiPhase_Arrear Deleted Successfully Deleted");
            test.pass("MultiPhase_Arrear Deleted Successfully Deleted");  
        } else 
        {
            logger.info("Unable to delete MultiPhase_Arrear");
            test.fail("Unable to delete MultiPhase_Arrear");    
        }  
        

            
	}
}
