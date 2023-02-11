package com.vetan.mool.TestCases;

import java.io.File;  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.Utilities.readConfig;

public class BaseClass {
	
	public static final String scrollDown = null;

	readConfig readconfig = new readConfig();
	
	public String vetanURL = readconfig.getvetanURL();
	public String stageURL = readconfig.getstageURL();
	public String devURL = readconfig.getdevURL();
	public String landingPageURL = readconfig.getlandingPageURL();
	public String localHost = readconfig.getlocalHost();
	public String devUserName = readconfig.getdevUserName();
	public String devPassword = readconfig.getdevPassword();
	public String prodUserName = readconfig.getdprodUserName();
	public String prodPassword = readconfig.getprodPassword();
	public String gmail = readconfig.getgmail();
	public static WebDriver driver; 
	
	public static Logger logger;
	
	
    public static ExtentReports extent;
    public static ExtentTest test;
	

	@BeforeSuite
	public void BeforeSuite() throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="Test-Report-"+timeStamp+".html";
		extent = new ExtentReports();
      	String failedReportName = "FailedExtentReport";
      	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/extentReport/"+repName);
      	ExtentSparkReporter failedspark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+failedReportName).filter().statusFilter().as(new Status []{Status.FAIL}).apply();
      	failedspark.config().setDocumentTitle("Failed Tests");
      	// spark.config().setTheme(Theme.DARK);
      	// spark.config().setDocumentTitle("Extent Report");
      	// spark.config().setReportName("Extent Report");
      	final File CONF = new File("extent-config.xml"); 
      	spark.loadXMLConfig(CONF);
		extent.attachReporter(spark, failedspark);
      	

	}
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver(); 
		}else if(br.equals("safari"))
		{
			driver = new SafariDriver();
		}
		
		driver.get(vetanURL);
		
		
		logger  =  Logger.getLogger("Vetan_Flow");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	//ScreenShots
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		logger.info("Screenshot taken");
	}
	
	//Implicit Wait

	public void implicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	//Scrolldown

	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void scrollUp()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1500)");
	}

	
	
	
	
	
	
	//Random Generations
	public String randomPanalpha()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomPannumeric()
	{
		String generatedString = RandomStringUtils.randomNumeric(4);
		return generatedString;
	}
	
	//Phone
	public String randomPhone()
	{
		String generatedString = 7 + RandomStringUtils.randomNumeric(9);
		return generatedString;
	}
	
	//Email
	public String randomEmail()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(7);
		return generatedString;
	}
	
	//Name
	public String randomFName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomLName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public String randomEmpid()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(5);
		return generatedString;
	}	
	
	public String randomCtc()
	{
		String generatedString = RandomStringUtils.randomNumeric(5);
		return generatedString;
	}	
	
	public String randomUserName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomOrgname()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}

	//Login

	public void login() throws InterruptedException
	{
	LoginPage lp = new LoginPage(BaseClass.driver);
	Thread.sleep(2000);

	lp.settxtUsername(prodUserName);

	lp.clickbtnContinue();
	Thread.sleep(2000);
	
	lp.settxtPassword(prodPassword);
	Thread.sleep(2000);
	
	lp.clickbtnSignin();
	Thread.sleep(2000);
			
	System.out.println(driver.getTitle());

}
		
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() throws IOException
	{
		
		extent.flush();
	}
	
	
}


// // Gmail Signin
// 	 //Page Object
// 	 @FindBy(xpath="/html/body/header/div/div/div/a[2]");
// 	 @CacheLookup
// 	 WebElement btnGmailSignin;
 
// 	 public void clicknbtnGmailSignin()
// 	 {
// 		 btnGmailSignin.click();
// 	 }
 
// 	 @FindBy(xpath = "//*[@id='identifierId']")
// 	 @CacheLookup
// 	 WebElement txtEmailorPhone;
 
// 	 public void settxtEmailorPhone(String Ep)
// 	 {
// 		 txtEmailorPhone.sendKeys(Ep);
// 	 }
 
