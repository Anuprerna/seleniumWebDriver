package seleniumWebDriver;

import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
//import WebTesting.WebElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import java.util.Scanner;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BookAppointment {
	public static void main(String[] args) throws InterruptedException {
			
			String WebsiteLink="https://qa.lemniska.com/";
			String User="usa_member@yopmail.com";	
			String Passwrd="usa_member1@"; 	
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
		    
		    //To check the Doctor/Clinic name text box availability
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
		    
		    //---------------------- V Call - Insurance  -----------------------------------
		    //To check Doctor and book appointment
		    WebElement BookNow1a=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
		    BookNow1a.click();
		    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //To select Tomorrow date
		    WebElement TomorrowNextDate1v=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[2]"));
		    TomorrowNextDate1v.click();
		    System.out.println("Test Case " +TC+ " : Selecting day-after-tomorrow date is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //To check timings are visible 
		    WebElement Timeing1v=VG.findElement(By.xpath("//h3[@id=\"doctor-current-time\"]"));
		    String Timeing2v=Timeing1v.getText();
		    WebElement TimeingTZ=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div/div[2]/div/div[1]/div/div/div/div[2]/p"));
		    String TimeingTZT=TimeingTZ.getText();
		    System.out.println("Test Case " +TC+ " : Timing is available  -Test Case Passed -"+Timeing2v+" Time Zone -"+TimeingTZT);
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To check  YOE is available		
		    WebElement YOE=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/p/span"));
		    String YOET=YOE.getText();
		    System.out.println("Test Case " +TC+ " : Years of experience is available  -Test Case Passed -"+YOET+" Years");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To select V-Call button
		    WebElement VCallBtn=VG.findElement(By.xpath("(//label[@class=\"video-call-btn\"])[1]"));
		    VCallBtn.click();
		    System.out.println("Test Case " +TC+ " : VCall radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		  
		    //To select Other button
		    WebElement OtherBtn=VG.findElement(By.xpath("//div[@class=\"vg-book\"]"));
		    OtherBtn.click();
		    System.out.println("Test Case " +TC+ " : OtherBtn radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To provide Name of other person
		    WebElement OtherName=VG.findElement(By.xpath("//input[@id=\"OtherPatinetName\"]"));
		    OtherName.sendKeys("Peri Peri");
		    System.out.println("Test Case " +TC+ " : Name of other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To provide Relation with other person
		    WebElement OtherRelation=VG.findElement(By.xpath("//input[@id=\"AppointmentsMaster_OtherPatientRelation\"]")); 
		    OtherRelation.sendKeys("Son");
		    System.out.println("Test Case " +TC+ " : Relation with other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To select Insurance Button
		    WebElement InsuranceBtn=VG.findElement(By.xpath("//input[@id=\"SelectedPlan\"]"));
		    InsuranceBtn.click();
		    System.out.println("Test Case " +TC+ " : Insurance dropdown-button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
 		    //To select Specific Insurance Name from drop-down
		    WebElement InsuranceName=VG.findElement(By.xpath("//*[@id=\"headingOne\"]/a/h4"));
		    InsuranceName.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance Name from drop-down is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To select Specific Insurance Category
		    WebElement InsuranceValb=VG.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[2]/a"));
		    InsuranceValb.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance Category is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To select Insurance card		
		    VG.findElement(By.xpath("//*[@id=\"insurace-car-pic-name-label\"]")).click();
		    WebElement frame =VG.switchTo().activeElement();
		    frame.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");	///seleniumWebDriver/src/test/resources/A1.jpg
		    
		    System.out.println("Test Case " +TC+ " : Specific Insurance is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //To provide Reason
		    WebElement Reason=VG.findElement(By.xpath("//input[@id=\"reason\"]"));
		    Reason.sendKeys("Backpain");
		    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To provide Age
		    WebElement Age1=VG.findElement(By.xpath("//input[@id=\"Age\"]"));
		    Age1.sendKeys("22");
		    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To click Submit button
		    WebElement Submit1v=VG.findElement(By.xpath("//*[@id=\"submit\"]"));
		    Submit1v.click();
		    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		  
		    //To accept Disclaimer
		    WebElement Accept1v=VG.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
		    Accept1v.click();
		    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To confirm on Appointment details		
		    WebElement Accept1c=VG.findElement(By.xpath("//input[@class=\"btn bg-vg1 text-white mp btn-disable\"]"));
		    Accept1c.click();
		    System.out.println("Test Case " +TC+ " : Confirm on Appointment details	page is Clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //To find doctor - click Book Appointment		
		    WebElement FindDoc1i=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
		    FindDoc1i.click();
		    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    
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
		    
		    //To check Doctor book appointment button
		    WebElement BookNow=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
		    BookNow.click();
		    System.out.println("Test Case " +TC+ ": Book now button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To check timings are visible 
		    WebElement Timeing1=VG.findElement(By.xpath("//h3[@id=\"doctor-current-time\"]"));
		    String Timeing2=Timeing1.getText();
		    System.out.println("Test Case " +TC+ ": Timing is available  -Test Case Passed -"+Timeing2);
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //To check Clinic Name are visible 
		    WebElement ClinicName=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[1]/p"));
		    String ClinicName2=ClinicName.getText();
		    System.out.println("Test Case " +TC+ ": Clinic Name is available  -Test Case Passed -"+ClinicName2);
		    TC++;
		    Thread.sleep(TimeToSleep);	
		  
		    //To check Address are visible 
		    WebElement AddrName=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div/div[1]/div/div[2]/div[3]/div/div/div[1]/p"));
		    String Addr2=AddrName.getText();
		    System.out.println("Test Case " +TC+ ": Present Address is available  -Test Case Passed -"+Addr2);
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    //---------------------- In Person - Pay Later  -----------------------------------
		    //To select Tomorrow date
		    WebElement TomorrowDate1=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
		    System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
		    TomorrowDate1.click();
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
		    //VG.switchTo().alert().accept();
		    
		    //To click Pay Later
		    WebElement PayLater1=VG.findElement(By.xpath("//*[@id=\"Paylater\"]"));
		    PayLater1.click();
		    System.out.println("Test Case " +TC+ " : Pay Later is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(7000);
		    
		    //To find doctor - click Book Appointment		
		    WebElement FindDoc1=VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
		    FindDoc1.click();
		    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		  
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName2a = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName2a.sendKeys("USA Doctor");
		    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
		    Thread.sleep(TimeToSleep);
		    
		    //To click on Search button
		    WebElement SearchBtn2b = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn2b.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(7000);
		    
		    //---------------------- In Person - Payment  -----------------------------------
		    
		    WebElement BookNow1=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
		    BookNow1.click();
		    System.out.println("Test Case " +TC+ ": Book now button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
		    
		    //To select Tomorrow date
		    WebElement TomorrowDate2=VG.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
		    System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
		    TomorrowDate2.click();
		    TC++;
		    Thread.sleep(TimeToSleep);	
		    
	    
		    //To select Evening Timings
		    WebElement Time2=VG.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[15]"));
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
		    
		    //To click Make Payment
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
		    Thread.sleep(TimeToSleep);
		    
		  }
	
}
