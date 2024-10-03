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


public class EditDoctor {
	public static void main(String[] args) throws InterruptedException {
		String WebsiteLink="https://qa.lemniska.com/";
		String User="usa_doctor@yopmail.com";	
		String Passwrd="XzNuP"; 	
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
	    
	    //To go to manage appointment 																																													
	  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();																																										
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Dropdown button is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);

	  	VG.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div/ul/li[7]/a")).click();
		System.out.println("Test Case " +TC+ " : My Profile is selected from dropdown  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		     
		
	    //-----------------------------clear most of the fields-------------------------
	    //To clear F name
	    WebElement FName=VG.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		FName.clear();
		System.out.println("Test Case " +TC+ " : First name clear  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    //To clear L name
		WebElement LName=VG.findElement(By.xpath("//*[@id=\"LastName\"]"));
		LName.clear();
		System.out.println("Test Case " +TC+ " : Last name clear  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    //To clear Phone number
		WebElement PNum=VG.findElement(By.xpath("//*[@id=\"Phone\"]"));
		PNum.clear();
		System.out.println("Test Case " +TC+ " : Phone number clear  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
		//To provide Consultation Fee
	    //WebElement CFee=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_ConsultationFeeString\"]"));
	    //CFee.clear();
	    
	    //To provide Price for e-Consultation		
	    //WebElement ECFee=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_EConsultationFee\"]"));
	    //ECFee.clear();
	    
		//To clear Doctor Registration No
	   // WebElement RegNo=VG.findElement(By.xpath("//*[@id=\"RegNo\"]"));
	   // RegNo.clear();
	    
	    //To provide Clinic Name
	   // WebElement CName=VG.findElement(By.xpath("//*[@id=\"DoctorAddressMasterModel_HospitalName\"]"));
	   // CName.clear();
	    
	    //To provide Doctor  Driver License Or Passport No	
	    //WebElement DL_PN=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_DriverLicenseOrPassportNo\"]"));
	   // DL_PN.clear();
    
		VG.findElement(By.xpath("//*[@id=\"btn_Register\"]")).click();																																											
	  	Thread.sleep(5000);
	  	//VG.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/button")).click();
	  	VG.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/button[2]")).click();
	  	 
		System.out.println("Test Case " +TC+ " : Save button is clicked, Error Received - Test Case Passed");                          
	    Thread.sleep(5000);  
	    TC++;
	    

		//--------------------------------check warnings---------------------
	    
		//To clear F name
	    String Error7=VG.findElement(By.xpath("//span[contains(text(),'First name is required')]")).getText();	
	    System.out.println("Test Case " +TC+ " : First Name clear  -Test Case Passed-"+Error7);  
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    //To clear L name
		String Error55=VG.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();		
		System.out.println("Test Case " +TC+ " : Last Name clear  -Test Case Passed-"+Error55);  
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    // To clear Phone no.
		String Error56=VG.findElement(By.xpath("//span[contains(text(),'Mobile No. is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : Phone no. clear  -Test Case Passed-"+Error56);  
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    
	    //-------------------------------------------Give values----------------------------------
	    
	    //Provide F name value
	    WebElement FName1=VG.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		FName1.sendKeys("Jacky");
		System.out.println("Test Case " +TC+ " : First name given -Test Case Passed-"); 
		TC++;
	    Thread.sleep(TimeToSleep);
	    FName1.clear();
	    FName1.sendKeys("USA");
	    System.out.println("Test Case " +TC+ " : Another value in First name given -Test Case Passed-"); 
	    TC++;
	    Thread.sleep(TimeToSleep);
		
	    //Provide F name value
		WebElement LName1=VG.findElement(By.xpath("//*[@id=\"LastName\"]"));
		LName1.sendKeys("Dada");
		System.out.println("Test Case " +TC+ " : Last name given -Test Case Passed-"); 
		TC++;
	    Thread.sleep(TimeToSleep);
	    LName1.clear();
	    LName1.sendKeys("Doctor");
	    System.out.println("Test Case " +TC+ " : Another value in Last name given -Test Case Passed-"); 
	    TC++;
	    Thread.sleep(TimeToSleep);
		
	    //Provide Phone number
		WebElement PNum1=VG.findElement(By.xpath("//*[@id=\"Phone\"]"));
		PNum1.sendKeys("3333333333");
		System.out.println("Test Case " +TC+ " : Phone number given -Test Case Passed-"); 
		TC++;
	    Thread.sleep(TimeToSleep);
	    PNum1.clear();
	    PNum1.sendKeys("2222222222");
	    Thread.sleep(TimeToSleep);
		
	    //Select Title selections
	    VG.findElement(By.xpath("//*[@id=\"GenderId\"]")).click();																																											
		WebElement GenderF=VG.findElement(By.xpath("//*[@id=\"GenderId\"]/option[2]"));
		GenderF.click();
		System.out.println("Test Case " +TC+ " : 'Female' as Gender selected from dropdown  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
		
		VG.findElement(By.xpath("//*[@id=\"GenderId\"]")).click();																																											
		WebElement GenderM=VG.findElement(By.xpath("//*[@id=\"GenderId\"]/option[1]"));
		GenderM.click();
		System.out.println("Test Case " +TC+ " : 'Male' as Gender selected from dropdown  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);																																	
		
		
		VG.findElement(By.xpath("//*[@id=\"GenderId\"]")).click();																																											
		WebElement GenderR=VG.findElement(By.xpath("//*[@id=\"GenderId\"]/option[3]"));
		GenderR.click();
		System.out.println("Test Case " +TC+ " : 'Rather not say' as Gender selected from dropdown  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
		
		VG.findElement(By.xpath("//*[@id=\"GenderId\"]")).click();																																											
		WebElement GenderFA=VG.findElement(By.xpath("//*[@id=\"GenderId\"]/option[2]"));
		GenderFA.click();
		System.out.println("Test Case " +TC+ " : Again 'Female' as Gender selected from dropdown  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To select DOB
	    VG.findElement(By.xpath("//*[@id=\"DOB\"]")).click();		//click calender icon to open its panel for date select																																									
		//WebElement DOB=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span[1]/span/input"));		
		JavascriptExecutor js = (JavascriptExecutor) VG;		
		js.executeScript("document.getElementById($('#DOB').val('11/11/2001'))");
		System.out.println("Test Case " +TC+ " : DOB selected from Calender  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);
		
	    
	    //To provide Clinic Name
	    WebElement CName1=VG.findElement(By.xpath("//*[@id=\"DoctorAddressMasterModel_HospitalName\"]"));
	    CName1.clear();
	    CName1.sendKeys("Jackey Dada Clinic");
	    Thread.sleep(TimeToSleep);
	    CName1.clear();
	    CName1.sendKeys("USA Doctor Clinic");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Clinic name given  -Test Case Passed");
	    TC++;
	  
	    
	    
	    
	    //To provide Consultation Fee
	    WebElement CFee1=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_ConsultationFeeString\"]"));
	    CFee1.clear();
	    CFee1.sendKeys("50.50");
	    Thread.sleep(TimeToSleep);
	    CFee1.clear();
	    CFee1.sendKeys("#@*(^");
	    Thread.sleep(TimeToSleep);
	    CFee1.clear();
	    CFee1.sendKeys("ABCD");
	    Thread.sleep(TimeToSleep);
	    CFee1.clear();
	    CFee1.sendKeys("100");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Consultation Fee given  -Test Case Passed");
	    TC++;
	    
	    
	    //To provide Price for member 
	    WebElement MFee=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_DiscountOffered\"]"));
	    MFee.clear();
	    MFee.sendKeys("50.50");
	    Thread.sleep(TimeToSleep);
	    MFee.clear();
	    MFee.sendKeys("#@*(^");
	    Thread.sleep(TimeToSleep);
	    MFee.clear();
	    MFee.sendKeys("EFGH");
	    Thread.sleep(TimeToSleep);
	    MFee.clear();
	    MFee.sendKeys("100");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Member Fee/Discount Fee given  -Test Case Passed");
	    TC++;
	    
	    //To provide Price for e-Consultation		
	    WebElement ECFee1=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_EConsultationFee\"]"));
	    ECFee1.clear();
	    ECFee1.sendKeys("50.50");
	    Thread.sleep(TimeToSleep);
	    ECFee1.clear();
	    ECFee1.sendKeys("#@*(^");
	    Thread.sleep(TimeToSleep);
	    ECFee1.clear();
	    ECFee1.sendKeys("XYZ");
	    Thread.sleep(TimeToSleep);
	    ECFee1.clear();
	    ECFee1.sendKeys("100");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : E-Consultation Fee given  -Test Case Passed");
	    TC++;
	    
	    
	    // Un-Insured Treatment Discount
	    WebElement UIDis=VG.findElement(By.xpath("//*[@id=\"TreatmentDiscount\"]"));
	    UIDis.clear();
	    UIDis.sendKeys("2.5");
	    Thread.sleep(TimeToSleep);
	    UIDis.clear();
	    UIDis.sendKeys("#@*(^");
	    Thread.sleep(TimeToSleep);
	    UIDis.clear();
	    UIDis.sendKeys("PQR");
	    Thread.sleep(TimeToSleep);
	    UIDis.clear();
	    UIDis.sendKeys("3");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Un-Insured Treatment Discount given  -Test Case Passed");
	    TC++;	    
	    
	    // YOE 
	    WebElement YOE=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_Experience\"]"));
	    YOE.clear();
	    YOE.sendKeys("12.5");
	    Thread.sleep(TimeToSleep);
	    YOE.clear();
	    YOE.sendKeys("#@*(^");
	    Thread.sleep(TimeToSleep);
	    YOE.clear();
	    YOE.sendKeys("YOE");
	    Thread.sleep(TimeToSleep);
	    YOE.clear();
	    YOE.sendKeys("11");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Un-Insured Treatment Discount given  -Test Case Passed");
	    TC++;
	    
	    //Website 
	    WebElement WebSiteDoc=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_Website\"]"));
	    WebSiteDoc.clear();
	    WebSiteDoc.sendKeys("Rough Data ");
	    Thread.sleep(TimeToSleep);
	    WebSiteDoc.clear();
	    WebSiteDoc.sendKeys("https://www.google.com/");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Doctor  Website filled  -Test Case Passed");
	    TC++;

	    //To provide Doctor  Driver License Or Passport No	
	    WebElement DL_PN1=VG.findElement(By.xpath("//*[@id=\"DoctorDetailMasterModel_DriverLicenseOrPassportNo\"]"));
	    DL_PN1.clear();
	    DL_PN1.sendKeys("@#$%^&*()*&^%$#@");
	    Thread.sleep(TimeToSleep);
	    DL_PN1.clear();
	    DL_PN1.sendKeys("M1234567989899595952152222222221111111111555555555");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Doctor  Driver License Or Passport No	 filled  -Test Case Passed");
	    TC++;
	    
	    //To provide Doctor Registration No
	    WebElement RegNo1=VG.findElement(By.xpath("//*[@id=\"RegNo\"]"));
	    RegNo1.clear();
	    RegNo1.sendKeys("@#$%^&*()*&^%$#@");
	    Thread.sleep(TimeToSleep);
	    RegNo1.clear();
	    RegNo1.sendKeys("012345678912345");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Doctor Registration No filled  -Test Case Passed");
	    TC++;
	    
	    //*[@id="Licence-pic-name-label"]
	   
	    
	    // To provide Doctor info in Tell About YourSelf
	    WebElement TAY=VG.findElement(By.xpath("//*[@id=\"TellAboutYourSelf\"]"));
	    TAY.clear();
	    TAY.sendKeys("For Automation");
	    System.out.println("Test Case " +TC+ " : Doctor info in Tell About YourSelf filled  -Test Case Passed");
	    TC++;
	    TAY.clear();
	    TAY.sendKeys("Genuine Doctor");
	    Thread.sleep(TimeToSleep);
	    System.out.println("Test Case " +TC+ " : Again Doctor info in Tell About YourSelf filled  -Test Case Passed");
	    TC++;
	    
	    //Morning Checkbox 		
	    WebElement MondayCB=VG.findElement(By.xpath("//*[@id=\"Day_1\"]"));
	    MondayCB.click();
	    MondayCB.click();
	    WebElement MondayMTB=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_MorningTimingIdStart\"]"));
	    WebElement MondayMTS=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_MorningTimingIdStart\"]/option[2]"));
	    MondayMTS.click();
	    System.out.println("Test Case " +TC+ " : Monday Morning start time filled  -Test Case Passed");
	    TC++;
	    
	    WebElement MondayMTE=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_MorningTimingIdEnd\"]"));
	    WebElement MondayMTT=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_MorningTimingIdEnd\"]/option[6]"));
	    MondayMTT.click();
	    System.out.println("Test Case " +TC+ " : Monday Morning end time filled  -Test Case Passed");
	    TC++;
	    
	    WebElement MondayAFM=VG.findElement(By.xpath("//*[@id=\"autofillMorning\"]"));
	    MondayAFM.click();
	    System.out.println("Test Case " +TC+ " : Autofill Morning as per Monday  -Test Case Passed");
	    TC++;
	    
	    
	    //Evening 		
	    WebElement MondayMTBE=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_EveningTimingIdStart\"]"));
	    WebElement MondayMTSE=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_EveningTimingIdStart\"]/option[2]"));
	    MondayMTSE.click();
	    System.out.println("Test Case " +TC+ " : Monday Evening start time filled  -Test Case Passed");
	    TC++;
	    
	    WebElement MondayMTEE=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_EveningTimingIdEnd\"]"));
	    WebElement MondayMTTEE=VG.findElement(By.xpath("//*[@id=\"BusinessHoursModel_EveningTimingIdEnd\"]/option[11]"));
	    MondayMTTEE.click();
	    System.out.println("Test Case " +TC+ " : Monday Evening end time filled  -Test Case Passed");
	    TC++;
	    
	    WebElement MondayAFME=VG.findElement(By.xpath("//*[@id=\"autofillEvening\"]"));
	    MondayAFME.click();
	    System.out.println("Test Case " +TC+ " : Autofill Evening as per Monday  -Test Case Passed");
	    TC++;
	    Thread.sleep(5000);
		
	    //To provide Profile picture
	    VG.findElement(By.xpath("//*[@id=\"pictureId-pic-name-label\"]")).click();
	    WebElement frame1 =VG.switchTo().activeElement();
	    frame1.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");	
	    
	    //To provide Health Care License
	    VG.findElement(By.xpath("//*[@id=\"Licence-pic-name-label\"]")).click();
	    WebElement frame2 =VG.switchTo().activeElement();
	    frame2.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A2.jpeg");	
	    
	    VG.findElement(By.xpath("//*[@id=\"btn_Register\"]")).click();                               
	    Thread.sleep(5000);  
	    VG.findElement(By.cssSelector("body.modal-open:nth-child(2) div.bootbox.modal.fade.bootbox-confirm.show:nth-child(43) div.modal-dialog div.modal-content div.modal-footer > button.btn.bg-green.text-white.bootbox-accept:nth-child(2)")).click();  
	    Thread.sleep(5000);
	    
		System.out.println("Test Case " +TC+ " : Save button is clicked - Test Case Passed");
		Thread.sleep(5000);
		TC++;
		
		System.out.println("Test Case " +TC+ " : Success run is visible - Test Case Passed");
	  
	}

}
