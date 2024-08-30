package seleniumWebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;




public class GetStartedPage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver VG=new ChromeDriver();
		//ChromeDriver VG=new ChromeDriver();	
		VG.get("https://lemniska.com/");	
		VG.manage().window().maximize();	
		Thread.sleep(5000);	
		
		// to test the new landing page without login			
		/// To click on get started 	
		
		
		WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));			
		if(GetStartedNow.isEnabled()) {			
		System.out.println("Test Case 1 :Get started icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 1:Get started is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
					
					
					
		// to check the header icons and their working 			
					
		//To check the How It works			
					
		WebElement HowItworks=VG.findElement(By.linkText("How It Works"));			
		if(HowItworks.isEnabled()) {			
		System.out.println("Test Case 2 :How It works icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 2:How It works is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
					
					
		//To check the	 Faq's 		
					
		WebElement  Faq =VG.findElement(By.linkText("Faq's"));			
		if( Faq.isEnabled()) {			
		System.out.println("Test Case 3 : Faq's  icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 3: Faq's is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
					
					
		//To check the	 Healthy Media icon		
		WebElement HealthyMedia=VG.findElement(By.linkText("Healthy Media"));			
		if(HealthyMedia.isEnabled()) {			
		System.out.println("Test Case 4 : Healthy Media icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 4 : Healthy Media is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
		//To check the Invite Now			
					
		WebElement InviteNow=VG.findElement(By.linkText("Invite Now"));			
		if(InviteNow.isEnabled()) {			
		System.out.println("Test Case 5 :Invite Now icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 5: Invite Now is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
					
		//To check the Login			
					
		WebElement LogIn=VG.findElement(By.linkText("Log in"));			
		if(LogIn.isEnabled()) {			
		System.out.println("Test Case 6 :Log In icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 6 : Log In is Not present -Test Case Failed");			
		}			
		Thread.sleep(2000);			
					
					
				
					
		//VG.findElement(By.className("LMokaybtnforal")).click();		
		Thread.sleep(5000);
		//to check the footer 			
	
		//To check the	Security & Privacy 		
					
		WebElement SecurityandPrivacy =VG.findElement(By.linkText("Security & Privacy"));			
		if(SecurityandPrivacy.isEnabled()) {			
		System.out.println("Test Case 9 :Security & Privacy icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 9 : Security & Privacy is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
		//To check the	Terms & Conditions		
					
		WebElement TermsandConditions=VG.findElement(By.linkText("Terms & Conditions"));			
		if(TermsandConditions.isEnabled()) {			
		System.out.println("Test Case 10 :Terms & Conditions icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 10 : Terms & Conditions is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
		//To check the	HIPAA		
					
		WebElement HIPAA=VG.findElement(By.linkText("HIPAA"));			
		if(HIPAA.isEnabled()) {			
		System.out.println("Test Case 11 :HIPAA icon is present -Test Case Passed");			
		}			
		else {			
		System.out.println("Test Case 11: HIPAA is Not present -Test Case Failled");			
		}			
		Thread.sleep(2000);			
					
					
					
					
					
					
		// to redirect to various links 			
					
		
					
		// to test the How it works Flow			
					
					
					
		VG.findElement(By.linkText("How It Works")).click();			
		Thread.sleep(3500);			
					
					
		System.out.println("Test Case 12 : How It Works is present and clickable -Test Case Passed");			
		Thread.sleep(2000);			
		//title validate 			
		String HowitworksTitle=VG.findElement(By.xpath("//h2[contains(text(),'How Lemniska Works')]")).getText();			
		System.out.println("Test Case 13 :Title is "+HowitworksTitle);			
					
					
		//URl validate 			
//			QA URL		
		String HowitworksURL=VG.getCurrentUrl();			
		Assert.assertEquals(HowitworksURL, "https://lemniska.com/how-it-works");			
		System.out.println("Test Case 14 : Assert is working");			
					
		
					
		Thread.sleep(2000);			
		VG.navigate().back();			
		Thread.sleep(4500);			
		VG.navigate().refresh();			
					
		// to test the FAQ Flow			
					
		VG.findElement(By.linkText("Faq's")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case 15 : Faq is present and clickable -Test Case Passed");			
		Thread.sleep(5000);			
		//title validate 		
		
	
//	 	String FaqTitle=VG.findElement(By.xpath("//h2[contains(text(),\"FAQ's\")]")).getText();	
	 	String FaqTitle=VG.findElement(By.linkText("Faq's")).getText();	
	 	System.out.println("Test Case 16 : Title is "+FaqTitle);			
					
					
		//URl validate 			
//			QA URL		
		String FaqTitleURL=VG.getCurrentUrl();			
		Assert.assertEquals(FaqTitleURL, "https://lemniska.com/faqs");			
		System.out.println("Test Case 17 : Assert is working");			
					
					
		//Live URL			
		//String HowitworksURLlive=VG.getCurrentUrl();			
		//Assert.assertEquals(HowitworksURLlive, "https://Lemniska.com/how-it-works");			
//		 	System.out.println("Test Case 20 : Assert is working");		
					
		VG.navigate().back();			
		Thread.sleep(4500);			
		VG.navigate().refresh();			
					
		VG.findElement(By.linkText("Healthy Media")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case 18 : Healthy Media is present and clickable -Test Case Passed");			
					
		//URl validate 			
//			QA URL		
		String HealthyMediaURL=VG.getCurrentUrl();			
		Assert.assertEquals(HealthyMediaURL, "https://lemniska.com/social-signup");			
		System.out.println("Test Case 19 : Assert is working");			
		
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
		System.out.println("Test Case 20 : Invite Now is present and clickable -Test Case Passed");			
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
					
					
		System.out.println("Test Case 21 : Inviteicon validation working as expected");			
					
		Thread.sleep(5500);			
		//VG.findElement(By.className("LMokaybtnforal")).click();		
		Thread.sleep(5000);			
					
		//to check for the security and privacy 			
		Thread.sleep(4000);			
		VG.findElement(By.linkText("Security & Privacy")).click();			
		Thread.sleep(3500);			
		System.out.println("Test Case 22 :Security & Privacy is present and clickable -Test Case Passed");			
					
		ArrayList SP=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(1));			
		Thread.sleep(2000);			
					
					
		String PrivacyURL=VG.getCurrentUrl();			
		Assert.assertEquals(PrivacyURL, "https://lemniska.com/policy/security-and-privacy.pdf");			
		System.out.println("Test case 23 : Assert for Lemniska Security and priacy URL is passed");			
		ArrayList SPback=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(0));			
					
		Thread.sleep(4000);			
		// to check for the Terms and conditions			
					
		VG.findElement(By.linkText("Terms & Conditions")).click();			
					
		Thread.sleep(3500);			
		System.out.println("Test Case 24 :Security & Privacy is present and clickable -Test Case Passed");			
					
		ArrayList TC=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)TC.get(2));			
		Thread.sleep(2000);			
					
					
		String TCURL=VG.getCurrentUrl();			
		Assert.assertEquals(TCURL, "https://lemniska.com/policy/terms-and-conditions.pdf");			
		System.out.println("Test case 25 : Assert for Lemniska Security and priacy URL is passed");			
		ArrayList TCback=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)SP.get(0));			
					
					
		Thread.sleep(4000);			
		// to check for the HIPAA			
		VG.findElement(By.linkText("HIPAA")).click();			
					
					
		Thread.sleep(3500);			
		System.out.println("Test Case 26 :HIPAA is present and clickable -Test Case Passed");			
					
		ArrayList HIPAA1=new ArrayList(VG.getWindowHandles());			
		VG.switchTo().window((String)HIPAA1.get(3));			
		Thread.sleep(2000);			
					
					
		String HIPAAURL=VG.getCurrentUrl();			
		Assert.assertEquals(HIPAAURL, "https://lemniska.com/policy/lemniska-hipaa-authorization.pdf");			
		System.out.println("Test case 27 : Assert for HIPAA is present and clickable URL is passed");			
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
		Thread.sleep(5500);			
					
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
					
		System.out.println("Test case 28 : User is logged in ");			
		Thread.sleep(5000);			
					
					VG.quit();
					System.out.println("Test Configuration : A-Get Started Module is working as expected on Chrome");																											

					
					
					
					
			}		


		
		

	}


