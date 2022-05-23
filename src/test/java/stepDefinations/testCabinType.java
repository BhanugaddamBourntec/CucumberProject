package stepDefinations;

import PageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testData.TestDataGenerator;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static stepDefinations.TestBase.driver;

public class testCabinType {


    @Test
    public void selectCabinType() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.united.com/en/us/");

        Actions action = new Actions(driver);
        WebElement cabinType = driver.findElement(By.id("cabinType"));
        cabinType.click();
        action.sendKeys("Premium economy");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();

        WebElement findFlights = driver.findElement(By.xpath("//*[@type='submit']//span"));

        findFlights.click();


    }


    @Test
    public void datePicker() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.united.com/en/us/");


        WebElement datePickerTab = driver.findElement(By.xpath("//*[@id='DepartDate']"));

        datePickerTab.click();



    }

    @Test
    public void bookHotelAt() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.united.com/en/us/");

        WebElement Hoteltab = driver.findElement(By.xpath("//*[@id='bookHotelTab']"));

        Hoteltab.click();


        WebElement HotelLocation = driver.findElement(By.xpath("//*[@type='text'][1]"));

        Actions action = new Actions(driver);

        action.sendKeys(HotelLocation, "Kachiguda");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER);

    }


    @Test

    public void slectRooms(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.united.com/en/us/");

        WebElement Hoteltab = driver.findElement(By.xpath("//*[@id='bookHotelTab']"));

        Hoteltab.click();


        Actions action = new Actions(driver);
        WebElement Rooms = driver.findElement(By.xpath("//*[@id='roomsDropdown']"));

        Rooms.click();
        action.sendKeys("3 rooms");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();

    }


    @Test
    public void getTime() throws InterruptedException {

//        // here we are only capturing current date, which you can use for your automated scripts.
//        DateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
//        //get current date time with Date()
//        Date date = new Date();
//        // Now format the date
//        String time1= dateFormat.format(date);
//
//        System.out.println(time1);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.united.com/en/us/");

        WebElement carTab = driver.findElement(By.xpath("//li[@id='bookCarTab']//span"));

        carTab.click();


        Thread.sleep(5000);

        WebElement timeDropdown = driver.findElement(By.xpath("//*[@id='pickupTime_label-0']"));

        timeDropdown.click();

//        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
//        String dateString = dateFormat.format(new Date()).toString();
//        System.out.println("Current time in AM/PM: "+dateString);

        Actions action = new Actions(driver);
        action.sendKeys();
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();

    }




    @Test
    public static String getCurrentTime(){

        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String dateString = dateFormat.format(new Date()).toString();

        System.out.println("Current time in AM/PM: "+dateString);

        return dateString;
    }

}