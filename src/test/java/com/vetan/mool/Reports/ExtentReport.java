// package com.vetan.mool.Reports;

// import java.io.File;
// import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Objects;
// import java.awt.Desktop;
// import com.aventstack.extentreports.ExtentReports;
// import com.aventstack.extentreports.ExtentTest;
// import com.aventstack.extentreports.Status;
// import com.aventstack.extentreports.reporter.ExtentSparkReporter;


// public class ExtentReport {
    
//     private ExtentReport() {}

//     private static ExtentReports extent;
//     public static ExtentTest test;

//     public static void initReports() throws IOException
//     {   
//         String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
//         String repName="Test-Report-"+timeStamp+".html";
//         extent = new ExtentReports();
// 		String reportName = "ExtentReport";
//       	String failedReportName = "FailedExtentReport";
//       	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
//       	ExtentSparkReporter failedspark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+failedReportName).filter().statusFilter().as(new Status []{Status.FAIL}).apply();
//       	failedspark.config().setDocumentTitle("Failed Tests");
//       	final File CONF = new File("extent-config.xml"); 
//       	spark.loadXMLConfig(CONF);
// 		extent.attachReporter(spark, failedspark);

//     }
      

//     public static void flushReports() throws IOException
//     {
//         extent.flush();
//         Desktop.getDesktop().browse(new File("index.html").toURI());
//     }
    

//     public static void createTest(String testcasename)
//     {
//         ExtentTest test = extent.createTest(testcasename);
//     } 
// }
