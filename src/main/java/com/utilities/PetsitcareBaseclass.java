package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pages.AddServicePage;
import com.Pages.AddServiceVerificationPage;
import com.Pages.LoginPage;


public class PetsitcareBaseclass 
{
	public static LoginPage LoginPageObject;
	public static AddServicePage AddServicePageObject;
	public static AddServiceVerificationPage AddServiceVerificationPageObject;
	
	public static File f;
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	public static Actions action;
	
	public static void intialization() throws IOException
	{
		String filepath=System.getProperty("user.dir")+"\\src\\main\\java\\Configur.properties";
		prop=new Properties();
		f=new File(filepath);
		fis=new FileInputStream(f);
		prop.load(fis);
	}
	public static void browserintialization()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty(("user.dir")+"\\drivers\\geckodriver.exe"));
			driver=new FirefoxDriver();
		}
		action=new Actions(driver);
		
	}
	
	public static void launchUrl()
	{
		
		driver.get(prop.getProperty("URL"));
	}
	public static void dropdown(WebElement element,String text)
	{
		Select abc=new Select(element);
		
		abc.selectByVisibleText(text);
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void clear(WebElement element)
	{
		element.clear();
	}
	public static void sendkey(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static void moveToElement(WebElement element)
	{
		
		action.moveToElement(element).build().perform();
	}
	public static void pageIntialisation()
	{
		LoginPageObject=PageFactory.initElements(driver, LoginPage.class);
		AddServicePageObject=PageFactory.initElements(driver, AddServicePage.class);
		AddServiceVerificationPageObject=PageFactory.initElements(driver, AddServiceVerificationPage.class);
	}
	public static void loginfun()
	{
		click(LoginPageObject.Petsitcare_singin_link);
		sendkey(LoginPageObject.Petsitcare_username, prop.getProperty("username"));
		sendkey(LoginPageObject.Petsitcare_password, prop.getProperty("password"));
		click(LoginPageObject.Petsitcare_singin_btn);
	}
	public static void addServicefirststep() throws InterruptedException
	{
		Thread.sleep(5000);
		click(AddServicePageObject.addservice_link);
		Thread.sleep(1000);
		click(AddServicePageObject.service_type);
		Thread.sleep(1000);
		click(AddServicePageObject.service_type_data);
		Thread.sleep(1000);
		click(AddServicePageObject.service_duration);
		Thread.sleep(1000);
		click(AddServicePageObject.service_duration_data);
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_additionaldograte, "8787");
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_holidayrate, "8787");
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_price, "8787");
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_age);
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_age_data);
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_breed);
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_breed_data);
		Thread.sleep(1000);
		click(AddServicePageObject.service_cancellation_policy);
		Thread.sleep(1000);
		click(AddServicePageObject.service_cancellation_policy_data);
		Thread.sleep(1000);
		click(AddServicePageObject.service_medium);
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_location, "Hyderabad");
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_supervision_time, "11");
		Thread.sleep(1000);
		sendkey(AddServicePageObject.service_description, "Am indian");
		Thread.sleep(1000);
		click(AddServicePageObject.service_continue);
		
	}
	public static void addServicesecondstep() throws InterruptedException
	{
		click(AddServicePageObject.service_dog_gender);
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_kids);
		Thread.sleep(1000);
		click(AddServicePageObject.service_dog_Biscuits);
		Thread.sleep(1000);
		click(AddServicePageObject.service_pet_breed);
		Thread.sleep(1000);
		click(AddServicePageObject.service_pet_name);
		Thread.sleep(2000);
		click(AddServicePageObject.service_pet_available_calender);
		Thread.sleep(2000);
		click(AddServicePageObject.service_pet_available_calender_yearmonth);
		Thread.sleep(2000);
		click(AddServicePageObject.service_pet_available_calender_date);
		Thread.sleep(2000);
		click(AddServicePageObject.service_pet_available_calender_savebtn);
		Thread.sleep(2000);
		click(AddServicePageObject.service_second_continue);
	}
	public static void addServicethirdstep() throws InterruptedException, IOException
	{
			
		click(AddServicePageObject.service_upload_file);
		Thread.sleep(2000);
		click(AddServicePageObject.service_choose_file);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\SELENIUM\\AutoIt Software\\dog image.exe");
		Thread.sleep(5000);
		click(AddServicePageObject.service_choose_file_done);
		Thread.sleep(5000);
		click(AddServicePageObject.service_finish);
	}
	public static void verifyAddService() throws InterruptedException
	{
		click(AddServiceVerificationPageObject.myservices_link);
		Thread.sleep(2000);
		sendkey(AddServiceVerificationPageObject.myservices_search_data, "Dog Boarding");
		Thread.sleep(2000);
		click(AddServiceVerificationPageObject.myservices_search_btn);
		Thread.sleep(2000);
		click(AddServiceVerificationPageObject.myservices_search_first_one);
	}
	}
	

