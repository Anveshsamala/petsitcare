   package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddServicePage 
{
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")
	public static WebElement addservice_link;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[1]/div[1]/div/div/button/span[1]")
	public static WebElement service_type;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[1]/div[1]/div/div/div/ul/li[2]/a/span[1]")
	public static WebElement service_type_data;	
		
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[1]/div[2]/div/div/button/span[1]")
	public static WebElement service_duration;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span[1]")
	public static WebElement service_duration_data;
	
	
	@FindBy(xpath="//*[@id=\"additionalRate\"]")
	public static WebElement service_additionaldograte;
	
	
	@FindBy(xpath="//*[@id=\"holidayRate\"]")
	public static WebElement service_holidayrate;
	
	
	@FindBy(xpath="//*[@id=\"price\"]")
	public static WebElement service_price;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[2]/div/div/button/span[1]")
	public static WebElement service_dog_age;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[2]/div/div/div/ul/li[5]/a/span[1]")
	public static WebElement service_dog_age_data;	
	
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[3]/div/div/button/span[1]")
	public static WebElement service_dog_breed;
	
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[3]/div/div/div/ul/li[4]/a/span[1]")
	public static WebElement service_dog_breed_data;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[4]/div/div/button/span[1]")
	public static WebElement service_cancellation_policy;
	
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[2]/div[4]/div/div/div/ul/li[4]/a/span[1]")
	public static WebElement service_cancellation_policy_data;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[1]/div[3]/div[1]/div/ul/li[2]/div/div/label")
	public static WebElement service_medium;
	
	@FindBy(xpath="//*[@id=\"location\"]")
	public static WebElement service_location;
	
	@FindBy(xpath="//*[@id=\"supervisionTime\"]")
	public static WebElement service_supervision_time;
	
	
	@FindBy(xpath="//*[@id=\"description\"]")
	public static WebElement service_description;
	
	@FindBy(xpath="//*[@id=\"addServiceStep1\"]/div[2]/input")
	public static WebElement service_continue;
	
	//second 
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[1]/div/div[1]/div/div[1]/label/span")
	public static WebElement service_dog_gender;
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[1]/div/div[1]/div/div[2]/label/span")
	public static WebElement service_dog_kids;
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[1]/div/div[1]/div/div[3]/label/span")
	public static WebElement service_dog_Biscuits;
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[1]/div/div[1]/div/div[4]/label/span")
	public static WebElement service_pet_breed;
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[1]/div/div[1]/div/div[5]/label/span")
	public static WebElement service_pet_name;
	
	@FindBy(xpath="//*[@id=\"calendar_month\"]")
	public static WebElement service_pet_available_calender;
	
	@FindBy(xpath="//*[@id=\"calendar_month\"]/option[7]")
	public static WebElement service_pet_available_calender_yearmonth;
	
	@FindBy(xpath="//*[@id=\"calendar\"]/tbody/tr[4]/td[2]")
	public static WebElement service_pet_available_calender_date;
		
	@FindBy(xpath="//*[@id=\"save\"]")
	public static WebElement service_pet_available_calender_savebtn;
	
	@FindBy(xpath="//*[@id=\"addServiceStep2\"]/div[2]/input")
	public static WebElement service_second_continue;
	
	//third 
		
	@FindBy(xpath="//*[@id=\"addServiceStep3\"]/div/div[1]/ul/li/div")
	public static WebElement service_upload_file;
	
	@FindBy(xpath="//*[@id=\"avtar_form\"]/div/div/div[1]/label")
	public static WebElement service_choose_file;
	
	@FindBy(xpath="//*[@id=\"avtar_form\"]/div/div/div[3]/div[2]/button[1]")
	public static WebElement service_choose_file_done;
	
	@FindBy(xpath="//*[@id=\"submitStep3\"]")
	public static WebElement service_finish;
	
}
