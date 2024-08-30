package seleniumWebDriver;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
//import WebTesting.WebElement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;

import java.util.Scanner;


public class MemberProfile {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");																																											
			//ChromeDriver VG=new ChromeDriver();	
			WebDriver VG=new ChromeDriver();
			//WebDriver driver=new ChromeDriver();
			VG.get("https://qa.lemniska.com/");																																												
			VG.manage().window().maximize();																																												
			Thread.sleep(5000);	
			
			
			/// To click on get started 																																												
			WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
			if(GetStartedNow.isEnabled()) {																																												
				System.out.println("Test Case 1 : Get started icon is present -Test Case Passed");																																											
			}																																												
				else {																																											
					System.out.println("Test Case 1 : Get started is Not present -Test Case Failled");																																										
				}																																											
			Thread.sleep(2000);																																												
																																															
			GetStartedNow.click();		
			System.out.println("Test Case 2 : Get started icon is present and selected -Test Case Passed");
			Thread.sleep(5500);																																												
									
			//Dropdown is selected 
			WebElement Dropdown=VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
					Dropdown.click();	
					System.out.println("Test Case 3 : Dropdown is selected  -Test Case Passed");

			Thread.sleep(2000);																																												
			VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
			Thread.sleep(8000);	
			
			// To enter the valid email and password 
			WebElement EmailAddress=VG.findElement(By.xpath("//input[@id='Email']"));
			EmailAddress.sendKeys("priya00@yopmail.com");	//automationcode@yopmail.com	
			System.out.println("Test Case 4 : Email address is added  -Test Case Passed");
		    Thread.sleep(2000);		
		    
		    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
		    Password.sendKeys("Priya@6767");	//HkS2k	
		     System.out.println("Test Case 5 : Password is added  -Test Case Passed");
		    Thread.sleep(2500);	
		    
		    //To click on eye icon
		    WebElement Eyeicon=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));
		    //old value //body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/span[1]
		    
		    Eyeicon.click();	
		     System.out.println("Test Case 6 : Eye-icon is clicked once  -Test Case Passed");

		    Thread.sleep(2000);																																													
		    Eyeicon.click();
		     System.out.println("Test Case 7 : Eye-icon is clicked again  -Test Case Passed");

		    VG.findElement(By.xpath("//input[@id='RememberMe']")).click();	
		     System.out.println("Test Case 8 : Remember Me button is clicked  -Test Case Passed");

		    WebElement Loginicon= VG.findElement(By.xpath("//input[@id='loginBttn']"));
		    Loginicon.click();			
		     System.out.println("Test Case 9 : login icon is clicked   -Test Case Passed");

		    Thread.sleep(5000);																																													
		    																																													
		    //to go to manage appointment 																																													
		  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();		// old dropdownMenuLink																																									
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case 10 : Dropdown button is clicked  -Test Case Passed");

		  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/div/ul/li[2]/a")).click();																																											
		  	Thread.sleep(1500);
			System.out.println("Test Case 11 : My Profile is selected from dropdown  -Test Case Passed");
			     
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span")).click();																																											
		  	Thread.sleep(1500);
			System.out.println("Test Case 12 : Edit is selected  -Test Case Passed");    
			///html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span
			
			
			WebElement FName=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/input"));
			FName.clear();
			Thread.sleep(1500);
			
			WebElement LName=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[3]/input"));
			LName.clear();
			Thread.sleep(1500);
			
			WebElement PNum=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div/input[1]"));
			PNum.clear();
			Thread.sleep(1500);
			
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[9]/div/div/div/input[1]")).click();																																											
		  	Thread.sleep(1500);
			System.out.println("Test Case 13 : Save button is clicked, Error Received - Test Case Passed"); 			
			
			
			String Error7=VG.findElement(By.xpath("//span[contains(text(),'First name is required')]")).getText();														
			System.out.println("Test case 14 : 'First Name' error received -"+Error7);
			String Error55=VG.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();														
			System.out.println("Test case 15 : 'Last name' error received -"+Error55);
			String Error56=VG.findElement(By.xpath("//span[contains(text(),'Mobile No. is required.')]")).getText();														
			System.out.println("Test case 16 : 'Last name' error received -"+Error56);
			System.out.println("Test case 17-22 : Reserved for remaining warnings for first time user");
			
			/*String Error1=VG.findElement(By.xpath("//span[contains(text(),'Date of birth is required')]")).getText();														
			System.out.println("Test case 17 : 'Date of birth' error received -"+Error1);
			
			
			String Error2=VG.findElement(By.xpath("//span[contains(text(),'Address line 1 is required.')]")).getText();														
			System.out.println("Test case 18 : 'Address line' error received -"+Error2);
			
			
			String Error3=VG.findElement(By.xpath("//span[contains(text(),'Country is required.')]")).getText();														
			System.out.println("Test case 19 : 'Country' error received -"+Error3);
			
			String Error4=VG.findElement(By.xpath("//span[contains(text(),'State is required.')]")).getText();														
			System.out.println("Test case 20 : 'State' error received -"+Error4);
			
			
			String Error5=VG.findElement(By.xpath("//span[contains(text(),'City is required.')]")).getText();														
			System.out.println("Test case 21 : 'City' error received "+Error5);
			
			
			String Error6=VG.findElement(By.xpath("//span[contains(text(),'Zip/ Postal code is required .')]")).getText();														
			System.out.println("Test case 22 : 'Zip/ Postal code' error received -"+Error6);
			*/		
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
			WebElement GenderF=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]"));
			GenderF.click();
			System.out.println("Test Case 23 : 'Female' as Gender selected from dropdown  -Test Case Passed");
			Thread.sleep(1500);
			
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
			WebElement GenderM=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[1]"));
			GenderM.click();
			System.out.println("Test Case 24 : 'Male' as Gender selected from dropdown  -Test Case Passed");
			Thread.sleep(1500);																																			
			
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
			WebElement GenderR=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[3]"));
			GenderR.click();
			System.out.println("Test Case 25 : 'Rather not say' as Gender selected from dropdown  -Test Case Passed");
			Thread.sleep(1500);
			
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
			WebElement GenderFA=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]"));
			GenderFA.click();
			System.out.println("Test Case 26 : Again 'Female' as Gender selected from dropdown  -Test Case Passed");
			
			//WebElement FName=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/input"));
			FName.sendKeys("Priya");
			Thread.sleep(3000);
			
			//WebElement LName=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[3]/input"));
			LName.sendKeys("Kaushik");
			Thread.sleep(3000);
			
			//WebElement PNum=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div/input[1]"));
			PNum.sendKeys("2222222222");
			//PNum.sendKeys("4444444444");
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span[1]/span/span/span")).click();		//click calender icon to open its panel for date select																																									
			WebElement DOB=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span[1]/span/input"));
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) VG;
			
			js.executeScript("document.getElementById($('#DateOfBirth').val('11/11/2001'))");
			
			System.out.println("Test Case 27 : DOB selected from Calender  -Test Case Passed");
			
			//To change the address																																													
			/*VG.findElement(By.id("Address1")).clear();																																		
			Thread.sleep(2000);																																		
			VG.findElement(By.id("Address1")).sendKeys("Gaur city 2");																																		
			System.out.println("Test Case 25 : Address name validation is tested : Test case passed");																																		
			*/																				
			//To change the State 																																													
			/*VG.findElement(By.id("StateProvinceId")).click();																																		
			Thread.sleep(2000);																																		
			VG.findElement(By.xpath("//option[contains(text(),'Uttar Pradesh')]")).click();																																		
			Thread.sleep(2000);																																		
			VG.findElement(By.id("CityName")).click();																																		
			Thread.sleep(2000);																																		
			System.out.println("Test Case 26 : City add validation is tested : Test case passed");																																		
			*/																				
			
			/*WebElement Adr1= VG.findElement(By.xpath("//*[@id=\"Address1\"]"));
			Adr1.clear();
			
			VG.findElement(By.id("Address1")).click();
			VG.findElement(By.id("Address1")).sendKeys("Hidalgotitlán Ver., Mexico");
			VG.findElement(By.id("Address1")).click();
			
	        Thread.sleep(3000);
 
	        try {
                Thread.sleep(3000);
                VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
	        Thread.sleep(3000);
			System.out.println("Second address saved.");
			Thread.sleep(3000);
			VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
		  	Thread.sleep(1500);
		  	System.out.println("Profile saved");
			Thread.sleep(3000);
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[5]/div/div[1]/span")).click();		//click  icon to open its panel																																								
			
			System.out.println("Test Case 27 : Timezone Icon selected from dropdown  -Test Case Passed");
			
			
			
			
			VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[9]/div/div/div/input[1]")).click();																																											
		  	Thread.sleep(1500);
			System.out.println("Test Case 28 : Save button is clicked  -Test Case Passed");			
			*/
			
			
			//driver.quit();																																												
			DOB.click();
			Thread.sleep(3000);
			
			VG.findElement(By.xpath("//*[@id=\"TimeZoneId\"]/option[1]")).click();////*[@id="TimeZoneId"]/option[1]
			Thread.sleep(3000);
			VG.findElement(By.xpath("//*[@id=\"TimeZoneId\"]/option[2]")).click();
			//click time-zone icon to open its panel																																								
		
			System.out.println("Test Case 28 : Timezone Icon selected from dropdown  -Test Case Passed");
			
			WebElement TellAbout=VG.findElement(By.xpath("//*[@id=\"Tellmeabout\"]"));
			TellAbout.clear();
			TellAbout.sendKeys("Hi All, I am Member");
			Thread.sleep(3000);
//WebElement Adr11= VG.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
			
			/*Adr11.clear();
			VG.findElement(By.id("Address1")).click();
			VG.findElement(By.id("Address1")).sendKeys("Dilshad Garden Metro Station Lane");
			VG.findElement(By.id("Address1")).click();    
			
	        Thread.sleep(3000);
 
	        try {
                Thread.sleep(3000);
                VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
	        
	        Thread.sleep(3000);
			System.out.println("Test Case 25 : Test Case Passed");
			Thread.sleep(3000);
			VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
		  	Thread.sleep(1500);
		  	System.out.println("Test Case 26 : Profile saved");
			Thread.sleep(5000);
			
			VG.switchTo( ).alert( );
			VG.switchTo( ).alert( ).accept();
			Thread.sleep(3000);
			*/
			WebElement Adr1a=VG.findElement(By.id("Address1"));// VG.findElement(By.xpath("//*[@id=\"Address1\"]"));
			Adr1a.clear();
			
			VG.findElement(By.id("Address1")).click();
			VG.findElement(By.id("Address1")).sendKeys("Har Ki Pauri");
			
			
	        Thread.sleep(3000);
 
	        try {
                Thread.sleep(3000);
                VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
	        VG.findElement(By.id("Address1")).click();
	        Thread.sleep(3000);
	        
			System.out.println("Test Case 29 : First address saved.");
			Thread.sleep(3000);
			VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
		  	Thread.sleep(1500);
		  	System.out.println("Test Case 30 : Profile saved");
			Thread.sleep(3000);
																																							
			System.out.println("Test Case 31 : Save button is clicked  -Test Case Passed"); 			
			VG.switchTo( ).alert( );
			VG.switchTo( ).alert( ).accept();
			Thread.sleep(3000);

			
			
			//   //*[@id="Address1"]
			Thread.sleep(3000);
			js.executeScript("document.getElementById($('#DateOfBirth').val('22/02/2002'))");
			Thread.sleep(3000);
			WebElement Adr1=VG.findElement(By.xpath("//*[@id=\"Address1\"]"));// VG.findElement(By.xpath("//*[@id=\"Address1\"]"));
			Adr1.clear();
			
			VG.findElement(By.id("Address1")).click();
			VG.findElement(By.id("Address1")).sendKeys("Dilshad Garden Metro Station Lane");
			VG.findElement(By.id("Address1")).click();
			
	        Thread.sleep(3000);
 
	        try {
                Thread.sleep(3000);
                VG.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
	        Thread.sleep(3000);
			System.out.println("Test Case 32 : Second address saved.");
			Thread.sleep(3000);
			VG.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
		  	Thread.sleep(1500);
		  	System.out.println("Test Case 33 : Profile saved");
			Thread.sleep(3000);
																																							
			System.out.println("Test Case 34 : Save button is clicked  -Test Case Passed"); 			
			
		  	//VG.quit();
			/*		    // To book appointment
		    WebElement BookNow1=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[2]"));               
		    BookNow1.click();
		    System.out.println("Test Case 32  : Book now button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Tomorrow date
		    WebElement TomorrowDate1=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
		    System.out.println("Test Case 33  : Selecting tomorrow date is clicked  -Test Case Passed");
		    TomorrowDate1.click();
		    Thread.sleep(5000);
		    
		    //To select Tomorrow date
		    WebElement TomorrowNextDate1=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[2]"));
		    TomorrowNextDate1.click();
		    System.out.println("Test Case 34  : Selecting day-after-tomorrow date is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Morning Timings
		    WebElement Time1=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[3]"));
		    Time1.click();
		    System.out.println("Test Case 35  : Morning time is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Evening Timings
		    WebElement Time2=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[18]"));
		    Time2.click();
		    System.out.println("Test Case 36  : Evening time is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    
		    //To select V-Call button
		    WebElement VCallBtn=VG.findElement(By.xpath("(//label[@class=\"video-call-btn\"])[1]"));
		    VCallBtn.click();
		    System.out.println("Test Case 37  : VCall radio-button is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select In-Person button
		    WebElement InPersonBtn=VG.findElement(By.xpath("(//label[@class=\"physical-btn\"])[1]"));
		    InPersonBtn.click();
		    System.out.println("Test Case 38  : In-Person radio-button is selected  -Test Case Passed");
		    Thread.sleep(5000);
		  
		    //To select Other button
		    WebElement OtherBtn=VG.findElement(By.xpath("//div[@class=\"vg-book\"]"));
		    OtherBtn.click();
		    System.out.println("Test Case 39  : OtherBtn radio-button is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To provide Name of other person
		    WebElement OtherName=VG.findElement(By.xpath("//input[@id=\"OtherPatinetName\"]"));
		    OtherName.sendKeys("Peri Peri");
		    System.out.println("Test Case 40  : Name of other person is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To provide Relation with other person
		    WebElement OtherRelation=VG.findElement(By.xpath("//input[@id=\"OtherPatinetName\"]"));
		    OtherRelation.sendKeys("Son");
		    System.out.println("Test Case 41  : Relation with other person is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To provide Reason
		    WebElement Reason=VG.findElement(By.xpath("//input[@id=\"reason\"]"));
		    Reason.sendKeys("Facing cough and cold");
		    System.out.println("Test Case 42  :  Reason is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To provide Age of other person
		    WebElement Age1=VG.findElement(By.xpath("//input[@id=\"Age\"]"));
		    Age1.sendKeys("22");
		    System.out.println("Test Case 43  : Age of other person is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Myself button
		    WebElement MyselfBtn=VG.findElement(By.xpath("(//label[@class=\"physical-btn\"])[2]"));
		    MyselfBtn.click();
		    System.out.println("Test Case 44   : MyselfBtn radio-button is selected  -Test Case Passed");
		    Thread.sleep(5000);
		    // VG.switchTo().alert().accept();
		    
		    //To select Insurance Button
		    WebElement InsuranceBtn=VG.findElement(By.xpath("//input[@id=\"SelectedPlan\"]"));
		    InsuranceBtn.click();
		    System.out.println("Test Case 45   : Insurance dropdown-button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Specific Insurance Name from drop-down
		    WebElement InsuranceName=VG.findElement(By.xpath("//*[@id=\"headingOne\"]/a/h4"));
		    InsuranceName.click();
		    System.out.println("Test Case 46   : Specific Insurance Name from drop-down is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To select Specific Insurance Category
		    WebElement InsuranceVal=VG.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[2]/a"));
		    InsuranceVal.click();
		    System.out.println("Test Case 47   : Specific Insurance Category is clicked  -Test Case Passed");
		    Thread.sleep(5000);
*/
			}

	
		
	}																																												
																																															
																																															
																																															
																																														


	
