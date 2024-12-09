

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

		public class DoctorSignUp {
		
				public static void main(String[] args) throws InterruptedException {
					
					
					
			/////////////////To test the Doctor sign up  on QA ///////////////																
/*			System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");																																																								
			ChromeDriver driver=new ChromeDriver();														
			driver.get("https://www.lemniska.com/");	
*/			System.out.println("Indian Doctor SIgnUp");
			WebDriver driver=new ChromeDriver();
            driver.get("https://qa.lemniska.com/");
			driver.manage().window().maximize();														
			Thread.sleep(5000);														
												
			// To click on get started 														
			WebElement GetStartedNow=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/a[1]"));												
			if(GetStartedNow.isEnabled()) {												
			System.out.println("Test Case 00A : Get started icon is present -Test Case Passed");											
			}												
			else {											
			System.out.println("Test Case 00A : Get started is Not present -Test Case Failed");										
			}											
			Thread.sleep(5000);
			
			/*
			WebElement okayicon = driver.findElement(By.className("LMokaybtnforal"));
			okayicon.click();
			System.out.println("Test Case 00-B :Pop-up is present -Test Case Passed");
			Thread.sleep(2000);
			--------------------------------------------------------	close comment from 35line	
			*/						
			GetStartedNow.click();												
			Thread.sleep(5000);												
			//////////////////									
			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();														
			Thread.sleep(2000);														
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();														
			Thread.sleep(8000);														
			System.out.println("Test case 1 : Doctor sign up link is clicked");														
			//String DoctorSignuptitle=driver.findElement(By.xpath("//h2[contains(text(),'Doctor Sign Up')]")).getText();	
			String DoctorSignuptitle=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/section/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/h2")).getText();	 
			Assert.assertEquals(DoctorSignuptitle, "Doctor Sign Up");														
			System.out.println("Test case 2 : Assert for the Doctor sign up is passed");														
			WebElement Title=driver.findElement(By.xpath("//option[contains(text(),'Dr.')]"));														
			Thread.sleep(2500);														
			System.out.println("Test case 3 : Title is Selected");														
			WebElement FirstName=driver.findElement(By.xpath("//input[@id='FirstName']"));														
			FirstName.sendKeys("346546456");														
			Thread.sleep(2000);														
			FirstName.clear();														
			Thread.sleep(2000);														
			FirstName.sendKeys("Anu");														
			System.out.println("Test case 4 : Random and Correct Keys are added to First Name");														
			WebElement LastName=driver.findElement(By.xpath("//input[@id='LastName']"));														
			LastName.sendKeys("6464646546");														
			Thread.sleep(2000);														
			LastName.clear();														
			Thread.sleep(2500);														
			LastName.sendKeys("Sharma");														
			System.out.println("Test case 5 : Random and Correct Keys are added to Last Name");														
			WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));														
			Email.sendKeys("3464646546");														
			Thread.sleep(2000);														
			Email.clear();														
			Thread.sleep(2500);														
			Email.sendKeys("anu_US@yopmail.com");														
			System.out.println("Test case 6 : Random and Correct Keys are added to Email");			
			
			
			WebElement PhoneNumber=driver.findElement(By.xpath("//input[@id='Phone']"));														
			PhoneNumber.sendKeys("@@%$%^$^$^$");														
			Thread.sleep(2000);														
			PhoneNumber.clear();														
			Thread.sleep(2500);														
			PhoneNumber.sendKeys("3532145698");		

			//driver.get("https://qa.lemniska.com/doctor-sign-up");
			
			
			Thread.sleep(2500);
			
			WebElement Pref = driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
			Pref.click();
			
			//WebElement Country1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
			//Country1.click();
			
			Thread.sleep(2000);														
			System.out.println("Test case 7 : Random and Correct Keys are added to PhoneNumber");														
			WebElement Referral=driver.findElement(By.xpath("//input[@id='Mrcode']"));														
			Referral.sendKeys("3464646");														
			Referral.clear();														
			Thread.sleep(2500);														
			System.out.println("Test case 8 : Correct Keys are added to Referral");														
			WebElement privacy=driver.findElement(By.xpath("//input[@id='IsVerified']"));														
			privacy.click();														
			Thread.sleep(2500);														
			privacy.click();														
			Thread.sleep(2500);														
			privacy.click();														
			System.out.println("Test case 9 : Lemniska's Terms & Conditions and Privacy Policy checked & unchecked.");														
			WebElement Save=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save.click();														
			Thread.sleep(2500);														
			String HippaError=driver.findElement(By.xpath("//span[contains(text(),'Please agree to HIPAA Authorization.')]")).getText();														
			System.out.println("Test case 10 : Hippa not clicked error received "+HippaError);														
			WebElement Hippa=driver.findElement(By.xpath("//input[@id='IsVerifiedHippa']"));														
			Hippa.click();														
			Thread.sleep(2500);														
			System.out.println("Test case 11 : HIPAA icon is checked");														
			WebElement Save1=driver.findElement(By.xpath("//input[@id='doctor-sign-next']"));														
			Save1.click();														
			System.out.println("Test case 12 : Save icon is selected");														
			Thread.sleep(5000);														
							
			// To check the plan screen and purchase 														
			
			Thread.sleep(5000);	
			
			//String Plantitlepage=driver.findElement(By.xpath("//h2[contains(text(),'Simple Pricing that scales with your business')]")).getText();		
			
			
			//driver.get("https://qa.lemniska.com/pricing/Quarterly/bebc0e48-a09d-4a49-aed9-72d6fe753439");
			
			String Plantitlepage=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]")).getText();
            Assert.assertEquals(Plantitlepage, "Simple pricing that scales with your business");														
			System.out.println("Test case 13 : Assert for Subscription Title Text is passed");														
			Thread.sleep(2500);														
			// to switch betweeb Quarterly and annual plans														
												
			//WebElement Annual=driver.findElement(By.xpath("//a[contains(text(),'Annual')]"));														
			//Annual.click();														
			Thread.sleep(5500);														

			
/*			
			//WebElement silverbuyannnu=driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));	
			WebElement silverbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));
			if(silverbuyannnu.isEnabled()) {														
			System.out.println("Test case 14 : silver buy annnual is present-Test case passed");													
			}													
			else {													
			System.out.println("Test case 14 : silver buy annnual is Not present-Test case Failed");													
			}													
			Thread.sleep(1000);													
												
			WebElement Goldbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(Goldbuyannnu.isEnabled()) {													
			System.out.println("Test case 15 : Gold buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 15 : Gold buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
			WebElement platinumbuyannnu=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));													
			if(platinumbuyannnu.isEnabled()) {													
			System.out.println("Test case 16 : Platinum buy annnual is present-Test case passed");												
			}												
			else {												
			System.out.println("Test case 16 : Platinum buy annnual is Not present-Test case Failed");												
			}												
			Thread.sleep(1000);												
												
												
												
			// to check and validate the quarterly plan 																
												
			//WebElement Quarterly=driver.findElement(By.xpath("//a[contains(text(),'Quarterly')]"));	
			WebElement Quarterly=driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h2[1]"));									
			Quarterly.click();												
			Thread.sleep(5500);												
	
												
*/
			WebElement silverbuyQuar=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));												
			if(silverbuyQuar.isEnabled()) {												
			System.out.println("Test case 17 : silver buy Quar is present-Test case passed");											
			}											
			else {											
			System.out.println("Test case 17 : silver buy Quar is Not present-Test case Failed");											
			}											
			Thread.sleep(1000);											
												
			WebElement GoldbuyQuar=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(GoldbuyQuar.isEnabled()) {											
			System.out.println("Test case 18 : Gold buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 18 : Gold buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
			WebElement platinumbuyQuar=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]"));											
			if(platinumbuyQuar.isEnabled()) {											
			System.out.println("Test case 19 : Platinum buy Quar is present-Test case passed");										
			}										
			else {										
			System.out.println("Test case 19 : Platinum buy Quar is Not present-Test case Failed");										
			}										
			Thread.sleep(1000);										
												
			//driver.get("https://qa.lemniska.com/pricing/1/300b9964-5293-4a0c-bfeb-3004d2f24984");									
			// to purchase the gold quarterly plan 										
			WebElement Goldbuy=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));										
			Goldbuy.click();										
			Thread.sleep(4500);										
																					
			// //h2[contains(text(),'Plan Details')]\"  to validate the plan purchase screen			/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]				--- 					
			String Plandetails=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText();										
			Assert.assertEquals(Plandetails, "Plan Details");										
			System.out.println("Test case 20 : Assert for Subscription Title Text is passed");										
			Thread.sleep(2500);										
			// /html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/form[1]/div[1]/input[1]		
			WebElement plancancel=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));										
			if(plancancel.isEnabled()) {										
			System.out.println("Test case 21 : Plan Cancel is present-Test case passed");									
			}									
			else {									
			System.out.println("Test case 21 : Plan Cancel is Not present-Test case Failed");									
			}									
			Thread.sleep(1000);									
												
												
			// to check the proceed icon										
			WebElement proceed=driver.findElement(By.xpath("//input[@id='checkout-button']"));									
			if(proceed.isEnabled()) {									
				System.out.println("Test case 22 : Proceed Icon is present-Test case passed");								
				}								
				else {								
				System.out.println("Test case 22 : Proceed Icon is Not present-Test case Failed");								
				}								
				Thread.sleep(1000);								
			// to check the note										
												
				String notedetails=driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/p")).getText();								
				Assert.assertEquals(notedetails, "Note- Please do not change or refresh the page language during the payment process.");								
				System.out.println("Test case 23 : Assert for note Text is passed");								
				Thread.sleep(2500);								
												
				//to cancel the plan 								
				WebElement plancancel1=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				plancancel1.click();								
				Thread.sleep(2500);								
												
			// to purchase the plan again 	/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]									
				WebElement platinumbuy=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/h1[1]/button[1]"));								
				platinumbuy.click();								
				Thread.sleep(4500);								
				String Plandetails1=driver.findElement(By.xpath("//h2[contains(text(),'Plan Details')]")).getText();								
				Assert.assertEquals(Plandetails1, "Plan Details");								
				System.out.println("Test case 24 : Assert for Subscription Title Text is passed");								
				Thread.sleep(2500);								
												
				WebElement plancancel2=driver.findElement(By.xpath("//tbody/tr[6]/td[1]/form[1]/div[1]/input[1]"));								
				if(plancancel2.isEnabled()) {								
					System.out.println("Test case 25 : Plan Cancel is present-Test case passed");							
					}							
					else {							
					System.out.println("Test case 25 : Plan Cancel is Not present-Test case Failed");							
					}							
					Thread.sleep(1000);							
												
												
				// to check the proceed icon								
					WebElement proceed1=driver.findElement(By.xpath("//input[@id='checkout-button']"));							
					if(proceed1.isEnabled()) {							
						System.out.println("Test case 26 : Proceed Icon is present-Test case passed");						
						}						
						else {						
						System.out.println("Test case 26 : Proceed Icon  is Not present-Test case Failed");						
						}						
						Thread.sleep(1000);						
												
						proceed1.click();						
						Thread.sleep(4500);						
						System.out.println("Test case 27 : User is now on the payment page");						
						System.out.println("Test case 28 : Doctor Sign up on the live is completed Successfully");						
						driver.quit();						
			// to add card details 										
												
			}															
											
		
		
			}

