import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAppointmentDoctor {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			String WebsiteLink="https://qa.lemniska.com/";
			String User="usa_doctor@yopmail.com";//"drNidhi663@YOPmail.com";	
			String Passwrd="XzNuP";//"drNidhi663@"; 	
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
		    VG.findElement(By.id("lm-memdropdown")).click();
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
		    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/button")).click();
		    System.out.println("Test Case " +TC+ " : Yes from Pop-Up Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
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
		    WebElement PendingMenuCancel2=VG.findElement(By.xpath("//*[@id=\"applist\"]/div/div[3]/div/div/div[3]/div/div/div[2]/a"));
		    PendingMenuCancel2.click();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Cancel from Menu in Pending Apppointment is clicked  -Test Case Passed ");
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    //Pop no click
		    VG.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/button")).click();
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
		    WebElement ConfirmedDateTime2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[1]/div[2]/h6"));
		    String ConfirmedDateTime12=ConfirmedDateTime2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+ConfirmedDateTime12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Confirmed - Age 
		    WebElement ConfirmedAge2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[1]/div[4]/h6"));
		    String ConfirmedAge12=ConfirmedAge2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+ConfirmedAge12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Confirmed - Reason 
		    WebElement ConfirmedReason2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[1]/div[3]/h6"));
		    String ConfirmedReason12=ConfirmedReason2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+ConfirmedReason12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //type of appointment on Cancelled- In-Person/vcall
		    WebElement ConfirmedType2=VG.findElement(By.xpath("//*[@id=\"applistcnf\"]/div/div[1]/div/div/div[1]/div[5]/h6"));
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
		  	WebElement ViewFile1=VG.findElement(By.xpath("(//a[@id=\"ViewMemberFilesPopUpbtn\"])[2]"));
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
		  	

		  	//Sort by button
		  	VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
		    System.out.println("Test Case " +TC+ " : Sort button  is clicked  -Test Case Passed");
		    TC++;
		    Thread.sleep(TimeToSleep);
		    
		    VG.findElement(By.xpath("//*[@id=\"sorting_anch\"]")).click();
		    System.out.println("Test Case " +TC+ " : Sort button  is clicked again  -Test Case Passed");
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
		    Thread.sleep(TimeToSleep);
		    
		  	///Close button 
		    VG.findElement(By.xpath("//*[@id=\"set_Recall_Apt_PopUp\"]/div/div/div[1]/div/span")).click();
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
		    
		    
		    //Complete-Date and time
		    WebElement CompleteDateTime2=VG.findElement(By.xpath("//*[@id=\"applistcmp_ul\"]/div/div[1]/div/div/div/div[2]/h6"));
		    String CompleteDateTime12=CompleteDateTime2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CompleteDateTime12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Complete - Age 
		    WebElement CompleteAge2=VG.findElement(By.xpath("//*[@id=\"applistcmp_ul\"]/div/div[1]/div/div/div/div[4]/h6"));
		    String CompleteAge12=CompleteAge2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CompleteAge12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Complete - Reason 
		    WebElement CompleteReason2=VG.findElement(By.xpath("//*[@id=\"applistcmp_ul\"]/div/div[1]/div/div/div/div[3]/h6/span"));
		    String CompleteReason12=CompleteReason2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CompleteReason12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //type of appointment on Complete- In-Person/vcall
		    WebElement CompleteType2=VG.findElement(By.xpath("//*[@id=\"applistcmp_ul\"]/div/div[1]/div/div/div/div[5]/h6"));
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
		    WebElement CancelledDateTime2=VG.findElement(By.xpath("//*[@id=\"applistarchive\"]/div/div[1]/div/div/div[1]/div[2]/h6"));
		    String CancelledDateTime12=CancelledDateTime2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Date & Time of patient's appointment is available  -Test Case Passed "+CancelledDateTime12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Cancelled - Age 
		    WebElement CancelledAge2=VG.findElement(By.xpath("//*[@id=\"applistarchive\"]/div/div[1]/div/div/div[1]/div[4]/h6"));
		    String CancelledAge12=CancelledAge2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Age of patient is available  -Test Case Passed "+CancelledAge12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //Cancelled - Reason 
		    WebElement CancelledReason2=VG.findElement(By.xpath("//*[@id=\"applistarchive\"]/div/div[1]/div/div/div[1]/div[3]/h6"));
		    String CancelledReason12=CancelledReason2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Reason of patient's appointment is available  -Test Case Passed "+CancelledReason12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //type of appointment on Cancelled- In-Person/vcall
		    WebElement CancelledType2=VG.findElement(By.xpath("//*[@id=\"applistarchive\"]/div/div[1]/div/div/div[1]/div[5]/h6"));
		    String CancelledType12=CancelledType2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Type of patient's appointment is available  -Test Case Passed "+CancelledType12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    // Status of cancellation 
		    WebElement CancelledStatus2=VG.findElement(By.xpath("//*[@id=\"applistarchive\"]/div/div[1]/div/div/div[1]/div[8]/h6"));
		    String CancelledStatus12=CancelledStatus2.getText();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Status/Reason of cancelled appointment is available  -Test Case Passed "+CancelledStatus12);
		  	TC++;
		    Thread.sleep(TimeToSleep);
		    
		    //To go to Menu History appointment in manage appointment
		    WebElement HistoryMenu=VG.findElement(By.xpath("//*[@id=\"lm-memdropdown\"]"));
		    HistoryMenu.click();
		  	//Thread.sleep(1000);																																											
		  	System.out.println("Test Case " +TC+ " : Menu in History Apppointment is clicked  -Test Case Passed ");
		  	TC++;
		    
		  	

	}

}
