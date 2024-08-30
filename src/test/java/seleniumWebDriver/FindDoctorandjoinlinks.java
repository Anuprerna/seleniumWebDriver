package seleniumWebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;


public class FindDoctorandjoinlinks {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\Amit\\WebDrivers\\chromedriver_win32\\chromedriver.exe");																																											
		ChromeDriver VG=new ChromeDriver();																																												
		VG.get("https://qa.lemniska.com/");																																												
		VG.manage().window().maximize();																																												
		Thread.sleep(5000);																																												
																																														
		/// To click on get started 																																												
		WebElement GetStartedNow=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));																																												
		if(GetStartedNow.isEnabled()) {																																												
			System.out.println("Test Case 0 :Get started icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 0:Get started is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
																																														
		GetStartedNow.click();																																												
		Thread.sleep(5500);																																												
																																														
		/// To check the find doctor now and join now links																																												
		WebElement FindDoctorNow=VG.findElement(By.xpath("//a[contains(text(),'Find Doctor Now')]"));																																												
		if(FindDoctorNow.isEnabled()) {																																												
			System.out.println("Test Case 1 :Find Doctor Now icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 1: Find Doctor Now icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
																																														
		WebElement JoinNow=VG.findElement(By.xpath("//a[contains(text(),'Join Now')]"));																																												
		if(JoinNow.isEnabled()) {																																												
			System.out.println("Test Case 2 :Join Now icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 2: Join Now icon is Not present -Test Case Failled");																																										
			}																																											
																																														
																																														
		/// to click on the join us link and check for the links 																																												
		Thread.sleep(1000);																																												
		JoinNow.click();																																												
		Thread.sleep(2500);																																												
																																														
		WebElement Memberandpatient=VG.findElement(By.xpath("//p[contains(text(),'Member / Patient')]"));																																												
		if(Memberandpatient.isEnabled()) {																																												
			System.out.println("Test Case 3 :Member and patient icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 3: Member and patient icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
																																														
																																														
																																														
		WebElement Doctor=VG.findElement(By.xpath("//p[contains(text(),'Doctor')]"));																																												
		if(Doctor.isEnabled()) {																																												
			System.out.println("Test Case 4 :Doctor icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 4 : Doctor icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
																																														
																																														
						// to close the pop up 																																								
		WebElement Crossicon=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/button[1]/span[1]"));																																												
		Crossicon.click();																																												
		System.out.println("Test Case 5 :Cross icon works as expected -Test Case Passed");																																												
		Thread.sleep(2000);																																												
																																														
		// to work on about doctor and search for doctors 																																												
																																														
		VG.findElement(By.xpath("//a[contains(text(),'Find Doctor Now')]")).click();																																												
		Thread.sleep(5000);																																												
		String CurrentyURL=VG.getCurrentUrl();																																												
		String expectedURL=("https://qa.lemniska.com/find-a-doctor?lat=28.6130176&lng=77.4340608");																																												
		Assert.assertEquals( CurrentyURL, CurrentyURL);																																												
		System.out.println("Test Case 6 :Assert is passed");																																												
		System.out.println("Test Case 7 :User is now on the Find Doctor page");																																												
		Thread.sleep(5000);																																												
																																														
																																														
		// To search the Doctor harjap's account 																																												
																																														
		WebElement Docsearch=VG.findElement(By.xpath("//input[@id='PName']"));																																												
		Thread.sleep(2500);																																												
		Docsearch.sendKeys("Nidhi");																																												
		Thread.sleep(1500);	
		
		/*WebElement DocCountry=VG.findElement(By.xpath("//input[@id='PName']"));																																												
		Thread.sleep(2500);																																												
		DocCountry.sendKeys("Harjap");																																												
		Thread.sleep(1500);*/
		
		WebElement searchicon=VG.findElement(By.xpath("//button[@id='btn-search']"));																																												
		Thread.sleep(2500);																																												
		searchicon.click();																																												
		Thread.sleep(5500);																																												
		System.out.println("Test Case 8 :Nidhi is Searched on the Find Doctor page");																																												
																																														
		// to validate the icons and check the about profile 																																												
																																														
																																														
		WebElement Booknow=VG.findElement(By.linkText("Book Now"));																																												
		if(Booknow.isEnabled()) {																																												
			System.out.println("Test Case 9 :Book Now icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 9 : Book Now icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(5000);																																												
		Booknow.click();																																												
		Thread.sleep(5000);																																												
		String LoginpageCurrentyURL=VG.getCurrentUrl();																																												
		String LoginpageexpectedURL=("https://qa.lemniska.com/find-a-doctor?lat=28.619755&lng=77.4282086");																																												
		Assert.assertEquals( CurrentyURL, expectedURL);																																												
		System.out.println("Test Case 10 :Assert is passed");																																												
		System.out.println("Test Case 11 :User is now on the Login page");																																												
		Thread.sleep(5000);																																												
																																														
																																														
		// to go to the home page to search doctor as find doctor from footer is removed																																												
																																														
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]")).click();																																												
		Thread.sleep(5000);																																												
		//User is in the home page																																												
																																														
		VG.findElement(By.xpath("//a[contains(text(),'Book an Appointment')]")).click();																																												
		Thread.sleep(2500);																																												
																																														
		WebElement Docsearch1=VG.findElement(By.xpath("//input[@id='PName']"));																																												
		Thread.sleep(2500);																																												
		Docsearch1.sendKeys("Nidhi");																																												
		Thread.sleep(1500);																																												
		WebElement searchicon1=VG.findElement(By.xpath("//button[@id='btn-search']"));																																												
		Thread.sleep(2500);																																												
		searchicon1.click();																																												
		Thread.sleep(5500);																																												
		System.out.println("Test Case 12 :Nidhi is Searched on the Find Doctor page");																																												
		Thread.sleep(2500);																																												
																																														
		String harjapname=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/section[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/h2[1]")).getText();																																												
		Thread.sleep(2000);																																												
		String Location=VG.findElement(By.xpath("//p[contains(text(),'Mahagun Mywoods ,201318')]")).getText();																																												
																																														
		// View Profile view and text compare																																												
																																														
		WebElement Viewprofile=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/section[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));																																												
		if(Viewprofile.isEnabled()) {																																												
			System.out.println("Test Case 13 :View profile icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 13 : View profile icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
		Viewprofile.click();																																												
		ArrayList Viewprofilepage=new ArrayList(VG.getWindowHandles());																																												
		VG.switchTo().window((String)Viewprofilepage.get(1));																																												
		Thread.sleep(5000);																																												
		System.out.println("Test case 14 : View profile page is opened");																																												
		ArrayList Viewprofilepageback=new ArrayList(VG.getWindowHandles());																																												
		
		// to check the name on the view profile page and validation																																												
		String harjapnamevewporfilepage=VG.findElement(By.xpath("//h2[contains(text(),'Dr. Nidhi Doctor')]")).getText();																																												
		Assert.assertEquals( harjapname, harjapnamevewporfilepage);																																												
		System.out.println("Test case 15 : Assertion is Passed");																																												
																																														
		VG.switchTo().window((String)Viewprofilepage.get(0));																																												
																																														
		//To click on the view slows and hide 																																												
																																														
																																														
		WebElement Viewallslots=VG.findElement(By.linkText("View All Slots"));																																												
		if(Viewallslots.isEnabled()) {																																												
		System.out.println("Test Case 16 : View all slots icon is present -Test Case Passed");																																												
		}																																												
		else {																																												
				System.out.println("Test Case 16 : View all slots icon is not present  -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
		Viewallslots.click();																																												
		Thread.sleep(1500);																																												
		Viewallslots.click();																																												
		Thread.sleep(2500);																																												
		Viewprofile.click();																																												
																																														
		ArrayList Viewprofilepage1=new ArrayList(VG.getWindowHandles());																																												
		VG.switchTo().window((String)Viewprofilepage1.get(2));																																												
		Thread.sleep(5000);																																												
		System.out.println("Test case 17 : View profile page is opened");																																												
		ArrayList Viewprofilepage1back=new ArrayList(VG.getWindowHandles());																																												
		//to check the view profile title																																												
		Thread.sleep(2500);																																												
																																														
		// to validate the title																																												
		//String pagetile=VG.findElement(By.xpath("//h2[contains(text(),'About Doctor')]")).getText();																																												
		//String expectedtitle=("About Doctor");																																												
		//Assert.assertEquals( pagetile, expectedtitle);																																												
		//System.out.println("Test case 18 : Assertion is Passed");																																												
		Thread.sleep(2500);																																												
																																														
																																														
		//to check the icons in person 																																												
		//WebElement Iconinperson=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		WebElement Iconinperson=VG.findElement(By.xpath("//*[@id=\"lower-main-contain\"]/section/div/div[1]/div[1]/div/div[1]/div[2]/div[10]/ul/li[1]/a"));
		// 
		if(Iconinperson.isEnabled()) {																																												
		System.out.println("Test Case 19 :In person icon is present -Test Case Passed");																																												
		}																																												
		else {																																												
				System.out.println("Test Case 19 :In person icon is not present  -Test Case Failled");																																										
			}																																											
		Thread.sleep(2500);																																												
		//pick location																																												
																																														
																																														
																																														
																																														
		/////////tp check the viwe review icon																																												
		WebElement ViewReview=VG.findElement(By.linkText("View Review"));																																												
		if(ViewReview.isEnabled()) {																																												
		System.out.println("Test Case 21 :In person icon is present -Test Case Passed");																																												
		}																																												
		else {																																												
				System.out.println("Test Case 21 :In person icon is not present  -Test Case Failled");																																										
			}																																											
		Thread.sleep(2500);																																												
		ViewReview.click();																																												
		Thread.sleep(2000);																																												
																																														
																																														
		//review title check 																																												
		//String Titlereviews=VG.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/h2[1]")).getText();																																												
		//System.out.println("Title is : "+Titlereviews);																																												
		Thread.sleep(2500);																																												
																																														
		//to check the icon click and book appointment 																																												
																																														
		Iconinperson.click();																																												
		Thread.sleep(5000);																																												
																																														
																																														
		// to log -in 																																												
		WebElement loginemail=VG.findElement(By.xpath("//input[@id='Email']"));																																												
		loginemail.sendKeys("priya00@yopmail.com");				//wj916137@gmail.com																																								
		Thread.sleep(1500);																																												
		WebElement loginPW=VG.findElement(By.xpath("//input[@id='Password']"));																																												
		loginPW.sendKeys("Priya@6767");					//amit@626																																							
		Thread.sleep(1500);																																												
		WebElement Logincion=VG.findElement(By.xpath("//input[@id='loginBttn']"));																																												
		Logincion.click();																																												
		Thread.sleep(4500);																																												
		System.out.println("User is logged in Succesfully ");																																												
		/// harjap sir profile is serached and prifel is validated 																																												
		//to click on find doctor from the footer																																												
																																														
		//to go to Manage appointment																																												
			VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();																																						
			Thread.sleep(1000);																																											
																																														
			VG.findElement(By.partialLinkText("Manage Appo")).click();																																											
			Thread.sleep(1500);																																											
////////////////////////////////////////////																																														
																																														
		VG.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]")).click();																																												
		Thread.sleep(5000);																																												
		//User is in the home page																																												
																																														
		VG.findElement(By.xpath("//a[contains(text(),'Book an Appointment')]")).click();																																												
		Thread.sleep(2500);																																												
																																														
		//VG.findElement(By.xpath("//a[contains(text(),'Find a Doctor')]").click();																																												
		WebElement Docsearch11=VG.findElement(By.xpath("//input[@id='PName']"));																																												
		Thread.sleep(2500);																																												
		Docsearch11.sendKeys("Nidhi");																																												
		Thread.sleep(1500);																																												
		WebElement searchicon11=VG.findElement(By.xpath("//button[@id='btn-search']"));																																												
		Thread.sleep(2500);																																												
		searchicon11.click();																																												
		Thread.sleep(5500);																																												
		System.out.println("Test Case 22 : Doctor is Searched on the Find Doctor page");																																												
		Thread.sleep(2500);																																												
																																														
		// view profile is clicked and now icons will be clicked to book appointment page																																												
																																														
		WebElement Viewprofile1=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/section[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));																																												
		if(Viewprofile1.isEnabled()) {																																												
			System.out.println("Test Case 23 :View profile icon is present -Test Case Passed");																																											
		}																																												
			else {																																											
				System.out.println("Test Case 23 : View profile icon is Not present -Test Case Failled");																																										
			}																																											
		Thread.sleep(2000);																																												
		Viewprofile1.click();																																												
		ArrayList Viewprofilepage2=new ArrayList(VG.getWindowHandles());																																												
		VG.switchTo().window((String)Viewprofilepage.get(1));																																												
		Thread.sleep(5000);																																												
		System.out.println("Test case 24 : View profile page is opened");																																												
		ArrayList Viewprofilepage2back=new ArrayList(VG.getWindowHandles());																																												
																																														
		//to check the icons in person after the login 																																												
				WebElement Iconinperson1=VG.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));																																										
				if(Iconinperson1.isEnabled()) {																																										
				System.out.println("Test Case 25 :In person icon is present -Test Case Passed");																																										
				}																																										
				else {																																										
						System.out.println("Test Case 25 :In person icon is not present  -Test Case Failled");																																								
					}																																									
				Thread.sleep(2500);																																										
				Iconinperson1.click();																																										
				Thread.sleep(2500);																																										
				String Doctorapptpagetile=VG.findElement(By.xpath("//h2[contains(text(),'Doctor Appointment')]")).getText();																																										
				String Doctorapptpageexpectedtitle=("Doctor Appointment");																																										
				//Assert.assertEquals( pagetile, expectedtitle);																																										
				System.out.println("Test case 26 : Assertion for appointment page is Passed");																																										
				Thread.sleep(2500);																																										
																																														
																																														
																																													
				VG.quit();																																										
												

	}

}
