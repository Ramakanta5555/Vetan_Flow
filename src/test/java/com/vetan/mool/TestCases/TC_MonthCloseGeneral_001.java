package com.vetan.mool.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vetan.mool.PageObjects.MonthCloseGeneralPage;



public class TC_MonthCloseGeneral_001 extends BaseClass {
    
    @Test
    public void Incentive() throws InterruptedException, IOException
    { 

      driver.get(vetanURL);
      driver.manage().window().maximize();

      MonthCloseGeneralPage mg = new MonthCloseGeneralPage(BaseClass.driver);
      Thread.sleep(2000);

      test = extent.createTest("Incentive").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

      login();
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

      mg.clickbtnPayrollHistory();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnPayrollFebruary();
      Thread.sleep(2000);

      mg.clickbtnRunPayroll();
      Thread.sleep(2000);

      mg.clickbtncheckbox();
      Thread.sleep(2000);

      mg.clickbtnRunPayrollFinal();
      Thread.sleep(5000);

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

      mg.clickbtnEmployee();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamalEmployee();
      Thread.sleep(20000);

      mg.clickbtnPayslipandForms();
      Thread.sleep(2000);

      mg.clickbtnViewFebPayslip();
      Thread.sleep(10000);
      
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
        test.info("NetPay before Monthclose addition: 119200");
        test.info("NetPay after Monthclose addition: 121200");
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


    //Variable Salary
    @Test
    public void variableSalary() throws InterruptedException, IOException
    {

      // String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		  // String repName="Test-Report-"+timeStamp+".html";

      // ExtentReports extent = new ExtentReports();
		  // String reportName = "ExtentReport";
      // String failedReportName = "FailedExtentReport";
      // // ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
      // ExtentSparkReporter spark = new ExtentSparkReporter("extent report path");
      // ExtentSparkReporter failedspark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+failedReportName).filter().statusFilter().as(new Status []{Status.FAIL}).apply();
      // failedspark.config().setDocumentTitle("Failed Tests");
      // // spark.config().setTheme(Theme.DARK);
      // // spark.config().setDocumentTitle("Extent Report");
      // // spark.config().setReportName("Extent Report");
      // final File CONF = new File("extent-config.xml"); 
      // spark.loadXMLConfig(CONF);
      test = extent.createTest("Variable_Salary").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

      // final File CONF = new File("extent-config.json");
      // spark.loadJSONConfig(CONF);

      // extent.attachReporter(spark, failedspark);
      // driver.get(vetanURL);
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
      else if(driver.getPageSource().contains("Unable to add the month close") && driver.getPageSource().contains("Incentive"))
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

      mg.clickbtnPayrollHistory();
      Thread.sleep(2000);

      //Need to change Per Month
      mg.clickbtnPayrollFebruary();
      Thread.sleep(2000);

      mg.clickbtnRunPayroll();
      Thread.sleep(2000);

      mg.clickbtncheckbox();
      Thread.sleep(2000);

      mg.clickbtnRunPayrollFinal();
      Thread.sleep(3000);

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

      mg.clickbtnEmployee();
      Thread.sleep(2000);

      mg.clickbtnRamakantaSamalEmployee();
      Thread.sleep(20000);

      mg.clickbtnPayslipandForms();
      Thread.sleep(2000);

      mg.clickbtnViewFebPayslip();
      Thread.sleep(10000);
      
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
        test.info("NetPay before Monthclose addition: 119200");
        test.info("NetPay after Monthclose addition: 121200");
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
}

