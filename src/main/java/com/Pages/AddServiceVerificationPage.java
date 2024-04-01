package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddServiceVerificationPage 
{
	@FindBy(xpath="/html/body/div[1]/section/div/div[1]/ul/li[4]/a")
	public static WebElement myservices_link;
	
	@FindBy(xpath="//*[@id=\"keyword\"]")
	public static WebElement myservices_search_data;
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/a/i")
	public static WebElement myservices_search_btn;
	
	@FindBy(xpath="//*[@id=\"service_332\"]/div[2]/a/h4")
	public static WebElement myservices_search_first_one;
	
	
}
