package com.vetan.mool.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vetan.mool.PageObjects.MonthCloseGeneralPage;



public class TC_MonthCloseGeneral_001 extends BaseClass {
    

    //4. Award
    @Test
    public void Awards() throws InterruptedException
    {
      test = extent.createTest("Awards").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(3000);

      login();
      Thread.sleep(5000);

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(5000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnAwards();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Awards Added Successfully");
        test.pass("Successfully added the Awards");
        test.info("Awards amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Awards"))
      {
        logger.info("Unstable: There are a Awards added already For this month For that Employee");
        test.info("There are a Awards added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Awards");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Awards");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      //Employee Payslip

      Employee_Payslip();
      Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Award") && driver.getPageSource().contains("2000"))
      {
        logger.info("Awards added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Awards added to the Payslip");
        test.info("Awards amount: 2000");
      }else
      {
        logger.info("Error: Awards not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Awards not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Awards Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Awards Calculated correctly on Payslip");
        test.info("NetPay before Awards addition: 119200");
        test.info("NetPay after Awards addition: 121200");
      }
      else
      { 
        logger.info("Error: There is some error on Awards Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Awards Calculation");
        test.info("NetPay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(15000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Awards Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Awards Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Awards");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Awards");
      }

      //7.Attendance Bonus

      test = extent.createTest("Attendance_Bonus").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      try {
        mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);
      } catch (StaleElementReferenceException e) {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement btnPayrollInput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        btnPayrollInput.click();
        Thread.sleep(2000);

        WebElement btnAddSingleRecord = driver.findElement(By.xpath("(//img[@alt='sec-icon'])[1]"));
        btnAddSingleRecord.click();
        Thread.sleep(2000);

        WebElement btnSingleRecord = driver.findElement(By.xpath("(//span[normalize-space()='Single Record'])[1]"));
        btnSingleRecord.click();
        Thread.sleep(2000);

        WebElement btnEmployeeName = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
        btnEmployeeName.click();
        Thread.sleep(2000);

        WebElement btnRamakantaSamal = driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]"));
        btnRamakantaSamal.click();
        Thread.sleep(2000);
        
        WebElement btnFinancialYear = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
        btnFinancialYear.click();
        Thread.sleep(2000);

        WebElement btn2023 = driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='2022-2023'])[1]"));
        btn2023.click();
        Thread.sleep(2000);

        WebElement btnCreditCatagory = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
        btnCreditCatagory.click();
        Thread.sleep(2000);

        WebElement btnAttendanceBonus = driver.findElement(By.xpath("(//div[contains(text(),'Attendance Bonus')])[1]"));
        btnAttendanceBonus.click();
        Thread.sleep(2000);

        WebElement sendtxtAmount = driver.findElement(By.xpath("(//input[@placeholder=' '])[1]"));
        sendtxtAmount.sendKeys("2000");
        Thread.sleep(2000);

        WebElement btnAdd = driver.findElement(By.xpath("(//div[contains(text(),'Add to the month end data')])[1]"));
        btnAdd.click();
        Thread.sleep(2000);
      }

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Attendance_Bonus Added Successfully");
        test.pass("Successfully added the Attendance_Bonus");
        test.info("Attendance_Bonus amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Attendance_Bonus"))
      {
        logger.info("Unstable: There are a Attendance_Bonus added already For this month For that Employee");
        test.info("There are a Attendance_Bonus added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Attendance_Bonus");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Attendance_Bonus");
      }
      try {

      mg.clickbtnPayrollHistory();
      Thread.sleep(2000);

      mg.clickbtnPayrollMarch();  //Change the xpath and Month for every month
      Thread.sleep(2000);

      mg.clickbtnRunPayroll();
      Thread.sleep(2000);

      mg.clickbtncheckbox();
      Thread.sleep(2000);

      mg.clickbtnRunPayrollFinal();
      Thread.sleep(3000);
        
      } catch (StaleElementReferenceException e) {

        WebElement btnPayrollHistory = driver.findElement(By.xpath("(//a[@href='/org/payroll/history'])[1]"));
        btnPayrollHistory.click();
        Thread.sleep(2000);

        WebElement btnPayrollFebruary = driver.findElement(By.xpath("(//h3[normalize-space()='Payroll for February'])[1]"));
         //Change the xpath and Month for every month
        btnPayrollFebruary.click();
        Thread.sleep(2000);

        WebElement btnRunPayroll = driver.findElement(By.xpath("(//div[contains(text(),'Run payroll')])[1]"));
        btnRunPayroll.click();
        Thread.sleep(2000);

        WebElement btncheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        btncheckbox.click();
        Thread.sleep(2000);

        WebElement btnRunPayrollFinal = driver.findElement(By.xpath("(//div[contains(text(),'Run Payroll')])[1]"));
        btnRunPayrollFinal.click();
        Thread.sleep(5000);
      }

      if(driver.getPageSource().contains("Payroll has been processed successfully") && driver.getPageSource().contains("Ramakanta Samal"))
      {
        Assert.assertTrue( true);
        logger.info("Payroll run Successfully");
        test.pass("Payroll run Successfully");
      }
      else
      {
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      try {
        
        mg.clickbtnEmployee();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamalEmployee();
      Thread.sleep(20000);

      mg.clickbtnPayslipandForms();
      Thread.sleep(2000);

      mg.clickbtnViewFebPayslip();
      Thread.sleep(10000);

      } catch (StaleElementReferenceException e) {
        
        WebElement btnEmployee = driver.findElement(By.xpath("(//img[@alt='Employees'])[1]"));
        btnEmployee.click();
        Thread.sleep(2000);

        WebElement btnRamakantaSamalEmployee = driver.findElement(By.xpath("(//td[@class='ant-table-cell ant-table-column-sort ant-table-cell-fix-left ant-table-cell-fix-left-last'])[1]"));
        btnRamakantaSamalEmployee.click();
        Thread.sleep(15000);

        WebElement btnPayslipandForms = driver.findElement(By.xpath("(//span[normalize-space()='Payslips & Forms'])[1]"));
        btnPayslipandForms.click();
        Thread.sleep(2000);

        WebElement btnViewFebPayslip = driver.findElement(By.xpath("(//div[contains(text(),'View')])[1]"));
        btnViewFebPayslip.click();
        Thread.sleep(2000);
      }
      
      if(driver.getPageSource().contains("Attendance_Bonus") && driver.getPageSource().contains("2000"))
      {
        logger.info("Attendance_Bonus added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Attendance_Bonus added to the Payslip");
        test.info("Attendance_Bonus amount: 2000");
      }else
      {
        logger.info("Error: Attendance_Bonus not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Attendance_Bonus not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Attendance_Bonus Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Attendance_Bonus Calculated correctly on Payslip");
        test.info("NetPay before Attendance_Bonus addition: 119200");
        test.info("NetPay after Attendance_Bonus addition: 121200");
        System.out.println(Math.subtractExact(121200, 119200));
      }
      else
      { 
        logger.info("Error: There is some error on Attendance_Bonus Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Attendance_Bonus Calculation");
        test.info("NetPay: 119200");
      }

      try {

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      } catch (StaleElementReferenceException e) {
        
        WebElement btnCloseOPayslip = driver.findElement(By.xpath("(//*[name()='svg'])[3]"));
        btnCloseOPayslip.click();
        Thread.sleep(2000);
      }

      driver.navigate().refresh();
      Thread.sleep(10000);
      
      // FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30));
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[normalize-space()='Dashboard'])[1]")));

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      try{
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnDeleteIncentive = driver.findElement(By.xpath("(//div[@class='button-lib-content'])[1]"));
        btnDeleteIncentive.click();
        Thread.sleep(2000); 

        WebElement btnDeleteIncentiveOk = driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]"));
        btnDeleteIncentiveOk.click();
        Thread.sleep(2000);  
      }
      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Attendance_Bonus Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Attendance_Bonus Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Attendance_Bonus");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Attendance_Bonus");
      }
    }
    //MonthClose/General
    //1. Incentive
    @Test
    public void Incentive() throws InterruptedException
    { 

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(2000);

      test = extent.createTest("Incentive").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnIncentive();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Incentive Added Successfully");
        test.pass("Successfully added the month close");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Incentive"))
      {
        logger.info("Unstable: There are a Incentive added already For this month For that Employee");
        test.info("There are a Incentive added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add incentive");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add incentive");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      //Employee Payslip

      Employee_Payslip();
      Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Incentive") && driver.getPageSource().contains("2000"))
      {
        logger.info("Incentive added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Incentive added to the Payslip");
        test.info("Incentive amount: 2000");
      }else
      {
        logger.info("Error: Incentive not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Incentive not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Incentive Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Incentive Calculated correctly on Payslip");
        test.info("NetPay before Incentive addition: 119200");
        test.info("NetPay after Incentive addition: 121200");
      }
      else
      { 
        logger.info("Error: There is some error on Incentive Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Incentive Calculation");
        test.info("Netpay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(5000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Incentive Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Incentive Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Incentive");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Incentive");
      }
    }


    //2. Variable Salary
    @Test
    public void variableSalary() throws InterruptedException, IOException
    {
      test = extent.createTest("Variable_Salary").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(3000);

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnVariableSalary();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Variable Salary Added Successfully");
        test.pass("Successfully added the Variable Salary");
        test.info("Variable_Salary amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Variable_Salary"))
      {
        logger.info("Unstable: There are a Variable Salary added already For this month For that Employee");
        test.info("There are a Variable Salary added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Variable Salary");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Variable Salary");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      //Employee Payslip

      Employee_Payslip();
      Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Variable_Salary") && driver.getPageSource().contains("2000"))
      {
        logger.info("Variable Salary added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Variable Salary added to the Payslip");
        test.info("Variable_Salary amount: 2000");
      }else
      {
        logger.info("Error: Variable Salary not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Variable Salary not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Variable Salary Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Variable Salary Calculated correctly on Payslip");
        test.info("NetPay before Variable Salary addition: 119200");
        test.info("NetPay after Variable Salary addition: 121200");
        Math.subtractExact(121200, 119200);
      }
      else
      { 
        logger.info("Error: There is some error on Variable Salary Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Variable Salary Calculation");
        test.info("NetPay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(10000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Variable Salary Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Variable Salary Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Variable Salary");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Variable Salary");
      }
    }

    //3. Other_Allowances
    @Test
    public void otherAllowances() throws InterruptedException
    {
      test = extent.createTest("Other_Allowances").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(2000);

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnOtherAllowances();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Other_Allowances Added Successfully");
        test.pass("Successfully added the Other_Allowances");
        test.info("Other_Allowances amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Other_Allowances"))
      {
        logger.info("Unstable: There are a Other_Allowances added already For this month For that Employee");
        test.info("There are a Other_Allowances added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Other_Allowances");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Other_Allowances");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      //Employee Payslip

      Employee_Payslip();
      Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Other_Allowance") && driver.getPageSource().contains("2000"))
      {
        logger.info("Other_Allowances added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Other_Allowances added to the Payslip");
        test.info("Other_Allowances amount: 2000");
      }else
      {
        logger.info("Error: Other_Allowances not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Other_Allowances not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Other_Allowances Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Other_Allowances Calculated correctly on Payslip");
        test.info("NetPay before Other_Allowances addition: 119200");
        test.info("NetPay after Other_Allowances addition: 121200");
        System.out.println(Math.subtractExact(121200, 119200));
      }
      else
      { 
        logger.info("Error: There is some error on Other_Allowances Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Other_Allowances Calculation");
        test.info("NetPay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(10000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Other_Allowances Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Other_Allowances Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Other_Allowances");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Other_Allowances");
      }

    }   
    //5. Rewards
    @Test
    public void Rewards() throws InterruptedException
    {
      test = extent.createTest("Rewards").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(5000);

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnRewards();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Rewards Added Successfully");
        test.pass("Successfully added the Rewards");
        test.info("Rewards amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Rewards"))
      {
        logger.info("Unstable: There are a Rewards added already For this month For that Employee");
        test.info("There are a Rewards added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Rewards");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Rewards");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

      //Employee Payslip

        Employee_Payslip();
        Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Rewards") && driver.getPageSource().contains("2000"))
      {
        logger.info("Rewards added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Rewards added to the Payslip");
        test.info("Rewards amount: 2000");
      }else
      {
        logger.info("Error: Rewards not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Rewards not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Rewards Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Rewards Calculated correctly on Payslip");
        test.info("NetPay before Rewards addition: 119200");
        test.info("NetPay after Rewards addition: 121200");
        System.out.println(Math.subtractExact(121200, 119200));
      }
      else
      { 
        logger.info("Error: There is some error on Rewards Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Rewards Calculation");
        test.info("NetPay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(10000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Rewards Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Rewards Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Rewards");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Rewards");
      }

    }
    //6. Leave_Encashment
    @Test
    public void LeaveEncashment() throws InterruptedException
    {
      test = extent.createTest("Leave_Encashment").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(5000);

      mg.clickbtnPayroll();
      Thread.sleep(2000);

      mg.clickbtnPayrollInput();
      Thread.sleep(2000);

      mg.clickbtnAddSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnSingleRecord();
      Thread.sleep(2000);

      mg.clickbtnEmployeeName();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamal();
      Thread.sleep(2000);

      mg.clickbtnFinancialYear();
      Thread.sleep(2000);

      mg.clickbtn2023();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnMonth();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnFebruary();
      Thread.sleep(2000);

      mg.clickbtnCreditCatagory();
      Thread.sleep(2000);

      mg.clickbtnLeaveEncashment();
      Thread.sleep(2000);

      mg.sendtxtAmount("2000");
      Thread.sleep(2000);

      mg.clickbtnAdd();
      Thread.sleep(2000);

      if(driver.getPageSource().contains("Successfully added the month close") && driver.getPageSource().contains("2000"))
      {
        Assert.assertTrue( true);
        logger.info("Success: Leave_Encashment Added Successfully");
        test.pass("Successfully added the Leave_Encashment");
        test.info("Leave_Encashment amount = 2000");
      }
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Leave_Encashment"))
      {
        logger.info("Unstable: There are a Leave_Encashment added already For this month For that Employee");
        test.info("There are a Leave_Encashment added already For this month For that Employee");
      }
      else
      {
        logger.info("Error: unable to Add Leave_Encashment");
        Assert.assertTrue(false);
        test.fail("Error: unable to Add Leave_Encashment");
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
        Assert.assertTrue( false);
        logger.info("Error: Unable to run the Payroll");
        test.fail("Unable to run the Payroll");
      }

     //Employee Payslip

     Employee_Payslip();
     Thread.sleep(2000);
      
      if(driver.getPageSource().contains("Leave_Encashment") && driver.getPageSource().contains("2000"))
      {
        logger.info("Leave_Encashment added to the Payslip");
        Assert.assertTrue(true);
        test.pass("Leave_Encashment added to the Payslip");
        test.info("Leave_Encashment amount: 2000");
      }else
      {
        logger.info("Error: Leave_Encashment not avilable on the Payslip");
        Assert.assertTrue(false);
        test.fail("Error: Leave_Encashment not avilable on the Payslip");
      }

      if(driver.getPageSource().contains("121,200"))
      {
        logger.info("Leave_Encashment Calculated correctly on Payslip"); 
        Assert.assertTrue(true);
        test.pass("Leave_Encashment Calculated correctly on Payslip");
        test.info("NetPay before Leave_Encashment addition: 119200");
        test.info("NetPay after Leave_Encashment addition: 121200");
        System.out.println(Math.subtractExact(121200, 119200));
      }
      else
      { 
        logger.info("Error: There is some error on Leave_Encashment Calculation");
        // Assert.assertTrue(false);
        test.fail("Error: There is some error on Leave_Encashment Calculation");
        test.info("NetPay: 119200");
      }

      mg.clickbtnCloseOPayslip();
      Thread.sleep(2000);

      driver.navigate().refresh();
      Thread.sleep(10000);

      try
      {
      mg.clickbtnPayroll();
      Thread.sleep(2000);
      mg.clickbtnPayrollInput();
      Thread.sleep(2000);
      }
      catch(StaleElementReferenceException e)
      {
        WebElement btnPayroll = driver.findElement(By.xpath("(//img[@alt='Payroll'])[1]"));
        btnPayroll.click();
        Thread.sleep(2000);

        WebElement payrollinput = driver.findElement(By.xpath("(//a[@href='/org/payroll/payroll_inputs'])[1]"));
        payrollinput.click();
        Thread.sleep(2000); 
      }
      mg.clickbtnDeleteIncentive();
      Thread.sleep(2000);

      mg.clickbtnDeleteIncentiveOk();
      Thread.sleep(3000);

      if(driver.getPageSource().contains("Successfully deleted month close"))
      {
        logger.info("Successful: Leave_Encashment Deleted successfully");
        Assert.assertTrue(true);
        test.pass("Successful: Leave_Encashment Deleted successfully");
      }
      else
      {
        logger.info("Error: Unable to delete Leave_Encashment");
        Assert.assertTrue(false);
        test.fail("Error: Unable to delete Leave_Encashment");
      }
    }
    
}

