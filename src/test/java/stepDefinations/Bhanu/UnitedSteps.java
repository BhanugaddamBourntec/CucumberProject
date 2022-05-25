package stepDefinations.Bhanu;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testData.TestDataGenerator;

public class UnitedSteps {

    LoginPage loginPage =new LoginPage();
    HomePage homepage =new HomePage();

    @When("^user open united Airlines home page$")
    public void user_open_united_airlines_home_page() throws Throwable {

        loginPage.openBrowser();
        loginPage.navigateToApplicationPage();


    }


    @And("user selects book tab")
    public void userSelectsBookTab() throws Exception {

        homepage.selectBookmenu();
    }

    @And("user selects flight option")
    public void userSelectsFlightOption() throws Exception {

        homepage.userSelectsFlightOption();
    }

    @And("user selects Roundtrip")
    public void userSelectsRoundtrip() throws Exception {
        homepage.selectFlightType("Roundtrip");
    }

    @And("user selects from city")
    public void userSelectsFromCity() {

        homepage.selectFromCity("Mumbai");
    }

    @And("user selects To city")
    public void userSelectsToCity() {

        homepage.selectToCity("Chicago");
    }

    @And("user selects from date and return date")
    public void userSelectsFromDateAndReturnDate() {

        homepage.selectFromDate(TestDataGenerator.getcurrentDate());
        homepage.selectToDate(TestDataGenerator.getFutureDate(10));

    }

    @And("user selects number of Adults")
    public void userSelectsNumberOfAdults() throws Exception {

        homepage.selectAdults(String.valueOf(TestDataGenerator.getRandomNumber(5)));
    }

    @And("user selects the CabinType")
    public void userSelectsTheCabinType() throws Exception {
        homepage.selectCabinType();
    }

    @Then("user clicks on find flights")
    public void userClicksOnFindFlights() {

        homepage.clickOnFindFlights();
    }

    @And("Capture price details")
    public void capturePriceDetails() {

        homepage.verifyListOfAvailableFlights();

    }


    @And("user selects one-way Radio button")
    public void userSelectsOneWayRadioButton() throws Exception {

        homepage.selectOneway();

        System.out.println("user require 'one-way' Trip");

    }

    @And("user selects from date")
    public void userSelectsFromDate() {

        homepage.selectFromDate(TestDataGenerator.getFutureDate(5));
    }

    @And("user selects BookwithMiles checkbutton")
    public void userSelectsBookwithMilesCheckbutton() {

        homepage.flightBookMilesCheckButton();


    }

    @And("user selects Flexibledates checkbutton")
    public void userSelectsFlexibledatesCheckbutton() {
        homepage.flexibleDatesCheckButton();

    }

    @And("user selects Hotel Tab")
    public void userSelectsHotelTab() {
        homepage.hotelTab();

    }

    @And("user selects Going place")
    public void userSelectsGoingPlace() throws Exception {

        homepage.goingPlace("Kachiguda");

    }


    @Then("user gives checkin and checkout date")
    public void userGivesCheckinAndCheckoutDate() {

        homepage.checkIn_Date(TestDataGenerator.getFutureDate(3));
        homepage.checkOut_Date(TestDataGenerator.getFutureDate(10));


    }

    @And("selects No of Rooms required")
    public void selectsNoOfRoomsRequired() throws Exception {

        homepage.selectHotelRooms();

    }

    @Then("user selects number of travellers")
    public void userSelectsNumberOfTravellers() throws Exception {

        homepage.numberOfAdults();


    }

    @And("user checks BookwithMiles")
    public void userChecksBookwithMiles() throws Exception {

        homepage.checkBookWithMiles();

    }

    @Then("user clicks on find Hotels")
    public void userClicksOnFindHotels() throws Exception {

        homepage.findHotels();
    }


    @Then("user selects car Tab")
    public void userSelectsCarTab() throws Exception {

        homepage.carTab();
    }

    @Then("user selects pick-up location")
    public void userSelectsPickUpLocation() throws Exception {

        homepage.carPickLocation("Hyderabad Downtown, IN");

    }

    @Then("user selects pick and Drop dates")
    public void userSelectsPickAndDropDates() {

        homepage.carPickDate(TestDataGenerator.getcurrentDate());
        homepage.carDropDate(TestDataGenerator.getFutureDate(5));

    }

    @And("user provides pickup time")
    public void userProvidesPickupTime() throws Exception {

//        homepage.clickPickUpTime(TestDataGenerator.getCurrentTime());

        homepage.clickPickUpTime("8:00 a.m.");

    }

    @And("user provides drop time")
    public void userProvidesDropTime() throws Exception {

        homepage.clickDropTime("10:00 p.m.");
    }


    @And("click on find cars")
    public void clickOnFindCars() throws Exception {

        homepage.clickFindCars();

    }


    @Then("user click on Package Tab")
    public void userClickOnPackageTab() throws Exception {
        homepage.clickPackageTab();

    }

    @And("user selects FlightandHotel Package")
    public void userSelectsFlightandHotelPackage() throws Exception {

        homepage.selectPackageType();

    }

    @Then("user gives Fromcity and Tocity")
    public void userGivesFromcityAndTocity() throws Exception {

        homepage.flightFrom();
        homepage.flightTo();

    }

    @And("user provides Departdate and  ReturnDate")
    public void userProvidesDepartdateAndReturnDate() {

        homepage.selectPackage_Departdate(TestDataGenerator.getFutureDate(5));
        homepage.selectPackage_Returndate(TestDataGenerator.getFutureDate(10));

    }

    @Then("user selects number of travellers under package")
    public void userSelectsNumberOfTravellersUnderPackage() throws Exception {

//        homepage.selectTravellers_forPackage(String.valueOf(TestDataGenerator.getRandomNumber(10)));
        homepage.selectTravellers_forPackage();

    }


    @And("selects No of Rooms required under package")
    public void selectsNoOfRoomsRequiredUnderPackage() throws Exception {

        homepage.selectRooms_package();

    }



    @Then("user click on Find Trips button")
    public void userClickOnFindTripsButton() throws Exception {

        homepage.click_findTrips();
    }

}
