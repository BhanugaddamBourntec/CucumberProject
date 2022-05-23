package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepDefinations.TestBase;

import java.util.List;

public class HomePage extends TestBase {
    private By menuLink;
    public By subMenuLink;
    private By travelTab;
    private By travelTabSelectedStatus;
    private By fightTypeRadio;
    private By flightTicketOriginCity;
    private By flightTicketDestinationCity;
    private By findFlightsButton;
    private By originFlightsList;
    private By destinationFlightsList;
    private By TravellerMenuOpen;
    private By TravellerMenuClose;
    private By adultInput;
    private By adultAdd;
    private By fromDateEdit;
    private By economyPrices;
    private By economyRefundablePrices;
    private By businessPrices;
    private By economyPremiumEconomyPrices;
    private By flightInfoDuration;
    private By flightInfoStartTime;
    private By flightInfoEndTime;
    private By bestPricesList;
    private By bestDatesToTravel;
    private By toDateEdit;
    private By oneWayFlight;

    private By selectFlightOption;
    private By goingToCity;
    private By checkInDAte;
    private By checkOutDate;
    private By No_of_Adults;
    private By Hotel_adultAdd;
    private By Rooms;
    private By checkbox;
    private By clickFindHotels;
    private By Hotel_location;
    private By pickTime;
    private By dropTimeButton;
    private By findCars;
    private By carPickUpLocation;
    private By carPick_date;
    private By carDrop_date;
    private By carTab;
    private By PackageTab;
    private By packageType;
    private By Flight_from;
    private By package_departDATE;
    private By Flight_To;
    private By package_ReturnDATE;
    private By package_Adults;
    private By package_AdultsAdd;
    private By package_Rooms;
    private By FindTrips;
    private By pickupTimeList;
    private By dropOffTimeList;

    public HomePage() {
        InitElements();
    }

    private void InitElements() {
        travelTab = By.xpath("//li[@id='travelTab']");
        travelTabSelectedStatus = By.xpath("//li[@id='travelTab'][@aria-selected='true']");
        flightTicketOriginCity = By.xpath("//input[@id='bookFlightOriginInput']");
        flightTicketDestinationCity = By.xpath("//input[@id='bookFlightDestinationInput']");
        findFlightsButton = By.xpath("//button[@type='submit']//span[text()='Find flights']");
        originFlightsList = By.xpath("//*[@id='bookFlightOriginInput-menu']//button//span");
        destinationFlightsList = By.xpath("//*[@id='bookFlightDestinationInput-menu']//button//span");
        TravellerMenuOpen = By.xpath("//p[@id='stuff']//following-sibling::button");
        TravellerMenuClose = By.xpath("//button[@class='atm-c-btn atm-c-btn--bare']");
        adultInput = By.xpath("//button[@aria-label='Add one more Adult']//following-sibling::input[1]");
        adultAdd = By.xpath("//button[@aria-label='Substract one Adult']");

        fromDateEdit = By.xpath("//input[@id='DepartDate']");

        toDateEdit = By.xpath("//input[@id='ReturnDate']");
        economyPrices = By.xpath("");
        economyRefundablePrices = By.xpath("");
        economyPremiumEconomyPrices = By.xpath("");
        businessPrices = By.xpath("");
        flightInfoDuration = By.xpath("");
        flightInfoStartTime = By.xpath("");
        flightInfoEndTime = By.xpath("");
        bestPricesList = By.xpath("//div[@class='app-components-Shopping-FareWheelCard-styles__amountValue--3IF2-']//span");
        bestDatesToTravel = By.xpath("//div[@class='app-components-Shopping-FareWheelCard-styles__dateLabel--MAATI']");

        selectFlightOption = By.xpath("//li[@id='bookFlightTab']");
        goingToCity = By.xpath("//input[@id=\"bookHotelInput\"]");

        checkInDAte = By.xpath("//input[@id='bookHotelCheckinDate']");
        checkOutDate = By.xpath("//input[@id='bookHotelCheckoutDate']");

        No_of_Adults = By.xpath("//*[@id=\"bookHotelModel.passengers\"]");
        Hotel_adultAdd = By.xpath("//*[@id=\"Adults plusBtn\"]");

        Rooms = By.xpath("//*[@id='roomsDropdown']");

        checkbox = By.xpath("//label[@for='BookWithMiles']//span");
        clickFindHotels = By.xpath("//*[@id=\"bookHotelTab-panel\"]/form/button/span");
        Hotel_location = By.xpath("//input[@type='text'][1]");

        carTab = By.xpath("//li[@id='bookCarTab']//span");

        pickTime = By.xpath("//*[@id=\"pickupTime\"]");
        pickupTimeList = By.xpath("//li[starts-with(@id,'pickupTime_item')]");

        dropTimeButton = By.xpath("//button[@name='dropoffTime']");
        dropOffTimeList = By.xpath("//li[starts-with(@id,'dropoffTime_item')]");

        findCars = By.xpath("//button[@type='submit'][1]");
        carPickUpLocation = By.xpath("//input[@id='bookCarPickupInput']");

        carPick_date = By.xpath("//input[@id='bookCarPickupDate']");
        carDrop_date = By.xpath("//input[@id='bookCarDropoffDate']");
        PackageTab = By.xpath("//*[@id='bookPackageTab']");
        packageType = By.xpath("(//*[@class=\"atm-c-radio-field__item\"])[1]");

        Flight_from = By.xpath("//*[@id='vacationOriginInput']");
        Flight_To = By.xpath("//*[@id=\"vacationDestinationInput\"]");

        package_departDATE = By.xpath("//*[@id=\"DepartDate\"]");
        package_ReturnDATE = By.xpath("//*[@id=\"ReturnDate\"]");
        package_Adults = By.xpath("//*[@id=\"containerId\"]/button");
        package_AdultsAdd = By.xpath("//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/button[2]");
        package_Rooms = By.xpath("//*[@id=\"selectedRooms\"]");
        FindTrips = By.xpath("//*[@id=\"bookVacationForm\"]/div[3]/button");


    }

    public void selectBookmenu() throws Exception {
        click(travelTab);
        waitForElementToDisplay(travelTabSelectedStatus, 10);
        if (isElementCurrentlyDisplayed(travelTabSelectedStatus)) {
            test.pass("Selected Book tab");
        } else {
            test.fail("Selected Book tab");
            Assert.fail("Selected Book tab");
        }
    }


    public void userSelectsFlightOption() throws Exception {

        click(selectFlightOption);
    }


//    public void selectFlightType(String flightType) throws Exception {
//        fightTypeRadio = By.xpath("//input[@id='"+flightType.toLowerCase()+"']//following-sibling::span");
//        click(fightTypeRadio);
//        test.info("Flight type selected as: "+flightType);
//    }


    // selecting RoundTrip Radio button
    public void selectFlightType(String flightType) throws Exception {
        fightTypeRadio = By.xpath("//*[@class='app-components-BookFlightForm-bookFlightForm__radioBtnContainer--VrnUD']");
        click(fightTypeRadio);
        test.info("Flight type selected as: " + flightType);
    }

    //  selecting One-way Radio button

    public void selectOneway() throws Exception {

        oneWayFlight = By.xpath("(//*[@for='oneway']//span)[2]");

        click(oneWayFlight);
    }

    public void selectFromCity(String city) {
        if (sendKeys(flightTicketOriginCity, city)) {
            pause(3000);
            List<WebElement> originFlights = driver.findElements(originFlightsList);
            for (int i = 0; i < originFlights.size(); i++) {
                System.out.println(originFlights.get(i).getText().trim());
            }
            if (originFlights.size() > 0) {
                click(originFlights.get(0));
                test.pass("Origin city selected");
            }
        } else {
            test.fail("Origin city not selected as: " + city);
            Assert.fail("Origin city not selected as: " + city);
        }
    }

    public void selectToCity(String city) {
        if (sendKeys(flightTicketDestinationCity, city)) {
            pause(3000);
            List<WebElement> destinationFlights = driver.findElements(destinationFlightsList);
            for (int i = 0; i < destinationFlights.size(); i++) {
                System.out.println(destinationFlights.get(i).getText().trim());
            }
            if (destinationFlights.size() > 0) {
                click(destinationFlights.get(0));
                test.pass("Destination city selected ");
            }
        } else {
            test.fail("Destination city not selected as: " + city);
            Assert.fail("Destination city not selected as: " + city);
        }
    }

    public void selectTravellersMenu() throws Exception {
        click(TravellerMenuOpen);
    }

    public void closeTravellersMenu() throws Exception {
        click(TravellerMenuClose);
    }


    public void selectAdults(String travellers) throws Exception {
        click(TravellerMenuOpen);
        pause(2000);
        click(adultInput);

//        sendKeys(adultInput, travellers);
        for (int i = 1; i < Integer.parseInt(travellers); i++) {
            pause(1000);
            click(adultAdd);
        }
    }

    public void verifyListOfAvailableFlights() {
        pause(10000);
        List<WebElement> pricesList = driver.findElements(bestPricesList);
        List<WebElement> datesList = driver.findElements(bestDatesToTravel);
        for (int i = 0; i < pricesList.size(); i++) {

            test.info("Date: " + datesList.get(i).getText());
            test.info("Price: " + pricesList.get(i).getText());

            System.out.println("Date: " + datesList.get(i).getText());
            System.out.println("Price: " + pricesList.get(i).getText());
        }
    }

    public void selectFromDate(String fromDate) {

        if (sendKeys(fromDateEdit, fromDate)) {
            test.pass("From Date is selected as: " + fromDate);
        }

    }

    public void selectToDate(String toDate) {
        if (sendKeys(toDateEdit, toDate)) {
            test.pass("To Date is selected as: " + toDate);
        }
    }


    public void selectCabinType() {

        Actions action = new Actions(driver);
        WebElement cabinType = driver.findElement(By.id("cabinType"));

        cabinType.click();
        action.sendKeys("Premium economy");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();


    }

    public void clickOnFindFlights() {

        WebElement findFlights = driver.findElement(By.xpath("//*[@type='submit']//span"));

        if (click(findFlights)) {
            test.pass("Find flights button is selected");
        } else {
            test.fail("Find flights button is selected");
            Assert.fail("Find flights button is selected");
        }

    }

//    public void clickOnFindFlightsButton() throws Exception {
//        if(click(findFlightsButton)){
//         //   test.pass("Find flights button is selected");
//        } else {
//            test.fail("Find flights button is selected");
//            Assert.fail("Find flights button is selected");
//        }


    public void flightBookMilesCheckButton() {

        WebElement bookMiles = driver.findElement(By.xpath("//*[@for='award']//span[text()='Book with miles']"));

        if (click(bookMiles)) {
            test.pass("checked BookwithMiles tab");
        } else {
            test.fail("Not able to check it");
        }

    }

    public void flexibleDatesCheckButton() {

        WebElement flexibleDates = driver.findElement(By.xpath("//*[@for='flexibleDates']//span[text()='Flexible dates']"));

        if (click(flexibleDates)) {
            test.pass("checked Flexible_dates tab");
        } else {
            test.fail("Not able check it");
        }

    }

    public void hotelTab() {

        WebElement Hoteltab = driver.findElement(By.xpath("//*[@id='bookHotelTab']"));

        click(Hoteltab);


        test.pass("selected Hotel tab");


    }

//    public void bookHotelAt(String HotelLocation) throws Exception {
//
//        Actions action = new Actions(driver);
//        click(Hotel_location);
//
//        action.sendKeys(Keys.ARROW_DOWN);
//        action.sendKeys(Keys.ENTER);
//
//        test.info("Hotel selected at: "+HotelLocation);
//
//    }


    public void goingPlace(String city) throws Exception {
        click(goingToCity);
        if (sendKeys(goingToCity, city)) {
            pause(3000);
            List<WebElement> goingCity = driver.findElements(goingToCity);
            for (int i = 0; i < goingCity.size(); i++) {
                System.out.println(goingCity.get(i).getText().trim());
            }
            if (goingCity.size() > 0) {
                click(goingCity.get(0));
                test.pass("Going To city selected");
                ;
            }
        } else {
            test.fail("Going to city not selected as: " + city);
            Assert.fail("Going to  city not selected as: " + city);
        }

    }


//    public void hotelCheckIn(String checkinDate){
//
//        WebElement checkIn =driver.findElement(By.xpath("//input[@id=\"bookHotelInput\"]"));
//
//        click(checkIn);
//
//        test.info("check in date is given as: " +checkinDate);
//
//    }
//
//    public void hotelCheckOut(String checkOutDate){
//
//        WebElement checkOut =driver.findElement(By.xpath("//*[@id='bookHotelCheckoutDate']"));
//
//        click(checkOut);
//
//        test.info("check Out date is given as: " +checkOutDate);
//
//    }

    public void checkIn_Date(String fromDate) {
        if (sendKeys(checkInDAte, fromDate)) {
            test.pass("checkIn Date is selected as: " + fromDate);
        }
    }

    public void checkOut_Date(String toDate) {
        if (sendKeys(checkOutDate, toDate)) {
            test.pass("checkOut Date is selected as: " + toDate);
        }
    }


    public void selectHotelRooms() throws Exception {

        Actions action = new Actions(driver);

        click(Rooms);
        action.sendKeys("3 rooms");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();


    }

    public void checkBookWithMiles() throws Exception {

//        WebElement checkbox = driver.findElement(By.xpath("//label[@for='BookWithMiles']//span"));

        click(checkbox);

        if (click(checkbox)) {

            test.info("selected 'Book with miles' checkbox");
        }

    }


    public void findHotels() throws Exception {

//        WebElement  clickFindHotels = driver.findElement(By.xpath("//*[@id=\"bookHotelTab-panel\"]/form/button/span"));

        click(clickFindHotels);

        if (click(clickFindHotels)) {

            test.info("user clicked on 'Find Hotels' ");
        }


    }

    public void numberOfAdults() throws Exception {
        click(No_of_Adults);
        Thread.sleep(5000);
        click(Hotel_adultAdd);
    }


    public void carTab() throws Exception {

        click(carTab);

    }

    public void carPickLocation(String carPick) throws Exception {

        click(carPickUpLocation);
        if (sendKeys(carPickUpLocation, carPick)) {

            Actions action = new Actions(driver);
            action.sendKeys(carPick);
            action.sendKeys(Keys.ARROW_DOWN);
            action.sendKeys(Keys.ENTER).perform();

            pause(3000);
            List<WebElement> carPickLocation = driver.findElements(carPickUpLocation);
            for (int i = 0; i < carPickLocation.size(); i++) {
                System.out.println(carPickLocation.get(i).getText().trim());
            }
            if (carPickLocation.size() > 0) {
                click(carPickLocation.get(0));
                test.pass("Pickup location selected as " + carPick);
                ;
            }
        } else {
            test.fail("Going to city not selected as: " + carPick);
            Assert.fail("Going to  city not selected as: " + carPick);
        }


    }


    public void carPickDate(String fromDate) {
        if (sendKeys(carPick_date, fromDate)) {
            test.pass("car pickup Date is selected as: " + fromDate);
        }
    }

    public void carDropDate(String toDate) {
        if (sendKeys(carDrop_date, toDate)) {
            test.pass("car Drop Date is selected as: " + toDate);
        }
    }


    public void clickPickUpTime(String pickUpTime) throws Exception {

        click(pickTime);
        List<WebElement> carPickTime = driver.findElements(pickupTimeList);
        for (int i = 0; i < carPickTime.size(); i++) {
            logger.info("Actual Pick Up Time Values: " + carPickTime.get(i).getAttribute("aria-label"));
            if (carPickTime.get(i).getAttribute("aria-label").equals(pickUpTime)) {
                click(carPickTime.get(i));
                test.pass("Selected Pickup time is: " + pickUpTime);
                break;
            } else {
                continue;
            }

        }
    }


    public void clickDropTime(String droptime) throws Exception {

        click(dropTimeButton);
        Thread.sleep(3000);
        List<WebElement> carDropTime = driver.findElements(dropOffTimeList);
        for (int i = 0; i < carDropTime.size(); i++) {
            System.out.println(carDropTime.get(i).getText());
            if (carDropTime.get(i).getText().equals(droptime)) {
                click(carDropTime.get(i));
                test.pass("Selected Drop time is: " + droptime);
                break;
            } else {
                continue;
            }


        }

//        Actions action = new Actions(driver);
//        sendKeys(dropTimeButton, droptime);
//        action.sendKeys(Keys.ARROW_DOWN);
//        action.sendKeys(Keys.ENTER).perform();

    }

    public void clickFindCars() throws Exception {

        click(findCars);

    }

    public void clickPackageTab() throws Exception {

        click(PackageTab);
        test.pass("selected package under Book Tab");

    }

    public void selectPackageType() throws Exception {

        click(packageType);

    }

    public void flightFrom() throws Exception {

        click(Flight_from);

        Actions action = new Actions(driver);
        action.sendKeys("Rajiv Gandhi Intl Airport (HYD), India");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();

    }

    public void flightTo() throws Exception {

        click(Flight_To);

        Actions action = new Actions(driver);
        action.sendKeys("Toronto, ON, Canada");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).build().perform();

    }

    public void selectPackage_Departdate(String package_Fromdate) {
        if (sendKeys(package_departDATE, package_Fromdate)) {
            test.pass("package From Date is selected as: " + package_Fromdate);
        }

    }

    public void selectPackage_Returndate(String package_Todate) {
        if (sendKeys(package_ReturnDATE, package_Todate)) {
            test.pass("package Return Date is selected as: " + package_Todate);
        }

    }


    public void selectTravellers_forPackage() throws Exception {

        click(package_Adults);
        click(package_AdultsAdd);


    }


    public void selectRooms_package() throws Exception {

        click(package_Rooms);

        Actions action = new Actions(driver);
        action.sendKeys("2 rooms");
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER).perform();

    }

    public void click_findTrips() throws Exception {

        click(FindTrips);

        test.pass("clicked on 'FindTrips'");


    }





}




