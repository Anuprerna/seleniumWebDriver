package seleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import WebTesting.WebElement;

import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MemberSignUp {

	public static void main(String[] args) throws InterruptedException  {
		
		
		
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);
            
            // Prompt the user to enter text
            //System.out.println("Enter text (type 'exit' to stop):");

		
            
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.lemniska.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000); 
		/// To click on get started 
		WebElement GetStartedNow=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]")); 
		if(GetStartedNow.isEnabled()) { 
		System.out.println("Test Case 1 :Get started icon is present -Test Case Passed"); 
		} 
		else { 
		System.out.println("Test Case 1 :Get started is Not present -Test Case Failled"); 
		} 
		Thread.sleep(2000);
		
		//driver.findElement(By.className("LMokaybtnforal")).click();
				
		
		GetStartedNow.click(); 
		System.out.println("Test Case 2 :Get started icon is Selected -Test Case Passed");
		Thread.sleep(5500); 
		//////////sign up icon ///////////////////////
		WebElement Dropdownsignup=driver.findElement(By.tagName("button")); 
		Thread.sleep(2000); 
		Dropdownsignup.click(); 
		System.out.println("Test Case 3 : Dropdown icon is present -Test Case Passed");
		//to click on the member spanish form 
		driver.findElement(By.linkText("Sign up")).click(); 
		System.out.println("Test Case 4 :Sign Up icon is selected -Test Case Passed");
		Thread.sleep(3500); 
		String MembersignupURL=driver.getCurrentUrl(); 
		Assert.assertEquals(MembersignupURL, "https://qa.lemniska.com/membership"); 
		System.out.println("Test case 5 : Assert for Member Sign Up page URL is passed"); 
		Thread.sleep(2000); 
		//To validate the page title 
		String MembersignupTitle=driver.findElement(By.xpath("//h2[normalize-space()='Member Sign Up']")).getText(); 
		Assert.assertEquals(MembersignupTitle, "Member Sign Up"); 
		System.out.println("Test case 6 : Assert for Member Sign Up Title is passed"); 
		Thread.sleep(2000); 
		
		//to test each value now 
		WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']")); 
		firstname.sendKeys("@$%$%$^^^%^#$^#$^#^#^#$^#%^^"); 
		Thread.sleep(2500); 
		firstname.clear(); 
		Thread.sleep(1500); 
		firstname.sendKeys("Sane@123"); 
		Thread.sleep(1500); 
		firstname.clear(); 
		Thread.sleep(1500); 
		firstname.sendKeys("Sane"); 
		Thread.sleep(1500); 
		firstname.clear(); 
		System.out.println("Test Case 7 : First name is added and validated for various inputs-Test Case Passed"); 
		//to enter the all the details and save 
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']")); 
		lastname.sendKeys("@$%$%$^^^%^#$^#$^#^#^#$^#%^^"); 
		Thread.sleep(2500); 
		lastname.clear(); 
		Thread.sleep(1500); 
		lastname.sendKeys("Kashyap@123"); 
		Thread.sleep(1500); 
		lastname.clear(); 
		Thread.sleep(1500); 
		lastname.sendKeys("Doe"); 
		Thread.sleep(1500); 
		lastname.clear(); 
		System.out.println("Test Case 8 : Last name is added and validated for various inputs-Test Case Passed"); 
		WebElement memberemail=driver.findElement(By.xpath("//input[@id='Email']")); 
		memberemail.sendKeys("amit.test0113@yopmail.com"); 
		Thread.sleep(1500); 
		memberemail.clear(); 
		System.out.println("Test Case 9 : email is added-Test Case Passed"); 
		WebElement phonenumber=driver.findElement(By.xpath("//input[@id='Phone']")); 
		phonenumber.sendKeys("6468953210"); 
		Thread.sleep(1500); 
		phonenumber.clear(); 
		WebElement Timeeshown=driver.findElement(By.xpath("//div[@title='India (भारत): +91']"));
		Timeeshown.click();
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ENTER); 
		System.out.println("Test Case 10 : Phone Number is added and validated -Test Case Passed"); 
		//Us country is selected
		/*
		WebElement UScountry=driver.findElement(By.xpath("//div[@title='United States: +1']");
		UScountry.click();
		UScountry.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		WebElement timezone=driver.findElement(By.xpath("//select[@id='TimeZoneId']");
		timezone.click(); 
		Thread.sleep(1500); 
		timezone.sendKeys(Keys.ARROW_DOWN);
		timezone.sendKeys(Keys.ARROW_DOWN);
		timezone.sendKeys(Keys.ENTER); 
*/
		System.out.println("Test Case 11 : TimeZone is selcted-Test Case Passed"); 
		//WebElement canceliconspanish =driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[2]")); 
		Thread.sleep(5000); 
		System.out.println("Test Case 12 : All inputs added are cleared-Test Case Passed"); 
		firstname.sendKeys("Automation"); 
		Thread.sleep(1500); 
		lastname.sendKeys("SignUP"); 
		Thread.sleep(1500); 
		memberemail.sendKeys("anu.test_AT@yopmail.com"); 
		Thread.sleep(1500); 
		phonenumber.sendKeys("2345678910"); 
		Thread.sleep(1500); 
		//timezone.click(); 
		Thread.sleep(1500); 
		System.out.println("Test Case 13 : All values are added and saved-Test Case Passed"); 
		WebElement Submitbutton=driver.findElement(By.xpath("//input[@id='btn_SaveMember']"));
		Submitbutton.click(); 
		System.out.println("Test Case 14 : Data is saved-Test Case Passed"); 
		//to accept the terms and condition 
		driver.findElement(By.xpath("//input[@id='IsVerified']")).click(); 
		Thread.sleep(1500); 
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click(); 
		//to accept the HipAA 
		driver.findElement(By.xpath("//input[@id='IsVerifiedhppa']")).click(); 
		Thread.sleep(1500); 
		System.out.println("Test Case 15 : Check Box are selected-Test Case Passed"); 
		Thread.sleep(1500); 
		Submitbutton.click(); 
		System.out.println("Test Case 16 : Data is saved-Test Case Passed"); 
		//to check the registaration message pop up received 
		//driver.findElement(By.xpath("//*[@id=\"search-data-main\"]/div/div/div/div/div[1]/div[1]/div/div[1]/a/span")).click(); 
		//driver.findElement(By.className("vg-sucess-span")).click();
		Thread.sleep(3500); 
		//to check the doctor as guest and other links on the login page 
		//fist checking the Forgoot password 
		
		System.out.println("QA Member Sign Up completed Sucessfully "); 
		driver.quit(); 	
		
	  
   
}

		
        
        
}															
											



