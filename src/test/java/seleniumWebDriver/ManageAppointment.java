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

public class ManageAppointment {
	public static void main(String[] args) throws InterruptedException {
		String WebsiteLink="https://qa.lemniska.com/";
		String UserM="usa_member@yopmail.com";	
		String PasswrdM="usa_member1@";
		String UserD="usa_doctor@yopmail.com";	
		String PasswrdD="XzNuP";
		int TimeToSleep=2000,TC=1;
		
		
		WebDriver VG=new ChromeDriver();
		
		VG.get(WebsiteLink);																																												
		VG.manage().window().maximize();																																												
		Thread.sleep(TimeToSleep);		
		
		
		/// To click on get started 																																												
		WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
		if(GetStartedNow.isEnabled()) {																																												
			System.out.println("Test Case " +TC+ " : Get started icon is present -Test Case Passed");	
			TC++;
		}																																												
			else {																																											
				System.out.println("Test Case " +TC+ " : : Get started is Not present -Test Case Failed");		
				TC++;
			}																																											
		Thread.sleep(TimeToSleep);																																												
																																														
		GetStartedNow.click();		
		System.out.println("Test Case " +TC+ " : Get started icon is present and se3ected -Test Case Passed");
		TC++;
		Thread.sleep(5500);																																												
								
		//Dropdown is selected 
		WebElement Dropdown=VG.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
				Dropdown.click();	
				System.out.println("Test Case " +TC+ " : Dropdown is selected  -Test Case Passed");
				TC++;

		Thread.sleep(TimeToSleep);																																													
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
		Thread.sleep(8000);	
		
		// To enter the valid email and password 
		WebElement EmailAddress=VG.findElement(By.xpath("//input[@id='Email']"));
		EmailAddress.sendKeys(UserM);		
		System.out.println("Test Case " +TC+ " : Email address is added  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);			
	    
	    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
	    Password.sendKeys(PasswrdM);	
	     System.out.println("Test Case " +TC+ " : Password is added  -Test Case Passed");
	     TC++;
	    Thread.sleep(TimeToSleep);		
	    
	    //To click on eye icon
	    WebElement Eyeicon=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));		    
	    Eyeicon.click();	
	    System.out.println("Test Case " +TC+ " : Eye-icon is clicked once  -Test Case Passed");
	    TC++;

	    //To click on eye icon again
	    Thread.sleep(TimeToSleep);																																														
	    Eyeicon.click();
	    System.out.println("Test Case " +TC+ " : Eye-icon is clicked again  -Test Case Passed");
	    TC++;

	    //To click on Remember me button
	    VG.findElement(By.xpath("//input[@id='RememberMe']")).click();	
	    System.out.println("Test Case " +TC+ " : Remember Me button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	

	    //To click on Login button
	    WebElement Loginicon= VG.findElement(By.xpath("//input[@id='loginBttn']"));
	    Loginicon.click();
	    System.out.println("Test Case " +TC+ " : Login button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //-----------------------------------Book Appointment------------------------
    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1a = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1a.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2a = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2a.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(10000);
	    
	    WebElement BookNow1=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1.click();
	    System.out.println("Test Case " +TC+ ": Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To select Tomorrow date
		WebElement TomorrowDate1=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
		System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
		    TomorrowDate1.click();
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
	    
		    //To select Morning Timings
		    WebElement Time1=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[1]"));
		    Time1.click();
		    System.out.println("Test Case " +TC+ " : Morning time is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To provide Reason
		    WebElement ReasonI=VG.findElement(By.xpath("//input[@id=\"reason\"]"));
		    ReasonI.sendKeys("Backpain");
		    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To provide Age
		    WebElement Age1i=VG.findElement(By.xpath("//input[@id=\"Age\"]"));
		    Age1i.sendKeys("22");
		    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To click Submit button
		    WebElement Submit1=VG.findElement(By.xpath("//*[@id=\"submit\"]"));
		    Submit1.click();
		    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		  
		    //To accept Disclaimer
		    WebElement Accept1=VG.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
		    Accept1.click();
		    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			///html/body/div[8]/div/div/div[1]/button
		    VG.switchTo().alert().accept();
		    
		    //To click Pay Later
		    WebElement PayLater1=VG.findElement(By.xpath("//*[@id=\"Paylater\"]"));
		    PayLater1.click();
		    System.out.println("Test Case " +TC+ " : Pay Later is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(7000);		    
	    	    
	    //----------------------------------End of Book Appointment------------------
	    
	    //To go to Manage Appointment page   
	    WebElement DropDownIcon= VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/a"));
	    DropDownIcon.click();
	    System.out.println("Test Case " +TC+ " : DropDown button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // To go for manage appointment page	
	    WebElement ManageAptIcon= VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[1]/a"));
	    ManageAptIcon.click();
	    System.out.println("Test Case " +TC+ " : Manage Appointment is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to pending appointment in manage appointment 																																													
	  	VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[1]/a")).click();
	  	WebElement PendingMA1=VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[1]/a/div/div/p"));
	  	String PendingCount= PendingMA1.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Pending appointment in manage appointment  is clicked  -Test Case Passed , Count is "+PendingCount);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Confirmed appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[2]/a")).click();
	  	WebElement ConfirmedMA=VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[2]/a/div/div/p"));
	  	String ConfirmedCount2= ConfirmedMA.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Confirmed appointment in manage appointment  is clicked  -Test Case Passed , Count is "+ConfirmedCount2);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Complete appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[3]/a")).click();
	  	WebElement CompleteMA=VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[3]/a/div/div/p"));
	  	String CompleteCount2= CompleteMA.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Complete appointment in manage appointment  is clicked  -Test Case Passed , Count is "+CompleteCount2);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	  //To go to HISTORY appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[4]/a")).click();
	  	WebElement HistoryMA=VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[4]/a/div/div/p"));
	  	String History2= HistoryMA.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : History appointment in manage appointment  is clicked  -Test Case Passed , Count is "+History2);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to pending appointment in manage appointment 																																													
	  	VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[1]/a")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Back to Pending appointment in manage appointment  is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //	Pending Date and time
	    WebElement PendingDateTime=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[2]/h6"));
	    String PendingDateTime1=PendingDateTime.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+PendingDateTime1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Age 
	    WebElement PendingAge=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[5]/h6"));
	    String PendingAge1=PendingAge.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+PendingAge1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Reason 
	    WebElement PendingReason=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[4]/h6"));
	    String PendingReason1=PendingReason.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+PendingReason1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment -inperson/vcall
	    WebElement PendingType=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[6]/h6"));
	    String PendingType1=PendingType.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+PendingType1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	     
	    //Menu in Pending Apppointment - Cancel WebElement PendingMenu=
	    VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[3]")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Menu in Pending Apppointment - Cancel
	    WebElement PendingMenuCancel=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[3]/div"));
	    PendingMenuCancel.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop no click
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	    //Pop Yes click
	    //html/body/div[8]/div/div/div[2]/button[2]
	 
	    //To go to Confirmed appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[2]/a")).click();																																											
	  	System.out.println("Test Case " +TC+ " : Confirmed appointment in manage appointment  is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	  
	    //To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]"));
	    ConfirmMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	
	  	//To go to Complete appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[3]/a")).click();																																				
	  	System.out.println("Test Case " +TC+ " : Complete appointment in manage appointment  is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu Complete appointment in manage appointment
	    WebElement CompleteMenu=VG.findElement(By.xpath("//div[contains(@class,\"lm-appointment-rating-button\")]"));
	    //		//div[contains(@class,"lm-appointment-rating-button")]		//		//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/a
	    CompleteMenu.click();
	    Thread.sleep(10000);
	    VG.findElement(By.xpath("//*[@id=\"reason\"]")).sendKeys("Very Good Doc - by Automation");
	    Thread.sleep(TimeToSleep);
	    VG.findElement(By.xpath("//*[@id=\"5\"]")).click();
	    Thread.sleep(TimeToSleep);
	    VG.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    Thread.sleep(8000);
	    VG.navigate().back();
	    VG.navigate().back();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Complete Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    
	    //To go to HISTORY appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[4]/a")).click();																																								
	  	System.out.println("Test Case " +TC+ " : History appointment in manage appointment  is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu History appointment in manage appointment
	    WebElement HistoryMenu=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[3]"));
	    HistoryMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in History Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	}
}
