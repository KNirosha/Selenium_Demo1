package org.kms.testcase.profile;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.kms.constants.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CandidateProfileCreateTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_WS\\API\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String loginURL="https://toefl-registration-dev.ets.org/TOEFLWeb/extISERLogonPrompt.do";
	
		driver.get(loginURL);
		
		WebElement signUp= driver.findElement(By.linkText("Sign Up"));
		signUp.click();
		
		// Fill the signup form
		pageONE_OF_FOUR(driver);
		pageTWO_OF_FOUR(driver);
		pageTHREE_OF_FOUR(driver);
		pageFOUR_OF_FOUR(driver);
		
		WebElement termsAndCond= driver.findElement(By.id(AppConstants.TERMS_AND_COND_ID));
		termsAndCond.click();
		
		WebElement submit= driver.findElement(By.name(AppConstants.CONTINUE));
		submit.click();
		

		WebElement etsPrsnId= driver.findElement(By.xpath("//*[@id=\"rightside\"]/p[10]"));
		System.out.println(etsPrsnId.getText());
		
		
	}

	public static void pageONE_OF_FOUR(WebDriver driver) throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_WS\\API\\chromedriver.exe");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String nameAppender= Math.random()+dateFormat.format(date).toString();
		
		WebElement prefix= driver.findElement(By.name(AppConstants.PREFIX));
		Select prefixSelect= new Select(prefix);
		prefixSelect.selectByIndex(2);
		
		WebElement firstName=driver.findElement(By.name(AppConstants.FIRST_NAME));
		firstName.sendKeys("a"+nameAppender);
		
		WebElement midName=driver.findElement(By.name(AppConstants.MIDDLE_NAME));
		midName.sendKeys("b"+nameAppender);
		
		WebElement lastName=driver.findElement(By.name(AppConstants.LAST_NAME));
		lastName.sendKeys("c"+nameAppender);
		
		WebElement suffix= driver.findElement(By.name(AppConstants.SUFFIX));
		Select sufixSelect= new Select(suffix);
		sufixSelect.selectByValue("1");
		
		WebElement gender= driver.findElement(By.name(AppConstants.GENDER));
		Select genderSelect= new Select(gender);
		genderSelect.selectByVisibleText("Male");
		
		WebElement dobMM= driver.findElement(By.name(AppConstants.DOB_MM));
		Select dobMMSelect= new Select(dobMM);
		dobMMSelect.selectByIndex(8);
		
		WebElement dobDD= driver.findElement(By.name(AppConstants.DOB_DD));
		Select dobDDSelect= new Select(dobDD);
		dobDDSelect.selectByVisibleText("09");
		
		WebElement dobYY= driver.findElement(By.name(AppConstants.DOB_YY));
		dobYY.sendKeys("1988");
		
		WebElement cntry= driver.findElement(By.name(AppConstants.CNTRY));
		Select cntrySelect= new Select(cntry);
		cntrySelect.selectByVisibleText("India");
		
		
		WebElement add1= driver.findElement(By.name(AppConstants.ADD_L1));
		add1.sendKeys("STREET1"+nameAppender);
		
		WebElement add2= driver.findElement(By.name(AppConstants.ADD_L2));
		add2.sendKeys("STREET2"+nameAppender);
		
		WebElement add3= driver.findElement(By.name(AppConstants.ADD_L3));
		add3.sendKeys("STREET3"+nameAppender);
		
		WebElement add4= driver.findElement(By.name(AppConstants.ADD_L4));
		add4.sendKeys("STREET4"+nameAppender);
		
		WebElement city= driver.findElement(By.name(AppConstants.CITY));
		city.sendKeys("MUNAGALAPALEM");
		WebElement state= driver.findElement(By.name(AppConstants.STATE));
		state.sendKeys("ANDHRA PRADESH");
		
		WebElement zipcode= driver.findElement(By.name(AppConstants.ZIP));
		zipcode.sendKeys("517526");
		
		WebElement primarycntry= driver.findElement(By.name(AppConstants.PRIMARY_PH_CNTRY));
		Select primarycntrySelect= new Select(primarycntry);
		primarycntrySelect.selectByVisibleText("India");
		
		WebElement primarPhoneNo= driver.findElement(By.name(AppConstants.PRIMARY_PH_NO));
		primarPhoneNo.sendKeys(nameAppender);
		
		WebElement primarPhoneNoExt= driver.findElement(By.name(AppConstants.PRIMARY_PH_NO_EXT));
		primarPhoneNoExt.sendKeys("91");
		
		
		WebElement seccntry= driver.findElement(By.name(AppConstants.PRIMARY_PH_CNTRY));
		Select seccntrySelect= new Select(seccntry);
		seccntrySelect.selectByVisibleText("India");
		
		WebElement secPhoneNo= driver.findElement(By.name(AppConstants.SEC_PH_NO));
		secPhoneNo.sendKeys(nameAppender);		
		
		WebElement secPhoneNoExt= driver.findElement(By.name(AppConstants.SEC_PH_NO_EXT));
		secPhoneNoExt.sendKeys("91");
		
		WebElement email= driver.findElement(By.name(AppConstants.EMAIL));
		email.sendKeys("e"+nameAppender+"@gmail.com");
		
		WebElement continueFromPage1= driver.findElement(By.name(AppConstants.CONTINUE));
		continueFromPage1.click();
		
	}
	
	public static void pageTWO_OF_FOUR(WebDriver driver) throws InterruptedException{
		
		WebElement countryOfBirth= driver.findElement(By.name(AppConstants.NATIVE_CNTRY));
		Select countryOfBirthSelect= new Select(countryOfBirth);
		countryOfBirthSelect.selectByVisibleText("India");
		
		WebElement nativeLang= driver.findElement(By.name(AppConstants.NATIVE_LANG));
		Select nativeLangSelect= new Select(nativeLang);
		nativeLangSelect.selectByVisibleText("TELUGU");
		
		WebElement countryCitizen= driver.findElement(By.name(AppConstants.CNTRY_CITZEN));
		Select countryCitizenSelect= new Select(countryCitizen);
		countryCitizenSelect.selectByVisibleText("India");
		
		WebElement cntryToStudy= driver.findElement(By.name(AppConstants.CNTRY_STUDY));
		Select cntryToStudySelect= new Select(cntryToStudy);
		cntryToStudySelect.selectByVisibleText("Australia");
		
		WebElement age= driver.findElement(By.name(AppConstants.AGE_GROUP));
		Select ageSelect= new Select(age);
		ageSelect.selectByVisibleText("22-26");
		
		WebElement currentStudyLvl= driver.findElement(By.name(AppConstants.CURNT_LVL_STD));
		Select currentStudyLvlSelect= new Select(currentStudyLvl);
		currentStudyLvlSelect.selectByVisibleText("Undergraduate program");
		
		WebElement nextStudyLvl= driver.findElement(By.name(AppConstants.NXT_LVL_STUDY));
		Select nextStudyLvlSelect= new Select(nextStudyLvl);
		nextStudyLvlSelect.selectByVisibleText("Graduate/postgraduate program");
		
		WebElement desiredFieldOfStdy= driver.findElement(By.name(AppConstants.FIELD_OF_STUDY));
		Select desiredFieldOfStdySelect= new Select(desiredFieldOfStdy);
		desiredFieldOfStdySelect.selectByVisibleText("Engineering & Technology");
		
		WebElement continueFromPage2= driver.findElement(By.name(AppConstants.CONTINUE));
		continueFromPage2.click();
			
	}
	
	public static void pageTHREE_OF_FOUR(WebDriver driver) throws InterruptedException{
		WebElement searchServOpt= driver.findElement(By.name(AppConstants.SEARCH_SERV_OPTIONS));
		searchServOpt.click();
		
		WebElement continueFromPage3= driver.findElement(By.name(AppConstants.CONTINUE));
		continueFromPage3.click();
		
	}
	
	public static void pageFOUR_OF_FOUR(WebDriver driver) throws InterruptedException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String nameAppender= dateFormat.format(date).toString();
		WebElement userName= driver.findElement(By.name(AppConstants.USER_NAME));
		userName.sendKeys("m"+nameAppender);
		WebElement password= driver.findElement(By.name(AppConstants.PASSWORD));
		password.sendKeys("0okm(IJN");
		WebElement confirmPwd= driver.findElement(By.name(AppConstants.CONFIRM_PASSWORD));
		confirmPwd.sendKeys("0okm(IJN");
		
		WebElement challengeQsn= driver.findElement(By.name(AppConstants.CHALLEGE_QSN));
		Select challengeQsnSelect= new Select(challengeQsn);
		challengeQsnSelect.selectByVisibleText("In what city you were born?");
		
		WebElement challengeQsnAns= driver.findElement(By.name(AppConstants.CHALLEGE_QSN_ANS));
		challengeQsnAns.sendKeys("MUNAGALAPALEM");
		
		WebElement continueFromPage4= driver.findElement(By.name(AppConstants.CONTINUE));
		continueFromPage4.click();
		
	}
	
}
