package stepDefinations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

import java.io.File;


public class MyExtentReportDemo {


    @Test

    public void getExtentReports() {

        // object creation for extent reports
        ExtentReports reports = new ExtentReports();

        ExtentHtmlReporter htmlReporter;

        // for creating tests
        ExtentTest test;

        // initialising variable to store report name in specified path
        String reportName = System.getProperty("user.dir") + "/Reports/FirstExtentReport.html";

        // Assigning report name to htmlreporter
        htmlReporter = new ExtentHtmlReporter(new File(reportName));

        // properties for extent report
        htmlReporter.loadXMLConfig(String.valueOf(new File(System.getProperty("user.dir") + "/src/test/resources/extent-config.xml")));


        reports.setSystemInfo("Browser", "Chrome");
        reports.setSystemInfo("Author", "BhanuGaddam");
        reports.setSystemInfo("Executed By", System.getProperty("user.name"));
        reports.setSystemInfo("Operating System", System.getProperty("os.name"));

        reports.attachReporter(htmlReporter);

        test = reports.createTest("TestName - Extent Report 1");
        test.info("This is info message");
        test.pass("Test Case is passed");

        test = reports.createTest("TestName - Extent Report 2");
        test.info("This is Display message");
        test.pass("Test Case is passed");
        test.fail("Test Case is failed");


        // to get report for every scenario execution

      //  test = reports.createTest("Scenario : " +scenario.getName());

        reports.flush();  // it is mandatory to close and get reports

    }

}

