package seleniumWebDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_Storyviews {

	public static void main(String[] args) throws InterruptedException, IOException {
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
			    
			  //To go to manage appointment 																																													
			  	VG.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/div[3]/div/a")).click();																																										
			  	//Thread.sleep(1000);																																											
			  	System.out.println("Test Case " +TC+ " : Dropdown button is clicked  -Test Case Passed");
			  	TC++;
			    Thread.sleep(TimeToSleep);

			  	VG.findElement(By.xpath("//*[@id=\"header-right-button\"]/div[3]/div/div/ul/li[3]/a")).click();
				System.out.println("Test Case " +TC+ " : Healthy Media is selected from dropdown  -Test Case Passed");
				TC++;
			    Thread.sleep(TimeToSleep);
			    
			    
	    Thread.sleep(TimeToSleep);		
	    VG.findElement(By.className("hmactive-timeline")).click();								
		Thread.sleep(2000);								
		System.out.println("Stories of the user is selected");								
		System.out.println("Test Case 10 : Stories of the User is Selected-Test Case Passed");								
		VG.findElement(By.className("HMSTRDIV")).click();								
		System.out.println("Test Case 11 : Stories of the User is Freezed -Test Case Passed");								
		//to valildate the eye icon 								
		WebElement eye=VG.findElement(By.className("HM-viewerico"));								
		System.out.println("Test Case 12 : Stories of the User is Selected -Test Case Passed");								
		//to add the wait till the eye is seen 								
										
		//WebDriverWait wait = new WebDriverWait(VG,10);								
		//wait.until(ExpectedConditions.visibilityOf(eye));								
		System.out.println("Test Case 13 : Eye icon is selected -Test Case Passed");								
		//to click on eye 								
		eye.click();								
		System.out.println("Test Case 14 : eye icon is selected -Test Case Passed");								
		Thread.sleep(2000);								
										
		//to click on the cross icon 								
		VG.findElement(By.xpath("//*[@id=\"Stories_viewers_list\"]/div/div/div[3]/button")).click();								
		System.out.println("cross icon is selected");								
		System.out.println("Test Case 15 : Cross icon is selected-Test Case Passed");								
		Thread.sleep(20000);								
										
		WebElement storyendcontent=VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[2]"));								
		//WebDriverWait wait101 = new WebDriverWait(VG,80);								
		//wait101.until(ExpectedConditions.visibilityOf(storyendcontent));								
		System.out.println("Test Case 16 : refresh icon is selected -Test Case Passed");								
										
		//content after story 								
		WebElement storyendcontent1=VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[2]"));								
		System.out.println( "Text is : "+ storyendcontent1.getText());								
		String Received=storyendcontent1.getText();								
										
		System.out.println("Test Case 17 : Content is verified -Test Case Passed");								
		Thread.sleep(4000);								
		//String expectedStorycontent=()								
										
										
		//to click on the story refresh icon 								
		//WebElement restartstories=VG.findElement(ByClassName("fa-repeat");								
		//restartstories.click();								
		VG.navigate().refresh();								
		System.out.println("Test Case 18 : Refresh icon to restart stories is selected -Test Case Passed");								
		Thread.sleep(50000);								
										
										
										
		//share story button								
		WebElement sharestorybutton=VG.findElement(By.xpath("//*[@id=\"stories-end-section\"]/div/div/div[3]/a"));								
		Thread.sleep(TimeToSleep);								
		//WebDriverWait wait1 = new WebDriverWait(VG,30);								
		//wait1.until(ExpectedConditions.visibilityOf(sharestorybutton));								
		System.out.println("Test Case 19 : Share story icon is available -Test Case Passed");								
										
										
										
		sharestorybutton.click();								
		System.out.println("Test Case 20 : share story is selected -Test Case Passed");								
		Thread.sleep(TimeToSleep);								
										
		//click on image section  								
										
			VG.findElement(By.xpath("//p[normalize-space()='Share a story']")).click();							
			System.out.println("Test Case 21 :Create Story image icon is Selected-Test Case Passed");							
			Thread.sleep(TimeToSleep);							
										
			
			Runtime.getRuntime().exec("C:\\\\Users\\\\Anuprerna\\\\Desktop\\\\A1.jpg");					
			Thread.sleep(TimeToSleep);							
										
			//Select Share Story 							
			VG.findElement(By.id("up-load-media-story")).click();							
			System.out.println("Test Case 22 :Share Story icon is selected -Test Case Passed");							
			Thread.sleep(10000);							
										
										
										
			VG.findElement(By.className("home-div")).click();							
			System.out.println("Test Case 23 :Home icon is selected -Test Case Passed");							
							
					Thread.sleep(TimeToSleep);					
										
										
					// to  to test the Home section from the menu bar					
										
								WebElement VGhome=VG.findElement(By.className("hmbbthome"));		
								((JavascriptExecutor)VG).executeScript("arguments[0].scrollIntoView();", VGhome);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
								VGhome.sendKeys(Keys.ARROW_DOWN);		
										
										
										
										
					//to click on profile icon 					
					VG.findElement(By.className("hhm-profile-icon")).click();					
					System.out.println("Test Case 24 :Profile  icon is selected -Test Case Passed");					
					Thread.sleep(TimeToSleep);					
										
					//to click on share story under the profile 					
					VG.findElement(By.className("HMFTCS")).click();					
					System.out.println("Test Case 25 :Create story icon is selected -Test Case Passed");					
					Thread.sleep(TimeToSleep);					
										
					//to validate the story section page 					
					String sharestorytext=VG.findElement(By.xpath("//h2[contains(text(),'Share a story')]")).getText();					
					String Expectedtextstory=("Share a story");					
					Assert.assertEquals(sharestorytext, Expectedtextstory);					
					System.out.println("Test Case 26 :Assert is Passed");					
					Thread.sleep(TimeToSleep);					
										
					//to close the story page 					
					VG.findElement(By.className("hmcs-here-close")).click();					
					System.out.println("Test Case 27 :Story page is closed -Test Case Passed");					
					Thread.sleep(TimeToSleep);					
					System.out.println("Story Views Module is Working as Expected For Kurt");					
		            VG.quit();								
		            }								
									
									

	

}
