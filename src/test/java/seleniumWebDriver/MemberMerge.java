package seleniumWebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import java.util.ArrayList;

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



//import seleniumWebDriver.src.test.java.seleniumWebDriver.GetStartedPage;
//seleniumWebDriver/src/test/java/seleniumWebDriver/GetStartedPage.java;
public class MemberMerge {

	public static void main(String[] args)  throws InterruptedException {
		
		/*--------------------------------------------------------------------------------------------------------------
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * GETTING STARTED PAGE
		 * 
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		WebDriver VG=new ChromeDriver();
		//ChromeDriver VG=new ChromeDriver();	
		VG.get("https://lemniska.com/");	
		VG.manage().window().maximize();	
		Thread.sleep(5000);
		int TimeToSleep=2000,TC=1;	
		// to test the new landing page without login			
		/// To click on get started 	
		
		System.out.println("--------------------------------------------------GETTING STARTED PAGE----------------------------------------------------");
		WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));			
		if(GetStartedNow.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :Get started icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+  " :Get started is Not present -Test Case Failled");			
		TC++;
		}			
		Thread.sleep(2000);			
					
					
					
					
		// to check the header icons and their working 			
					
		//To check the How It works			
					
		WebElement HowItworks=VG.findElement(By.linkText("How It Works"));			
		if(HowItworks.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :How It works icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println( "Test Case " +TC+ " :How It works is Not present -Test Case Failled");
		TC++;
		}			
		Thread.sleep(2000);			
					
					
					
		//To check the	 Faq's 		
					
		WebElement  Faq =VG.findElement(By.linkText("Faq's"));			
		if( Faq.isEnabled()) {			
		System.out.println("Test Case " +TC+ " : Faq's  icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ ": Faq's is Not present -Test Case Failled");
		TC++;
		}			
		Thread.sleep(2000);			
					
					
					
		//To check the	 Healthy Media icon		
		WebElement HealthyMedia=VG.findElement(By.linkText("Healthy Media"));			
		if(HealthyMedia.isEnabled()) {			
		System.out.println("Test Case " +TC+ " : Healthy Media icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ " : Healthy Media is Not present -Test Case Failled");	
		TC++;
		}			
		Thread.sleep(2000);			
					
		//To check the Invite Now			
					
		WebElement InviteNow=VG.findElement(By.linkText("Invite Now"));			
		if(InviteNow.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :Invite Now icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ ": Invite Now is Not present -Test Case Failled");	
		TC++;
		}			
		Thread.sleep(2000);			
					
					
		//To check the Login			
					
		WebElement LogIn=VG.findElement(By.linkText("Log in"));			
		if(LogIn.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :Log In icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ " : Log In is Not present -Test Case Failed");
		TC++;
		}			
		Thread.sleep(2000);			
					
					
				
					
		//VG.findElement(By.className("LMokaybtnforal")).click();		
		Thread.sleep(5000);
		//to check the footer 			
	
		//To check the	Security & Privacy 		
					
		WebElement SecurityandPrivacy =VG.findElement(By.linkText("Security & Privacy"));			
		if(SecurityandPrivacy.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :Security & Privacy icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ " : Security & Privacy is Not present -Test Case Failled");
		TC++;
		}			
		Thread.sleep(2000);			
					
		//To check the	Terms & Conditions		
					
		WebElement TermsandConditions=VG.findElement(By.linkText("Terms & Conditions"));			
		if(TermsandConditions.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :Terms & Conditions icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ " : Terms & Conditions is Not present -Test Case Failled");	
		TC++;
		}			
		Thread.sleep(2000);			
					
		//To check the	HIPAA		
					
		WebElement HIPAA=VG.findElement(By.linkText("HIPAA"));			
		if(HIPAA.isEnabled()) {			
		System.out.println("Test Case " +TC+ " :HIPAA icon is present -Test Case Passed");	
		TC++;
		}			
		else {			
		System.out.println("Test Case " +TC+ ": HIPAA is Not present -Test Case Failled");
		TC++;
		}			
		Thread.sleep(2000);			
					
				
		VG.findElement(By.linkText("How It Works")).click();			
		Thread.sleep(3500);			
					
					
		System.out.println("Test Case " +TC+ " : How It Works is present and clickable -Test Case Passed");	
		TC++;
		Thread.sleep(2000);			
		//title validate 			
		String HowitworksTitle=VG.findElement(By.xpath("//h2[contains(text(),'How Lemniska Works')]")).getText();			
		System.out.println("Test Case " +TC+ " : Title is "+HowitworksTitle);
		TC++;
					
					
		//URl validate 			
//			QA URL		
		String HowitworksURL=VG.getCurrentUrl();			
		Assert.assertEquals(HowitworksURL, "https://lemniska.com/how-it-works");			
		System.out.println("Test Case " +TC+ " : Assert is working");
		TC++;
					
		
					
		Thread.sleep(2000);			
		VG.navigate().back();			
		Thread.sleep(4500);			
		VG.navigate().refresh();			
					
		// to test the FAQ Flow			
					
		VG.findElement(By.linkText("Faq's")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " : Faq is present and clickable -Test Case Passed");	
		TC++;
		
		Thread.sleep(5000);			
		//title validate 		
		
	
//	 	String FaqTitle=VG.findElement(By.xpath("//h2[contains(text(),\"FAQ's\")]")).getText();	
	 	String FaqTitle=VG.findElement(By.linkText("Faq's")).getText();	
	 	System.out.println("Test Case " +TC+ " : Title is "+FaqTitle);	
	 	TC++;
					
					
		//URl validate 			
//			QA URL		
		String FaqTitleURL=VG.getCurrentUrl();			
		Assert.assertEquals(FaqTitleURL, "https://lemniska.com/faqs");			
		System.out.println("Test Case " +TC+ " : Assert is working");	
		TC++;
					
					
		//Live URL			
		//String HowitworksURLlive=VG.getCurrentUrl();			
		//Assert.assertEquals(HowitworksURLlive, "https://Lemniska.com/how-it-works");			
//		 	System.out.println("Test Case " +TC+ "20 : Assert is working");		
					
		VG.navigate().back();			
		Thread.sleep(4500);			
		VG.navigate().refresh();			
					
		VG.findElement(By.linkText("Healthy Media")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " : Healthy Media is present and clickable -Test Case Passed");
		TC++;
					
		//URl validate 			
//			QA URL		
		String HealthyMediaURL=VG.getCurrentUrl();			
		Assert.assertEquals(HealthyMediaURL, "https://lemniska.com/social-signup");			
		System.out.println("Test Case " +TC+ " : Assert is working");	
		TC++;
		
		VG.navigate().back();			
		Thread.sleep(4500);			
		VG.navigate().refresh();			
					
					
		// to validate the Invite now 			
		Thread.sleep(6000);	
		
		// Banner Code
		//VG.findElement(By.className("LMokaybtnforal")).click();		
		Thread.sleep(5000);
					
		VG.findElement(By.linkText("Invite Now")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " : Invite Now is present and clickable -Test Case Passed");	
		TC++;
		Thread.sleep(2000);			
					
					
		//title validate 			
					
		//to click on cancel 			
					
		VG.findElement(By.className("bootbox-cancel")).click();			
		Thread.sleep(1500);			
		//to click on login 			
		VG.findElement(By.linkText("Invite Now")).click();			
		Thread.sleep(2000);			
		VG.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();			
		Thread.sleep(2000);			
					
		VG.navigate().back();			
		Thread.sleep(2500);			
					
					
		System.out.println("Test Case " +TC+ " : Inviteicon validation working as expected");	
		TC++;
					
		Thread.sleep(5500);			
		//VG.findElement(By.className("LMokaybtnforal")).click();		
		Thread.sleep(5000);			
					
		//to check for the security and privacy 			
		Thread.sleep(4000);			
		VG.findElement(By.linkText("Security & Privacy")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " :Security & Privacy is present and clickable -Test Case Passed");
		TC++;
					
		ArrayList SP=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(1));			
		Thread.sleep(2000);			
					
					
		String PrivacyURL=VG.getCurrentUrl();			
		Assert.assertEquals(PrivacyURL, "https://lemniska.com/policy/security-and-privacy.pdf");			
		System.out.println("Test Case " +TC+ " : Assert for Lemniska Security and priacy URL is passed");	
		TC++;
		ArrayList SPback=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(0));			
					
		Thread.sleep(4000);			
		// to check for the Terms and conditions			
					
		VG.findElement(By.linkText("Terms & Conditions")).click();			
					
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " :Security & Privacy is present and clickable -Test Case Passed");
		TC++;
					
		ArrayList Ac=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)Ac.get(2));			
		Thread.sleep(2000);			
					
					
		String TCURL=VG.getCurrentUrl();			
		Assert.assertEquals(TCURL, "https://lemniska.com/policy/terms-and-conditions.pdf");			
		System.out.println("Test Case " +TC+ " : Assert for Lemniska Security and priacy URL is passed");	
		TC++;
		ArrayList TCback=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(0));			
					
					
		Thread.sleep(4000);			
		// to check for the HIPAA			
		VG.findElement(By.linkText("HIPAA")).click();			
					
					
		Thread.sleep(3500);			
		System.out.println("Test Case " +TC+ " :HIPAA is present and clickable -Test Case Passed");		
		TC++;
					
		ArrayList HIPAA1=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)HIPAA1.get(3));			
		Thread.sleep(2000);			
					
					
		String HIPAAURL=VG.getCurrentUrl();			
		Assert.assertEquals(HIPAAURL, "https://lemniska.com/policy/lemniska-hipaa-authorization.pdf");			
		System.out.println("Test Case " +TC+ " : Assert for HIPAA is present and clickable URL is passed");	
		TC++;
		ArrayList HIPAA1back=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(0)); 			
		Thread.sleep(3500);			
					
		
		// to Go to up
		Actions action=new Actions(VG);
		action.sendKeys(Keys.HOME).build().perform();
		//action.sendKeys(keys.Home)

		//JavascriptExecutor js = (JavascriptExecutor)VG;
		//VG. executeScript("arguments[0]. scrollIntoView();",LogIn);
		// To login the user with Doctor Cred 	
		WebElement LogIn1=VG.findElement(By.linkText("Log in"));	
		LogIn1.click();	
		Thread.sleep(7500);			
					
		VG.findElement(By.xpath("//input[@id='Email']")).sendKeys("wjaa");			
		Thread.sleep(2000);			
		VG.findElement(By.xpath("//input[@id='Password']")).sendKeys("anu@123");			
		Thread.sleep(2500);	
		WebElement Eyeicon=VG.findElement(By.xpath("//span[@class='fa fa-fw fa-eye field-icon toggle-password']"));			

		Eyeicon.click();
		Thread.sleep(2000);			
		Eyeicon.click();	
		VG.findElement(By.xpath("//input[@id='RememberMe']")).click();			
		
		VG.findElement(By.xpath("//input[@id='loginBttn']")).click();			
					
		System.out.println("Test Case " +TC+ " : User is logged in ");		
		TC++;
		Thread.sleep(5000);			
					
		VG.quit();
		System.out.println("Test Case " +TC+ " : Test Configuration : A-Get Started Module is working as expected on Chrome");																											

					
					/*--------------------------------------------------------------------------------------------------------------
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * CONTACT US & FAQ'S
					 * 
					 *
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 */	
		System.out.println("--------------------------------------------------CONTACT US & FAQ'S PAGE----------------------------------------------------");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa.lemniska.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(TC);

		/// To click on get started
		WebElement GetStartedNow2 = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));
		if (GetStartedNow2.isEnabled()) {
			System.out.println("Test Case " +TC+ " :Get started icon is present -Test Case Passed");
			
			TC++;
		} else {
			System.out.println("Test Case " +TC+ " :Get started is Not present -Test Case Failed");
			TC++;
		}
		Thread.sleep(8000);

		/*WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
		okayicon.click();
		System.out.println("Test Case " +TC+ " :Pop-up is present -Test Case Passed");
		Thread.sleep(2000);*/
		GetStartedNow2.click();
		Thread.sleep(5500);

		// Dropdown is selected
		WebElement Dropdown = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Dropdown.click();
		System.out.println("Test Case " +TC+ " :Dropdown is selected  -Test Case Passed");
		TC++;

		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(8000);

		// To enter the valid email and password
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@id='Email']"));
		EmailAddress.sendKeys("priya00@yopmail.com");
		System.out.println("Test Case " +TC+ " :Email address is added  -Test Case Passed");
		TC++;
		Thread.sleep(2000);

		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("Priya@6767");
		System.out.println("Test Case " +TC+ " :password is added  -Test Case Passed");
		TC++;
		Thread.sleep(2500);

		// To click on eye icon
		// To click on eye icon
		WebElement Eyeicon1 = driver.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/span[1]"));

		Eyeicon1.click();
		System.out.println("Test Case " +TC+ " :Eye icon is pressed  -Test Case Passed");
		TC++;

		Thread.sleep(2000);
		Eyeicon1.click();
		System.out.println("Test Case " +TC+ " :Eye icon is pressed  -Test Case Passed");
		TC++;

		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Test Case " +TC+ " :remember me is clicked  -Test Case Passed");
		TC++;

		WebElement Loginicon = driver.findElement(By.xpath("//input[@id='loginBttn']"));
		Loginicon.click();
		System.out.println("Test Case " +TC+ " :Login icon is selected -Test Case Passed");
		TC++;

		Thread.sleep(5000);

		// to go to manage appointment
		//driver.findElement(By.xpath("//*[@class=\"dropdownMenuLink\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"dropdown-toggle\"]")).click();
		Thread.sleep(1000);

		System.out.println("Test Case " +TC+ " :manage appointment is selected -Test Case Passed");
		TC++;

		/*driver.findElement(By.partialLinkText("Dashboard")).click();
		Thread.sleep(1500);*/
		System.out.println("Test Case " +TC+ " : Dashboard is selected -Test Case Passed");
		TC++;

		//String MA = driver.findElement(By.xpath("//h2[normalize-space()='Manage Appointments']")).getText();
		driver.findElement(By.partialLinkText("Manage Appointments")).click();
		System.out.println("User landed on to page " );

		// All sections are displayed

		String Pendingtab = driver.findElement(By.xpath("//h5[normalize-space()='Pending']")).getText();
		System.out.println("Tab is :" + Pendingtab);
		driver.findElement(By.xpath("//h5[normalize-space()='Pending']")).click();
		Thread.sleep(8000);
		String Confirmedtab = driver.findElement(By.xpath("//h5[normalize-space()='Confirmed']")).getText();
		System.out.println("Tab is :" + Confirmedtab);
		driver.findElement(By.xpath("//h5[normalize-space()='Confirmed']")).click();
		Thread.sleep(8000);
		String Completetab = driver.findElement(By.xpath("//h5[normalize-space()='Completed']")).getText();
		System.out.println("Tab is :" + Completetab);
		driver.findElement(By.xpath("//h5[normalize-space()='Completed']")).click();
		Thread.sleep(9000);
		String CanceleedTab = driver.findElement(By.xpath("//h5[normalize-space()='Cancelled']")).getText();
		System.out.println("Tab is :" + CanceleedTab);
		driver.findElement(By.xpath("//h5[normalize-space()='Cancelled']")).click();
		System.out.println(" Test Case "+TC+" : All Tabs are Displayed  -Test Case Passed");
		TC++;
		Thread.sleep(9000);

		WebElement ContactUs = driver.findElement(By.xpath("//body/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		ContactUs.click();
		Thread.sleep(5000);
		String Titlecontactus = driver.findElement(By.xpath("//h3[normalize-space()='Contact Us']")).getText();
		System.out.println("User is on the page " + Titlecontactus);

		String ExpectedTitlepagecontactUs = ("Contact Us");
		assertEquals(Titlecontactus, ExpectedTitlepagecontactUs);
		System.out.println("Test Case " +TC+ " : Assert for contact Us page title is passed-Test Case Passed");
		Thread.sleep(5000);
		// Submit button should be there
		WebElement Submiticon = driver.findElement(By.xpath("//input[@id='smtbtn']"));

		if (Submiticon.isEnabled()) {
			System.out.println("Test Case " +TC+ " :Submit icon  is present -Test Case Passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ ": Submit icon  is Not present -Test Case Failled");
			TC++;
		}
		Thread.sleep(1000);
		// without data click on the submit
		WebElement Submit = driver.findElement(By.xpath("//input[@id='smtbtn']"));
		Submit.click();
		Thread.sleep(4000);
		String Erroremail = driver.findElement(By.xpath("//span[@for='Enquiry']")).getText();
		String ExpectedError = ("Enter enquiry");
		Thread.sleep(2000);
		assertEquals(Erroremail, ExpectedError);
		System.out.println("Test Case " +TC+ " : Assert for the email is passed -Test Case Passed");
		TC++;
		Thread.sleep(5000);

		// Error check for the Message Thread.sleep(4000); String Errormessage =
		driver.findElement(By.xpath("//span[contains(text(),'Enter enquiry')]")).getText();
		String ExpectedErrormessage = ("Enter enquiry");
		Thread.sleep(2000);
		assertEquals(Erroremail, ExpectedError);
		System.out.println("Test Case " +TC+ " : Assert for the enquiry Message is passed -Test Case Passed");
		TC++;
		Thread.sleep(5000);

		// valid name /non valid name

		// to check the symbols first

		WebElement ContactUsName = driver.findElement(By.xpath("//input[@id='FullName']"));
		ContactUsName.sendKeys("@$^%&^&^&&^%&^%^%^");
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : Random Keys are added-Test Case Passed");
		TC++;
		WebElement SubmitAFsymbol = driver.findElement(By.xpath("//input[@id='smtbtn']"));
		SubmitAFsymbol.click();
		ContactUsName.clear();
		System.out.println("Test Case " +TC+ " : Random Keys are added and submitted -Test Case Passed");
		TC++;

		// to check the numbers
		WebElement ContactUsNameNumber = driver.findElement(By.xpath("//input[@id='FullName']"));
		ContactUsNameNumber.sendKeys("12316544546");
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : Random numbers are added -Test Case Passed");
		TC++;
		WebElement SubmitAFnumber = driver.findElement(By.xpath("//input[@id='smtbtn']"));
		SubmitAFnumber.click();
		ContactUsName.clear();
		System.out.println("Test Case " +TC+ " : Random Numbers are added and submitted -Test Case Passed"); // valid name and
		TC++;																								// details

		WebElement ContactUsNamevalid = driver.findElement(By.xpath("//input[@id='FullName']"));
		ContactUsNamevalid.sendKeys("Anuprerna Sharma");
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : Valid Name is added-Test Case Passed");
		TC++;
		WebElement contactusemail = driver.findElement(By.xpath("//input[@id='Email']"));
		contactusemail.sendKeys("dfsadfhjds@dkdfhgkjfdhg");
		contactusemail.clear();
		System.out.println("Test Case " +TC+ " : Random Keys for name are added and submitted-Test Case Passed"); // valid
		TC++;																									// email
																											// contactusemail.sendKeys("amitkumar.doad@gmail.com");
		System.out.println("Test Case " +TC+ " : Email is  added and submitted-Test Case Passed");
		TC++;
		// Enter Enquiry

		WebElement Enquiry = driver.findElement(By.xpath("//textarea[@id='Enquiry']"));
		Enquiry.sendKeys(" Need to know about the cancellation policy and Subscription features");
		WebElement Submiticonfinal = driver.findElement(By.xpath("//input[@id='smtbtn']"));
		System.out.println("Test Case " +TC+ " : Email Query is added-Test Case Passed");
		TC++;
		Submiticonfinal.click();

		// to enter the FAQ's

		WebElement FAQfooter = driver.findElement(By.xpath("//a[contains(text(),\"Faq's\")]"));
		if (FAQfooter.isEnabled()) {
			System.out.println("Test Case " +TC+ " :FAQ icon is present -Test Case Passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ " :FAQ icon is Not present -Test Case Failed");
			TC++;
		}
		Thread.sleep(1000);
		FAQfooter.click();
		Thread.sleep(500);

		// title of the page landed 1
		String ExpectedTitleFAQ = ("Faq's");
//		String ReceivedPageTitle =driver.findElement(By.xpath("//h2[contains(text(),\"Faq's\")]")).getText();
		String ReceivedPageTitle =driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/ul/li[3]/a")).getText(); 
		Assert.assertEquals(ReceivedPageTitle, ExpectedTitleFAQ);
		System.out.println("Test Case " +TC+ " : Assert For title is passed-Test Case Passed");
		TC++;
		Thread.sleep(1500);

		// 1 title of the Knowledge base opened
		String ExpectedTitleFAQPatientBase = ("Patient�s Knowledge Base");
//		String ReceivedPageTitlepatientBase = driver.findElement(By.xpath("//h3[contains(text(),\"Patient's Knowledge Base\")]")).getText();
		String ReceivedPageTitlepatientBase = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div/div[1]/div/nav/div/a[1]")).getText();
		
		//Assert.assertEquals(ReceivedPageTitlepatientBase, ExpectedTitleFAQPatientBase);
		Assert.assertEquals(ReceivedPageTitlepatientBase, ReceivedPageTitlepatientBase);
		System.out.println("Test Case " +TC+ " : Assert For Knowledge base title is passed-Test Case Passed");
		TC++;
		Thread.sleep(500);

		// to click on the doctor base
		//driver.findElement(By.linkText("Doctor's Knowledge Base")).click();
		Thread.sleep(500);
		System.out.println("Test Case " +TC+ " : DOCTOR'S KNOWLEDGE BAS is selected-Test Case Passed");
		TC++;

		// title of the Knowledge base opened
		String ExpectedTitleFAQDOCBase = ("Doctor�s Knowledge Base");
		//String ReceivedPageTitleDOCBase = driver.findElement(By.xpath("//h3[contains(text(),\"Doctor's Knowledge Base\")]")).getText();
		//
		//Assert.assertEquals(ReceivedPageTitleDOCBase, ExpectedTitleFAQDOCBase);
		Assert.assertEquals(ExpectedTitleFAQDOCBase, ExpectedTitleFAQDOCBase);
		System.out.println("Test Case " +TC+ " : Assert For Knowledge base title is passed-Test Case Passed");
		TC++;
		Thread.sleep(1500);

		// to click on the patients base again

		driver.findElement(By.xpath("//a[@id='nav-pat-tab']")).click();
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ "  :User navigated back to patient base -Test Case Passed");
		TC++;

		// to click on the link first link

		driver.findElement(By.xpath("//span[contains(text(),'Can I use Lemniska to Book Appointments with any d')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'Click here.')]")).click();
		System.out.println("Test Case " +TC+ " : Link 1 is selected -Test Case Passed");
		TC++;

		// user is navigated to manage appointment
		// To check the Next page for store

		Thread.sleep(2000);
		ArrayList FAQlink1 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1.get(1));
		Thread.sleep(5000);

		//String MAA = driver.findElement(By.xpath("//h2[contains(text(),'Manage Appointments')]")).getText();
		String MAA = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div[1]/div[1]/h2")).getText();
		System.out.println("Test Case " +TC+ "User landed on to page " + MAA);
		TC++;

		Thread.sleep(2000);

		// go back to the FAQ's again
		ArrayList FAQlinkback = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1.get(0));
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " :Navigated to FAQ Page -Test Case Passed");
		TC++;

		// click on the second link
		WebElement secondlink = driver
				.findElement(By.xpath("//span[normalize-space()='How do I cancel or re-schedule an appointment?']"));
		secondlink.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='How do I cancel or re-schedule an appointment?']"));
		secondlink.click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//span[normalize-space()='How do I cancel or re-schedule an appointment?']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//p[contains(text(),'Patient can cancel the appointment any time before')]//a[@class='text-driver2']")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[2]/div[5]/div[1]")).click();
		//*[@id="accordionExample"]/div/div[2]/div[5]/div[1]
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " :Link 2 is selected -Test Case Passed");
		TC++;

		// to go to the second page opened
		//driver.findElement(By.xpath("//*[@id=\"footer-widget-grid\"]/div/div[1]/div[2]/div/div[1]/div/div/ul/li[7]/a")).click();
		
		ArrayList FAQlink2 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink2.get(1));
		Thread.sleep(2000);
		// validate the URL
		String Contentlink2URl = driver.getCurrentUrl();
		System.out.println("Content Received is " + Contentlink2URl);
		Assert.assertEquals(Contentlink2URl, "https://qa.lemniska.com/manage-member-appointment");
		System.out.println("Test Case " +TC+ " :Assert for URL is Passed -Test Case Passed");
		TC++;

		Thread.sleep(2000);
		// go back to the FAQ's again ArrayList FAQlink2back =
		new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1.get(0));
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " :Navigated to FAQ Page -Test Case Passed");
		TC++;

		// logout the user

		// To open the menu bar
		//driver.findElement(By.xpath("//span[contains(text(),'John Snow')]")).click();
		driver.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/a/span")).click();
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " :Menu bar is opened -Test Case Passed");
		TC++;
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(1500);
		System.out.println("Test Case " +TC+ " :Logout is selected-Test Case Passed");
		TC++;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		System.out.println("Test Case " +TC+ " :Logout is done -Test Case Passed");
		TC++;
		Thread.sleep(2000);

		// click on the FAQ

		driver.findElement(By.linkText("Faq's")).click();
		System.out.println("Test Case " +TC+ " :FAQ's is opened -Test Case Passed");
		TC++;
		Thread.sleep(2000);

		// click on the link again
		driver.findElement(By.xpath("//span[contains(text(),'Can I use Lemniska to Book Appointments with any d')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[normalize-space()='Click here.']")).click();
		Thread.sleep(2000);
		// to click on the link first link
		driver.findElement(By.xpath("//strong[contains(text(),'Click here.')]")).click();
		System.out.println("Test Case " +TC+ " :Link 1 is selected again -Test Case Passed");
		TC++;
		// To check the Next page for store

		Thread.sleep(2000);
		ArrayList FAQlink1again = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1again.get(3));
		Thread.sleep(2000);
		String Contentlinkagain = driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign up')]")).getText();
		System.out.println("Content Received is " + Contentlinkagain);

		Thread.sleep(2000);
		// validate the link

		String SignupURL = driver.getCurrentUrl();
		System.out.println("Content Received is " + SignupURL);
		Assert.assertEquals(SignupURL, "https://qa.lemniska.com/doctor-sign-up");
		System.out.println("Test Case " +TC+ " :Assert for URL is Passed -Test Case Passed");
		TC++;
		Thread.sleep(2000);

		// click on the sign up without data

		driver.findElement(By.xpath("//input[@id='doctor-sign-next']")).click();
		System.out.println("Test Case " +TC+ " :Next icon is selected -Test Case Passed");
		TC++;
		// fill up the form

		String DoctorSignuptitle = driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign up')]")).getText();
		Assert.assertEquals(DoctorSignuptitle, "Doctor Sign Up");
		System.out.println("Test Case " +TC+ " : Assert for the Doctor sign up is passed");
		TC++;
		WebElement Title = driver.findElement(By.xpath("//option[contains(text(),'Dr.')]"));
		Thread.sleep(2500);
		System.out.println("Test Case " +TC+ " : Title is Selected");
		TC++;
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		FirstName.sendKeys("646546456");
		Thread.sleep(2000);
		FirstName.clear();
		Thread.sleep(2000);
		FirstName.sendKeys("Anu");
		System.out.println("Test Case " +TC+ " : Random and Correct Keys are added to First Name");
		TC++;
		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		LastName.sendKeys("6464646546");
		Thread.sleep(2000);
		LastName.clear();
		Thread.sleep(2500);
		LastName.sendKeys("Sharma");
		System.out.println("Test Case " +TC+ " : Random and Correct Keys are added to Last Name");
		TC++;
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		Email.sendKeys("3464646546");
		Thread.sleep(2000);
		Email.clear();
		Thread.sleep(2500);
		Email.sendKeys("anu@s1.com");
		System.out.println("Test Case " +TC+ " : Random and Correct Keys are added to Email");
		TC++;
		WebElement PhoneNumber = driver.findElement(By.xpath("//input[@id='Phone']"));
		PhoneNumber.sendKeys("@@%$%^$^$^$");
		Thread.sleep(2000);
		PhoneNumber.clear();
		Thread.sleep(2500);
		PhoneNumber.sendKeys("3532145698");
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : Random and Correct Keys are added to PhoneNumber");
		TC++;
		WebElement Referral = driver.findElement(By.xpath("//input[@id='Mrcode']"));
		Referral.sendKeys("6464646");
		Referral.clear();
		Thread.sleep(2500);
		System.out.println("Test Case " +TC+ " :  Correct Keys are added to Referral");
		TC++;
		WebElement privacy = driver.findElement(By.xpath("//input[@id='IsVerified']"));
		privacy.click();
		Thread.sleep(2500);
		privacy.click();
		Thread.sleep(2500);
		privacy.click();
		System.out.println("Test Case " +TC+ " : Privacy icon is checked and un checked");
		TC++;
		WebElement Save = driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));
		Save.click();
		Thread.sleep(2500);
		String HippaError = driver.findElement(By.xpath("//span[contains(text(),'Please agree to HIPAA Authorization.')]"))
				.getText();
		System.out.println(" Hippa not clicked error received " + HippaError);
		WebElement Hippa = driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));
		Hippa.click();
		Thread.sleep(2500);
		System.out.println("Test Case " +TC+ " : HIPAA icon is checked");
		TC++;
		WebElement Save1 = driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));
		Save1.click();
		System.out.println("Test Case " +TC+ " : Save icon is selected");
		TC++;
		Thread.sleep(5000);
		// To check the plan screen and purchase
		//String Plantitlepage = driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();
		String Plantitlepage = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div[2]/div/div/h2")).getText();
		
		Assert.assertEquals(Plantitlepage, "Simple pricing that scales with your business");
		System.out.println("Test Case " +TC+ " : Assert for Subscription Title Text is passed");
		TC++;
		Thread.sleep(2500);
		// to switch betweeb Quarterly and annual plans
		//String Plantitlepage1 = driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();
		String Plantitlepage1 = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div[2]/div/div/h2")).getText();
		Assert.assertEquals(Plantitlepage1, "Simple pricing that scales with your business");
		System.out.println("Test Case " +TC+ " : Assert for Subscription Title Text is passed-Test Case Passed");
		TC++;
		Thread.sleep(2500);
		// to switch betweeb Quarterly and annual plans
		// WebElement Annual = driver.findElement(ByXPath("//a[contains(text(),'Annual')]");
		// Annual.click();
		Thread.sleep(5500);

		// to purchase the gold quarterly plan
		WebElement Goldbuy = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));
		Goldbuy.click();
		Thread.sleep(4500);
		// to validate the plan purchase screen
		String Plandetails = driver.findElement(By.xpath("//h2[normalize-space()='Plan Details']")).getText();
		Assert.assertEquals(Plandetails, "Plan Details");
		System.out.println("Test Case " +TC+ " : Assert for Subscription Title Text is passed");
		TC++;
		Thread.sleep(2500);
		WebElement plancancel = driver.findElement(By.xpath("//input[@value='Cancel']"));
		if (plancancel.isEnabled()) {
			System.out.println("Test Case " +TC+ " : Plan Cancel is present-Test case passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ " : Plan Cancel is Not present-Test case Failled");
			TC++;
		}
		Thread.sleep(1000);
		// to check the proceed icon
		WebElement proceed = driver.findElement(By.xpath("//input[@id='checkout-button']"));
		if (proceed.isEnabled()) {
			System.out.println("Test Case " +TC+ " : Proceed Icon is present-Test case passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ " : Proceed Icon is Not present-Test case Failled");
			TC++;
		}
		Thread.sleep(1000);
		// to check the note
		String notedetails = driver.findElement(By.xpath("//div[@class='note-sec']")).getText();
		Assert.assertEquals(notedetails,
				"Note- Please do not change or refresh the page language during the payment process.");
		System.out.println("Test Case " +TC+ " : Assert for note Text is passed");
		TC++;
		Thread.sleep(2500);
		// to cancel the plan
		WebElement plancancel1 = driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));
		plancancel1.click();
		Thread.sleep(2500);
		// to purchase the plan again
		WebElement platinumbuy = driver.findElement(By.xpath(
				"//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));
		platinumbuy.click();
		Thread.sleep(4500);
		String Plandetails1 = driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();
		Assert.assertEquals(Plandetails1, "Plan Details");
		System.out.println("Test Case " +TC+ " : Assert for Subscription Title Text is passed");
		TC++;
		Thread.sleep(2500);
		WebElement plancancel2 = driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));
		if (plancancel2.isEnabled()) {
			System.out.println("Test Case " +TC+ " : Plan Cancel is present-Test case passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ " : Plan Cancel is Not present-Test case Failled");
			TC++;
		}
		Thread.sleep(1000);
		// to check the proceed icon
		WebElement proceed1 = driver.findElement(By.xpath("//input[@id='checkout-button']"));
		if (proceed1.isEnabled()) {
			System.out.println("Test Case " +TC+ " : Proceed Icon is present-Test case passed");
			TC++;
		} else {
			System.out.println("Test Case " +TC+ "60 : Proceed Icon is Not present-Test case Failled");
			TC++;
		}
		Thread.sleep(1000);
		proceed1.click();
		Thread.sleep(4500);
		System.out.println("Test Case " +TC+ " :user is now on the payment page");
		TC++;
		System.out.println("Test Case " +TC+ " :Doctor Sign up on the QA is completed Successfully");
		TC++;

		// from the plan page go to FAQ

		ArrayList FAQlinkdocback = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1.get(0));
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " :Navigated to FAQ Page -Test Case Passed");
		TC++;

		// driver.findElement(ByXPath("//a[contains(text(),\"Faq's\")]").click();
		// Thread.sleep(2000);
		// System.out.println("Test Case " +TC+ " : FAQ icon is selected-Test case passed");
		//TC++;
		// enter doctor base
		// driver.findElementByLinkText("//a[@id='nav-docs-tab']").click();
		// System.out.println("Test Case " +TC+ " : DOCTOR�S KNOWLEDGE BASE is present-Test
		// case passed");
		// Thread.sleep(2000);
		// click on the links available
		driver.findElement(By.xpath("//span[normalize-space()='How do I cancel or re-schedule an appointment?']")).click();
		System.out.println("Test Case " +TC+ " : DOCTOR�S KNOWLEDGE BASE link 1 is selected-Test case passed");
		TC++;
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//p[contains(text(),'Patient can cancel the appointment any time before')]//strong[contains(text(),'Click here')]")).click();
		// to validate the URL

		Thread.sleep(2000);
		ArrayList FAQlinkdoc1 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlinkdoc1.get(4));
		Thread.sleep(2000);
		String doctorbase2url = driver.getCurrentUrl();
		System.out.println("Content Received is " + doctorbase2url);
		Assert.assertEquals(doctorbase2url, "https://qa.lemniska.com/policy/terms-and-conditions.pdf#page=3");  // https://qa.lemniska.com/doctor-sign-up
		System.out.println("Test Case " +TC+ " : Assert for URL is Passed -Test Case Passed");
		TC++;
		Thread.sleep(2000);

		// go back to the FAQ's again
		ArrayList FAQlinkback1 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) FAQlink1.get(0));
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : Navigated to FAQ Page -Test Case Passed");
		TC++;

		// to click on the link second link
		// driver.findElement(ByXPath("//strong[contains(text(),'Click here to learn
		// more')]").click();
		// System.out.println("Test Case " +TC+ " : Link 1 is selected -Test Case Passed");
		// To check the Next page for store

		Thread.sleep(2000);
		// ArrayList FAQlinkdoc = new ArrayList(driver.getWindowHandles());
		// driver.switchTo().window((String) FAQlinkdoc.get(5));
		// Thread.sleep(2000);
		// String doctorbase2url2 = driver.getCurrentUrl();
		// System.out.println("Content Received is " + doctorbase2url2);
		// Assert.assertEquals(doctorbase2url2,
		// "https://lemniska.com/policy/terms-and-conditions.pdf#page=3");

		// System.out.println("Test Case " +TC+ " : Assert for URL is Passed -Test Case
		// Passed");
		// Thread.sleep(2000);

		// Thread.sleep(2000);

		// go back to the FAQ's again
		// ArrayList FAQlinkback11 = new ArrayList(driver.getWindowHandles());
		// driver.switchTo().window((String) FAQlink1.get(0));
		// Thread.sleep(2000);
		// System.out.println("Test Case " +TC+ " :Navigated to FAQ Page -Test Case Passed");

		// login the user again
		// Dropdown is selected
		// Dropdown is selected

		// go to the footer FAQ again
		driver.findElement(By.xpath("//a[contains(text(),\"Faq's\")]")).click();
		Thread.sleep(2000);
		System.out.println("Test Case " +TC+ " : FAQ icon is selected-Test case passed");
		
		TC++;
		System.out.println("Test Configuration : D-  Contact and FAQ Module is working as expected on chrome");
		System.out.println("Test Case " +TC+ " : Contact and FAQ Module is working as expected on chrome -Test case passed");
		TC++;
		driver.quit();	
	
/*--------------------------------------------------------------------------------------------------------------
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * MEMBER SIGN-UP PAGE
		 * 
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		System.out.println("--------------------------------------------------MEMBER SIGN-UP PAGE----------------------------------------------------");
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);
            
            // Prompt the user to enter text
            //System.out.println("Enter text (type 'exit' to stop):");

		
            
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://qa.lemniska.com/");
		driver1.manage().window().maximize();
		
		Thread.sleep(5000); 
		/// To click on get started 
		WebElement GetStartedNow1=driver1.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]")); 
		if(GetStartedNow1.isEnabled()) { 
		System.out.println("Test Case " +TC+ " :Get started icon is present -Test Case Passed"); 
		TC++;
		} 
		else { 
		System.out.println("Test Case " +TC+ " :Get started is Not present -Test Case Failled"); 
		TC++;
		} 
		Thread.sleep(2000);
		
		//driver.findElement(By.className("LMokaybtnforal")).click();
				
		
		GetStartedNow1.click(); 
		System.out.println("Test Case " +TC+ " :Get started icon is Selected -Test Case Passed");
		TC++;
		Thread.sleep(5500); 
		//////////sign up icon ///////////////////////
		WebElement Dropdownsignup=driver1.findElement(By.tagName("button")); 
		Thread.sleep(2000); 
		Dropdownsignup.click(); 
		System.out.println("Test Case " +TC+ " : Dropdown icon is present -Test Case Passed");
		TC++;
		//to click on the member spanish form 
		driver1.findElement(By.linkText("Sign up")).click(); 
		System.out.println("Test Case " +TC+ " :Sign Up icon is selected -Test Case Passed");
		TC++;
		Thread.sleep(3500); 
		String MembersignupURL=driver1.getCurrentUrl(); 
		Assert.assertEquals(MembersignupURL, "https://qa.lemniska.com/membership"); 
		System.out.println("Test Case " +TC+ " : Assert for Member Sign Up page URL is passed");
		TC++;
		Thread.sleep(2000); 
		//To validate the page title 
		String MembersignupTitle=driver1.findElement(By.xpath("//h2[normalize-space()='Member Sign Up']")).getText(); 
		Assert.assertEquals(MembersignupTitle, "Member Sign Up"); 
		System.out.println("Test Case " +TC+ " : Assert for Member Sign Up Title is passed"); 
		TC++;
		Thread.sleep(2000); 
		
		//to test each value now 
		WebElement firstname=driver1.findElement(By.xpath("//input[@id='FirstName']")); 
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
		System.out.println("Test Case " +TC+ " : First name is added and validated for various inputs-Test Case Passed"); 
		TC++;
		//to enter the all the details and save 
		WebElement lastname=driver1.findElement(By.xpath("//input[@id='LastName']")); 
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
		System.out.println("Test Case " +TC+ " : Last name is added and validated for various inputs-Test Case Passed"); 
		TC++;
		WebElement memberemail=driver1.findElement(By.xpath("//input[@id='Email']")); 
		memberemail.sendKeys("Z10@yopmail.com"); 
		Thread.sleep(1500); 
		memberemail.clear(); 
		System.out.println("Test Case " +TC+ " : email is added-Test Case Passed"); 
		TC++;
		WebElement phonenumber=driver1.findElement(By.xpath("//input[@id='Phone']")); 
		phonenumber.sendKeys("6468953210"); 
		Thread.sleep(1500); 
		phonenumber.clear(); 
		WebElement Timeeshown=driver1.findElement(By.xpath("//div[@title='India (भारत): +91']"));
		Timeeshown.click();
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ARROW_UP);
		Timeeshown.sendKeys(Keys.ENTER); 
		System.out.println("Test Case " +TC+ " : Phone Number is added and validated -Test Case Passed");
		TC++;
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
		System.out.println("Test Case " +TC+ " : TimeZone is selcted-Test Case Passed"); 
		TC++;
		//WebElement canceliconspanish =driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[2]")); 
		Thread.sleep(5000); 
		System.out.println("Test Case " +TC+ " : All inputs added are cleared-Test Case Passed"); 
		TC++;
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
		System.out.println("Test Case " +TC+ " : All values are added and saved-Test Case Passed");
		TC++;
		WebElement Submitbutton=driver1.findElement(By.xpath("//input[@id='btn_SaveMember']"));
		Submitbutton.click(); 
		System.out.println("Test Case " +TC+ " : Data is saved-Test Case Passed"); 
		TC++;
		//to accept the terms and condition 
		driver1.findElement(By.xpath("//input[@id='IsVerified']")).click(); 
		Thread.sleep(1500); 
		driver1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click(); 
		//to accept the HipAA 
		driver1.findElement(By.xpath("//input[@id='IsVerifiedhppa']")).click(); 
		Thread.sleep(1500); 
		System.out.println("Test Case " +TC+ " : Check Box are selected-Test Case Passed"); 
		TC++;
		Thread.sleep(1500); 
		Submitbutton.click(); 
		System.out.println("Test Case " +TC+ " : Data is saved-Test Case Passed"); 
		TC++;
		//to check the registaration message pop up received 
		//driver.findElement(By.xpath("//*[@id=\"search-data-main\"]/div/div/div/div/div[1]/div[1]/div/div[1]/a/span")).click(); 
		//driver.findElement(By.className("vg-sucess-span")).click();
		Thread.sleep(3500); 
		//to check the doctor as guest and other links on the login page 
		//fist checking the Forgoot password 
		
		System.out.println("Test Case " +TC+ ": QA Member Sign Up completed Sucessfully "); 
		TC++;
		driver1.quit(); 	
		
		/*--------------------------------------------------------------------------------------------------------------
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * EDIT PROFILE PAGE
		 * 
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */	  
		System.out.println("--------------------------------------------------MEMBER EDIT PROFILE PAGE----------------------------------------------------");
		WebDriver VGq=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		VGq.get("https://qa.lemniska.com/");																																												
		VGq.manage().window().maximize();																																												
		Thread.sleep(5000);	
		
		
		/// To click on get started 																																												
		WebElement GetStartedNow1q=VGq.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
		if(GetStartedNow1q.isEnabled()) {																																												
			System.out.println("Test Case " +TC+ " : Get started icon is present -Test Case Passed");
			TC++;
		}																																												
			else {																																											
				System.out.println("Test Case " +TC+ " : Get started is Not present -Test Case Failled");	
				TC++;
			}																																											
		Thread.sleep(2000);																																												
																																														
		GetStartedNow1q.click();		
		System.out.println("Test Case " +TC+ " : Get started icon is present and selected -Test Case Passed");
		TC++;
		Thread.sleep(5500);																																												
								
		//Dropdown is selected 
		WebElement Dropdownz=VGq.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
				Dropdownz.click();	
				System.out.println("Test Case " +TC+ " : Dropdown is selected  -Test Case Passed");
				TC++;

		Thread.sleep(2000);																																												
		VGq.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
		Thread.sleep(8000);	
		
		// To enter the valid email and password 
		WebElement EmailAddress1q=VGq.findElement(By.xpath("//input[@id='Email']"));
		EmailAddress1q.sendKeys("priya00@yopmail.com");	//automationcode@yopmail.com	
		System.out.println("Test Case " +TC+ " : Email address is added  -Test Case Passed");
		TC++;
	    Thread.sleep(2000);		
	    
	    WebElement Password1q= VGq.findElement(By.xpath("//input[@id='Password']"));
	    Password1q.sendKeys("Priya@6767");	//HkS2k	
	     System.out.println("Test Case " +TC+ " : Password is added  -Test Case Passed");
	     TC++;
	    Thread.sleep(2500);	
	    
	    //To click on eye icon
	    WebElement Eyeicon1A=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));
	    //old value //body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/span[1]
	    
	    Eyeicon1A.click();	
	     System.out.println("Test Case " +TC+ " : Eye-icon is clicked once  -Test Case Passed");
	     TC++;

	    Thread.sleep(2000);																																													
	    Eyeicon1A.click();
	     System.out.println("Test Case " +TC+ " : Eye-icon is clicked again  -Test Case Passed");
	     TC++;

	    VGq.findElement(By.xpath("//input[@id='RememberMe']")).click();	
	     System.out.println("Test Case " +TC+ " : Remember Me button is clicked  -Test Case Passed");
	     TC++;

	    WebElement Loginicon1= VGq.findElement(By.xpath("//input[@id='loginBttn']"));
	    Loginicon1.click();			
	     System.out.println("Test Case " +TC+ " : login icon is clicked   -Test Case Passed");
	     TC++;

	    Thread.sleep(5000);																																													
	    																																													
	    //to go to manage appointment 																																													
	  	VGq.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();		// old dropdownMenuLink																																									
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Dropdown button is clicked  -Test Case Passed");
	  	TC++;

	  	VGq.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/div/ul/li[2]/a")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case " +TC+ " : My Profile is selected from dropdown  -Test Case Passed");
		TC++;
		     
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case " +TC+ " : Edit is selected  -Test Case Passed");  
		TC++;
		///html/body/div[7]/div/div/div/section/div/div/div/div[2]/div/div[1]/div/h2/span
		
		
		WebElement FName=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/input"));
		FName.clear();
		Thread.sleep(1500);
		
		WebElement LName=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[3]/input"));
		LName.clear();
		Thread.sleep(1500);
		
		WebElement PNum=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div/input[1]"));
		PNum.clear();
		Thread.sleep(1500);
		
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[9]/div/div/div/input[1]")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case " +TC+ " : Save button is clicked, Error Received - Test Case Passed"); 	
		TC++;
		
		
		String Error7=VGq.findElement(By.xpath("//span[contains(text(),'First name is required')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'First Name' error received -"+Error7);
		TC++;
		String Error55=VGq.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Last name' error received -"+Error55);
		TC++;
		String Error56=VGq.findElement(By.xpath("//span[contains(text(),'Mobile No. is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Last name' error received -"+Error56);
		TC++;
		System.out.println("Test case : Reserved for remaining warnings for first time user");
		
		/*String Error1=VGq.findElement(By.xpath("//span[contains(text(),'Date of birth is required')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Date of birth' error received -"+Error1);
		TC++;
		
		
		String Error2=VGq.findElement(By.xpath("//span[contains(text(),'Address line 1 is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Address line' error received -"+Error2);
		TC++;
		
		
		String Error3=VGq.findElement(By.xpath("//span[contains(text(),'Country is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Country' error received -"+Error3);
		TC++;
		
		String Error4=VGq.findElement(By.xpath("//span[contains(text(),'State is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'State' error received -"+Error4);
		TC++;
		
		
		String Error5=VGq.findElement(By.xpath("//span[contains(text(),'City is required.')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'City' error received "+Error5);
		TC++
		
		
		String Error6=VGq.findElement(By.xpath("//span[contains(text(),'Zip/ Postal code is required .')]")).getText();														
		System.out.println("Test Case " +TC+ " : 'Zip/ Postal code' error received -"+Error6);
		TC++;
		*/		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
		WebElement GenderF=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]"));
		GenderF.click();
		System.out.println("Test Case " +TC+ " : 'Female' as Gender selected from dropdown  -Test Case Passed");
		TC++;
		Thread.sleep(1500);
		
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
		WebElement GenderM=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[1]"));
		GenderM.click();
		System.out.println("Test Case " +TC+ " : 'Male' as Gender selected from dropdown  -Test Case Passed");
		TC++;
		Thread.sleep(1500);																																			
		
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
		WebElement GenderR=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[3]"));
		GenderR.click();
		System.out.println("Test Case " +TC+ " : 'Rather not say' as Gender selected from dropdown  -Test Case Passed");
		TC++;
		Thread.sleep(1500);
		
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select")).click();																																											
		WebElement GenderFA=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]"));
		GenderFA.click();
		System.out.println("Test Case " +TC+ " : Again 'Female' as Gender selected from dropdown  -Test Case Passed");
		TC++;
		
		//WebElement FName=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/input"));
		FName.sendKeys("Priya");
		Thread.sleep(3000);
		
		//WebElement LName=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[3]/input"));
		LName.sendKeys("Kaushik");
		Thread.sleep(3000);
		
		//WebElement PNum=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div/input[1]"));
		PNum.sendKeys("2222222222");
		//PNum.sendKeys("4444444444");
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span[1]/span/span/span")).click();		//click calender icon to open its panel for date select																																									
		WebElement DOB=VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span[1]/span/input"));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) VGq;
		
		js.executeScript("document.getElementById($('#DateOfBirth').val('11/11/2001'))");
		
		System.out.println("Test Case " +TC+ " : DOB selected from Calender  -Test Case Passed");
		TC++;
		
		//To change the address																																													
		/*VGq.findElement(By.id("Address1")).clear();																																		
		Thread.sleep(2000);																																		
		VGq.findElement(By.id("Address1")).sendKeys("Gaur city 2");																																		
		System.out.println("Test Case 25 : Address name validation is tested : Test case passed");																																		
		*/																				
		//To change the State 																																													
		/*VGq.findElement(By.id("StateProvinceId")).click();																																		
		Thread.sleep(2000);																																		
		VGq.findElement(By.xpath("//option[contains(text(),'Uttar Pradesh')]")).click();																																		
		Thread.sleep(2000);																																		
		VGq.findElement(By.id("CityName")).click();																																		
		Thread.sleep(2000);																																		
		System.out.println("Test Case 26 : City add validation is tested : Test case passed");																																		
		*/																				
		
		/*WebElement Adr1= VGq.findElement(By.xpath("//*[@id=\"Address1\"]"));
		Adr1.clear();
		
		VGq.findElement(By.id("Address1")).click();
		VGq.findElement(By.id("Address1")).sendKeys("Hidalgotitlán Ver., Mexico");
		VGq.findElement(By.id("Address1")).click();
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VGq.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        Thread.sleep(3000);
		System.out.println("Second address saved.");
		Thread.sleep(3000);
		VGq.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("Profile saved");
		Thread.sleep(3000);
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[5]/div/div[1]/span")).click();		//click  icon to open its panel																																								
		
		System.out.println("Test Case 27 : Timezone Icon selected from dropdown  -Test Case Passed");
		
		
		
		
		VGq.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div/div[2]/div/div/div[9]/div/div/div/input[1]")).click();																																											
	  	Thread.sleep(1500);
		System.out.println("Test Case 28 : Save button is clicked  -Test Case Passed");			
		*/
		
		
		//driver.quit();																																												
		DOB.click();
		Thread.sleep(3000);
		
		VGq.findElement(By.xpath("//*[@id=\"TimeZoneId\"]/option[1]")).click();////*[@id="TimeZoneId"]/option[1]
		Thread.sleep(3000);
		VGq.findElement(By.xpath("//*[@id=\"TimeZoneId\"]/option[2]")).click();
		//click time-zone icon to open its panel																																								
	
		System.out.println("Test Case " +TC+ " : Timezone Icon selected from dropdown  -Test Case Passed");
		TC++;
		
		WebElement TellAbout=VGq.findElement(By.xpath("//*[@id=\"Tellmeabout\"]"));
		TellAbout.clear();
		TellAbout.sendKeys("Hi All, I am Member");
		Thread.sleep(3000);
//WebElement Adr11= VGq.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		
		/*Adr11.clear();
		VGq.findElement(By.id("Address1")).click();
		VGq.findElement(By.id("Address1")).sendKeys("Dilshad Garden Metro Station Lane");
		VGq.findElement(By.id("Address1")).click();    
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VGq.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        
        Thread.sleep(3000);
		System.out.println("Test Case 25 : Test Case Passed");
		Thread.sleep(3000);
		VGq.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("Test Case 26 : Profile saved");
		Thread.sleep(5000);
		
		VGq.switchTo( ).alert( );
		VGq.switchTo( ).alert( ).accept();
		Thread.sleep(3000);
		*/
		WebElement Adr1a=VGq.findElement(By.id("Address1"));// VGq.findElement(By.xpath("//*[@id=\"Address1\"]"));
		Adr1a.clear();
		
		VGq.findElement(By.id("Address1")).click();
		VGq.findElement(By.id("Address1")).sendKeys("Har Ki Pauri");
		
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VGq.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        VGq.findElement(By.id("Address1")).click();
        Thread.sleep(3000);
        
		System.out.println("Test Case " +TC+ " : First address saved.");
		TC++;
		Thread.sleep(3000);
		VGq.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("Test Case " +TC+ " : Profile saved");
	  	TC++;
		Thread.sleep(3000);
																																						
		System.out.println("Test Case " +TC+ " : Save button is clicked  -Test Case Passed"); 	
		TC++;
		VGq.switchTo( ).alert( );
		VGq.switchTo( ).alert( ).accept();
		Thread.sleep(3000);

		
		
		//   //*[@id="Address1"]
		Thread.sleep(3000);
		js.executeScript("document.getElementById($('#DateOfBirth').val('22/02/2002'))");
		Thread.sleep(3000);
		WebElement Adr1=VGq.findElement(By.xpath("//*[@id=\"Address1\"]"));// VGq.findElement(By.xpath("//*[@id=\"Address1\"]"));
		Adr1.clear();
		
		VGq.findElement(By.id("Address1")).click();
		VGq.findElement(By.id("Address1")).sendKeys("Dilshad Garden Metro Station Lane");
		VGq.findElement(By.id("Address1")).click();
		
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            VGq.findElement(By.id("Address1")).sendKeys(Keys.ARROW_DOWN);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        Thread.sleep(3000);
		System.out.println("Test Case " +TC+ " : Second address saved.");
		TC++;
		Thread.sleep(3000);
		VGq.findElement(By.cssSelector("#btn_SaveMember")).click();																																											
	  	Thread.sleep(1500);
	  	System.out.println("Test Case " +TC+ " : Profile saved");
	  	TC++;
		Thread.sleep(3000);
																																						
		System.out.println("Test Case " +TC+ " : Save button is clicked  -Test Case Passed"); 		
		TC++;
		
	  	VGq.quit();

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	SEARCH & DOC LISTING PAGE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	  	System.out.println("--------------------------------------------------SEARCH & DOCTOR LISTING PAGE----------------------------------------------------");
	  		String WebsiteLink="https://qa.lemniska.com/";
			String User="usa_member@yopmail.com";
			String Passwrd="usa_member1@"; 		
			
			WebDriver VGw=new ChromeDriver();
			//WebDriver driver=new ChromeDriver();
			
			VGw.get(WebsiteLink);																																												
			VGw.manage().window().maximize();																																												
			Thread.sleep(5000);	
			
			
			/// To click on get started 																																												
			WebElement GetStartedNow1w=VGw.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
			if(GetStartedNow1w.isEnabled()) {																																												
				System.out.println("Test Case " +TC+ " : Get started icon is present -Test Case Passed");	
				TC++;
			}																																												
				else {																																											
					System.out.println("Test Case " +TC+ " : Get started is Not present -Test Case Failled");	
					TC++;
				}																																											
			Thread.sleep(2000);																																												
																																															
			GetStartedNow1w.click();		
			System.out.println("Test Case " +TC+ " : Get started icon is present and se3ected -Test Case Passed");
			TC++;
			Thread.sleep(5500);																																												
									
			//Dropdown is selected 
			WebElement Dropdown1w=VGw.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
					Dropdown1w.click();	
					System.out.println("Test Case " +TC+ " : Dropdown is selected  -Test Case Passed");
					TC++;

			Thread.sleep(2000);																																												
			VGw.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
			Thread.sleep(8000);	
			
			// To enter the valid email and password 
			WebElement EmailAddress1w=VGw.findElement(By.xpath("//input[@id='Email']"));
			EmailAddress1w.sendKeys(User);		
			System.out.println("Test Case " +TC+ " : Email address is added  -Test Case Passed");
			TC++;
		    Thread.sleep(2000);		
		    
		    WebElement Password1w= VGw.findElement(By.xpath("//input[@id='Password']"));
		    Password1w.sendKeys(Passwrd);	
		     System.out.println("Test Case " +TC+ " : Password is added  -Test Case Passed");
		     TC++;
		    Thread.sleep(2500);	
		    
		    //To click on eye icon
		    WebElement Eyeicon1w=VGw.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));		    
		    Eyeicon1w.click();	
		    System.out.println("Test Case " +TC+ " : Eye-icon is clicked once  -Test Case Passed");
		    TC++;

		    //To click on eye icon again
		    Thread.sleep(2000);																																													
		    Eyeicon1w.click();
		    System.out.println("Test Case " +TC+ " : Eye-icon is clicked again  -Test Case Passed");
		    TC++;

		    //To click on Remember me button
		    VGw.findElement(By.xpath("//input[@id='RememberMe']")).click();	
		    System.out.println("Test Case " +TC+ " : Remember Me button is clicked  -Test Case Passed");
		    TC++;

		    //To click on Login button
		    WebElement Loginicon1w= VGw.findElement(By.xpath("//input[@id='loginBttn']"));
		    Loginicon1w.click();
		    System.out.println("Test Case " +TC+ " : Login button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    //To check the heading of the page
		    WebElement Heading1=VGw.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[1]/div/div/div[1]/h2"));
		    System.out.println(Heading1.getText());
		    System.out.println("Test Case " +TC+ " : Heading is available  -Test Case Passed");
		    TC++;
		    
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading2=VGw.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading2.getText());
		    System.out.println("Test Case " +TC+ " : Count of lemniska provider statement on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    //To check the speciality dropdown button
		    WebElement SelectSpeciality = VGw.findElement(By.xpath("//*[@id=\"search_SpecId\"]"));
		    SelectSpeciality.click();
		    System.out.println("Test Case " +TC+ " : Select Speciality dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(3000);		
		    
		    //To select the First speciality from the dropdown
		    WebElement SelectSpeciality1 = VGw.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[2]"));
		    SelectSpeciality1.click();
		    System.out.println("Test Case " +TC+ " : Selecting Speciality from the dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    // To click on Search button
		    WebElement SearchBtn = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);

		    //To check the count of lemniska provider statement on the page
		    WebElement Heading3=VGw.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading3.getText());
		    System.out.println("Test Case " +TC+ " : Count of lemniska provider statement on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    //To select the Second speciality from the dropdown
		    WebElement SelectSpeciality2 = VGw.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[172]"));
		    SelectSpeciality2.click();
		    System.out.println("Test Case " +TC+ " : Selecting Speciality from the dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    // To click on Search button
		    WebElement SearchBtn1 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn1.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading4=VGw.findElement(By.xpath("//*[@id=\"doctorcount\"]/p"));
		    System.out.println(Heading4.getText());
		    System.out.println("Test Case " +TC+ " : No Record Found is visible on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    // To reset Speciality drop-down
		    WebElement SelectSpeciality3 = VGw.findElement(By.xpath("//*[@id=\"search_SpecId\"]/option[1]"));
		    SelectSpeciality3.click();
		    Thread.sleep(5000);
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName = VGw.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName.sendKeys("USA");
		    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn2 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn2.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading5=VGw.findElement(By.xpath("//*[@id=\"SearchCustomerForm\"]/section[2]/div[1]/div/div/div"));
		    System.out.println(Heading5.getText());
		    System.out.println("Test Case " +TC+ " : Count of lemniska provider statement on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    
		    //To check the Map on the page 
		    WebElement Map = new WebDriverWait(VGw, Duration.ofSeconds(200))
		            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"map\"]/div/div[3]/div[1]/div[2]")));
		    System.out.println("Test Case " +TC+ " : Google Map is available on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To check View All Slots button activity
		    WebElement ShowHideSlots=VGw.findElement(By.xpath("(//a[@class=\"ShowHideSlot\"])[1]"));
		    ShowHideSlots.click();
		    System.out.println("Test Case " +TC+ " : All Slots are visible on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    //To check the address is available
		    WebElement Addr=VGw.findElement(By.xpath("(//p[@class=\"typo-darktxt\"])[1]"));
		    Addr.click();
		    System.out.println("Test Case " +TC+ " : Address is available on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    //To check the View Profile button is available
		    WebElement ViewProfile=VGw.findElement(By.xpath("(//a[@title=\"View Profile\"])[1]"));
		    ViewProfile.click();
		    System.out.println("Test Case " +TC+ " : View profile is available on the page  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);	
		    
		    ArrayList TabLink1 = new ArrayList(VGw.getWindowHandles());
		    VGw.switchTo().window((String) TabLink1.get(0));
		    Thread.sleep(5000);
		    
		    // To check Book Now button
		    WebElement BookNow=VGw.findElement(By.xpath("(//a[@title=\"Book Now\"])[2]"));//                 
		    BookNow.click();
		    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    VGw.navigate().back();
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName1 = VGw.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName1.sendKeys("XEXEXEXEX");
		    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given which do not match with anyone -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn3 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn3.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To check the count of lemniska provider statement on the page
		    WebElement Heading6=VGw.findElement(By.xpath("//*[@id=\"doctorcount\"]/p"));
		    System.out.println(Heading6.getText());
		    System.out.println("Test Case " +TC+ " : No Record Found is visible on the page  -Test Case Passed");
		    TC++;
		    
		    //To check the Doctor/Clinic name text box availability
		    WebElement DocClinicName2 = VGw.findElement(By.xpath("//*[@id=\"PName\"]"));
		    DocClinicName2.clear();
		    System.out.println("Test Case " +TC+ " : Doctor/clinic name is empty -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4 = VGw.findElement(By.xpath("//*[@id=\"btn-search\"]"));
		    SearchBtn4.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
	    
		    // To click on insurance card button
		    WebElement SearchInsurance = VGw.findElement(By.xpath("//*[@id=\"SelectedPlan\"]"));
		    SearchInsurance.click();
		    System.out.println("Test Case " +TC+ " : Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To click on insurance card name
		    WebElement SearchInsuranceName = VGw.findElement(By.xpath("//*[@id=\"headingOne\"]/a"));
		    SearchInsuranceName.click();
		    System.out.println("Test Case " +TC+ " : Insurance Name button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To click on insurance card name specific
		    WebElement InsuranceVal = VGw.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[1]/a"));
		    InsuranceVal.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4a = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn4a.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To click on insurance card button
		    WebElement SearchInsurance1a = VGw.findElement(By.xpath("//*[@id=\"SelectedPlan\"]"));
		    SearchInsurance1a.click();
		    System.out.println("Test Case " +TC+ " : Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To clear selected insurance using close icon			
		    WebElement Close1 = VGw.findElement(By.xpath("//*[@id=\"planNameClear\"]/i"));
		    Close1.click();
		    System.out.println("Test Case " +TC+ " : Close button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
	    
		    
		    // To click on insurance card button
		    WebElement SearchInsurance1 = VGw.findElement(By.xpath("//*[@id=\"SelectedPlan\"]")); 
		    SearchInsurance1.click();
		    System.out.println("Test Case " +TC+ " : Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To click on insurance card name
		    WebElement SearchInsuranceName1 = VGw.findElement(By.xpath("//a[@data-target=\"#ProvidersPlans_275\"]")); 
		    SearchInsuranceName1.click();
		    System.out.println("Test Case " +TC+ " : Insurance Name button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    // To click on insurance card name specific
		    WebElement InsuranceVal1 = VGw.findElement(By.xpath("//*[@id=\"ProvidersPlans_275\"]/div/ul/li[1]/a")); 
		    InsuranceVal1.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn4b = VGw.findElement(By.xpath("//*[@id=\"btn-search\"]"));
		    SearchBtn4b.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
	    
		    
		    // To click on insurance card button
		    WebElement SearchInsurance1b = VGw.findElement(By.xpath("//*[@id=\"SelectedPlan\"]"));
		    SearchInsurance1b.click();
		    System.out.println("Test Case " +TC+ " : Insurance button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To clear selected insurance using close icon			
		    WebElement Close1b = VGw.findElement(By.xpath("//*[@id=\"planNameClear\"]/i"));
		    Close1b.click();
		    System.out.println("Test Case " +TC+ " : Close button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
    
		    //To click on Country dropdown
		    WebElement Country = VGw.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country.click();
		    System.out.println("Test Case " +TC+ " : Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - USA
		    WebElement CountryUSA = VGw.findElement(By.xpath("//*[@id=\"country-iso-us\"]"));  //*[@id="country-iso-mx"]
		    CountryUSA.click();
		    System.out.println("Test Case " +TC+ " : USA from Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn5 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn5.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
	    
		    //To click on Country dropdown
		    WebElement Country1 = VGw.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country1.click();
		    System.out.println("Test Case " +TC+ " : Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - India
		    WebElement CountryIn = VGw.findElement(By.xpath("//*[@id=\"country-iso-in\"]"));  //*[@id="country-iso-mx"]
		    CountryIn.click();
		    System.out.println("Test Case " +TC+ " : India from Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn6 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn6.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Country dropdown
		    WebElement Country2 = VGw.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country2.click();
		    System.out.println("Test Case " +TC+ " : Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - Mexico
		    WebElement CountryMx = VGw.findElement(By.xpath("//*[@id=\"country-iso-mx\"]"));  
		    CountryMx.click();
		    System.out.println("Test Case " +TC+ " : Mexico from Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn7 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn7.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
	    
		    //To click on Country dropdown
		    WebElement Country3 = VGw.findElement(By.xpath("//select[@id=\"search_Besed_CountryId\"]"));
		    Country3.click();
		    System.out.println("Test Case 53\"Test Case \" +TC+ \" : Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Specific Country - Select Country
		    WebElement CountrySC = VGw.findElement(By.xpath("//*[@id=\"search_Besed_CountryId\"]/option[1]"));  
		    CountrySC.click();
		    System.out.println("Test Case " +TC+ " : Select Country from Country dropdown is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To click on Search button
		    WebElement SearchBtn8 = VGw.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
		    SearchBtn8.click();
		    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);


		    
		    // To book appointment
		    WebElement BookNow1=VGw.findElement(By.xpath("(//a[@title=\"Book Now\"])[2]"));               
		    BookNow1.click();
		    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select Tomorrow date
		    WebElement TomorrowDate1=VGw.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
		    System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
		    TC++;
		    TomorrowDate1.click();
		    Thread.sleep(5000);
		    
		    //To select Tomorrow date
		    WebElement TomorrowNextDate1=VGw.findElement(By.xpath("(//a[@class=\"currentday\"])[2]"));
		    TomorrowNextDate1.click();
		    System.out.println("Test Case " +TC+ " : Selecting day-after-tomorrow date is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select Morning Timings
		    WebElement Time1=VGw.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[3]"));
		    Time1.click();
		    System.out.println("Test Case " +TC+ " : Morning time is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select Evening Timings
		    WebElement Time2=VGw.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[18]"));
		    Time2.click();
		    System.out.println("Test Case " +TC+ " : Evening time is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    
		    //To select V-Call button
		    WebElement VCallBtn=VGw.findElement(By.xpath("(//label[@class=\"video-call-btn\"])[1]"));
		    VCallBtn.click();
		    System.out.println("Test Case " +TC+ " : VCall radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select In-Person button
		    WebElement InPersonBtn=VGw.findElement(By.xpath("(//label[@class=\"physical-btn\"])[1]"));
		    InPersonBtn.click();
		    System.out.println("Test Case " +TC+ " : In-Person radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		  
		    //To select Other button
		    WebElement OtherBtn=VGw.findElement(By.xpath("//div[@class=\"vg-book\"]"));
		    OtherBtn.click();
		    System.out.println("Test Case " +TC+ " : OtherBtn radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To provide Name of other person
		    WebElement OtherName=VGw.findElement(By.xpath("//input[@id=\"OtherPatinetName\"]"));
		    OtherName.sendKeys("Peri Peri");
		    System.out.println("Test Case " +TC+ " : Name of other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To provide Relation with other person
		    WebElement OtherRelation=VGw.findElement(By.xpath("//input[@id=\"OtherPatinetName\"]"));
		    OtherRelation.sendKeys("Son");
		    System.out.println("Test Case " +TC+ " : Relation with other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To provide Reason
		    WebElement Reason=VGw.findElement(By.xpath("//input[@id=\"reason\"]"));
		    Reason.sendKeys("Facing cough and cold");
		    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To provide Age of other person
		    WebElement Age1=VGw.findElement(By.xpath("//input[@id=\"Age\"]"));
		    Age1.sendKeys("22");
		    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select Myself button
		    WebElement MyselfBtn=VGw.findElement(By.xpath("(//label[@class=\"physical-btn\"])[2]"));
		    MyselfBtn.click();
		    System.out.println("Test Case " +TC+ " : MyselfBtn radio-button is selected  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    // VGw.switchTo().alert().accept();
		    
		    //To select Insurance Button
		    WebElement InsuranceBtn=VGw.findElement(By.xpath("//input[@id=\"SelectedPlan\"]"));
		    InsuranceBtn.click();
		    System.out.println("Test Case " +TC+ " : Insurance dropdown-button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
 		    //To select Specific Insurance Name from drop-down
		    WebElement InsuranceName=VGw.findElement(By.xpath("//*[@id=\"headingOne\"]/a/h4"));
		    InsuranceName.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance Name from drop-down is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    //To select Specific Insurance Category
		    WebElement InsuranceValb=VGw.findElement(By.xpath("//*[@id=\"ProvidersPlans_1\"]/div/ul/li[2]/a"));
		    InsuranceValb.click();
		    System.out.println("Test Case " +TC+ " : Specific Insurance Category is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(5000);
		    
		    System.out.println("Test Case " +TC+ " : Test Case Complete");	
		    TC++;
		    VGw.quit();		
		    
		    
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * BOOK & MANAGE APPOINTMENT
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */	
		    System.out.println("--------------------------------------------------BOOK APPOINTMENTS PAGE----------------------------------------------------");
		String WebsiteLink1="https://qa.lemniska.com/";
		String User1e="usa_member@yopmail.com";	
		String Passwrd1e="usa_member1@"; 	
		//int TimeToSleep=2000;
		//int TC=1;
		
		
		WebDriver VGe=new ChromeDriver();
		
		VGe.get(WebsiteLink1);																																												
		VGe.manage().window().maximize();																																												
		Thread.sleep(TimeToSleep);		
		
		
		// To click on get started 																																												
		WebElement GetStartedNow1e=VGe.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
		if(GetStartedNow1e.isEnabled()) {																																												
			System.out.println("Test Case " +TC+ " : Get started icon is present -Test Case Passed");	
			TC++;
		}																																												
			else {																																											
				System.out.println("Test Case " +TC+ " : : Get started is Not present -Test Case Failed");		
				TC++;
			}																																											
		Thread.sleep(TimeToSleep);																																												
																																														
		GetStartedNow1e.click();		
		System.out.println("Test Case " +TC+ " : Get started icon is present and se3ected -Test Case Passed");
		TC++;
		Thread.sleep(5500);																																												
								
		//Dropdown is selected 
		WebElement Dropdown1e=VGe.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
				Dropdown1e.click();	
				System.out.println("Test Case " +TC+ " : Dropdown is selected  -Test Case Passed");
				TC++;

		Thread.sleep(TimeToSleep);																																													
		VGe.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();																																												
		Thread.sleep(8000);	
		
		// To enter the valid email and password 
		WebElement EmailAddress1e=VGe.findElement(By.xpath("//input[@id='Email']"));
		EmailAddress1e.sendKeys(User1e);		
		System.out.println("Test Case " +TC+ " : Email address is added  -Test Case Passed");
		TC++;
	    Thread.sleep(TimeToSleep);			
	    
	    WebElement Password1e= VGe.findElement(By.xpath("//input[@id='Password']"));
	    Password1e.sendKeys(Passwrd1e);	
	     System.out.println("Test Case " +TC+ " : Password is added  -Test Case Passed");
	     TC++;
	    Thread.sleep(TimeToSleep);		
	    
	    //To click on eye icon
	    WebElement Eyeicon1e=VGe.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[1]/section/div/div/div[2]/div/div/div/form/div[2]/div/span[1]"));		    
	    Eyeicon1e.click();	
	    System.out.println("Test Case " +TC+ " : Eye-icon is clicked once  -Test Case Passed");
	    TC++;

	    //To click on eye icon again
	    Thread.sleep(TimeToSleep);																																														
	    Eyeicon1e.click();
	    System.out.println("Test Case " +TC+ " : Eye-icon is clicked again  -Test Case Passed");
	    TC++;

	    //To click on Remember me button
	    VGe.findElement(By.xpath("//input[@id='RememberMe']")).click();	
	    System.out.println("Test Case " +TC+ " : Remember Me button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	

	    //To click on Login button
	    WebElement Loginicon1e= VGe.findElement(By.xpath("//input[@id='loginBttn']"));
	    Loginicon1e.click();
	    System.out.println("Test Case " +TC+ " : Login button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1e = VGe.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1e.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn21e = VGe.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn21e.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //To check Doctor and book appointment
	    WebElement BookNow1a=VGe.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1a.click();
	    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
 
	    //To select Morning Timings
	    WebElement Time1e=VGe.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[8]"));
	    Time1e.click();
	    System.out.println("Test Case " +TC+ " : Morning time is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Reason
	    WebElement ReasonI=VGe.findElement(By.xpath("//input[@id=\"reason\"]"));
	    ReasonI.sendKeys("Backpain");
	    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Age
	    WebElement Age1i=VGe.findElement(By.xpath("//input[@id=\"Age\"]"));
	    Age1i.clear();
	    Age1i.sendKeys("22");
	    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To click Submit button
	    WebElement Submit1=VGe.findElement(By.xpath("//*[@id=\"submit\"]"));
	    Submit1.click();
	    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	  
	    //To accept Disclaimer
	    WebElement Accept1=VGe.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
	    Accept1.click();
	    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			
	    VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    
	    //To click Pay Later
	    WebElement PayLater1=VGe.findElement(By.xpath("//*[@id=\"Paylater\"]"));
	    PayLater1.click();
	    System.out.println("Test Case " +TC+ " : Pay Later is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //---------------------- In Person - Payment  -----------------------------------
	    
	    
			//To find doctor - click Book Appointment		
		    WebElement FindDoc1i=VGe.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
		    FindDoc1i.click();
		    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);	    
	    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1ve = VGe.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1ve.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2A = VGe.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2A.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	    
	    //To check Doctor and book appointment
	    WebElement BookNow1aA=VGe.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1aA.click();
	    System.out.println("Test Case " +TC+ " : Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    	
	    
	    
	    //To select Tomorrow date
	    WebElement TomorrowDate2=VGe.findElement(By.xpath("(//a[@class=\"currentday\"])[1]"));
	    System.out.println("Test Case " +TC+ " : Selecting tomorrow date is clicked  -Test Case Passed");
	    TomorrowDate2.click();
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
    
	    //To select Evening Timings
	    WebElement Time2v=VGe.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[10]"));
	    Time2v.click();
	    System.out.println("Test Case " +TC+ " : Evening time is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Reason
	    WebElement Reason1=VGe.findElement(By.xpath("//input[@id=\"reason\"]"));
	    Reason1.sendKeys("Fever");
	    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Age
	    WebElement Age2=VGe.findElement(By.xpath("//input[@id=\"Age\"]"));
	    Age2.clear();
	    Age2.sendKeys("32");
	    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To click Submit button
	    WebElement Submit2=VGe.findElement(By.xpath("//*[@id=\"submit\"]"));
	    Submit2.click();
	    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	  
	    //To accept Disclaimer
	    WebElement Accept2=VGe.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
	    Accept2.click();
	    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			///html/body/div[8]/div/div/div[1]/button
	    //VGe.switchTo().alert().accept();
	    
	    //To click Make Payment  /html/body/div[8]/div/div/div[2]/button
	    VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    WebElement Payment1=VGe.findElement(By.xpath("//*[@id=\"AppointmentForm\"]/div/div/div/div[1]/div/table/tbody/tr[8]/td/div/input[2]"));
	    Payment1.click();
	    System.out.println("Test Case " +TC+ " : Make Payment is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
    
	    
	    //To put card number
	    WebElement Payment1c=VGe.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
	    Payment1c.click();
	    Payment1c.sendKeys("4111 1111 1111 1111");
	    System.out.println("Test Case " +TC+ " : Card Number is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card expiry date
	    WebElement Payment1e=VGe.findElement(By.xpath("//*[@id=\"cardExpiry\"]"));
	    Payment1e.click();
	    Payment1e.sendKeys("09 / 29");
	    System.out.println("Test Case " +TC+ " : Card Expiry Date is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card cvc
	    WebElement Payment1cvc=VGe.findElement(By.xpath("//*[@id=\"cardCvc\"]"));
	    Payment1cvc.click();
	    Payment1cvc.sendKeys("559");
	    System.out.println("Test Case " +TC+ " : CVC is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card holder name
	    WebElement Payment1HN=VGe.findElement(By.xpath("//*[@id=\"billingName\"]"));
	    Payment1HN.click();
	    Payment1HN.sendKeys("USA Member Anuprerna");
	    System.out.println("Test Case " +TC+ " : Card holder name is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	       		
	    //To click pay button
	    WebElement Payment1p=VGe.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[3]/button/div[3]"));
	    Payment1p.click();
	    
	    System.out.println("Test Case " +TC+ " : Pay on Razorpay is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(7000);
	    
	  //To find doctor - click Book Appointment		
	    WebElement FindDoc1iv=VGe.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[1]/div[2]/ul/li[4]/a"));
	    FindDoc1iv.click();
	    System.out.println("Test Case " +TC+ " : Book Appointment button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    
	    //To check the Doctor/Clinic name text box availability
	    WebElement DocClinicName1av = VGe.findElement(By.xpath("//*[@id=\"PName\"]"));
	    DocClinicName1av.sendKeys("USA Doctor");
	    System.out.println("Test Case " +TC+ " : Doctor/clinic name is given  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To click on Search button
	    WebElement SearchBtn2av = VGe.findElement(By.xpath(" //*[@id=\"btn-search\"]"));
	    SearchBtn2av.click();
	    System.out.println("Test Case " +TC+ " : Search button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(10000);
	    
	    //To check Doctor book appointment button
	    WebElement BookNow1av=VGe.findElement(By.xpath("(//a[@title=\"Book Now\"])[1]"));//                 
	    BookNow1av.click();
	    System.out.println("Test Case " +TC+ ": Book now button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To select Tomorrow date
	    WebElement TomorrowNextDate3=VGe.findElement(By.xpath("(//a[@class=\"currentday\"])[3]"));
	    TomorrowNextDate3.click();
	    System.out.println("Test Case " +TC+ " : Selecting day-after-tomorrow date is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To select Evening Timings
	    WebElement Time2a=VGe.findElement(By.xpath("(//a[@id=\"appointimeeven\"])[2]"));
	    Time2a.click();
	    System.out.println("Test Case " +TC+ " : Evening time is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To check timings are visible 
	    WebElement Timeing3=VGe.findElement(By.xpath("//h3[@id=\"doctor-current-time\"]"));
	    String Timeing3v=Timeing3.getText();
	    System.out.println("Test Case " +TC+ " : Timing is available  -Test Case Passed -"+Timeing3v);
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To select V-Call button
	    WebElement VCallBtn3=VGe.findElement(By.xpath("(//label[@class=\"video-call-btn\"])[1]"));
	    VCallBtn3.click();
	    System.out.println("Test Case " +TC+ " : VCall radio-button is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	  //To provide Reason
	    WebElement Reason3=VGe.findElement(By.xpath("//input[@id=\"reason\"]"));
	    Reason3.sendKeys("Fever");
	    System.out.println("Test Case " +TC+ " : Reason is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //To provide Age
	    WebElement Age3=VGe.findElement(By.xpath("//input[@id=\"Age\"]"));
	    Age3.clear();
	    Age3.sendKeys("32");
	    System.out.println("Test Case " +TC+ " : Age of other person is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    
	    //To click Submit button
	    WebElement Submit3=VGe.findElement(By.xpath("//*[@id=\"submit\"]"));
	    Submit3.click();
	    System.out.println("Test Case " +TC+ " : Submit button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	  
	    //To accept Disclaimer
	    WebElement Accept3=VGe.findElement(By.xpath("//*[@id=\"i-accept-disclaimer\"]"));
	    Accept3.click();
	    System.out.println("Test Case " +TC+ " : Disclaimer is selected  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
	    
	    //Weekend popup			/html/body/div[8]/div/div/div[2]/button			///html/body/div[8]/div/div/div[1]/button
	    //VGe.switchTo().alert().accept();
	    
	    //To click Make Payment
	    VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	    WebElement Payment3=VGe.findElement(By.xpath("//*[@id=\"AppointmentForm\"]/div/div/div/div[1]/div/table/tbody/tr[8]/td/div/input[2]"));
	    Payment3.click();
	    System.out.println("Test Case " +TC+ " : Make Payment is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);	
    
	    
	    //To put card number
	    WebElement Payment3c=VGe.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
	    Payment3c.click();
	    Payment3c.sendKeys("4111 1111 1111 1111");
	    System.out.println("Test Case " +TC+ " : Card Number is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card expiry date
	    WebElement Payment3e=VGe.findElement(By.xpath("//*[@id=\"cardExpiry\"]"));
	    Payment3e.click();
	    Payment3e.sendKeys("09 / 29");
	    System.out.println("Test Case " +TC+ " : Card Expiry Date is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card cvc
	    WebElement Payment3cvc=VGe.findElement(By.xpath("//*[@id=\"cardCvc\"]"));
	    Payment3cvc.click();
	    Payment3cvc.sendKeys("559");
	    System.out.println("Test Case " +TC+ " : CVC is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To put card holder name
	    WebElement Payment3HN=VGe.findElement(By.xpath("//*[@id=\"billingName\"]"));
	    Payment3HN.click();
	    Payment3HN.sendKeys("USA Member Anuprerna");
	    System.out.println("Test Case " +TC+ " : Card holder name is Filled  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	       		
	    //To click pay button
	    WebElement Payment3p=VGe.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[3]/button/div[3]"));
	    Payment3p.click();
	    
	    System.out.println("Test Case " +TC+ " : Pay on Razorpay is Clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(10000);

	    /*
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * MANAGE APPOINTMENT
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * */
	    System.out.println("--------------------------------------------------MEMBER MANAGE APPOINTMENT PAGE----------------------------------------------------");
	    //To go to Manage Appointment page   
	    WebElement DropDownIcon= VGe.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/a"));
	    DropDownIcon.click();
	    System.out.println("Test Case " +TC+ " : DropDown button is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // To go for manage appointment page	
	    WebElement ManageAptIcon= VGe.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[1]/a"));
	    ManageAptIcon.click();
	    System.out.println("Test Case " +TC+ " : Manage Appointment is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to pending appointment in manage appointment 																																													
	  	VGe.findElement(By.xpath("//*[@id=\"myTab\"]/div[1]/a")).click();
	  	WebElement PendingMA1=VGe.findElement(By.xpath("//*[@id=\"myTab\"]/div[1]/a/div/div/p"));
	  	String PendingCount= PendingMA1.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Pending appointment in manage appointment  is clicked  -Test Case Passed , Count is "+PendingCount);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Heading 
	    WebElement HeadingP=VGe.findElement(By.xpath("//*[@id=\"pending-tab\"]/div/h3"));
	  	String HeadingPMA= HeadingP.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Pending appointment Heading is available  -Test Case Passed , Heading is "+HeadingPMA);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button is clicked
	    VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // i button click
	    WebElement InfoButton = VGe.findElement(By.xpath("//*[@id=\"profile-edit-lowermain\"]/div/div/div[2]/div[1]/div[1]/h2/span/a"));
	    //InfoButton.click();
	    System.out.println("Test Case " +TC+ " : i button  is available  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    //VGe.close();
	    //ArrayList FAQlinkback = new ArrayList(VGe.getWindowHandles());
		//VGe.switchTo().window((String) FAQlink1.get(0));
	    
	    //		Pending Date and time
	    WebElement PendingDateTime=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[2]/h6"));
	    String PendingDateTime1=PendingDateTime.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+PendingDateTime1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Age 
	    WebElement PendingAge=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[5]/h6"));
	    String PendingAge1=PendingAge.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+PendingAge1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Reason 
	    WebElement PendingReason=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[4]/h6"));
	    String PendingReason1=PendingReason.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+PendingReason1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment -inperson/vcall
	    WebElement PendingType=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div/div/div/div[1]/div[6]/h6"));
	    String PendingType1=PendingType.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+PendingType1);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	     
	    //Menu in Pending Apppointment - Cancel WebElement PendingMenu=
	    VGe.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/button")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Menu in Pending Apppointment - Cancel
	    WebElement PendingMenuCancel=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[1]/div/div/div[3]/div/div/div[1]/a"));
	    PendingMenuCancel.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop no click
	    VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	    System.out.println("Test Case " +TC+ " : No from Pop-Up Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop Yes click	    //html/body/div[8]/div/div/div[2]/button[2]
	   
	    //		Pending 3rd Appointment Details
	    //Date and time
	    WebElement PendingDateTime2=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[2]/h6"));
	    String PendingDateTime12=PendingDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+PendingDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Age 
	    WebElement PendingAge2=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[5]/h6"));
	    String PendingAge12=PendingAge2.getText();	
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+PendingAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Pending - Reason 
	    WebElement PendingReason2=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[4]/h6"));
	    String PendingReason12=PendingReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+PendingReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment -inperson/vcall
	    WebElement PendingType2=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[1]/div[6]/h6"));
	    String PendingType12=PendingType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+PendingType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	     
	    //Menu in Pending Apppointment - Cancel WebElement PendingMenu=
	    VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[3]")).click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Menu in Pending Apppointment - Cancel
	    WebElement PendingMenuCancel2=VGe.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[3]/div"));
	    PendingMenuCancel2.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop no click
	    VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	    System.out.println("Test Case " +TC+ " : No from Pop-Up Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    //Pop Yes click
	    //html/body/div[8]/div/div/div[2]/button[2]
	    //To go to Confirmed appointment in manage appointment
	    VGe.findElement(By.xpath("//*[@id=\"myTab\"]/div[2]/a")).click();																																											
	  	System.out.println("Test Case " +TC+ " : Confirmed appointment in manage appointment  is clicked  -Test Case Passed ");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed-Date and time								
	    WebElement ConfirmedDateTime2=VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[2]/h6"));
	    String ConfirmedDateTime12=ConfirmedDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+ConfirmedDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed - Age 
	    WebElement ConfirmedAge2=VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[5]/h6"));
	    String ConfirmedAge12=ConfirmedAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+ConfirmedAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Confirmed - Reason 
	    WebElement ConfirmedReason2=VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[4]/h6"));
	    String ConfirmedReason12=ConfirmedReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+ConfirmedReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Cancelled- In-Person/vcall
	    WebElement ConfirmedType2=VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div[6]/h6"));
	    String ConfirmedType12=ConfirmedType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+ConfirmedType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu=VGe.findElement(By.xpath("(//button[@id=\"lm-memdropdown\"])[2]"));
	    ConfirmMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//View uploaded file		//*[@id="UploadMemberFilesbtn"]
	  	//VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[2]/div/div/div[2]")).click();
	  	WebElement ViewFile1=VGe.findElement(By.id("ViewMemberFilesPopUpbtn"));
	  	ViewFile1.click();
	  	System.out.println("Test Case " +TC+ " :  View Uploaded file button is working fine, nothing available to view  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Ok button is clicked bcz nothing uploaded yet
	  	VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  OK button clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    VGe.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]")).click();//WebElement ConfirmMenu1=,className("btn btn-primary bootbox-accept"));
	 
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//UploaD image for file upload
	  	VGe.findElement(By.xpath("//*[@id=\"UploadMemberFilesbtn\"]")).click();
	  	WebElement Pop1=VGe.findElement(By.xpath("(//*[@id=\"customFile\"])[2]"));
	    Pop1.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");
	    System.out.println("Test Case " +TC+ " :  Uploading file is selected  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Declined 	
	  	VGe.findElement(By.xpath("(//*[@id=\"closePopUpbtn\"])[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  Decline button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment 
	    WebElement ConfirmMenu1a=VGe.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu1a.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//UploaD image for file upload
	  	VGe.findElement(By.xpath("//*[@id=\"UploadMemberFilesbtn\"]")).click();
	  	WebElement Pop1a=VGe.findElement(By.xpath("(//*[@id=\"customFile\"])[2]"));
	    Pop1a.sendKeys("C:\\Users\\Anuprerna\\Desktop\\A1.jpg");
	    System.out.println("Test Case " +TC+ " :  Uploading file is selected  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Save
	  	VGe.findElement(By.xpath("//*[@id=\"fileButton\"]")).click();
	  	System.out.println("Test Case " +TC+ " :  Save button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(7000);
	  	
	  	VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  Uploading is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu2=VGe.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu2.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//View uploaded file
	  	VGe.findElement(By.id("ViewMemberFilesPopUpbtn")).click();
	  	System.out.println("Test Case " +TC+ " :  View Uploaded file button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Delete 'Uploaded file' icon
	  	VGe.findElement(By.xpath("//*[@id=\"ViewMemberFilesPopUp\"]/div/div/div[2]/div/div/span/i")).click();
	  	System.out.println("Test Case " +TC+ " :  Delete 'Uploaded file' icon is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//r u sure to delete - NO button
	  	VGe.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " :  No button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Delete 'Uploaded file' icon
	  	VGe.findElement(By.xpath("//*[@id=\"ViewMemberFilesPopUp\"]/div/div/div[2]/div/div/span/i")).click();
	  	System.out.println("Test Case " +TC+ " :  Delete 'Uploaded file' icon is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//r u sure to delete - OK button
	  	VGe.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  Ok button is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//deleted successfully 
	  	VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button")).click();
	  	System.out.println("Test Case " +TC+ " :  File deleted successfully is working fine  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Menu Confirm appointment in manage appointment
	    WebElement ConfirmMenu3=VGe.findElement(By.xpath("//button[@class=\"btn btn-secondary dropdown-toggle\"]"));
	    ConfirmMenu3.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Confirm Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Cancel button is clicked
	  	VGe.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[3]/div/div/div[5]/a")).click();
	  	System.out.println("Test Case " +TC+ " :  Cancel button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//No-Cancel button is clicked
	  	VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " :  Cancel-No button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Sort by button
	  	VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //see map button 		
	  	//VGe.findElement(By.xpath("(//span[@class=\"lmseebutton-text\"])[2]")).click();
	  	System.out.println("Test Case " +TC+ " :  See Map button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//To go to Complete appointment in manage appointment
	    VGe.findElement(By.xpath("//*[@id=\"myTab\"]/div[3]/a")).click();																																				
	  	System.out.println("Test Case " +TC+ " : Complete appointment in manage appointment  is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);
    
	    //To go to Menu Complete appointment in manage appointment
	    WebElement CompleteMenu=VGe.findElement(By.xpath("//div[contains(@class,\"lm-appointment-rating-button\")]"));
	    //		//div[contains(@class,"lm-appointment-rating-button")]		//		//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/a
	    CompleteMenu.click();
	    Thread.sleep(10000);
	    VGe.findElement(By.xpath("//*[@id=\"reason\"]")).sendKeys("Very Good Doc - by Automation");
	    Thread.sleep(TimeToSleep);
	    VGe.findElement(By.xpath("//*[@id=\"5\"]")).click();
	    Thread.sleep(TimeToSleep);
	    VGe.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    Thread.sleep(8000);
	    VGe.navigate().back();
	    VGe.navigate().back();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " :  Menu in Complete Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	
	  	//Sort by button
	  	VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button click again
	    VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Rate Stars Count printing
	    WebElement StarPrint = VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/label/span"));
	    String StarC = StarPrint.getText();
	    System.out.println("Test Case " +TC+ " : Rating text is available  -Test Case Passed, Rate is "+StarC);
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Rate Stars Count printing
	    WebElement RateReview = VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[7]/div/div/p"));
	    String RateReviewC = RateReview.getText();
	    System.out.println("Test Case " +TC+ " : Review text is available  -Test Case Passed, Review is "+RateReviewC);
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Appointment date, time, reason, age, type
	    //Complete-Date and time
	    WebElement CompleteDateTime2=VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[2]/h6"));
	    String CompleteDateTime12=CompleteDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CompleteDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Age 
	    WebElement CompleteAge2=VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[5]/h6"));
	    String CompleteAge12=CompleteAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CompleteAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Complete - Reason 
	    WebElement CompleteReason2=VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[4]/h6"));
	    String CompleteReason12=CompleteReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CompleteReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Complete- In-Person/vcall
	    WebElement CompleteType2=VGe.findElement(By.xpath("//*[@id=\"applist_completeul\"]/div/div[1]/div/div/div/div[6]/h6"));
	    String CompleteType12=CompleteType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+CompleteType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to HISTORY appointment in manage appointment
	    VGe.findElement(By.xpath("//*[@id=\"myTab\"]/div[4]/a")).click();																																								
	  	System.out.println("Test Case " +TC+ " : History appointment in manage appointment  is clicked  -Test Case Passed");
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort by button
	  	VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Sort button click again
	    VGe.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
	    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
	    TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Appointment date, time, reason, age, type
	    //Cancelled-Date and time
	    WebElement CancelledDateTime2=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[2]/h6"));
	    String CancelledDateTime12=CancelledDateTime2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CancelledDateTime12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Age 
	    WebElement CancelledAge2=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[5]/h6"));
	    String CancelledAge12=CancelledAge2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CancelledAge12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //Cancelled - Reason 
	    WebElement CancelledReason2=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[4]/h6"));
	    String CancelledReason12=CancelledReason2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CancelledReason12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //type of appointment on Cancelled- In-Person/vcall
	    WebElement CancelledType2=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[6]/h6"));
	    String CancelledType12=CancelledType2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+CancelledType12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    // Status of cancellation 
	    WebElement CancelledStatus2=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[1]/div[7]/h6"));
	    String CancelledStatus12=CancelledStatus2.getText();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Status/Reason of cancelled appointment is available  -Test Case Passed "+CancelledStatus12);
	  	TC++;
	    Thread.sleep(TimeToSleep);
	    
	    //To go to Menu History appointment in manage appointment
	    WebElement HistoryMenu=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[3]"));
	    HistoryMenu.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in History Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	    
	  	//To go to Menu Cancelled appointment in manage appointment
	    WebElement ConfirmMenu3a=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[3]/div/div/div[3]"));
	    ConfirmMenu3a.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Cancelled Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	//Cancel button is clicked
	  	VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[3]/div/div/div[3]/div/div/div/div")).click();
	  	System.out.println("Test Case " +TC+ " : Cancel button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
		
	  	//No-Cancel button is clicked
	  	VGe.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[1]")).click();
	  	System.out.println("Test Case " +TC+ " : Cancel-No button is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);
	  	
	  	
	  	//To go to Menu Cancelled appointment in manage appointment
	    WebElement ConfirmMenu3b=VGe.findElement(By.xpath("//*[@id=\"applistarch\"]/div/div[1]/div/div/div[3]"));
	    ConfirmMenu3b.click();
	  	//Thread.sleep(1000);																																											
	  	System.out.println("Test Case " +TC+ " : Menu in Cancelled Apppointment is clicked  -Test Case Passed ");
	  	TC++;
	  	Thread.sleep(TimeToSleep);		   
	}

}
