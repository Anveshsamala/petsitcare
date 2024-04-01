package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 	
{
	@FindBy(css="#bs-example-navbar-collapse-1 > ul > li.login > a")
	public static WebElement Petsitcare_singin_link;
	
	@FindBy(xpath="//*[@id=\"frmLogin\"]/div/div[1]/div[1]/input")
	public static WebElement Petsitcare_username;
	
	@FindBy(xpath="//*[@id=\"frmLogin\"]/div/div[1]/div[2]/input")
	public static WebElement Petsitcare_password;
	
	@FindBy(xpath="//*[@id=\"frmLogin\"]/div/div[1]/div[4]/button")
	public static WebElement Petsitcare_singin_btn;
}
