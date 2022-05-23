package testData.bhanu;

import org.testng.annotations.Test;
import testData.TestDataGenerator;


public class TestDataMethods {

    @Test


    public void getTestData(){

        System.out.println("random password"+ "- " + TestDataGenerator.getRandomPassword());

        // generating email upto 5 random characters
        System.out.println(TestDataGenerator.generateRandomEmail(5));

        // generating email upto 10 random characters
        System.out.println(TestDataGenerator.generateRandomEmail(10));

        System.out.println(TestDataGenerator.getcurrentDate());

        System.out.println("random code upto 4 digits"+ " - "+TestDataGenerator.getRandomCode());

        System.out.println("random code upto 6 digits"+ " - "+TestDataGenerator.getRandomCodee());

        System.out.println("numeric string of 5 numbers" + "-"+TestDataGenerator.getRandomNumericString(5));

        System.out.println("Alphanumeric string of 10 numbers"+ " - "+TestDataGenerator.getRandomAlphaNumericString(10));

        System.out.println("phone number"+ "-"+TestDataGenerator.getRandomPhone());

        System.out.println(TestDataGenerator.getRandomAlphabeticString(5));

        System.out.println(TestDataGenerator.getcurrentDateUTC());

        System.out.println("coming 5 days  from current date"+ "-"+TestDataGenerator.getFutureDate(5));

        System.out.println("5 days before from current date"+ "-" +TestDataGenerator.getPastDate(5));

        System.out.println("UID" +TestDataGenerator.getRandomUUID());

       // System.out.println(TestDataGenerator.getFormattedDate("Feb172009"));

        System.out.println(TestDataGenerator.getUniqueDate());

        System.out.println(TestDataGenerator.getcurrentDateEST());

        System.out.println("random number below '5' "+ "-" + TestDataGenerator.getRandomNumber(5));

    }

    }



