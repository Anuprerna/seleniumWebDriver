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
public class ManageAppointmentMember {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String WebsiteLink="https://qa.lemniska.com/";
		String User="usa_member@yopmail.com";	
		String Passwrd="usa_member1@"; 	
		int TimeToSleep=2000,TC=1;
		
		
		WebDriver VG=new ChromeDriver();
		
		VG.get(WebsiteLink);																																												
		VG.manage().window().maximize();																																												
		Thread.sleep(TimeToSleep);		
		
		
		// To click on get started 																																												
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
		EmailAddress.sendKeys(User);		
		System.out.println("Test Case " +TC+ " : Email address is added  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);			
	    
	    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
	    Password.sendKeys(Passwrd);	
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
	    
/*	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //To check Doctor and book appointment
	    WebElement BookNow1a=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1a.click();
	    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
 
	    //To select Morning Timings
	    WebElement Time1=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[3]"));
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
	    Age1i.clear();
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
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    
	    //To click Pay Later
	    WebElement PayLater1=VG.findElement(By.xpath("//*[@id=\"Paylater\"]"));
	    PayLater1.click();
	    System.out.println("Test Case " +TC+ " : Pay Later is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //---------------------- In Person - Payment  -----------------------------------
	    
	    
		//To find doctor - click Book Appointment		
		    WebElement FindDoc1i=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
		    FindDoc1i.click();
		    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	    
	    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1 = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2A = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2A.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //To check Doctor and book appointment
	    WebElement BookNow1aA=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1aA.click();
	    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    	
	    
	    
	    //To select Tomorrow date
	    WebElement TomorrowDate2=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
	    System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
	    TomorrowDate2.click();
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
    
	    //To select Evening Timings
	    WebElement Time2=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[13]"));
	    Time2.click();
	    System.out.println("Test Case " +TC+ " : Evening time is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Reason
	    WebElement Reason1=VG.findElement(By.xpath("//input[@id=\"reason\"]"));
	    Reason1.sendKeys("Fever");
	    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Age
	    WebElement Age2=VG.findElement(By.xpath("//input[@id=\"Age\"]"));
	    Age2.clear();
	    Age2.sendKeys("32");
	    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To click Submit button
	    WebElement Submit2=VG.findElement(By.xpath("//*[@id=\"submit\"]"));
	    Submit2.click();
	    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	  
	    //To accept Disclaimer
	    WebElement Accept2=VG.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
	    Accept2.click();
	    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			///html/body/div[8]/div/div/div[1]/button
	    //VG.switchTo().alert().accept();
	    
	    //To click Make Payment  /html/body/div[8]/div/div/div[2]/button
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    WebElement Payment1=VG.findElement(By.xpath("//input[@class=\"btn pmt-mkpay bg-vg1  text-white mp btn-disable\"]"));
	    Payment1.click();
	    System.out.println("Test Case " +TC+ " : Make Payment is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
    
	    
	    //To put card number
	    WebElement Payment1c=VG.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
	    Payment1c.click();
	    Payment1c.sendKeys("4111 1111 1111 1111");
	    System.out.println("Test Case " +TC+ " : Card Number is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card expiry date
	    WebElement Payment1e=VG.findElement(By.xpath("//*[@id=\"cardExpiry\"]"));
	    Payment1e.click();
	    Payment1e.sendKeys("09 / 29");
	    System.out.println("Test Case " +TC+ " : Card Expiry Date is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card cvc
	    WebElement Payment1cvc=VG.findElement(By.xpath("//*[@id=\"cardCvc\"]"));
	    Payment1cvc.click();
	    Payment1cvc.sendKeys("559");
	    System.out.println("Test Case " +TC+ " : CVC is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card holder name
	    WebElement Payment1HN=VG.findElement(By.xpath("//*[@id=\"billingName\"]"));
	    Payment1HN.click();
	    Payment1HN.sendKeys("USA Member Anuprerna");
	    System.out.println("Test Case " +TC+ " : Card holder name is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	       		
	    //To click pay button
	    WebElement Payment1p=VG.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]"));
	    Payment1p.click();
	    
	    System.out.println("Test Case " +TC+ " : Pay on Razorpay is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	  //To find doctor - click Book Appointment		
	    WebElement FindDoc1iv=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
	    FindDoc1iv.click();
	    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1av = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1av.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2av = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2av.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(10000);
	    
	    //To check Doctor book appointment button
	    WebElement BookNow1av=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1av.click();
	    System.out.println("Test Case " +TC+ ": Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To select Tomorrow date
	    WebElement TomorrowNextDate3=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[3]"));
	    TomorrowNextDate3.click();
	    System.out.println("Test Case " +TC+ " : Selecting day-after-tomorrow date is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To select Evening Timings
	    WebElement Time2a=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[2]"));
	    Time2a.click();
	    System.out.println("Test Case " +TC+ " : Evening time is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To check timings are visible 
	    WebElement Timeing3=VG.findElement(By.xpath("//h3[@id=\"doctor-current-time\"]"));
	    String Timeing3v=Timeing3.getText();
	    System.out.println("Test Case " +TC+ " : Timing is available  -Test Case Passed -"+Timeing3v);
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To select V-Call button
	    WebElement VCallBtn3=VG.findElement(By.xpath("(//label[@class=\"video-call-btn\"])[1]"));
	    VCallBtn3.click();
	    System.out.println("Test Case " +TC+ " : VCall radio-button is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	  //To provide Reason
	    WebElement Reason3=VG.findElement(By.xpath("//input[@id=\"reason\"]"));
	    Reason3.sendKeys("Fever");
	    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Age
	    WebElement Age3=VG.findElement(By.xpath("//input[@id=\"Age\"]"));
	    Age3.clear();
	    Age3.sendKeys("32");
	    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To click Submit button
	    WebElement Submit3=VG.findElement(By.xpath("//*[@id=\"submit\"]"));
	    Submit3.click();
	    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	  
	    //To accept Disclaimer
	    WebElement Accept3=VG.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
	    Accept3.click();
	    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			///html/body/div[8]/div/div/div[1]/button
	    //VG.switchTo().alert().accept();
	    
	    //To click Make Payment
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    WebElement Payment3=VG.findElement(By.xpath("//input[@class=\"btn pmt-mkpay bg-vg1  text-white mp btn-disable\"]"));
	    Payment3.click();
	    System.out.println("Test Case " +TC+ " : Make Payment is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
    
	    
	    //To put card number
	    WebElement Payment3c=VG.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
	    Payment3c.click();
	    Payment3c.sendKeys("4111 1111 1111 1111");
	    System.out.println("Test Case " +TC+ " : Card Number is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card expiry date
	    WebElement Payment3e=VG.findElement(By.xpath("//*[@id=\"cardExpiry\"]"));
	    Payment3e.click();
	    Payment3e.sendKeys("09 / 29");
	    System.out.println("Test Case " +TC+ " : Card Expiry Date is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card cvc
	    WebElement Payment3cvc=VG.findElement(By.xpath("//*[@id=\"cardCvc\"]"));
	    Payment3cvc.click();
	    Payment3cvc.sendKeys("559");
	    System.out.println("Test Case " +TC+ " : CVC is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card holder name
	    WebElement Payment3HN=VG.findElement(By.xpath("//*[@id=\"billingName\"]"));
	    Payment3HN.click();
	    Payment3HN.sendKeys("USA Member Anuprerna");
	    System.out.println("Test Case " +TC+ " : Card holder name is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	       		
	    //To click pay button
	    WebElement Payment3p=VG.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]"));
	    Payment3p.click();
	    
	    System.out.println("Test Case " +TC+ " : Pay on Razorpay is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(10000);
*/
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
	    
	    //Heading 
	    WebElement HeadingP=VG.findElement(By.xpath("//*[@id=\"pending-tab\"]/div/h3"));
	  	String HeadingPMA= HeadingP.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Pending appointment Heading is available  -Test Case Passed , Heading is "+HeadingPMA);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button is clicked
	    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // i button click
	    WebElement InfoButton = VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[2]/div[1]/div[1]/h2/span/a"));
	    //InfoButton.click();
	    System.out.println("Test Case " +TC+ " : i button  is available  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    //VG.close();
	    //ArrayList FAQlinkback = new ArrayList(VG.getWindowHandles());
		//VG.switchTo().window((String) FAQlink1.get(0));
	    
	    //		Pending Date and time
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
	    VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/button")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Menu in Pending Apppointment - Cancel
	    WebElement PendingMenuCancel=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[1]/div/div/div[3]/div/div/div[1]/a"));
	    PendingMenuCancel.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop no click
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	    System.out.println("Test Case " +TC+ " : No from Pop-Up Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop Yes click	    //html/body/div[8]/div/div/div[2]/button[2]
	   
	    //		Pending 3rd Appointment Details
	    //Date and time
	    WebElement PendingDateTime2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[2]/h6"));
	    String PendingDateTime12=PendingDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+PendingDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Age 
	    WebElement PendingAge2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[5]/h6"));
	    String PendingAge12=PendingAge2.getText();	
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+PendingAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Reason 
	    WebElement PendingReason2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[4]/h6"));
	    String PendingReason12=PendingReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+PendingReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment -inperson/vcall
	    WebElement PendingType2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[6]/h6"));
	    String PendingType12=PendingType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+PendingType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	     
	    //Menu in Pending Apppointment - Cancel WebElement PendingMenu=
	    VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[3]")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Menu in Pending Apppointment - Cancel
	    WebElement PendingMenuCancel2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[3]/div"));
	    PendingMenuCancel2.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop no click
	    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	    System.out.println("Test Case " +TC+ " : No from Pop-Up Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop Yes click
	    //html/body/div[8]/div/div/div[2]/button[2]
	    //To go to Confirmed appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[2]/a")).click();																																											
	  	System.out.println("Test Case " +TC+ " : Confirmed appointment in manage appointment  is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed-Date and time								
	    WebElement ConfirmedDateTime2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[2]/h6"));
	    String ConfirmedDateTime12=ConfirmedDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+ConfirmedDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed - Age 
	    WebElement ConfirmedAge2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[5]/h6"));
	    String ConfirmedAge12=ConfirmedAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+ConfirmedAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed - Reason 
	    WebElement ConfirmedReason2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[4]/h6"));
	    String ConfirmedReason12=ConfirmedReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+ConfirmedReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Cancelled- In-Person/vcall
	    WebElement ConfirmedType2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[6]/h6"));
	    String ConfirmedType12=ConfirmedType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+ConfirmedType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu=VG.findElement(By.xpath("(//button[@id=\"lm-memdropdown\"])[2]"));
	    ConfirmMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//View uploaded file		//*[@id="UploadMemberFilesbtn"]
	  	//VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div/div/div[2]")).click();
	  	WebElement ViewFile1=VG.findElement(By.id("ViewMemberFilesPopUpbtn"));
	  	ViewFile1.click();
	  	System.out.println("Test Case " +TC+ " :  View Uploaded file button is working fine, nothing available to view  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Ok button is clicked bcz nothing uploaded yet
	  	VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  OK button clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    VG.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]")).click();//WebElement ConfirmMenu1=,className("btn btn-primary bootbox-accept"));
	 
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//UploaD image for file upload
	  	VG.findElement(By.xpath("//*[@id=\"UploadMemberFilesbtn\"]")).click();
	  	WebElement Pop1=VG.findElement(By.xpath("(//*[@id=\"customFile\"])[2]"));
	    Pop1.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");
	    System.out.println("Test Case " +TC+ " :  Uploading file is selected  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Declined 	
	  	VG.findElement(By.xpath("(//*[@id=\"closePopUpbtn\"])[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  Decline button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment 
	    WebElement ConfirmMenu1a=VG.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu1a.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//UploaD image for file upload
	  	VG.findElement(By.xpath("//*[@id=\"UploadMemberFilesbtn\"]")).click();
	  	WebElement Pop1a=VG.findElement(By.xpath("(//*[@id=\"customFile\"])[2]"));
	    Pop1a.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");
	    System.out.println("Test Case " +TC+ " :  Uploading file is selected  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Save
	  	VG.findElement(By.xpath("//*[@id=\"fileButton\"]")).click();
	  	System.out.println("Test Case " +TC+ " :  Save button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(7000);
	  	
	  	VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  Uploading is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu2=VG.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu2.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//View uploaded file
	  	VG.findElement(By.id("ViewMemberFilesPopUpbtn")).click();
	  	System.out.println("Test Case " +TC+ " :  View Uploaded file button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Delete 'Uploaded file' icon
	  	VG.findElement(By.xpath("//*[@id=\"ViewMemberFilesPopUp\"]/div/div/div[2]/div/div/span/i")).click();
	  	System.out.println("Test Case " +TC+ " :  Delete 'Uploaded file' icon is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//r u sure to delete - NO button
	  	VG.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " :  No button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Delete 'Uploaded file' icon
	  	VG.findElement(By.xpath("//*[@id=\"ViewMemberFilesPopUp\"]/div/div/div[2]/div/div/span/i")).click();
	  	System.out.println("Test Case " +TC+ " :  Delete 'Uploaded file' icon is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//r u sure to delete - OK button
	  	VG.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  Ok button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//deleted successfully 
	  	VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  File deleted successfully is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu3=VG.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu3.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Cancel button is clicked
	  	VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[3]/div/div/div[5]/a")).click();
	  	System.out.println("Test Case " +TC+ " :  Cancel button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//No-Cancel button is clicked
	  	VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " :  Cancel-No button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Sort by button
	  	VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //see map button 		
	  	//VG.findElement(By.xpath("(//span[@class=\"lmseebutton-text\"])[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  See Map button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
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
	  	
	  	//Sort by button
	  	VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button click again
	    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Rate Stars Count printing
	    WebElement StarPrint = VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/label/span"));
	    String StarC = StarPrint.getText();
	    System.out.println("Test Case " +TC+ " : Rating text is available  -Test Case Passed, Rate is "+StarC);
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Rate Stars Count printing
	    WebElement RateReview = VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/div/p"));
	    String RateReviewC = RateReview.getText();
	    System.out.println("Test Case " +TC+ " : Review text is available  -Test Case Passed, Review is "+RateReviewC);
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Appointment date, time, reason, age, type
	    //Complete-Date and time
	    WebElement CompleteDateTime2=VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[2]/h6"));
	    String CompleteDateTime12=CompleteDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CompleteDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Age 
	    WebElement CompleteAge2=VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[5]/h6"));
	    String CompleteAge12=CompleteAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CompleteAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Reason 
	    WebElement CompleteReason2=VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[4]/h6"));
	    String CompleteReason12=CompleteReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CompleteReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Complete- In-Person/vcall
	    WebElement CompleteType2=VG.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[6]/h6"));
	    String CompleteType12=CompleteType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+CompleteType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to HISTORY appointment in manage appointment
	    VG.findElement(By.xpath("//*[@id=\"myTab\"]/div[4]/a")).click();																																								
	  	System.out.println("Test Case " +TC+ " : History appointment in manage appointment  is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort by button
	  	VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button click again
	    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Appointment date, time, reason, age, type
	    //Cancelled-Date and time
	    WebElement CancelledDateTime2=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[2]/h6"));
	    String CancelledDateTime12=CancelledDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CancelledDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Age 
	    WebElement CancelledAge2=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[5]/h6"));
	    String CancelledAge12=CancelledAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CancelledAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Reason 
	    WebElement CancelledReason2=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[4]/h6"));
	    String CancelledReason12=CancelledReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CancelledReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Cancelled- In-Person/vcall
	    WebElement CancelledType2=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[6]/h6"));
	    String CancelledType12=CancelledType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+CancelledType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // Status of cancellation 
	    WebElement CancelledStatus2=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[7]/h6"));
	    String CancelledStatus12=CancelledStatus2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Status/Reason of cancelled appointment is available  -Test Case Passed "+CancelledStatus12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu History appointment in manage appointment
	    WebElement HistoryMenu=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[3]"));
	    HistoryMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in History Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    
	  	//To go to Menu Cancelled appointment in manage appointment
	    WebElement ConfirmMenu3a=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[3]/div/div/div[3]"));
	    ConfirmMenu3a.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Cancelled Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Cancel button is clicked
	  	VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[3]/div/div/div[3]/div/div/div/div")).click();
	  	System.out.println("Test Case " +TC+ " : Cancel button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
		
	  	//No-Cancel button is clicked
	  	VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " : Cancel-No button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	
	  	//To go to Menu Cancelled appointment in manage appointment
	    WebElement ConfirmMenu3b=VG.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[3]"));
	    ConfirmMenu3b.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Cancelled Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);

	}

}
