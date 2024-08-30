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




public class SearchAndBookAppointment {
	public static void main(String[] args) throws InterruptedException {
			
			String WebsiteLink="https://qa.lemniska.com/";
			String User="usa_member@yopmail.com";		//priya00@yopmail.com";	//usa_member@yopmail.com	//max00member@yopmail.com
			String Passwrd="usa_member1@"; 				//Priya@6767";			//usa_member1@				//max00member@
			
			WebDriver VG=new ChromeDriver();
			//WebDriver driver=new ChromeDriver();
			
			VG.get(WebsiteLink);																																												
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
			System.out.println("Test Case 2 : Get started icon is present and se3ected -Test Case Passed");
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
			EmailAddress.sendKeys(User);	//automationcode@yopmail.com	
			System.out.println("Test Case 4 : Email address is added  -Test Case Passed");
		    Thread.sleep(2000);		
		    
		    WebElement Password= VG.findElement(By.xpath("//input[@id='Password']"));
		    Password.sendKeys(Passwrd);	//HkS2k	
		     System.out.println("Test Case 5 : Password is added  -Test Case Passed");
		    Thread.sleep(2500);	
		    
		    //To click on eye icon
		    WebElement Eyeicon=VG.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));		    
		    Eyeicon.click();	
		    System.out.println("Test Case 6 : Eye-icon is clicked once  -Test Case Passed");

		    //To click on eye icon again
		    Thread.sleep(2000);																																													
		    Eyeicon.click();
		    System.out.println("Test Case 7 : Eye-icon is clicked again  -Test Case Passed");

		    //To click on Remember me button
		    VG.findElement(By.xpath("//input[@id='RememberMe']")).click();	
		    System.out.println("Test Case 8 : Remember Me button is clicked  -Test Case Passed");

		    //To click on Login button
		    WebElement Loginicon= VG.findElement(By.xpath("//input[@id='loginBttn']"));
		    Loginicon.click();
		    System.out.println("Test Case 9 : Login button is clicked  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    //To check the heading of the page
		    WebElement Heading1=VG.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[1]/div/div/div[1]/h2"));
		    System.out.println(Heading1.getText());
		    System.out.println("Test Case 10 : Heading is available  -Test Case Passed");
		    
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading2=VG.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading2.getText());
		    System.out.println("Test Case 11 : Count of lemniska provider statement on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    //To check the speciality dropdown button
/*		    WebElement SelectSpeciality = VG.findElement(By.xpath("//*[@id=\"search_SpecId\"]"));
		    SelectSpeciality.click();
		    System.out.println("Test Case 12 : Select Speciality dropdown is clicked  -Test Case Passed");
		    Thread.sleep(3000);		
		    
		    //To select the First speciality from the dropdown
		    WebElement SelectSpeciality1 = VG.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[2]"));
		    SelectSpeciality1.click();
		    System.out.println("Test Case 13 : Selecting Speciality from the dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    // To click on Search button
		    WebElement SearchBtn = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn.click();
		    System.out.println("Test Case 14 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);

		    //To check the count of lemniska provider statement on the page
		    WebElement Heading3=VG.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading3.getText());
		    System.out.println("Test Case 15  : Count of lemniska provider statement on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    //To select the Second speciality from the dropdown
		    WebElement SelectSpeciality2 = VG.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[172]"));
		    SelectSpeciality2.click();
		    System.out.println("Test Case 16 : Selecting Speciality from the dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    // To click on Search button
		    WebElement SearchBtn1 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn1.click();
		    System.out.println("Test Case 17 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading4=VG.findElement(By.xpath("//*[@id=\"doctorcount\"]/div/h4"));
		    System.out.println(Heading4.getText());
		    System.out.println("Test Case 18  : No Record Found is visible on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    // To reset Speciality drop-down
		    WebElement SelectSpeciality3 = VG.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[1]"));
		    SelectSpeciality3.click();
		    Thread.sleep(5000);
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName.sendKeys("USA");
		    System.out.println("Test Case 19 : Doctor/clinic name is given  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn2 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn2.click();
		    System.out.println("Test Case 20 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading5=VG.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading5.getText());
		    System.out.println("Test Case 21  : Count of lemniska provider statement on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    
		    //To check the Map on the page 
		    WebElement Map = new WebDriverWait(VG, Duration.ofSeconds(200))
		            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"map\"]/div/div[3]/div[1]/div[2]")));
		    System.out.println("Test Case 22  : Google Map is available on the page  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To check View All Slots button activity
		    WebElement ShowHideSlots=VG.findElement(By.xpath("(//a[@class=\"ShowHideSlot\"])[1]"));
		    ShowHideSlots.click();
		    System.out.println("Test Case 23  : All Slots are visible on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    //To check the address is available
		    WebElement Addr=VG.findElement(By.xpath("(//p[@class=\"typo-darktxt\"])[1]"));
		    Addr.click();
		    System.out.println("Test Case 24  : Address is available on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    //To check the View Profile button is available
		    WebElement ViewProfile=VG.findElement(By.xpath("(//a[@title=\"View Profile\"])[1]"));
		    ViewProfile.click();
		    System.out.println("Test Case 25  : View profile is available on the page  -Test Case Passed");
		    Thread.sleep(5000);	
		    
		    ArrayList TabLink1 = new ArrayList(VG.getWindowHandles());
		    VG.switchTo().window((String) TabLink1.get(0));
		    
		    // To check Book Now button
		    WebElement BookNow=VG.findElement(By.xpath("(//a[@title=\"Book Now\"])[2]"));//                 (//a[@title="Book Now"])[1] Jakol
		    BookNow.click();
		    System.out.println("Test Case 26  : Book now button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    VG.navigate().back();
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName1 = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName1.sendKeys("XEXEXEXEX");
		    System.out.println("Test Case 27 : Doctor/clinic name is given which do not match with anyone -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn3 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn3.click();
		    System.out.println("Test Case 28 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading6=VG.findElement(By.xpath("//*[@id=\"doctorcount\"]/div/h4"));
		    System.out.println(Heading6.getText());
		    System.out.println("Test Case 29  : No Record Found is visible on the page  -Test Case Passed");
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName2 = VG.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName2.clear();
		    System.out.println("Test Case 30 : Doctor/clinic name is empty -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4 = VG.findElement(By.xpath("//*[@id=\"btn-search\"]"));
		    SearchBtn4.click();
		    System.out.println("Test Case 31 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To click on insurance card button
		    WebElement SearchInsurance = VG.findElement(By.xpath("//*[@id=\"SelectedPlan\"]"));
		    SearchInsurance.click();
		    System.out.println("Test Case 31 : Insurance button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To click on insurance card name
		    WebElement SearchInsuranceName = VG.findElement(By.xpath("//*[@id=\"headingOne\"]/a"));
		    SearchInsuranceName.click();
		    System.out.println("Test Case 32 : Insurance Name button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To click on insurance card name specific
		    WebElement InsuranceVal = VG.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[1]/a"));
		    InsuranceVal.click();
		    System.out.println("Test Case 33 : Specific Insurance button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn4.click();
		    System.out.println("Test Case 34 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
	*/	    
		    //-----------------------------------------------------------------------------------------------------
		    
		 // To click on insurance card button
		    WebElement SearchInsurance1 = VG.findElement(By.xpath("//*[@id=\"SelectedPlan\"]"));
		    SearchInsurance1.click();
		    System.out.println("Test Case 35 : Insurance button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To click on insurance card name
		    WebElement SearchInsuranceName1 = VG.findElement(By.xpath("//*[@id=\"headingOne\"]/a"));
		    SearchInsuranceName1.click();
		    System.out.println("Test Case 36 : Insurance Name button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    // To click on insurance card name specific
		    WebElement InsuranceVal1 = VG.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[1]/a"));
		    InsuranceVal1.click();
		    System.out.println("Test Case 37 : Specific Insurance button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4a = VG.findElement(By.xpath("//*[@id=\"btn-search\"]"));
		    SearchBtn4a.click();
		    System.out.println("Test Case 38 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To clear selected insurqance using close icon			
		    WebElement Close1 = VG.findElement(By.xpath("//*[@id=\"planNameClear\"]/i"));
		    Close1.click();
		    System.out.println("Test Case 38 : Close button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
/*	    
		    //To click on Country dropdown
		    WebElement Country = VG.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country.click();
		    System.out.println("Test Case 40 : Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - USA
		    WebElement CountryUSA = VG.findElement(By.xpath("//*[@id=\"country-iso-us\"]"));  //*[@id="country-iso-mx"]
		    CountryUSA.click();
		    System.out.println("Test Case 36 : USA from Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn5 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn5.click();
		    System.out.println("Test Case 37 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
	    
		    //To click on Country dropdown
		    WebElement Country1 = VG.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country1.click();
		    System.out.println("Test Case 38 : Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - India
		    WebElement CountryIn = VG.findElement(By.xpath("//*[@id=\"country-iso-in\"]"));  //*[@id="country-iso-mx"]
		    CountryIn.click();
		    System.out.println("Test Case 39 : India from Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn6 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn6.click();
		    System.out.println("Test Case 40 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Country dropdown
		    WebElement Country2 = VG.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country2.click();
		    System.out.println("Test Case 41 : Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - Mexico
		    WebElement CountryMx = VG.findElement(By.xpath("//*[@id=\"country-iso-mx\"]"));  
		    CountryMx.click();
		    System.out.println("Test Case 42 : Mexico from Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn7 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn7.click();
		    System.out.println("Test Case 43 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);
	    
		    //To click on Country dropdown
		    WebElement Country3 = VG.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country3.click();
		    System.out.println("Test Case 44 : Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - Select Country
		    WebElement CountrySC = VG.findElement(By.xpath("//*[@id=\"search_Besed_CountryId\"]/option[1]"));  
		    CountrySC.click();
		    System.out.println("Test Case 45 : Select Country from Country dropdown is clicked  -Test Case Passed");
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn8 = VG.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn8.click();
		    System.out.println("Test Case 46 : Search button is clicked  -Test Case Passed");
		    Thread.sleep(5000);

*/
		  }
	
}
